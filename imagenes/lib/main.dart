import 'package:flutter/material.dart';
import 'package:imagenes/agregar.dart';
import 'package:imagenes/image_list_page.dart';

void main() => runApp(const MyApp());

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Material App',
      home: Scaffold(
        appBar: AppBar(
          title: const Text('Material App Bar'),
        ),
        body: ImageUploadPage(),
      ),
    );
  }
}