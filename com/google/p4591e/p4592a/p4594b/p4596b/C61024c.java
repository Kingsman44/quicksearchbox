package com.google.p4591e.p4592a.p4594b.p4596b;

import com.google.p4591e.p4592a.p4603d.C61069w;
import java.security.PublicKey;
import java.security.Signature;

/* renamed from: com.google.e.a.b.b.c */
/* compiled from: PG */
public final class C61024c extends C61027f {

    /* renamed from: c */
    private final byte[] f165241c;

    /* renamed from: d */
    private final byte[] f165242d;

    public C61024c(C61022a aVar, C61026e eVar, byte[] bArr, byte[] bArr2) {
        super(aVar, eVar);
        bArr.getClass();
        this.f165241c = bArr;
        bArr2.getClass();
        this.f165242d = bArr2;
    }

    /* renamed from: a */
    public final boolean mo57576a(PublicKey publicKey) {
        if ("RS256".equals(((C61022a) this.f165243a).algorithm)) {
            return C61069w.m93433a(Signature.getInstance("SHA256withRSA"), publicKey, this.f165241c, this.f165242d);
        }
        return false;
    }
}
