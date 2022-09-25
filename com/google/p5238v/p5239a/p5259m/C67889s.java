package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67536ag;
import com.google.p5238v.p5239a.p5243b.p5244a.C67543a;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* renamed from: com.google.v.a.m.s */
/* compiled from: PG */
public final class C67889s implements C67536ag {

    /* renamed from: a */
    public final ECPrivateKey f184057a;

    /* renamed from: b */
    public final String f184058b;

    /* renamed from: c */
    public final int f184059c;

    public C67889s(ECPrivateKey eCPrivateKey, int i, int i2) {
        if (C67543a.m97645a(2)) {
            this.f184057a = eCPrivateKey;
            this.f184058b = C67869bo.m98081f(i);
            this.f184059c = i2;
            return;
        }
        throw new GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
    }
}
