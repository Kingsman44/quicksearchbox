package com.google.p5238v.p5239a.p5246d.p5247a;

import com.google.p5238v.p5239a.p5259m.C67869bo;
import com.google.p5238v.p5239a.p5259m.C67886p;
import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.d.a.e */
/* compiled from: PG */
final class C67558e {

    /* renamed from: a */
    public static final byte[] f183468a = new byte[0];

    /* renamed from: b */
    public final C67557d f183469b;

    /* renamed from: c */
    public final byte[] f183470c;

    /* renamed from: d */
    public final byte[] f183471d;

    /* renamed from: e */
    private final BigInteger f183472e;

    /* renamed from: f */
    private final byte[] f183473f;

    /* renamed from: g */
    private BigInteger f183474g = BigInteger.ZERO;

    public C67558e(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, C67557d dVar) {
        this.f183471d = bArr;
        this.f183470c = bArr2;
        this.f183473f = bArr3;
        this.f183472e = bigInteger;
        this.f183469b = dVar;
    }

    /* renamed from: a */
    public final synchronized byte[] mo59926a() {
        byte[] d;
        d = C67886p.m98136d(this.f183473f, C67869bo.m98079d(this.f183474g, this.f183469b.mo59918b()));
        if (this.f183474g.compareTo(this.f183472e) < 0) {
            this.f183474g = this.f183474g.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return d;
    }
}
