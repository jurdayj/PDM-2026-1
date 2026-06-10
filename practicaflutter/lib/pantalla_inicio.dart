//Actividad: Aplicaciones Flutter.
//Autor: Urday Jerí, Joel Robert
//Fecha creación: 9 de junio de 2026
//Fecha última modificación:9 de junio de 2026

import 'package:flutter/material.dart';

class PantallaInicio extends StatelessWidget {
  const PantallaInicio({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Bienvenido'),
        backgroundColor: Colors.blue,
      ),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        //Columna para ordenar los elementos de arriba a abajo
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            const Text(
              'Bienvenido a mi aplicación personal.',
              style: TextStyle(fontSize: 20),
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: () {},
              child: const Text('Ver mi perfil'),
            ),
          ],
        ),
      ),
    );
  }
}