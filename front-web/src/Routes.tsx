import React from 'react';
import { BrowserRouter, Switch, Route} from 'react-router-dom';
import Home from './pages/Home';
import Header from './components/Header'
import Records from './pages/Records';

 const Routes = () => (
    <BrowserRouter>
        <Header />
        <Switch>
            <Route path="/" exact>
                <Home />
            </Route>
            <Route path="/records" exact> 
                <Records />
            </Route>
            <Route path="/charts" exact> 
                <h1>charts</h1>
            </Route>
        </Switch>
    </BrowserRouter>
 )

 export default Routes;