//Actividad: Aplicaciones Flutter.
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 9 de junio de 2026
//Fecha última modificación:9 de junio de 2026

import 'package:flutter/material.dart';
import 'pantalla_inicio.dart';
import 'pantalla_perfil.dart';
import 'pantalla_hobbies.dart';

//Partida en la que se inicializa y se ejecuta la aplicación completa
void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Mi App Personal',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),

      //Interfaces comentadas:

      //home: const PantallaInicio(),
      //home: const PantallaPerfil(),
      home: const PantallaHobbies(),
    );
  }
}