package com.google.android.gms.vision;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.gms.vision.d */
/* compiled from: PG */
public final class C146303d {

    /* renamed from: a */
    public final C146302c f395162a = new C146302c();

    /* renamed from: b */
    public ByteBuffer f395163b = null;

    /* renamed from: c */
    public Bitmap f395164c = null;

    /* renamed from: a */
    public final ByteBuffer mo122866a() {
        Bitmap bitmap = this.f395164c;
        if (bitmap == null) {
            return this.f395163b;
        }
        int width = bitmap.getWidth();
        int height = this.f395164c.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        this.f395164c.getPixels(iArr, 0, width, 0, 0, width, height);
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((((float) Color.red(iArr[i2])) * 0.299f) + (((float) Color.green(iArr[i2])) * 0.587f) + (((float) Color.blue(iArr[i2])) * 0.114f)));
        }
        return ByteBuffer.wrap(bArr);
    }
}
