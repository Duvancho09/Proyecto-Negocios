import axios from "axios";

class TransaccionService{
    url="http://localhost:8080/transaccion";

    obtenerTransaccion(){
        return axios.get(`${this.url}/plato`);
    }

}export default new TransaccionService();