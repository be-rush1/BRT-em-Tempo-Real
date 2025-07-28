FROM node:18-alpine AS builder

WORKDIR /app

COPY . .

RUN npm install \
 && npm install axios \
 && npm install react-leaflet leaflet \
 && npm install @mui/material @emotion/react @emotion/styled

RUN npm run build

FROM nginx:alpine

RUN rm -rf /usr/share/nginx/html/*

COPY --from=builder /app/build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
