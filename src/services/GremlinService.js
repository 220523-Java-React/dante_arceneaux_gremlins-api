import axios from 'axios';

const GREMLIN_REST_API_URL = 'http://localhost:8080/gremlins';

class GremlinService {

    getGremlins() {
        return axios.get(GREMLIN_REST_API_URL);
    }
}

export default new GremlinService();