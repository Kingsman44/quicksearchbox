package org.p5610a.p5611a.p5612a.p5617e;

import java.io.IOException;
import java.io.OutputStream;
import org.p5610a.p5611a.p5612a.C71986f;
import org.p5610a.p5611a.p5612a.C71989i;

/* renamed from: org.a.a.a.e.c */
/* compiled from: PG */
public final class C71984c extends OutputStream {

    /* renamed from: a */
    private final int f191698a = Integer.MAX_VALUE;

    /* renamed from: b */
    private long f191699b;

    /* renamed from: c */
    private boolean f191700c;

    /* renamed from: d */
    private final C71986f f191701d;

    public C71984c(C71986f fVar) {
        this.f191701d = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63182a(int i) {
        if (!this.f191700c && this.f191699b + ((long) i) > ((long) this.f191698a)) {
            this.f191700c = true;
            throw new IllegalArgumentException(String.format("Cannot read more than %,d into a byte array", new Object[]{Integer.MAX_VALUE}));
        }
    }

    public final void close() {
        try {
            C71985d dVar = this.f191701d.f191702a;
            byte[] bArr = C71989i.f191703a;
            dVar.flush();
        } catch (IOException unused) {
        }
        C71985d dVar2 = this.f191701d.f191702a;
        byte[] bArr2 = C71989i.f191703a;
    }

    public final void flush() {
        C71985d dVar = this.f191701d.f191702a;
        byte[] bArr = C71989i.f191703a;
        dVar.flush();
    }

    public final void write(int i) {
        mo63182a(1);
        C71985d dVar = this.f191701d.f191702a;
        byte[] bArr = C71989i.f191703a;
        dVar.write(i);
        this.f191699b++;
    }

    public final void write(byte[] bArr) {
        int length = bArr.length;
        mo63182a(length);
        C71985d dVar = this.f191701d.f191702a;
        byte[] bArr2 = C71989i.f191703a;
        dVar.write(bArr);
        this.f191699b += (long) length;
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo63182a(i2);
        C71985d dVar = this.f191701d.f191702a;
        byte[] bArr2 = C71989i.f191703a;
        dVar.write(bArr, i, i2);
        this.f191699b += (long) i2;
    }
}
