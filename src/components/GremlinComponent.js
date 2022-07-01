import React from "react"; 
import GremlinService from "../services/GremlinService";

class GremlinComponent extends React.Component{


    constructor(props){
        super(props);
        this.state = {
            gremlins: []
        }
    }

    componentDidMount(){
        GremlinService.getGremlins()
            .then(response => {
                this.setState({
                    gremlins: response.data
                });
            }
        );
    }

    render(){
        return(
            <div>
                <h1 className="text-center">Gremlins List</h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <th>Name</th>
                            <th>Age</th>
                            <th>Color</th>
                            <th>Is Evil?</th>
                        </tr>
                    </thead>

                    <tbody>
                        {this.state.gremlins.map(gremlin => (
                            <tr key={gremlin.id}>
                                <td>{gremlin.name}</td> 
                                <td>{gremlin.age}</td>
                                <td>{gremlin.color}</td>
                                <td>{gremlin.isEvil ? "Yes" : "No"}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}

export default GremlinComponent;