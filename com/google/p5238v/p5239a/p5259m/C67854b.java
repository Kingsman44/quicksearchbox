package com.google.p5238v.p5239a.p5259m;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.v.a.m.b */
/* compiled from: PG */
final class C67854b implements C67866bl {

    /* renamed from: a */
    final /* synthetic */ C67873c f183966a;

    /* renamed from: b */
    private final SecretKeySpec f183967b;

    /* renamed from: c */
    private final SecretKeySpec f183968c;

    /* renamed from: d */
    private final Cipher f183969d = C67873c.m98093i();

    /* renamed from: e */
    private final Mac f183970e;

    /* renamed from: f */
    private final byte[] f183971f;

    /* renamed from: g */
    private final ByteBuffer f183972g;

    /* renamed from: h */
    private long f183973h = 0;

    public C67854b(C67873c cVar, byte[] bArr) {
        this.f183966a = cVar;
        this.f183970e = cVar.mo60021j();
        this.f183973h = 0;
        byte[] a = C67859be.m98062a(cVar.f184016a);
        byte[] a2 = C67859be.m98062a(7);
        this.f183971f = a2;
        ByteBuffer allocate = ByteBuffer.allocate(cVar.f184016a + 8);
        this.f183972g = allocate;
        allocate.put((byte) (cVar.f184016a + 8));
        allocate.put(a);
        allocate.put(a2);
        allocate.flip();
        byte[] m = cVar.mo60024m(a, bArr);
        this.f183967b = cVar.mo60023l(m);
        this.f183968c = cVar.mo60022k(m);
    }

    /* renamed from: a */
    public final ByteBuffer mo60003a() {
        return this.f183972g.asReadOnlyBuffer();
    }

    /* renamed from: b */
    public final synchronized void mo60004b(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
        int position = byteBuffer3.position();
        byte[] n = C67873c.m98094n(this.f183971f, this.f183973h, false);
        this.f183969d.init(1, this.f183967b, new IvParameterSpec(n));
        this.f183973h++;
        this.f183969d.update(byteBuffer, byteBuffer3);
        this.f183969d.doFinal(byteBuffer2, byteBuffer3);
        ByteBuffer duplicate = byteBuffer3.duplicate();
        duplicate.flip();
        duplicate.position(position);
        this.f183970e.init(this.f183968c);
        this.f183970e.update(n);
        this.f183970e.update(duplicate);
        byteBuffer3.put(this.f183970e.doFinal(), 0, this.f183966a.f184017b);
    }

    /* renamed from: c */
    public final synchronized void mo60005c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int position = byteBuffer2.position();
        byte[] n = C67873c.m98094n(this.f183971f, this.f183973h, true);
        this.f183969d.init(1, this.f183967b, new IvParameterSpec(n));
        this.f183973h++;
        this.f183969d.doFinal(byteBuffer, byteBuffer2);
        ByteBuffer duplicate = byteBuffer2.duplicate();
        duplicate.flip();
        duplicate.position(position);
        this.f183970e.init(this.f183968c);
        this.f183970e.update(n);
        this.f183970e.update(duplicate);
        byteBuffer2.put(this.f183970e.doFinal(), 0, this.f183966a.f184017b);
    }
}
