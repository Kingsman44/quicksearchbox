package com.google.android.gms.vision.text;

import android.graphics.Point;
import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.SparseArray;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.vision.text.internal.client.BoundingBoxParcel;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.vision.text.d */
/* compiled from: PG */
public final class C146324d implements C146323c {

    /* renamed from: a */
    private LineBoxParcel[] f395227a;

    /* renamed from: b */
    private Point[] f395228b;

    /* renamed from: c */
    private List f395229c;

    /* renamed from: d */
    private Rect f395230d;

    public C146324d(SparseArray sparseArray) {
        this.f395227a = new LineBoxParcel[sparseArray.size()];
        int i = 0;
        while (true) {
            LineBoxParcel[] lineBoxParcelArr = this.f395227a;
            if (i < lineBoxParcelArr.length) {
                lineBoxParcelArr[i] = (LineBoxParcel) sparseArray.valueAt(i);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final Rect mo122887a() {
        if (this.f395230d == null) {
            this.f395230d = C146325e.m238290a(this);
        }
        return this.f395230d;
    }

    /* renamed from: b */
    public final String mo122888b() {
        LineBoxParcel[] lineBoxParcelArr = this.f395227a;
        if (lineBoxParcelArr.length == 0) {
            return BuildConfig.FLAVOR;
        }
        StringBuilder sb = new StringBuilder(lineBoxParcelArr[0].f395240e);
        for (int i = 1; i < this.f395227a.length; i++) {
            sb.append("\n");
            sb.append(this.f395227a[i].f395240e);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final List mo122889c() {
        return mo122891e();
    }

    /* renamed from: d */
    public final Point[] mo122890d() {
        LineBoxParcel[] lineBoxParcelArr;
        C146324d dVar = this;
        if (dVar.f395228b == null) {
            char c = 0;
            if (dVar.f395227a.length == 0) {
                dVar.f395228b = new Point[0];
            } else {
                int i = LinearLayoutManager.INVALID_OFFSET;
                int i2 = LinearLayoutManager.INVALID_OFFSET;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MAX_VALUE;
                int i5 = 0;
                while (true) {
                    lineBoxParcelArr = dVar.f395227a;
                    if (i5 >= lineBoxParcelArr.length) {
                        break;
                    }
                    BoundingBoxParcel boundingBoxParcel = lineBoxParcelArr[i5].f395237b;
                    BoundingBoxParcel boundingBoxParcel2 = lineBoxParcelArr[c].f395237b;
                    int i6 = boundingBoxParcel2.f395231a;
                    int i7 = boundingBoxParcel2.f395232b;
                    double sin = Math.sin(Math.toRadians((double) boundingBoxParcel2.f395235e));
                    double cos = Math.cos(Math.toRadians((double) boundingBoxParcel2.f395235e));
                    Point[] pointArr = new Point[4];
                    Point point = new Point(boundingBoxParcel.f395231a, boundingBoxParcel.f395232b);
                    pointArr[c] = point;
                    point.offset(-i6, -i7);
                    double d = (double) pointArr[c].x;
                    Double.isNaN(d);
                    int i8 = i2;
                    double d2 = (double) pointArr[c].y;
                    Double.isNaN(d2);
                    int i9 = (int) ((d * cos) + (d2 * sin));
                    double d3 = (double) (-pointArr[0].x);
                    Double.isNaN(d3);
                    double d4 = d3 * sin;
                    double d5 = (double) pointArr[0].y;
                    Double.isNaN(d5);
                    int i10 = (int) (d4 + (d5 * cos));
                    pointArr[0].x = i9;
                    pointArr[0].y = i10;
                    pointArr[1] = new Point(boundingBoxParcel.f395233c + i9, i10);
                    pointArr[2] = new Point(boundingBoxParcel.f395233c + i9, boundingBoxParcel.f395234d + i10);
                    pointArr[3] = new Point(i9, i10 + boundingBoxParcel.f395234d);
                    i2 = i8;
                    for (int i11 = 0; i11 < 4; i11++) {
                        Point point2 = pointArr[i11];
                        i3 = Math.min(i3, point2.x);
                        i = Math.max(i, point2.x);
                        i4 = Math.min(i4, point2.y);
                        i2 = Math.max(i2, point2.y);
                    }
                    i5++;
                    c = 0;
                    dVar = this;
                }
                int i12 = i2;
                BoundingBoxParcel boundingBoxParcel3 = lineBoxParcelArr[0].f395237b;
                int i13 = boundingBoxParcel3.f395231a;
                int i14 = boundingBoxParcel3.f395232b;
                double sin2 = Math.sin(Math.toRadians((double) boundingBoxParcel3.f395235e));
                double cos2 = Math.cos(Math.toRadians((double) boundingBoxParcel3.f395235e));
                int i15 = i12;
                Point[] pointArr2 = {new Point(i3, i4), new Point(i, i4), new Point(i, i15), new Point(i3, i15)};
                for (int i16 = 0; i16 < 4; i16++) {
                    int i17 = pointArr2[i16].x;
                    int i18 = pointArr2[i16].y;
                    int i19 = pointArr2[i16].x;
                    int i20 = pointArr2[i16].y;
                    Point point3 = pointArr2[i16];
                    double d6 = (double) i17;
                    Double.isNaN(d6);
                    double d7 = (double) i18;
                    Double.isNaN(d7);
                    point3.x = (int) ((d6 * cos2) - (d7 * sin2));
                    Point point4 = pointArr2[i16];
                    double d8 = (double) i19;
                    Double.isNaN(d8);
                    double d9 = (double) i20;
                    Double.isNaN(d9);
                    point4.y = (int) ((d8 * sin2) + (d9 * cos2));
                    pointArr2[i16].offset(i13, i14);
                }
                dVar = this;
                dVar.f395228b = pointArr2;
            }
        }
        return dVar.f395228b;
    }

    /* renamed from: e */
    public final List mo122891e() {
        int length = this.f395227a.length;
        if (length == 0) {
            return new ArrayList(0);
        }
        if (this.f395229c == null) {
            this.f395229c = new ArrayList(length);
            for (LineBoxParcel bVar : this.f395227a) {
                this.f395229c.add(new C146322b(bVar));
            }
        }
        return this.f395229c;
    }
}
