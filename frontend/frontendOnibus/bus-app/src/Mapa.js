import { MapContainer, TileLayer, Marker, Popup } from 'react-leaflet';
import 'leaflet/dist/leaflet.css';
import L from 'leaflet';

import icon from 'leaflet/dist/images/marker-icon.png';
import iconRetina from 'leaflet/dist/images/marker-icon-2x.png';
import shadow from 'leaflet/dist/images/marker-shadow.png';

delete L.Icon.Default.prototype._getIconUrl;
L.Icon.Default.mergeOptions({
  iconRetinaUrl: iconRetina,
  iconUrl: icon,
  shadowUrl: shadow,
});

function Mapa({ coordenadas }) {
  const center = coordenadas.length
    ? [
        coordenadas.reduce((acc, cur) => acc + cur.latitude, 0) / coordenadas.length,
        coordenadas.reduce((acc, cur) => acc + cur.longitude, 0) / coordenadas.length,
      ]
    : [0, 0]; // fallback se lista estiver vazia

  return (
    <div style={{ height: '500px', width: '100%', marginTop: '20px' }}>
      <MapContainer center={center} zoom={13} scrollWheelZoom={true} style={{ height: '100%', width: '100%' }}>
        <TileLayer
          attribution='&copy; OpenStreetMap contributors'
          url="https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png"
        />

        {coordenadas.map((item, index) => (
          <Marker key={index} position={[item.latitude, item.longitude]}>
            <Popup>
              Linha: {item.linha} <br />
              {item.trajeto}
            </Popup>
          </Marker>
        ))}
      </MapContainer>
    </div>
  );
}

export default Mapa;
