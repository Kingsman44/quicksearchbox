package org.p5610a.p5611a.p5612a.p5617e;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.p5610a.p5611a.p5612a.C71989i;

/* renamed from: org.a.a.a.e.a */
/* compiled from: PG */
public abstract class C71982a extends OutputStream {

    /* renamed from: a */
    public int f191692a;

    /* renamed from: b */
    public byte[] f191693b;

    /* renamed from: c */
    protected int f191694c;

    /* renamed from: d */
    private final List f191695d = new ArrayList();

    /* renamed from: e */
    private int f191696e;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo63169a(int i) {
        if (this.f191696e < this.f191695d.size() - 1) {
            this.f191692a += this.f191693b.length;
            int i2 = this.f191696e + 1;
            this.f191696e = i2;
            this.f191693b = (byte[]) this.f191695d.get(i2);
            return;
        }
        byte[] bArr = this.f191693b;
        if (bArr == null) {
            this.f191692a = 0;
        } else {
            int length = bArr.length;
            i = Math.max(length + length, i - this.f191692a);
            this.f191692a += this.f191693b.length;
        }
        this.f191696e++;
        byte[] b = C71989i.m105287b(i);
        this.f191693b = b;
        this.f191695d.add(b);
    }

    /* renamed from: b */
    public abstract byte[] mo63170b();

    /* renamed from: c */
    public final byte[] mo63171c() {
        int i = this.f191694c;
        if (i == 0) {
            return C71989i.f191703a;
        }
        byte[] b = C71989i.m105287b(i);
        int i2 = 0;
        for (byte[] bArr : this.f191695d) {
            int min = Math.min(bArr.length, i);
            System.arraycopy(bArr, 0, b, i2, min);
            i2 += min;
            i -= min;
            if (i == 0) {
                break;
            }
        }
        return b;
    }

    public final void close() {
    }

    @Deprecated
    public final String toString() {
        return new String(mo63170b(), Charset.defaultCharset());
    }
}
