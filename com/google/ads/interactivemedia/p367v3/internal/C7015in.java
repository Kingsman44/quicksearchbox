package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.in */
/* compiled from: PG */
public final class C7015in extends C6994ht {

    /* renamed from: d */
    private final long f22439d = 150000;

    /* renamed from: e */
    private final long f22440e = 20000;

    /* renamed from: f */
    private final short f22441f = 1024;

    /* renamed from: g */
    private int f22442g;

    /* renamed from: h */
    private boolean f22443h;

    /* renamed from: i */
    private byte[] f22444i = aeu.f20471f;

    /* renamed from: j */
    private byte[] f22445j = aeu.f20471f;

    /* renamed from: k */
    private int f22446k;

    /* renamed from: l */
    private int f22447l;

    /* renamed from: m */
    private int f22448m;

    /* renamed from: n */
    private boolean f22449n;

    /* renamed from: o */
    private long f22450o;

    public C7015in() {
        ary.m19462o(true);
    }

    /* renamed from: q */
    private final void m20778q(byte[] bArr, int i) {
        mo15983i(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.f22449n = true;
        }
    }

    /* renamed from: r */
    private final void m20779r(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int min = Math.min(byteBuffer.remaining(), this.f22448m);
        int i2 = this.f22448m - min;
        System.arraycopy(bArr, i - i2, this.f22445j, 0, i2);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f22445j, i2, min);
    }

    /* renamed from: s */
    private final int m20780s(long j) {
        return (int) ((j * ((long) this.f22313b.f22232b)) / 1000000);
    }

    /* renamed from: t */
    private final int m20781t(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > 1024) {
                int i = this.f22442g;
                return i * (position / i);
            }
        }
        return byteBuffer.limit();
    }

    /* renamed from: b */
    public final boolean mo15893b() {
        return this.f22443h;
    }

    /* renamed from: c */
    public final void mo15894c(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !mo15984j()) {
            int i = this.f22446k;
            if (i == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f22444i.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > 1024) {
                            int i2 = this.f22442g;
                            position = ((limit2 / i2) * i2) + i2;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f22446k = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    mo15983i(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f22449n = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i != 1) {
                int limit3 = byteBuffer.limit();
                int t = m20781t(byteBuffer);
                byteBuffer.limit(t);
                this.f22450o += (long) (byteBuffer.remaining() / this.f22442g);
                m20779r(byteBuffer, this.f22445j, this.f22448m);
                if (t < limit3) {
                    m20778q(this.f22445j, this.f22448m);
                    this.f22446k = 0;
                    byteBuffer.limit(limit3);
                }
            } else {
                int limit4 = byteBuffer.limit();
                int t2 = m20781t(byteBuffer);
                int position2 = t2 - byteBuffer.position();
                byte[] bArr = this.f22444i;
                int length = bArr.length;
                int i3 = this.f22447l;
                int i4 = length - i3;
                if (t2 >= limit4 || position2 >= i4) {
                    int min = Math.min(position2, i4);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f22444i, this.f22447l, min);
                    int i5 = this.f22447l + min;
                    this.f22447l = i5;
                    byte[] bArr2 = this.f22444i;
                    if (i5 == bArr2.length) {
                        if (this.f22449n) {
                            m20778q(bArr2, this.f22448m);
                            long j = this.f22450o;
                            int i6 = this.f22447l;
                            int i7 = this.f22448m;
                            this.f22450o = j + ((long) ((i6 - (i7 + i7)) / this.f22442g));
                            i5 = i6;
                        } else {
                            this.f22450o += (long) ((i5 - this.f22448m) / this.f22442g);
                        }
                        m20779r(byteBuffer, this.f22444i, i5);
                        this.f22447l = 0;
                        this.f22446k = 2;
                    }
                    byteBuffer.limit(limit4);
                } else {
                    m20778q(bArr, i3);
                    this.f22447l = 0;
                    this.f22446k = 0;
                }
            }
        }
    }

    /* renamed from: k */
    public final C6969gv mo15985k(C6969gv gvVar) {
        if (gvVar.f22234d == 2) {
            return this.f22443h ? gvVar : C6969gv.f22231a;
        }
        throw new C6970gw(gvVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo15986l() {
        int i = this.f22447l;
        if (i > 0) {
            m20778q(this.f22444i, i);
        }
        if (!this.f22449n) {
            this.f22450o += (long) (this.f22448m / this.f22442g);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo15987m() {
        if (this.f22443h) {
            this.f22442g = this.f22313b.f22235e;
            int s = m20780s(150000) * this.f22442g;
            if (this.f22444i.length != s) {
                this.f22444i = new byte[s];
            }
            int s2 = m20780s(20000) * this.f22442g;
            this.f22448m = s2;
            if (this.f22445j.length != s2) {
                this.f22445j = new byte[s2];
            }
        }
        this.f22446k = 0;
        this.f22450o = 0;
        this.f22447l = 0;
        this.f22449n = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo15988n() {
        this.f22443h = false;
        this.f22448m = 0;
        this.f22444i = aeu.f20471f;
        this.f22445j = aeu.f20471f;
    }

    /* renamed from: o */
    public final void mo16017o(boolean z) {
        this.f22443h = z;
    }

    /* renamed from: p */
    public final long mo16018p() {
        return this.f22450o;
    }
}
