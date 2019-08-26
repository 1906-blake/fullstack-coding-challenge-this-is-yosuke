import React from 'react';
import './App.scss';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import NotFound from './components/not-found/not-found.component';
import NavComponent from './components/app-nav/app-nav.component';
import GetAllLists from './components/get-lists/get-lists.component';
import AddToList from './components/add-to-list/add-item.component';
import AddAList from './components/add-a-list/add-list.component';
import DeleteItem from './components/delete-item/delete-item.component';
import DeleteList from './components/delete-list/delete-list.component';


const App: React.FC = () => {
  return (
      <BrowserRouter>
        <div className="App">
          <NavComponent />
          {/* The switch will only render the first route to match */}
          <Switch>
            <Route path="/get-lists" component={GetAllLists} />
            <Route path="/add-to-list" component={AddToList} />
            <Route path="/add-a-list" component={AddAList} />
            <Route path="/delete-item" component={DeleteItem} />
            <Route path="/delete-list" component={DeleteList} />
            <Route component={NotFound} />
          </Switch>
        </div>
      </BrowserRouter>
  );
}

export default App;