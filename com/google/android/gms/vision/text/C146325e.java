package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;

/* renamed from: com.google.android.gms.vision.text.e */
/* compiled from: PG */
final class C146325e {
    /* renamed from: a */
    static Rect m238290a(C146323c cVar) {
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MAX_VALUE;
        int i3 = LinearLayoutManager.INVALID_OFFSET;
        int i4 = LinearLayoutManager.INVALID_OFFSET;
        for (Point point : cVar.mo122890d()) {
            i = Math.min(i, point.x);
            i3 = Math.max(i3, point.x);
            i2 = Math.min(i2, point.y);
            i4 = Math.max(i4, point.y);
        }
        return new Rect(i, i2, i3, i4);
    }

    /* renamed from: b */
    static Point[] m238291b(BoundingBoxParcel boundingBoxParcel) {
        Point[] pointArr = new Point[4];
        double sin = Math.sin(Math.toRadians((double) boundingBoxParcel.f395235e));
        double cos = Math.cos(Math.toRadians((double) boundingBoxParcel.f395235e));
        pointArr[0] = new Point(boundingBoxParcel.f395231a, boundingBoxParcel.f395232b);
        int i = boundingBoxParcel.f395231a;
        double d = (double) boundingBoxParcel.f395233c;
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        int i2 = (int) (d2 + (d * cos));
        double d3 = (double) boundingBoxParcel.f395232b;
        Double.isNaN(d);
        Double.isNaN(d3);
        Point point = new Point(i2, (int) (d3 + (d * sin)));
        pointArr[1] = point;
        double d4 = (double) point.x;
        double d5 = (double) boundingBoxParcel.f395234d;
        Double.isNaN(d5);
        Double.isNaN(d4);
        int i3 = (int) (d4 - (d5 * sin));
        double d6 = (double) pointArr[1].y;
        double d7 = (double) boundingBoxParcel.f395234d;
        Double.isNaN(d7);
        Double.isNaN(d6);
        pointArr[2] = new Point(i3, (int) (d6 + (d7 * cos)));
        pointArr[3] = new Point(pointArr[0].x + (pointArr[2].x - pointArr[1].x), pointArr[0].y + (pointArr[2].y - pointArr[1].y));
        return pointArr;
    }
}
