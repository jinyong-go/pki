import { describe, it, expect, vi } from 'vitest'
import { flushPromises, mount } from '@vue/test-utils'
import type { fetchStatus } from '@/api/status'
import ServiceStatusCard from '../ServiceStatusCard.vue'

vi.mock('@/api/status', () => ({
  fetchStatus: vi.fn<typeof fetchStatus>().mockResolvedValue({ service: 'CA', status: 'UP' }),
}))

describe('ServiceStatusCard', () => {
  it('renders status from API', async () => {
    const wrapper = mount(ServiceStatusCard, { props: { service: 'ca', title: 'CA' } })
    await flushPromises()
    expect(wrapper.text()).toContain('CA')
    expect(wrapper.text()).toContain('UP')
  })
})
