package com.google.protobuf;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import p3186j$.p3188io.DesugarInputStream;
import p3186j$.p3188io.InputStreamRetargetInterface;

/* renamed from: com.google.protobuf.cu */
/* compiled from: PG */
final class C62975cu extends InputStream implements InputStreamRetargetInterface {

    /* renamed from: a */
    private Iterator f170013a;

    /* renamed from: b */
    private ByteBuffer f170014b;

    /* renamed from: c */
    private int f170015c = 0;

    /* renamed from: d */
    private int f170016d;

    /* renamed from: e */
    private int f170017e;

    /* renamed from: f */
    private boolean f170018f;

    /* renamed from: g */
    private byte[] f170019g;

    /* renamed from: h */
    private int f170020h;

    /* renamed from: i */
    private long f170021i;

    public C62975cu(Iterable iterable) {
        this.f170013a = iterable.iterator();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            this.f170015c++;
        }
        this.f170016d = -1;
        if (!m95561b()) {
            this.f170014b = C62972cr.f170011c;
            this.f170016d = 0;
            this.f170017e = 0;
            this.f170021i = 0;
        }
    }

    /* renamed from: a */
    private final void m95560a(int i) {
        int i2 = this.f170017e + i;
        this.f170017e = i2;
        if (i2 == this.f170014b.limit()) {
            m95561b();
        }
    }

    /* renamed from: b */
    private final boolean m95561b() {
        this.f170016d++;
        if (!this.f170013a.hasNext()) {
            return false;
        }
        ByteBuffer byteBuffer = (ByteBuffer) this.f170013a.next();
        this.f170014b = byteBuffer;
        this.f170017e = byteBuffer.position();
        if (this.f170014b.hasArray()) {
            this.f170018f = true;
            this.f170019g = this.f170014b.array();
            this.f170020h = this.f170014b.arrayOffset();
        } else {
            this.f170018f = false;
            this.f170021i = C63054fs.m95962a(this.f170014b);
            this.f170019g = null;
        }
        return true;
    }

    public final int read() {
        byte a;
        if (this.f170016d == this.f170015c) {
            return -1;
        }
        if (this.f170018f) {
            a = this.f170019g[this.f170017e + this.f170020h];
            m95560a(1);
        } else {
            int i = this.f170017e;
            a = C63054fs.f170169a.mo59123a(((long) i) + this.f170021i);
            m95560a(1);
        }
        return a & 255;
    }

    public final /* synthetic */ long transferTo(OutputStream outputStream) {
        return DesugarInputStream.transferTo(this, outputStream);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f170016d == this.f170015c) {
            return -1;
        }
        int limit = this.f170014b.limit();
        int i3 = this.f170017e;
        int i4 = limit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.f170018f) {
            System.arraycopy(this.f170019g, i3 + this.f170020h, bArr, i, i2);
            m95560a(i2);
        } else {
            int position = this.f170014b.position();
            ByteBuffer byteBuffer = (ByteBuffer) this.f170014b.position(this.f170017e);
            this.f170014b.get(bArr, i, i2);
            ByteBuffer byteBuffer2 = (ByteBuffer) this.f170014b.position(position);
            m95560a(i2);
        }
        return i2;
    }
}
