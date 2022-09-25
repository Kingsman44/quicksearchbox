package com.google.p5238v.p5239a.p5259m;

import java.security.SecureRandom;

/* renamed from: com.google.v.a.m.be */
/* compiled from: PG */
public final class C67859be {

    /* renamed from: a */
    private static final ThreadLocal f183981a = new C67858bd();

    /* renamed from: a */
    public static byte[] m98062a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f183981a.get()).nextBytes(bArr);
        return bArr;
    }
}
