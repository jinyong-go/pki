import { http, type ApiResponse } from './http'

export type ServiceName = 'ra' | 'ca' | 'tsa'

export interface ServiceStatus {
  service: string
  status: string
}

export async function fetchStatus(service: ServiceName): Promise<ServiceStatus> {
  const res = await http.get<ApiResponse<ServiceStatus>>(`/api/${service}/status`)
  if (!res.data.success || !res.data.data) {
    throw new Error(res.data.error?.message ?? 'Unknown error')
  }
  return res.data.data
}
