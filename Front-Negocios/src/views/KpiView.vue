<script setup>
import DocumentationIcon from '../components/icons/iconLinear.vue'
import ProgressIcon from '../components/icons/IconProgress.vue'
import ValueIcon from '../components/icons/IconValue.vue'
import MeasureIcon from '../components/icons/IconMeasure.vue'
</script>

<script>
export default {
  data() {
    return {
      meta: 0,
      progreso:0,
      valor:0,
      medida:'medida'
    }
  }
}
</script>


<template>
    <div class="container">
      <div>
        <DocumentationIcon />
        <h3>
      Valor Meta {{meta}}
      
    </h3>
      </div>
      <div><ProgressIcon />
      <h3>
      Valor Progreso {{progreso}}
      
    </h3></div>
      <div><ValueIcon/>
      <h3>
      Valor valor {{valor}}
      
    </h3></div>
      <div><MeasureIcon/>
      <h3>
      Valor medida {{medida}}
      
    </h3></div>
    </div>
      
      
      
      
    
</template>

<style>
.container {
    display: grid;
    grid-template-columns: 200px 200px;
}
</style>

