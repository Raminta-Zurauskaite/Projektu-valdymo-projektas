import React, { Component } from 'react';
import './App.css';
import axios from 'axios';

class App extends Component {
  constructor(){
    super()

    this.state = {
      m0: null,
      m1: null,
      m2: null,
      m3: null,
      m4: null,
      m5: null,
      m6: null,
      hmin: null,
      hmax: null,
      aa: null,
      av: null,
      ba: null,
      bv: null,
      h1: null,
      h2: null,
      taisyklinga: false
    }
  }

  submit = event => {
    event.preventDefault();

    const data = {
      m0: this.state.m0,
      m1: this.state.m1,
      m2: this.state.m2,
      m3: this.state.m3,
      m4: this.state.m4,
      m5: this.state.m5,
      m6: this.state.m6,
      hmin: this.state.hmin,
      hmax: this.state.hmax,
      aa: this.state.aa,
      av: this.state.av,
      ba: this.state.ba,
      bv: this.state.bv,
      h1: this.state.h1,
      h2: this.state.h2
    }
    axios.post("http://localhost:8080/api/calculate", data)
  }

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
