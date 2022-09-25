package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hu */
/* compiled from: PG */
final class C6995hu extends C6994ht {

    /* renamed from: d */
    private int[] f22320d;

    /* renamed from: e */
    private int[] f22321e;

    /* renamed from: c */
    public final void mo15894c(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) ary.m19467t(this.f22321e);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer i = mo15983i(((limit - position) / this.f22313b.f22235e) * this.f22314c.f22235e);
        while (position < limit) {
            for (int i2 : iArr) {
                i.putShort(byteBuffer.getShort(i2 + i2 + position));
            }
            position += this.f22313b.f22235e;
        }
        byteBuffer.position(limit);
        i.flip();
    }

    /* renamed from: k */
    public final C6969gv mo15985k(C6969gv gvVar) {
        int[] iArr = this.f22320d;
        if (iArr == null) {
            return C6969gv.f22231a;
        }
        if (gvVar.f22234d == 2) {
            boolean z = gvVar.f22233c != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new C6969gv(gvVar.f22232b, length, 2) : C6969gv.f22231a;
                }
                int i2 = iArr[i];
                if (i2 < gvVar.f22233c) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new C6970gw(gvVar);
                }
            }
        } else {
            throw new C6970gw(gvVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo15987m() {
        this.f22321e = this.f22320d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo15988n() {
        this.f22321e = null;
        this.f22320d = null;
    }

    /* renamed from: o */
    public final void mo15989o(int[] iArr) {
        this.f22320d = iArr;
    }
}
