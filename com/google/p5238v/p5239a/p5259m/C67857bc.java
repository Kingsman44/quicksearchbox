package com.google.p5238v.p5239a.p5259m;

import com.google.p5238v.p5239a.C67909y;
import com.google.p5238v.p5239a.p5254i.C67641a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.v.a.m.bc */
/* compiled from: PG */
public final class C67857bc implements C67909y {

    /* renamed from: a */
    private final C67641a f183979a;

    /* renamed from: b */
    private final int f183980b;

    public C67857bc(C67641a aVar, int i) {
        this.f183979a = aVar;
        this.f183980b = i;
        if (i >= 10) {
            aVar.mo59969a(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    /* renamed from: a */
    public final void mo59961a(byte[] bArr, byte[] bArr2) {
        if (!C67886p.m98134b(mo59962b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    /* renamed from: b */
    public final byte[] mo59962b(byte[] bArr) {
        return this.f183979a.mo59969a(bArr, this.f183980b);
    }
}
