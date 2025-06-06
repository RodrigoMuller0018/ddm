package com.ifsc.ddm;

import android.graphics.Paint;

import android.graphics.Path;

public class Camada {
    Path path;
    Paint paint;

    public Camada() {
        path = new Path();
        paint = new Paint();
        paint.setColor(0xFF000000); // Cor padrão preta
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
    }
    public Camada(Paint paint) {
        // Construtor que recebe um objeto Paint para criar uma nova camada com o mesmo estilo
        this.path = new Path();
        this.paint = new Paint(paint);
    }

}