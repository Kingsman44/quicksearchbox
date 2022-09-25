package com.bumptech.glide.load.p299c;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.C5734b;
import com.bumptech.glide.load.C5960s;
import com.bumptech.glide.load.C5961t;
import com.bumptech.glide.load.p299c.p300a.C5826ae;
import com.bumptech.glide.load.p299c.p300a.C5873v;
import com.bumptech.glide.load.p299c.p300a.C5876y;

/* renamed from: com.bumptech.glide.load.c.b */
/* compiled from: PG */
public final class C5878b implements ImageDecoder.OnHeaderDecodedListener {

    /* renamed from: a */
    private final C5826ae f17488a = C5826ae.m15058a();

    /* renamed from: b */
    private final int f17489b;

    /* renamed from: c */
    private final int f17490c;

    /* renamed from: d */
    private final C5734b f17491d;

    /* renamed from: e */
    private final C5873v f17492e;

    /* renamed from: f */
    private final boolean f17493f;

    /* renamed from: g */
    private final C5961t f17494g;

    public C5878b(int i, int i2, C5960s sVar) {
        this.f17489b = i;
        this.f17490c = i2;
        this.f17491d = (C5734b) sVar.mo12401b(C5876y.f17477a);
        this.f17492e = (C5873v) sVar.mo12401b(C5873v.f17475f);
        boolean z = false;
        if (sVar.mo12401b(C5876y.f17480d) != null && ((Boolean) sVar.mo12401b(C5876y.f17480d)).booleanValue()) {
            z = true;
        }
        this.f17493f = z;
        this.f17494g = (C5961t) sVar.mo12401b(C5876y.f17478b);
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f17488a.mo12297b(this.f17489b, this.f17490c, this.f17493f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f17491d == C5734b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new C5820a());
        Size size = imageInfo.getSize();
        int i = this.f17489b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.f17490c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float a = this.f17492e.mo12332a(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(((float) size.getWidth()) * a);
        int round2 = Math.round(((float) size.getHeight()) * a);
        if (Log.isLoggable("ImageDecoder", 2)) {
            int width = size.getWidth();
            int height = size.getHeight();
            Log.v("ImageDecoder", "Resizing from [" + width + "x" + height + "] to [" + round + "x" + round2 + "] scaleFactor: " + a);
        }
        imageDecoder.setTargetSize(round, round2);
        C5961t tVar = this.f17494g;
        if (tVar != null) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((tVar != C5961t.DISPLAY_P3 || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3));
        }
    }
}
