package com.google.p5238v.p5239a.p5259m;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.m.i */
/* compiled from: PG */
final class C67879i implements C67865bk {

    /* renamed from: a */
    final /* synthetic */ C67881k f184033a;

    /* renamed from: b */
    private SecretKeySpec f184034b;

    /* renamed from: c */
    private Cipher f184035c;

    /* renamed from: d */
    private byte[] f184036d;

    public C67879i(C67881k kVar) {
        this.f184033a = kVar;
    }

    /* renamed from: a */
    public final synchronized void mo59990a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        this.f184035c.init(2, this.f184034b, C67881k.m98122j(this.f184036d, (long) i, z));
        this.f184035c.doFinal(byteBuffer, byteBuffer2);
    }

    /* renamed from: b */
    public final synchronized void mo59991b(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() == this.f184033a.f184042a + 8) {
            byte b = byteBuffer.get();
            int i = this.f184033a.f184042a;
            if (b == i + 8) {
                this.f184036d = new byte[7];
                byte[] bArr2 = new byte[i];
                byteBuffer.get(bArr2);
                byteBuffer.get(this.f184036d);
                this.f184034b = this.f184033a.mo60028k(bArr2, bArr);
                this.f184035c = C67881k.m98121i();
            } else {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
    }
}
