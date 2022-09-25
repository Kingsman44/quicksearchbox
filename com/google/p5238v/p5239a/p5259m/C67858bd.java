package com.google.p5238v.p5239a.p5259m;

import java.security.SecureRandom;

/* renamed from: com.google.v.a.m.bd */
/* compiled from: PG */
final class C67858bd extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
