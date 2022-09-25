package com.google.p5238v.p5239a.p5259m;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* renamed from: com.google.v.a.m.f */
/* compiled from: PG */
final class C67876f extends ThreadLocal {
    /* renamed from: a */
    protected static final Cipher m98109a() {
        try {
            return (Cipher) C67838ak.f183948a.mo59993a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return m98109a();
    }
}
