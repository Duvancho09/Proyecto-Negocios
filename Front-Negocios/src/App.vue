<script setup>
import { RouterLink, RouterView } from 'vue-router'
import HelloWorld from '@/components/HelloWorld.vue'
import Padre from './components/Padre.vue';
import Hijo from './components/Hijo.vue';
import ClienteService from './services/cliente.js';
import TransaccionService from './services/transaccion.js';
//import axios from "axios";
</script>

<script>
export default {
  mounted(){
    console.log(
    //axios.get("http://localhost:8080/cliente/registros").then(response => (this.info = response.data))); 
    ClienteService.obtenerCliente());
    console.log(TransaccionService.obtenerTransaccion());
    this.transaccion = TransaccionService.obtenerTransaccion();
  },
  data() {
    return {
      count: 0,
      cliente: {},
      info: [],
      transaccion: {}
    }
  },
}
</script>

<template>
{{ cliente.cliente }}
{{ info || json }}
<div v-for="(unProducto, llave) in transaccion"
      v-bind:key="llave"
      v-bind:value="llave">
      <h3>{{ unProducto[llave] }}</h3>
      </div>
<Hijo/>
  <Padre/>
  <header>
    <img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="125" height="125" />

    <div class="wrapper">
      <HelloWorld msg="You did it!" />

      <nav>
        <RouterLink to="/">Inicio</RouterLink>
        <RouterLink to="/estadisticas">Estadisticas</RouterLink>
        <RouterLink to="/kpi">KPIs</RouterLink>
      </nav>
      <h1>{{count}}</h1>
    </div>
  </header>

  <RouterView />
</template>

<style>
@import '@/assets/base.css';

#app {
  max-width: 1280px;
  margin: 0 auto;
  padding: 2rem;

    font-weight: normal;
  }

  header {
    line-height: 1.5;
    max-height: 100vh;
  }

  .logo {
    display: block;
    margin: 0 auto 2rem;
  }

  a,
  .green {
    text-decoration: none;
    color: hsla(160, 100%, 37%, 1);
    transition: 0.4s;
  }

  @media (hover: hover) {
    a:hover {
      background-color: hsla(160, 100%, 37%, 0.2);
    }
}

nav {
  width: 100%;
  font-size: 12px;
  text-align: center;
  margin-top: 2rem;
}

nav a.router-link-exact-active {
  color: var(--color-text);
}

nav a.router-link-exact-active:hover {
  background-color: transparent;
}

nav a {
  display: inline-block;
  padding: 0 1rem;
  border-left: 1px solid var(--color-border);
}

nav a:first-of-type {
  border: 0;
}

@media (min-width: 1024px) {
  body {
    display: flex;
    place-items: center;
  }

  #app {
    display: grid;
    grid-template-columns: 1fr 1fr;
    padding: 0 2rem;
  }

  header {
    display: flex;
    place-items: center;
    padding-right: calc(var(--section-gap) / 2);
  }

  header .wrapper {
    display: flex;
    place-items: flex-start;
    flex-wrap: wrap;
  }

  .logo {
    margin: 0 2rem 0 0;
  }

  nav {
    text-align: left;
    margin-left: -1rem;
    font-size: 1rem;

    padding: 1rem 0;
    margin-top: 1rem;
  }
}
</style>
