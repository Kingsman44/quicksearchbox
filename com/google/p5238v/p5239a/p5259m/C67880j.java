package com.google.p5238v.p5239a.p5259m;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.m.j */
/* compiled from: PG */
final class C67880j implements C67866bl {

    /* renamed from: a */
    private final SecretKeySpec f184037a;

    /* renamed from: b */
    private final Cipher f184038b;

    /* renamed from: c */
    private final byte[] f184039c;

    /* renamed from: d */
    private final ByteBuffer f184040d;

    /* renamed from: e */
    private long f184041e;

    public C67880j(C67881k kVar, byte[] bArr) {
        this.f184041e = 0;
        this.f184038b = C67881k.m98121i();
        this.f184041e = 0;
        byte[] a = C67859be.m98062a(kVar.f184042a);
        byte[] a2 = C67859be.m98062a(7);
        this.f184039c = a2;
        ByteBuffer allocate = ByteBuffer.allocate(kVar.f184042a + 8);
        this.f184040d = allocate;
        allocate.put((byte) (kVar.f184042a + 8));
        allocate.put(a);
        allocate.put(a2);
        allocate.flip();
        this.f184037a = kVar.mo60028k(a, bArr);
    }

    /* renamed from: a */
    public final ByteBuffer mo60003a() {
        return this.f184040d.asReadOnlyBuffer();
    }

    /* renamed from: b */
    public final synchronized void mo60004b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        this.f184038b.init(1, this.f184037a, C67881k.m98122j(this.f184039c, this.f184041e, false));
        this.f184041e++;
        if (byteBuffer2.hasRemaining()) {
            this.f184038b.update(byteBuffer, byteBuffer3);
            this.f184038b.doFinal(byteBuffer2, byteBuffer3);
            return;
        }
        this.f184038b.doFinal(byteBuffer, byteBuffer3);
    }

    /* renamed from: c */
    public final synchronized void mo60005c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        this.f184038b.init(1, this.f184037a, C67881k.m98122j(this.f184039c, this.f184041e, true));
        this.f184041e++;
        this.f184038b.doFinal(byteBuffer, byteBuffer2);
    }
}
