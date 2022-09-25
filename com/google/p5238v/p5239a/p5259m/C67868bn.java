package com.google.p5238v.p5239a.p5259m;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: com.google.v.a.m.bn */
/* compiled from: PG */
final class C67868bn extends FilterOutputStream {

    /* renamed from: a */
    final ByteBuffer f184009a;

    /* renamed from: b */
    final ByteBuffer f184010b;

    /* renamed from: c */
    boolean f184011c = true;

    /* renamed from: d */
    private final C67866bl f184012d;

    /* renamed from: e */
    private final int f184013e;

    public C67868bn(C67852ay ayVar, OutputStream outputStream, byte[] bArr) {
        super(outputStream);
        C67866bl h = ayVar.mo60002h(bArr);
        this.f184012d = h;
        int f = ayVar.mo60000f();
        this.f184013e = f;
        ByteBuffer allocate = ByteBuffer.allocate(f);
        this.f184009a = allocate;
        this.f184010b = ByteBuffer.allocate(ayVar.mo59998d());
        allocate.limit(f - ayVar.mo59997c());
        ByteBuffer a = h.mo60003a();
        byte[] bArr2 = new byte[a.remaining()];
        a.get(bArr2);
        this.out.write(bArr2);
    }

    public final synchronized void close() {
        if (this.f184011c) {
            try {
                this.f184009a.flip();
                this.f184010b.clear();
                this.f184012d.mo60005c(this.f184009a, this.f184010b);
                this.f184010b.flip();
                this.out.write(this.f184010b.array(), this.f184010b.position(), this.f184010b.remaining());
                this.f184011c = false;
                super.close();
            } catch (GeneralSecurityException e) {
                int remaining = this.f184009a.remaining();
                int remaining2 = this.f184010b.remaining();
                throw new IOException("ptBuffer.remaining():" + remaining + " ctBuffer.remaining():" + remaining2, e);
            }
        }
    }

    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final synchronized void write(byte[] bArr, int i, int i2) {
        if (this.f184011c) {
            while (i2 > this.f184009a.remaining()) {
                int remaining = this.f184009a.remaining();
                ByteBuffer wrap = ByteBuffer.wrap(bArr, i, remaining);
                i += remaining;
                i2 -= remaining;
                try {
                    this.f184009a.flip();
                    this.f184010b.clear();
                    this.f184012d.mo60004b(this.f184009a, wrap, this.f184010b);
                    this.f184010b.flip();
                    this.out.write(this.f184010b.array(), this.f184010b.position(), this.f184010b.remaining());
                    this.f184009a.clear();
                    this.f184009a.limit(this.f184013e);
                } catch (GeneralSecurityException e) {
                    throw new IOException(e);
                }
            }
            this.f184009a.put(bArr, i, i2);
        } else {
            throw new IOException("Trying to write to closed stream");
        }
    }
}
