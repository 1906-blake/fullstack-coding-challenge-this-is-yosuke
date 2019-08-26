import React, { Component } from 'react'
import { environment } from '../../environment';
import GroceryList from '../../models/groceryList';

interface IState {
    groceryLists: GroceryList[],
}

export default class GroceryListComponent extends Component<{}, IState> {
    constructor(props: any) {
        super(props);
        this.state = {
            groceryLists: [],
        };
    }

    async componentDidMount() {
        this.getGroceryLists();
    }

    getGroceryLists = async () => {
        const resp = await fetch(environment.context +'/groceryLists', {
            credentials: 'include'
        });
        const groceryListsFromServer = await resp.json();
        this.setState({
            groceryLists: groceryListsFromServer,
        });
        console.log(groceryListsFromServer);
    }

    render() {
        const groceryLists = this.state.groceryLists;
        return (
            <div id="groceryList-table-container">
                <table className="table table-striped table-dark">
                    <thead>
                        <tr>
                            <th scope="col">Name</th>
                            <th scope="col"></th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            groceryLists.map(list =>
                                <tr key={'listId-' + list.id}>
                                    <td>{list.name}</td>
                                </tr>)
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}
