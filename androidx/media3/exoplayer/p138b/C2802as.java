package androidx.media3.exoplayer.p138b;

import androidx.media3.common.p136b.C2612ak;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.b.as */
/* compiled from: PG */
public final class C2802as extends C2829y {

    /* renamed from: d */
    public boolean f7780d;

    /* renamed from: e */
    public long f7781e;

    /* renamed from: f */
    private int f7782f;

    /* renamed from: g */
    private byte[] f7783g = C2612ak.f7254f;

    /* renamed from: h */
    private byte[] f7784h = C2612ak.f7254f;

    /* renamed from: i */
    private int f7785i;

    /* renamed from: j */
    private int f7786j;

    /* renamed from: k */
    private int f7787k;

    /* renamed from: l */
    private boolean f7788l;

    /* renamed from: n */
    private final int m7719n(long j) {
        return (int) ((j * ((long) this.f7920b.f7839b)) / 1000000);
    }

    /* renamed from: o */
    private final int m7720o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > 1024) {
                int i = this.f7782f;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: p */
    private final void m7721p(byte[] bArr, int i) {
        mo6569j(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f7788l = true;
        }
    }

    /* renamed from: q */
    private final void m7722q(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f7787k);
        int i2 = this.f7787k - min;
        System.arraycopy(bArr, i - i2, this.f7784h, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f7784h, i2, min);
    }

    /* renamed from: e */
    public final void mo6500e(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f7921c.hasRemaining()) {
            int i = this.f7785i;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f7783g.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.f7782f;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f7785i = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo6569j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f7788l = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i != 1) {
                int limit3 = byteBuffer.limit();
                int o = m7720o(byteBuffer);
                byteBuffer.limit(o);
                this.f7781e += (long) (byteBuffer.remaining() / this.f7782f);
                m7722q(byteBuffer, this.f7784h, this.f7787k);
                if (o < limit3) {
                    m7721p(this.f7784h, this.f7787k);
                    this.f7785i = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int o2 = m7720o(byteBuffer);
                int position2 = o2 - byteBuffer.position();
                byte[] bArr = this.f7783g;
                int length = bArr.length;
                int i3 = this.f7786j;
                int i4 = length - i3;
                if (o2 >= limit4 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f7783g, this.f7786j, min);
                    int i5 = this.f7786j + min;
                    this.f7786j = i5;
                    byte[] bArr2 = this.f7783g;
                    if (i5 == bArr2.length) {
                        if (this.f7788l) {
                            m7721p(bArr2, this.f7787k);
                            long j = this.f7781e;
                            int i6 = this.f7786j;
                            int i7 = this.f7787k;
                            this.f7781e = j + ((long) ((i6 - (i7 + i7)) / this.f7782f));
                            i5 = i6;
                        } else {
                            this.f7781e += (long) ((i5 - this.f7787k) / this.f7782f);
                        }
                        m7722q(byteBuffer, this.f7783g, i5);
                        this.f7786j = 0;
                        this.f7785i = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    m7721p(bArr, i3);
                    this.f7786j = 0;
                    this.f7785i = 0;
                }
            }
        }
    }

    /* renamed from: g */
    public final boolean mo6533g() {
        return this.f7780d;
    }

    /* renamed from: i */
    public final C2807c mo6501i(C2807c cVar) {
        if (cVar.f7841d == 2) {
            return this.f7780d ? cVar : C2807c.f7838a;
        }
        throw new C2808d(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo6534k() {
        if (this.f7780d) {
            this.f7782f = this.f7920b.f7842e;
            int n = m7719n(150000) * this.f7782f;
            if (this.f7783g.length != n) {
                this.f7783g = new byte[n];
            }
            int n2 = m7719n(20000) * this.f7782f;
            this.f7787k = n2;
            if (this.f7784h.length != n2) {
                this.f7784h = new byte[n2];
            }
        }
        this.f7785i = 0;
        this.f7781e = 0;
        this.f7786j = 0;
        this.f7788l = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo6535l() {
        int i = this.f7786j;
        if (i > 0) {
            m7721p(this.f7783g, i);
        }
        if (!this.f7788l) {
            this.f7781e += (long) (this.f7787k / this.f7782f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo6536m() {
        this.f7780d = false;
        this.f7787k = 0;
        this.f7783g = C2612ak.f7254f;
        this.f7784h = C2612ak.f7254f;
    }
}
