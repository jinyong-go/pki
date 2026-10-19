# pki
PKI toy project

## Structure

```
backend/
  common/      공통 모듈 (BouncyCastle provider, 공통 응답/예외 처리)
  ra-server/   Registration Authority   :8081
  ca-server/   Certificate Authority    :8082
  tsa-server/  Time Stamping Authority  :8083
web/           Vue 3 + Vite + TypeScript :5173
```

## Stack

- Backend: JDK 21, Kotlin 2.4, Spring Boot 4.1, BouncyCastle 1.86, springdoc-openapi
- Web: Vue 3, Vite, TypeScript, Vue Router, Pinia, Axios, Vitest

## Run

```bash
# backend (JDK 21 toolchain은 Gradle이 자동 프로비저닝)
./gradlew :backend:ra-server:bootRun
./gradlew :backend:ca-server:bootRun
./gradlew :backend:tsa-server:bootRun

# web (/api/{ra,ca,tsa} 요청은 각 서버로 프록시)
cd web && npm install && npm run dev
```

- Status: `GET /api/{ra|ca|tsa}/status`
- Swagger UI: `http://localhost:{port}/swagger-ui.html`
