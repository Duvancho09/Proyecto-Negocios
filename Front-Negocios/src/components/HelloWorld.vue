<script setup>
defineProps({
  msg: {
    type: String,
    required: true
  }
})
</script>

<script>

export default {
  data() {
    return {
             count: 1
    };
  }
}
</script>

<template>
  <h1>{{count}}</h1>
  <div class="greetings">
    <h1 class="green">KPI´s</h1>
    <h3>
      Los KPI´s a trabajar con el proyecto se muestran a continuación.
      
    </h3>
    <ol>
      <li>  
        <a @click="count=1" target="_blank" >
        ¿Cuantos usuarios permanecen en el negocio al saber que tienen que solicitar el servicio por una aplicación?
      </a> 
      </li>
      <li>
        <a @click="count=2" target="_blank" >
        ¿Cual es la cantidad de ingresos en el negocio luego de implementar la solución?
      </a>
      </li>
      <li>
        <a @click="count=3" target="_blank">
        ¿Cual es la puntuacion mas alta que tiene negocio?    
      </a> 
      </li>
      <li>
        <a @click="count=4" target="_blank" >
        ¿Cual es el plato más escogido por los clientes?
      </a>
      </li>
      <li>
        <a @click="count=5" target="_blank" >
        ¿Cual es la cantidad de usuarios registrados en una semana?
      </a>
      </li>
      
      
      
      
      
    </ol>
    

    
    
    
    
    


  </div>
</template>

<style scoped>
h1 {
  font-weight: 500;
  font-size: 2.6rem;
  top: -10px;
}

h3 {
  font-size: 1.2rem;
}

.greetings h1,
.greetings h3 {
  text-align: center;
}

@media (min-width: 1024px) {
  .greetings h1,
  .greetings h3 {
    text-align: left;
  }
}
</style>
