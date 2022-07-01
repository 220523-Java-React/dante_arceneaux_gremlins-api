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
                <h1 className="text-center bg-primary text-warning">Gremlins List</h1>
                <table className="table table-striped ">
                    <thead >
                        <tr className="table-row">
                        <th >ID</th>
                            <th>Name</th>
                            <th>Age</th>
                            <th>Color</th>
                            <th className="table-column">Is Evil?</th>
                        </tr>
                    </thead>

                    <tbody>
                        {this.state.gremlins.map(gremlin => (
                            <tr key={gremlin.id} className="rows">
                            <td className="rows">{gremlin.id}</td>
                                <td className="rows">{gremlin.name}</td> 
                                <td className="rows">{gremlin.age}</td>
                                <td className="rows">{gremlin.color}</td>
                                <td className="rows">{gremlin.isEvil ? "Yes" : "No"}</td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        );
    }
}

export default GremlinComponent;