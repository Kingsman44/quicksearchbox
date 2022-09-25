package com.android.p271h;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.android.h.g */
/* compiled from: PG */
final class C5168g implements C5167f {

    /* renamed from: a */
    final BitmapRegionDecoder f16428a;

    private C5168g(BitmapRegionDecoder bitmapRegionDecoder) {
        this.f16428a = bitmapRegionDecoder;
    }

    /* renamed from: d */
    public static C5168g m14111d(InputStream inputStream) {
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(inputStream, false);
            if (newInstance != null) {
                return new C5168g(newInstance);
            }
            return null;
        } catch (IOException e) {
            Log.w("BitmapRegionTileSource", "getting decoder failed", e);
            return null;
        }
    }

    /* renamed from: a */
    public final int mo10251a() {
        return this.f16428a.getHeight();
    }

    /* renamed from: b */
    public final int mo10252b() {
        return this.f16428a.getWidth();
    }

    /* renamed from: c */
    public final Bitmap mo10253c(Rect rect, BitmapFactory.Options options) {
        return this.f16428a.decodeRegion(rect, options);
    }
}
