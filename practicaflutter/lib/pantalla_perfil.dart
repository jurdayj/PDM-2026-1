//Actividad: Aplicaciones Flutter.
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 9 de junio de 2026
//Fecha última modificación:9 de junio de 2026

import 'package:flutter/material.dart';

class PantallaPerfil extends StatelessWidget {
  const PantallaPerfil({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Perfil Personal'),
        backgroundColor: Colors.green,
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          children: [
            Image.network(
              'https://raw.githubusercontent.com/jurdayj/PDM-2026-1/refs/heads/main/src/main/res/drawable/imagen.png',
              width: 150,
              height: 150,
            ),
            const SizedBox(height: 20),
            const Text(
              'Joel Urday',
              style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
            ),
            const Text('Carrera: Ingeniería de Software'),
            const SizedBox(height: 20),
            //Filas para organizar el ícono y el texto de forma horizontal
            const Row(
              children: [
                Icon(Icons.email),
                SizedBox(width: 10),
                Text('jurdayj@ulasalle.edu.pe'),
              ],
            ),
            const SizedBox(height: 10),
            const Row(
              children: [
                Icon(Icons.phone),
                SizedBox(width: 10),
                Text('+51 958273205'),
              ],
            ),
          ],
        ),
      ),
    );
  }
}