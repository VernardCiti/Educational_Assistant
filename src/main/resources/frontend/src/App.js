import { useEffect, useState } from 'react';
import axios from 'axios';  // <-- Import axios
import './App.css';

function App() {
    const [message, setMessage] = useState('Loading...');

    useEffect(() => {
        axios.get('http://localhost:8080/api/example', {
            headers: {
                'Accept': 'text/plain',
                'Content-Type': 'text/plain',
            },
            withCredentials: true,  // Equivalent to credentials: 'include'
        })
            .then(response => {
                setMessage(response.data); // Axios auto parses response based on content type
            })
            .catch(err => {
                console.error('Error fetching from backend:', err);
                setMessage('Error connecting to backend 😢');
            });
    }, []);

    return (
        <div className="App">
            <h1>{message}</h1>
        </div>
    );
}

export default App;
