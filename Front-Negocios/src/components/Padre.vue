<template>
    <div id="container">
        <input type="text" v-model="text" @change="dataChange">
        <Hijo :msg="text"></Hijo>
    </div>
</template>
<script>
import Hijo from "./Hijo.vue";
export default {
  data() {
    return {
             texto: "El valor del componente padre"
    };
  },
  methods: {
    dataChange(data){
        this.msg = data
    }
  },
  components: {
    Hijo
}
};
</script>
<style scoped>
</style>