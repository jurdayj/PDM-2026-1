//Actividad: Aplicaciones Flutter.
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 9 de junio de 2026
//Fecha última modificación:9 de junio de 2026

import 'package:flutter/material.dart';

class PantallaHobbies extends StatelessWidget {
  const PantallaHobbies({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Mis Hobbies'),
        backgroundColor: Colors.amber,
      ),
      body: const Padding(
        padding: const EdgeInsets.all(16.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(
              'Mis hobbies principales:',
              style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold),
            ),
            SizedBox(height: 20),
            //Filas estructuradas para emparejar cada pasatiempo con su respectivo ícono
            Row(
              children: [
                Icon(Icons.sports_esports),
                SizedBox(width: 15),
                Text('Videojuegos'),
              ],
            ),
            SizedBox(height: 15),
            Row(
              children: [
                Icon(Icons.tv),
                SizedBox(width: 15),
                Text('Series'),
              ],
            ),
            SizedBox(height: 15),
            Row(
              children: [
                Icon(Icons.audiotrack),
                SizedBox(width: 15),
                Text('Escuchar música'),
              ],
            ),
          ],
        ),
      ),
    );
  }
}