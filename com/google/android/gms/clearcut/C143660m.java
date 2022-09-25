package com.google.android.gms.clearcut;

import java.nio.charset.Charset;
import java.util.Comparator;

/* renamed from: com.google.android.gms.clearcut.m */
/* compiled from: PG */
public final /* synthetic */ class C143660m implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C143660m f389490a = new C143660m();

    private /* synthetic */ C143660m() {
    }

    public final int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        Charset charset = C143673z.f389502a;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return bArr.length - bArr2.length;
    }
}
