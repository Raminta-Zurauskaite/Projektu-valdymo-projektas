import React, { Component } from 'react';
import './App.css';
import axios from 'axios';

class App extends Component {
  constructor(){
    super()

    this.state = {
      m0: '',
      m1: '',
      m2: '',
      m3: '',
      m4: '',
      m5: '',
      m6: '',
      hmin: '',
      hmax: '',
      aa: '',
      av: '',
      ba: '',
      bv: '',
      h1: '',
      h2: '',
      taisyklinga: false,
      errors: {},
      results: [{
        s: '',
        v: '',
        we:'',
        wr:'',
        n:'',
        r:'',
        d:'',
        g1:'',
        gg1:'',
        gg2:'',
        fre1:'',
        fre2:'',
        ti:''
      }]
    }
  }

  submit = event => {
    event.preventDefault();

    const data = {
      m0: parseFloat(this.state.m0),
      m1: parseFloat(this.state.m1),
      m2: parseFloat(this.state.m2),
      m3: parseFloat(this.state.m3),
      m4: parseFloat(this.state.m4),
      m5: parseFloat(this.state.m5),
      m6: parseFloat(this.state.m6),
      hmin: parseFloat(this.state.hmin),
      hmax: parseFloat(this.state.hmax),
      aa: parseFloat(this.state.aa),
      av: parseFloat(this.state.av),
      ba: parseFloat(this.state.ba),
      bv: parseFloat(this.state.bv),
      h1: parseFloat(this.state.h1),
      h2: parseFloat(this.state.h2)
    }

    axios.post("http://localhost:8080/api/calculate", data)	
    	.then( this.setState({ errors: {} }))
    	.then((response) => {
    		 setTimeout(function(){}, 3000)
    		    
    		 axios.get("http://localhost:8080/api/results")
    		 	.then((response)=>{
    		 		this.setState({results: response.data})
    		 	})
    	})
    	.catch((error) => {
    		let errors = {};
    		errors = error.response.data
    		this.setState({ errors: errors })
    	})
    
   
    
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
                <input type="checkbox" id="forma" value="taisyklinga"/>
              </label>
              </div>
              <span style = {{color: "red"}}>{this.state.errors.m0}</span>
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
              <span style = {{color: "red"}}>{this.state.errors.hmax}</span>
            </div>
            <div>
              <span style = {{color: "red"}}>{this.state.errors.m1}</span>
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
              <span style = {{color: "red"}}>{this.state.errors.aa}</span>
            </div>
            <div>
              <span style = {{color: "red"}}>{this.state.errors.m2}</span>
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
              <span style = {{color: "red"}}>{this.state.errors.av}</span>
            </div>
            <div>
              <span style = {{color: "red"}}>{this.state.errors.m3}</span>
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
              <span style = {{color: "red"}}>{this.state.errors.ba}</span>
            </div>
            <div>
              <span style = {{color: "red"}}>{this.state.errors.m4}</span>
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
              <span style = {{color: "red"}}>{this.state.errors.bv}</span>
            </div>
            <div>
              <span style = {{color: "red"}}>{this.state.errors.m5}</span>
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
              <span style = {{color: "red"}}>{this.state.errors.h1}</span>
            </div>
            <div>
              <span style = {{color: "red"}}>{this.state.errors.m6}</span>
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
              <span style = {{color: "red"}}>{this.state.errors.h2}</span>
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
            <div>
              <span style = {{color: "red"}}>{this.state.errors.hmin}</span>
            </div>
          <button onClick={this.submit}>Skaiciuoti</button>

          <div>
          Rezultatai:
          <div>
          <label>S, cm^2: </label>{this.state.results.s}<br/>
          <label>V, cm^3: </label>{this.state.results.v}<br/>
          <label>WE, %: </label>{this.state.results.we}<br/>
          <label>WR, %: </label>{this.state.results.wr}<br/>
          <label>N: </label>{this.state.results.n}<br/>
          <label>R, %: </label>{this.state.results.r}<br/>
          <label>D: </label>{this.state.results.d}<br/>
          <label>g1, g/cm^2: </label>{this.state.results.g1}<br/>
          <label>G1, g/cm^2: </label>{this.state.results.gg1}<br/>
          <label>G2, g/cm^2: </label>{this.state.results.gg2}<br/>
          <label>FRE1: </label>{this.state.results.fre1}<br/>
          <label>FRE2: </label>{this.state.results.fre2}<br/>
          <label>Salygiskai salti sesonai: </label>{this.state.results.ti}
          </div>
          </div>
  
          </form>
      </div>
    );
  }
}



export default App;
