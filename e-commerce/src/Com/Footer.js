import '../assets/bootstrap/css/bootstrap.min.css'; 

const Footer = () => {  

    const Styles = {
        border: '2px solid black', 
        height: '70px',
        textAling:'center', 
       // marginTop:'120px'
    }; 
    

    return(
        <>
        <div class='col-md-12' style = {Styles} >
           <h3 style={{marginTop:'10px'}}> Social Media </h3>
        </div>
        </>
    );
}
export default Footer;