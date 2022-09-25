package com.google.p5238v.p5239a.p5259m;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.m.a */
/* compiled from: PG */
final class C67827a implements C67865bk {

    /* renamed from: a */
    final /* synthetic */ C67873c f183916a;

    /* renamed from: b */
    private SecretKeySpec f183917b;

    /* renamed from: c */
    private SecretKeySpec f183918c;

    /* renamed from: d */
    private Cipher f183919d;

    /* renamed from: e */
    private Mac f183920e;

    /* renamed from: f */
    private byte[] f183921f;

    public C67827a(C67873c cVar) {
        this.f183916a = cVar;
    }

    /* renamed from: a */
    public final synchronized void mo59990a(ByteBuffer byteBuffer, int i, boolean z, ByteBuffer byteBuffer2) {
        int position = byteBuffer.position();
        byte[] n = C67873c.m98094n(this.f183921f, (long) i, z);
        int remaining = byteBuffer.remaining();
        int i2 = this.f183916a.f184017b;
        if (remaining >= i2) {
            int i3 = position + (remaining - i2);
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.limit(i3);
            ByteBuffer duplicate2 = byteBuffer.duplicate();
            duplicate2.position(i3);
            this.f183920e.init(this.f183918c);
            this.f183920e.update(n);
            this.f183920e.update(duplicate);
            byte[] copyOf = Arrays.copyOf(this.f183920e.doFinal(), this.f183916a.f184017b);
            byte[] bArr = new byte[this.f183916a.f184017b];
            duplicate2.get(bArr);
            if (C67886p.m98134b(bArr, copyOf)) {
                byteBuffer.limit(i3);
                this.f183919d.init(1, this.f183917b, new IvParameterSpec(n));
                this.f183919d.doFinal(byteBuffer, byteBuffer2);
            } else {
                throw new GeneralSecurityException("Tag mismatch");
            }
        } else {
            throw new GeneralSecurityException("Ciphertext too short");
        }
    }

    /* renamed from: b */
    public final synchronized void mo59991b(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() == this.f183916a.f184016a + 8) {
            byte b = byteBuffer.get();
            int i = this.f183916a.f184016a;
            if (b == i + 8) {
                this.f183921f = new byte[7];
                byte[] bArr2 = new byte[i];
                byteBuffer.get(bArr2);
                byteBuffer.get(this.f183921f);
                byte[] m = this.f183916a.mo60024m(bArr2, bArr);
                this.f183917b = this.f183916a.mo60023l(m);
                this.f183918c = this.f183916a.mo60022k(m);
                this.f183919d = C67873c.m98093i();
                this.f183920e = this.f183916a.mo60021j();
            } else {
                throw new GeneralSecurityException("Invalid ciphertext");
            }
        } else {
            throw new InvalidAlgorithmParameterException("Invalid header length");
        }
    }
}
