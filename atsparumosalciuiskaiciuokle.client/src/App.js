import React, { Component } from 'react';
import './App.css';

class App extends Component {
  render() {
    return (
      <div  id="myDIV" className="App">
          <div className="header">Eksploatacinio atsparumo šalčiui skaičiuoklė</div>
          <form>
            <div>
              <label>m0 g:</label>
              <input type="text"/>
              <label>hmax mm:</label>
              <input type="text"/>
            </div>
            <div>
              <label>m1 g:</label>
              <input type="text"/>
              <label>aa cm:</label>
              <input type="text"/>
            </div>
            <div>
              <label>m2 g:</label>
              <input type="text"/>
              <label>av cm:</label>
              <input type="text"/>
            </div>
            <div>
              <label>m3 g:</label>
              <input type="text"/>
              <label>ba cm:</label>
              <input type="text"/>
            </div>
            <div>
              <label>m4 g:</label>
              <input type="text"/>
              <label>bv cm:</label>
              <input type="text"/>
            </div>
            <div>
              <label>m5 g:</label>
              <input type="text"/>
              <label>h1 cm:</label>
              <input type="text"/>
            </div>
            <div>
              <label>m6 g:</label>
              <input type="text"/>
              <label>h2 cm:</label>
              <input type="text"/>
            </div>
            <div>
              <label>hmin mm:</label>
              <input type="text"/>
            </div>
          <button>Skaiciuoti</button>

          <div>
          Rezultatai placeholder.
          </div>
  
          </form>
      </div>
    );
  }
}



export default App;
