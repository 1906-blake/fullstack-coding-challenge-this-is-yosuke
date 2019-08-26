import React from 'react'
import GroceryList from '../../models/groceryList';
import { environment } from '../../environment';
import { Button } from 'reactstrap';
interface IState {
   groceryList: GroceryList[]
   id: any
}
export default class GroceryListByIdComponent extends React.Component<{}, IState> {
   constructor(props: any) {
       super(props);
       const groceryList = localStorage.getItem('groceryList');
       const groceryListId = groceryList && JSON.parse(groceryList).id;
       this.state ={
           groceryList: [],
           id: ''
       };
   }
   search = async (event:any) => {
       event.preventDefault();
       const resp = await fetch(environment.context + `/groceryList/${this.state.id}`, {
           credentials: 'include'
       });
   }
//        const groceryListsFromServer = await resp.json();
//        this.setState({
//            ...this.state,
//            groceryList: groceryListsFromServer
//        });
//    }
   handleChange = (event: React.ChangeEvent<HTMLInputElement>) => {
       this.setState({
           ...this.state,
           id: event.target.value
       })
   }
   async componentDidMount() {
       const resp = await fetch(environment.context + `/groceryList/${this.state.id}`, {
           credentials: 'include'
       });
       const groceryListsFromServer = await resp.json();
       this.setState({
           ...this.state,
           groceryList: groceryListsFromServer
       });
    //    console.log(reimbursementsFromServer);
   }
   render() {
       const groceryList = this.state.groceryList;
       return (
           <div id="GroceryList-table-container"><h4>Grocery List by Name...?:</h4>
               <input type="number" value={this.state.id} onChange={this.handleChange} />
               <Button onClick={this.search}>Search</Button>
               <table className="table table-striped table-dark">
                   <thead>
                       <tr>
                           <th scope="col">List Name</th>
                           <th scope="col">Item Id</th>
                           <th scope="col">Name</th>
                           <th scope="col">Type</th>
                       </tr>
                   </thead>
                   <tbody>
                       {
                           groceryList.map(groceryList =>
                               <tr key={'groceryListId-'+groceryList.id}>
                                   <td>{groceryList.id}</td>
                                   <td>{groceryList.name}</td>
                               </tr>)
                       }
                   </tbody>
               </table>
           </div>
       )
   }
}