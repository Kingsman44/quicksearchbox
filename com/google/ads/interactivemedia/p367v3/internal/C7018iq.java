package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.iq */
/* compiled from: PG */
final class C7018iq extends C6994ht {

    /* renamed from: d */
    private int f22488d;

    /* renamed from: e */
    private int f22489e;

    /* renamed from: f */
    private boolean f22490f;

    /* renamed from: g */
    private int f22491g;

    /* renamed from: h */
    private byte[] f22492h = aeu.f20471f;

    /* renamed from: i */
    private int f22493i;

    /* renamed from: j */
    private long f22494j;

    /* renamed from: c */
    public final void mo15894c(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f22491g);
            this.f22494j += (long) (min / this.f22313b.f22235e);
            this.f22491g -= min;
            byteBuffer.position(position + min);
            if (this.f22491g <= 0) {
                int i2 = i - min;
                int length = (this.f22493i + i2) - this.f22492h.length;
                ByteBuffer i3 = mo15983i(length);
                int H = aeu.m18490H(length, 0, this.f22493i);
                i3.put(this.f22492h, 0, H);
                int H2 = aeu.m18490H(length - H, 0, i2);
                byteBuffer.limit(byteBuffer.position() + H2);
                i3.put(byteBuffer);
                byteBuffer.limit(limit);
                int i4 = i2 - H2;
                int i5 = this.f22493i - H;
                this.f22493i = i5;
                byte[] bArr = this.f22492h;
                System.arraycopy(bArr, H, bArr, 0, i5);
                byteBuffer.get(this.f22492h, this.f22493i, i4);
                this.f22493i += i4;
                i3.flip();
            }
        }
    }

    /* renamed from: e */
    public final ByteBuffer mo15896e() {
        int i;
        if (super.mo15897f() && (i = this.f22493i) > 0) {
            mo15983i(i).put(this.f22492h, 0, this.f22493i).flip();
            this.f22493i = 0;
        }
        return super.mo15896e();
    }

    /* renamed from: f */
    public final boolean mo15897f() {
        return super.mo15897f() && this.f22493i == 0;
    }

    /* renamed from: k */
    public final C6969gv mo15985k(C6969gv gvVar) {
        if (gvVar.f22234d == 2) {
            this.f22490f = true;
            return (this.f22488d == 0 && this.f22489e == 0) ? C6969gv.f22231a : gvVar;
        }
        throw new C6970gw(gvVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo15986l() {
        if (this.f22490f) {
            int i = this.f22493i;
            if (i > 0) {
                this.f22494j += (long) (i / this.f22313b.f22235e);
            }
            this.f22493i = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo15987m() {
        if (this.f22490f) {
            this.f22490f = false;
            int i = this.f22489e;
            int i2 = this.f22313b.f22235e;
            this.f22492h = new byte[(i * i2)];
            this.f22491g = this.f22488d * i2;
        }
        this.f22493i = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo15988n() {
        this.f22492h = aeu.f20471f;
    }

    /* renamed from: o */
    public final void mo16027o(int i, int i2) {
        this.f22488d = i;
        this.f22489e = i2;
    }

    /* renamed from: p */
    public final void mo16028p() {
        this.f22494j = 0;
    }

    /* renamed from: q */
    public final long mo16029q() {
        return this.f22494j;
    }
}
