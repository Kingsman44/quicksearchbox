package com.google.android.gms.common;

import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C143997a;
import com.google.android.gms.common.util.C144009i;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.i */
/* compiled from: PG */
public final /* synthetic */ class C143877i implements Callable {

    /* renamed from: a */
    public final /* synthetic */ boolean f389992a;

    /* renamed from: b */
    public final /* synthetic */ String f389993b;

    /* renamed from: c */
    public final /* synthetic */ C143989n f389994c;

    public /* synthetic */ C143877i(boolean z, String str, C143989n nVar) {
        this.f389992a = z;
        this.f389993b = str;
        this.f389994c = nVar;
    }

    public final Object call() {
        boolean z = this.f389992a;
        String str = this.f389993b;
        C143989n nVar = this.f389994c;
        int i = C143993r.f390232c;
        Object[] objArr = new Object[5];
        objArr[0] = true != (!z && C143993r.m234174b(str, nVar, true, false).f390258b) ? "not allowed" : "debug cert rejected";
        objArr[1] = str;
        MessageDigest a = C143997a.m234179a("SHA-256");
        C143919bh.m233958a(a);
        byte[] digest = a.digest(((C143990o) nVar).f390226a);
        char[] cArr = C144009i.f390249a;
        int length = digest.length;
        char[] cArr2 = new char[(length + length)];
        int i2 = 0;
        for (byte b : digest) {
            byte b2 = b & 255;
            int i3 = i2 + 1;
            char[] cArr3 = C144009i.f390250b;
            cArr2[i2] = cArr3[b2 >>> 4];
            i2 = i3 + 1;
            cArr2[i3] = cArr3[b2 & 15];
        }
        objArr[2] = new String(cArr2);
        objArr[3] = Boolean.valueOf(z);
        objArr[4] = "223810000.false";
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", objArr);
    }
}
