import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

import 'image_model.dart';

class ImageListPage extends StatefulWidget {
  @override
  _ImageListPageState createState() => _ImageListPageState();
}

class _ImageListPageState extends State<ImageListPage> {
  List<ImageModel> images = [];

  @override
  void initState() {
    super.initState();
    fetchImages();
  }

  Future<void> fetchImages() async {
    final response = await http.get(Uri.parse('http://localhost:8080/api/images'));
    if (response.statusCode == 200) {
      final List<dynamic> jsonResponse = json.decode(response.body);
      setState(() {
        images = jsonResponse.map((item) => ImageModel.fromJson(item)).toList();
      });
    } else {
      throw Exception('Failed to fetch images');
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Lista de Imágenes'),
      ),
      body: ListView.builder(
        itemCount: images.length,
        itemBuilder: (BuildContext context, int index) {
          return ListTile(
            leading: Image.memory(
              base64Decode(images[index].datos),
              width: 100,
              height: 100,
            ),
            title: Text(images[index].nombre),
            subtitle: Text(images[index].tipo),
          );
        },
      ),
    );
  }
}