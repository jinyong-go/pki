<script setup lang="ts">
import { RouterLink, RouterView } from 'vue-router'
</script>

<template>
  <div class="layout">
    <aside class="sidebar">
      <h1 class="logo">PKI</h1>
      <nav>
        <RouterLink to="/">Dashboard</RouterLink>
        <RouterLink to="/ra">RA</RouterLink>
        <RouterLink to="/ca">CA</RouterLink>
        <RouterLink to="/tsa">TSA</RouterLink>
      </nav>
    </aside>
    <main class="content">
      <RouterView />
    </main>
  </div>
</template>

<style scoped>
.layout {
  display: flex;
  min-height: 100vh;
}
.sidebar {
  width: 200px;
  padding: 1.5rem 1rem;
  border-right: 1px solid #ddd;
}
.logo {
  font-size: 1.5rem;
  margin-bottom: 1.5rem;
}
nav {
  display: flex;
  flex-direction: column;
  gap: 0.5rem;
}
nav a {
  color: inherit;
  text-decoration: none;
  padding: 0.4rem 0.6rem;
  border-radius: 6px;
}
nav a.router-link-exact-active {
  background: #f0f0f0;
  font-weight: 600;
}
.content {
  flex: 1;
  padding: 2rem;
}
</style>
