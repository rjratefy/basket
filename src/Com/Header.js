import '../assets/bootstrap/css/bootstrap.min.css';  

const Header = () => {  

    const myStyles = {
        border: '2px solid black', 
        height: '70px' 
    }; 
    const logo ={ 
        margin:'left',
        marginTop:"5px",
        height:'57px',
        width: '110px', 
       // backgroundColor:'red',
        float:'left',
        border: '2px solid black', 

    }; 
    const formu = {
        //marginLeft: '920px',
        width: '810px', 
        display: "flex", 
        marginTop:"13px",
        float: 'right'
    };
    
    return (
        <>
       <div class='col-md-12' style = {myStyles} >
           
                <div class="col-md-8" style = {logo}>
                </div>
                <div class="col-md-4" style = {formu} > 
                    <input type="text" class="form-control"  placeholder="text" style={{float:'left'}}></input>
                    <button class="btn btn-primary" style={{float:'left', marginLeft:'10px'}}>Valider</button>
                </div>
        </div>
      
        </>
    );
}
export default Header;
