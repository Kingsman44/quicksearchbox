package androidx.media3.exoplayer.p138b;

import androidx.media3.common.p136b.C2612ak;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.b.ao */
/* compiled from: PG */
final class C2798ao extends C2829y {

    /* renamed from: d */
    private static final int f7769d = Float.floatToIntBits(Float.NaN);

    /* renamed from: n */
    private static void m7680n(int i, ByteBuffer byteBuffer) {
        double d = (double) i;
        Double.isNaN(d);
        int floatToIntBits = Float.floatToIntBits((float) (d * 4.656612875245797E-10d));
        if (floatToIntBits == f7769d) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    /* renamed from: e */
    public final void mo6500e(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f7920b.f7841d;
        if (i2 == 536870912) {
            byteBuffer2 = mo6569j((i / 3) * 4);
            while (position < limit) {
                m7680n(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i2 == 805306368) {
            byteBuffer2 = mo6569j(i);
            while (position < limit) {
                m7680n((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    /* renamed from: i */
    public final C2807c mo6501i(C2807c cVar) {
        int i = cVar.f7841d;
        if (C2612ak.m6955ae(i)) {
            return i != 4 ? new C2807c(cVar.f7839b, cVar.f7840c, 4) : C2807c.f7838a;
        }
        throw new C2808d(cVar);
    }
}
