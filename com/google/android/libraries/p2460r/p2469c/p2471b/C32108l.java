package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: com.google.android.libraries.r.c.b.l */
/* compiled from: PG */
final class C32108l {

    /* renamed from: a */
    final Bitmap[] f86207a = new Bitmap[4];

    /* renamed from: b */
    private final Canvas f86208b;

    /* renamed from: c */
    private final int f86209c;

    /* renamed from: d */
    private final Paint f86210d;

    public C32108l(int i, Canvas canvas, Paint paint) {
        this.f86208b = canvas;
        this.f86209c = i;
        this.f86210d = paint;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bitmap mo37906a(int i) {
        if (i == 0) {
            Bitmap[] bitmapArr = this.f86207a;
            if (bitmapArr[0] == null) {
                int i2 = this.f86209c;
                bitmapArr[0] = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
                this.f86208b.setBitmap(this.f86207a[0]);
                this.f86208b.drawColor(-16777216);
                Canvas canvas = this.f86208b;
                float f = (float) this.f86209c;
                canvas.drawCircle(f, f, f, this.f86210d);
            }
            return this.f86207a[0];
        } else if (i == 1) {
            Bitmap[] bitmapArr2 = this.f86207a;
            if (bitmapArr2[1] == null) {
                int i3 = this.f86209c;
                bitmapArr2[1] = Bitmap.createBitmap(i3, i3, Bitmap.Config.ALPHA_8);
                this.f86208b.setBitmap(this.f86207a[1]);
                this.f86208b.drawColor(-16777216);
                Canvas canvas2 = this.f86208b;
                float f2 = (float) this.f86209c;
                canvas2.drawCircle(0.0f, f2, f2, this.f86210d);
            }
            return this.f86207a[1];
        } else if (i != 2) {
            Bitmap[] bitmapArr3 = this.f86207a;
            if (bitmapArr3[3] == null) {
                int i4 = this.f86209c;
                bitmapArr3[3] = Bitmap.createBitmap(i4, i4, Bitmap.Config.ALPHA_8);
                this.f86208b.setBitmap(this.f86207a[3]);
                this.f86208b.drawColor(-16777216);
                this.f86208b.drawCircle(0.0f, 0.0f, (float) this.f86209c, this.f86210d);
            }
            return this.f86207a[3];
        } else {
            Bitmap[] bitmapArr4 = this.f86207a;
            if (bitmapArr4[2] == null) {
                int i5 = this.f86209c;
                bitmapArr4[2] = Bitmap.createBitmap(i5, i5, Bitmap.Config.ALPHA_8);
                this.f86208b.setBitmap(this.f86207a[2]);
                this.f86208b.drawColor(-16777216);
                Canvas canvas3 = this.f86208b;
                float f3 = (float) this.f86209c;
                canvas3.drawCircle(f3, 0.0f, f3, this.f86210d);
            }
            return this.f86207a[2];
        }
    }
}
