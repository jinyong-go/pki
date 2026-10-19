import axios from 'axios'

export interface ApiResponse<T> {
  success: boolean
  data: T | null
  error: { code: string; message: string } | null
  timestamp: string
}

export const http = axios.create({
  timeout: 10_000,
})
