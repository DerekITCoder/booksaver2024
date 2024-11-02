import { useState } from 'react';
import FavoritesList from './FavoritesList';




function App2() {
    const [game, setGame] = useState('');
    const [favorites, setFavorites] = useState([]);
  
    return (
      <div className='App'>
    
        <FavoritesList favorites={favorites} />
      </div>
    )
  }
  
  export default App2;