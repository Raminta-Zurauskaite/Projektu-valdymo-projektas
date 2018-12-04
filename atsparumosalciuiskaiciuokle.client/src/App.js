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

  handleChangeFor = (property) => (event) => {
    this.setState({ [property]: event.target.value});
  }

  render() {
    return (
      <div  id="myDIV" className="App">
          <div className="header">Eksploatacinio atsparumo šalčiui skaičiuoklė</div>
          <form>
            <div>
              <div>
              <label>Bandinys taisyklingos formos
                <input type="checkbox" checked="checked"/>
              </label>
              </div>
              <label>m0 g:</label>
              <input 
                type="text"
                name="m0"
                value={this.state.m0}
                onChange={this.handleChangeFor("m0")}/>
              <label>hmax mm:</label>
              <input 
                type="text"
                name="hmax"
                value={this.state.hmax}
                onChange={this.handleChangeFor("hmax")}
              />
            </div>
            <div>
              <label>m1 g:</label>
              <input 
                type="text"
                name="m1"
                value={this.state.m1}
                onChange={this.handleChangeFor("m1")}
              />
              <label>aa cm:</label>
              <input 
                type="text"
                name="aa"
                value={this.state.aa}
                onChange={this.handleChangeFor("aa")}
              />
            </div>
            <div>
              <label>m2 g:</label>
              <input 
                type="text"
                name="m2"
                value={this.state.m2}
                onChange={this.handleChangeFor("m2")}
              />
              <label>av cm:</label>
              <input 
                type="text"
                name="av"
                value={this.state.av}
                onChange={this.handleChangeFor("av")}
              />
            </div>
            <div>
              <label>m3 g:</label>
              <input 
                type="text"
                name="m3"
                value={this.state.m3}
                onChange={this.handleChangeFor("m3")}
              />
              <label>ba cm:</label>
              <input 
                type="text"
                name="ba"
                value={this.state.ba}
                onChange={this.handleChangeFor("ba")}
              />
            </div>
            <div>
              <label>m4 g:</label>
              <input 
                type="text"
                name="m4"
                value={this.state.m4}
                onChange={this.handleChangeFor("m4")}
              />
              <label>bv cm:</label>
              <input 
                type="text"
                name="bv"
                value={this.state.bv}
                onChange={this.handleChangeFor("bv")}
              />
            </div>
            <div>
              <label>m5 g:</label>
              <input 
                type="text"
                name="m5"
                value={this.state.m5}
                onChange={this.handleChangeFor("m5")}
              />
              <label>h1 cm:</label>
              <input 
                type="text"
                name="h1"
                value={this.state.h1}
                onChange={this.handleChangeFor("h1")}
              />
            </div>
            <div>
              <label>m6 g:</label>
              <input 
                type="text"
                name="m6"
                value={this.state.m6}
                onChange={this.handleChangeFor("m6")}
              />
              <label>h2 cm:</label>
              <input 
                type="text"
                name="h2"
                value={this.state.h2}
                onChange={this.handleChangeFor("h2")}
              />
            </div>
            <div>
              <label>hmin mm:</label>
              <input 
                type="text"
                name="hmin"
                value={this.state.hmin}
                onChange={this.handleChangeFor("hmin")}
              />
            </div>
          <button onClick={this.submit}>Skaiciuoti</button>

          <div>
          Rezultatai placeholder.
          </div>
  
          </form>
      </div>
    );
  }
}



export default App;
