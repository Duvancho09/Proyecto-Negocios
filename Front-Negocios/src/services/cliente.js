import axios from "axios";

class ClienteService{
    url="http://localhost:8080/cliente";

    obtenerCliente(){
        return axios.get(`${this.url}/registros`);
    }

}export default new ClienteService();