import React from 'react'
import ReactDOM from 'react-dom/client'
/*import App from './App.jsx'*/
import { SignUp } from './pages/SignUp'
import "./styles.scss"

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    {/*<App />*/}
    <SignUp />
  </React.StrictMode>,
)
