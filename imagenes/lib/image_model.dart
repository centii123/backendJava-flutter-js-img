class ImageModel {
  final int id;
  final String nombre;
  final String tipo;
  final String datos;

  ImageModel({required this.id, required this.nombre, required this.tipo, required this.datos});

  factory ImageModel.fromJson(Map<String, dynamic> json) {
    return ImageModel(
      id: json['id'],
      nombre: json['nombre'],
      tipo: json['tipo'],
      datos: json['datos'],
    );
  }
}