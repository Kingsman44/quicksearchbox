package com.android.p271h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.io.InputStream;

/* renamed from: com.android.h.e */
/* compiled from: PG */
final class C5166e implements C5167f {

    /* renamed from: a */
    final Bitmap f16425a;

    /* renamed from: b */
    Canvas f16426b;

    /* renamed from: c */
    Paint f16427c;

    private C5166e(Bitmap bitmap) {
        this.f16425a = bitmap;
    }

    /* renamed from: d */
    public static C5166e m14104d(InputStream inputStream) {
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        if (decodeStream != null) {
            return new C5166e(decodeStream);
        }
        return null;
    }

    /* renamed from: a */
    public final int mo10251a() {
        return this.f16425a.getHeight();
    }

    /* renamed from: b */
    public final int mo10252b() {
        return this.f16425a.getWidth();
    }

    /* renamed from: c */
    public final Bitmap mo10253c(Rect rect, BitmapFactory.Options options) {
        if (this.f16426b == null) {
            this.f16426b = new Canvas();
            Paint paint = new Paint();
            this.f16427c = paint;
            paint.setFilterBitmap(true);
        }
        int max = Math.max(options.inSampleSize, 1);
        Bitmap createBitmap = Bitmap.createBitmap(rect.width() / max, rect.height() / max, Bitmap.Config.ARGB_8888);
        this.f16426b.setBitmap(createBitmap);
        this.f16426b.save();
        float f = 1.0f / ((float) max);
        this.f16426b.scale(f, f);
        this.f16426b.drawBitmap(this.f16425a, (float) (-rect.left), (float) (-rect.top), this.f16427c);
        this.f16426b.restore();
        this.f16426b.setBitmap((Bitmap) null);
        return createBitmap;
    }
}
