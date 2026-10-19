<script setup lang="ts">
import ServiceStatusCard from '@/components/ServiceStatusCard.vue'
</script>

<template>
  <section>
    <h2>Dashboard</h2>
    <div class="cards">
      <ServiceStatusCard service="ra" title="RA" />
      <ServiceStatusCard service="ca" title="CA" />
      <ServiceStatusCard service="tsa" title="TSA" />
    </div>
  </section>
</template>

<style scoped>
.cards {
  display: flex;
  gap: 1rem;
  margin-top: 1rem;
}
</style>
