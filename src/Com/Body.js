import '../assets/bootstrap/css/bootstrap.min.css'; 
import './body.css';

const Body = () => {  
    
        return (
          <div className="table-container">
            <table>
              <thead>
                <tr>
                  <th>Nom</th>
                  <th>Âge</th>
                  <th>Poste</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>John Doe</td>
                  <td>30</td>
                  <td>Développeur</td>
                </tr>
                <tr>
                  <td>Jane Smith</td>
                  <td>25</td>
                  <td>Designer</td>
                </tr>
                {/* Ajoutez d'autres lignes de données ici */}
              </tbody>
            </table>
          </div>
        );
    
}
export default Body;