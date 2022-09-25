package com.google.p5238v.p5239a.p5240a.p5241a;

import com.google.p5238v.p5239a.p5259m.C67838ak;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.v.a.a.a.b */
/* compiled from: PG */
final class C67489b extends ThreadLocal {
    /* renamed from: a */
    protected static final Cipher m97488a() {
        try {
            return (Cipher) C67838ak.f183948a.mo59993a("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m97488a();
    }
}
