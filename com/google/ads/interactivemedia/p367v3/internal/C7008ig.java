package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ig */
/* compiled from: PG */
final class C7008ig extends C6994ht {

    /* renamed from: d */
    private static final int f22412d = Float.floatToIntBits(Float.NaN);

    /* renamed from: o */
    private static void m20720o(int i, ByteBuffer byteBuffer) {
        double d = (double) i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == f22412d) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: c */
    public final void mo15894c(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f22313b.f22234d;
        if (i2 == 536870912) {
            byteBuffer2 = mo15983i((i / 3) * 4);
            while (position < limit) {
                m20720o(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo15983i(i);
            while (position < limit) {
                m20720o((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: k */
    public final C6969gv mo15985k(C6969gv gvVar) {
        int i = gvVar.f22234d;
        if (aeu.m18507Y(i)) {
            return i != 4 ? new C6969gv(gvVar.f22232b, gvVar.f22233c, 4) : C6969gv.f22231a;
        }
        throw new C6970gw(gvVar);
    }
}
