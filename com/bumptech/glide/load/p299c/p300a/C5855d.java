package com.bumptech.glide.load.p299c.p300a;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5962u;
import com.bumptech.glide.load.p293a.C5679av;
import com.bumptech.glide.load.p293a.p294a.C5642d;
import com.bumptech.glide.load.p293a.p294a.C5643e;
import com.bumptech.glide.load.p299c.C5878b;

/* renamed from: com.bumptech.glide.load.c.a.d */
/* compiled from: PG */
public final class C5855d implements C5962u {

    /* renamed from: a */
    private final C5642d f17458a = new C5643e();

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo12294b(Object obj, C5960s sVar) {
        ImageDecoder.Source source = (ImageDecoder.Source) obj;
        return true;
    }

    /* renamed from: c */
    public final C5679av mo12293a(ImageDecoder.Source source, int i, int i2, C5960s sVar) {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new C5878b(i, i2, sVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            int width = decodeBitmap.getWidth();
            int height = decodeBitmap.getHeight();
            Log.v("BitmapImageDecoder", "Decoded [" + width + "x" + height + "] for [" + i + "x" + i2 + "]");
        }
        return new C5856e(decodeBitmap, this.f17458a);
    }
}
