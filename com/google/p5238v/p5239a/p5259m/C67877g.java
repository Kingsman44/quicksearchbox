package com.google.p5238v.p5239a.p5259m;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.v.a.m.g */
/* compiled from: PG */
final class C67877g extends ThreadLocal {
    /* renamed from: a */
    protected static final Cipher m98110a() {
        try {
            return (Cipher) C67838ak.f183948a.mo59993a("AES/CTR/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m98110a();
    }
}
