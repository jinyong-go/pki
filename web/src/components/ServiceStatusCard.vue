<script setup lang="ts">
import { onMounted, ref } from 'vue'
import { fetchStatus, type ServiceName } from '@/api/status'

const props = defineProps<{ service: ServiceName; title: string }>()

const status = ref<'loading' | 'up' | 'down'>('loading')

onMounted(async () => {
  try {
    const result = await fetchStatus(props.service)
    status.value = result.status === 'UP' ? 'up' : 'down'
  } catch {
    status.value = 'down'
  }
})
</script>

<template>
  <div class="card">
    <h3>{{ title }}</h3>
    <span class="badge" :class="status">{{ status.toUpperCase() }}</span>
  </div>
</template>

<style scoped>
.card {
  border: 1px solid #ddd;
  border-radius: 8px;
  padding: 1rem 1.25rem;
  min-width: 180px;
}
.badge {
  font-size: 0.8rem;
  font-weight: 600;
}
.badge.up {
  color: #1a7f37;
}
.badge.down {
  color: #cf222e;
}
.badge.loading {
  color: #888;
}
</style>
