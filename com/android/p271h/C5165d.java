package com.android.p271h;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.Log;
import com.android.p261d.p264c.C5053a;
import com.android.p261d.p264c.C5054b;
import com.android.p271h.p272a.C5156d;
import com.android.p271h.p272a.C5157e;

/* renamed from: com.android.h.d */
/* compiled from: PG */
public final class C5165d implements C5156d {

    /* renamed from: a */
    final C5167f f16417a;

    /* renamed from: b */
    int f16418b;

    /* renamed from: c */
    int f16419c;

    /* renamed from: d */
    final int f16420d;

    /* renamed from: e */
    public C5053a f16421e;

    /* renamed from: f */
    private final int f16422f;

    /* renamed from: g */
    private final Rect f16423g = new Rect();

    /* renamed from: h */
    private BitmapFactory.Options f16424h;

    public C5165d(Context context, C5152a aVar, byte[] bArr) {
        int i;
        this.f16420d = C5157e.m14089a(context);
        this.f16422f = aVar.f16360c;
        C5167f fVar = aVar.f16358a;
        this.f16417a = fVar;
        if (fVar != null) {
            this.f16418b = fVar.mo10252b();
            this.f16419c = fVar.mo10251a();
            BitmapFactory.Options options = new BitmapFactory.Options();
            this.f16424h = options;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            this.f16424h.inPreferQualityOverSpeed = true;
            this.f16424h.inTempStorage = bArr;
            Bitmap bitmap = aVar.f16359b;
            if (bitmap == null || bitmap.getWidth() > 2048 || bitmap.getHeight() > 2048) {
                Object[] objArr = new Object[4];
                objArr[0] = Integer.valueOf(this.f16418b);
                objArr[1] = Integer.valueOf(this.f16419c);
                int i2 = -1;
                if (bitmap == null) {
                    i = -1;
                } else {
                    i = bitmap.getWidth();
                }
                objArr[2] = Integer.valueOf(i);
                objArr[3] = Integer.valueOf(bitmap != null ? bitmap.getHeight() : i2);
                Log.w("BitmapRegionTileSource", String.format("Failed to create preview of apropriate size!  in: %dx%d, out: %dx%d", objArr));
                return;
            }
            this.f16421e = new C5054b(bitmap);
        }
    }

    public final int getImageHeight() {
        return this.f16419c;
    }

    public final int getImageWidth() {
        return this.f16418b;
    }

    public final C5053a getPreview() {
        return this.f16421e;
    }

    public final int getRotation() {
        return this.f16422f;
    }

    public final Bitmap getTile(int i, int i2, int i3, Bitmap bitmap) {
        int i4 = this.f16420d;
        int i5 = i4 << i;
        this.f16423g.set(i2, i3, i2 + i5, i5 + i3);
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
        }
        this.f16424h.inSampleSize = 1 << i;
        this.f16424h.inBitmap = bitmap;
        try {
            Bitmap c = this.f16417a.mo10253c(this.f16423g, this.f16424h);
            if (!(this.f16424h.inBitmap == c || this.f16424h.inBitmap == null)) {
                this.f16424h.inBitmap = null;
            }
            if (c == null) {
                Log.w("BitmapRegionTileSource", "fail in decoding region");
            }
            return c;
        } catch (Throwable th) {
            if (!(this.f16424h.inBitmap == bitmap || this.f16424h.inBitmap == null)) {
                this.f16424h.inBitmap = null;
            }
            throw th;
        }
    }

    public final int getTileSize() {
        return this.f16420d;
    }
}
