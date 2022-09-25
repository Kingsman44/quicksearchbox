package com.google.p4591e.p4592a.p4603d;

import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

/* renamed from: com.google.e.a.d.w */
/* compiled from: PG */
public final class C61069w {
    /* renamed from: a */
    public static boolean m93433a(Signature signature, PublicKey publicKey, byte[] bArr, byte[] bArr2) {
        signature.initVerify(publicKey);
        signature.update(bArr2);
        try {
            return signature.verify(bArr);
        } catch (SignatureException unused) {
            return false;
        }
    }
}
