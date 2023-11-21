import '../assets/bootstrap/css/bootstrap.min.css'; 

const Body = () => {  
    
        const corps = {
            fontFamily:'cursive',
             marginTop:'30px',
            //border: '2px solid black', 
           
        }; 
        const produit = {
             backgroundColor:'yellow',
             float:'left'
        };
        const nav = {
            backgroundColor:'red',
            float:'right'
        };
    return(
        <> 
    <div class='col-md-12' style = {corps} > 
        <h4> All products </h4>
        <div class='col-md-8' style = {produit}>
             fdfd
        </div>
        <div class='col-md-4' style = {nav}>
             fdfdfdf
        </div>
    </div>
        </>
    );
}
export default Body;