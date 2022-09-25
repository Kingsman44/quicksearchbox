package androidx.media3.exoplayer.p138b;

import androidx.media3.common.p136b.C2612ak;
import java.nio.ByteBuffer;

/* renamed from: androidx.media3.exoplayer.b.av */
/* compiled from: PG */
final class C2805av extends C2829y {

    /* renamed from: d */
    public int f7826d;

    /* renamed from: e */
    public int f7827e;

    /* renamed from: f */
    public long f7828f;

    /* renamed from: g */
    private boolean f7829g;

    /* renamed from: h */
    private int f7830h;

    /* renamed from: i */
    private byte[] f7831i = C2612ak.f7254f;

    /* renamed from: j */
    private int f7832j;

    /* renamed from: b */
    public final ByteBuffer mo6541b() {
        int i;
        if (super.mo6545h() && (i = this.f7832j) > 0) {
            mo6569j(i).put(this.f7831i, 0, this.f7832j).flip();
            this.f7832j = 0;
        }
        return super.mo6541b();
    }

    /* renamed from: e */
    public final void mo6500e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        if (i != 0) {
            int min = Math.min(i, this.f7830h);
            this.f7828f += (long) (min / this.f7920b.f7842e);
            this.f7830h -= min;
            byteBuffer.position(position + min);
            if (this.f7830h <= 0) {
                int i2 = i - min;
                int length = (this.f7832j + i2) - this.f7831i.length;
                ByteBuffer j = mo6569j(length);
                int f = C2612ak.m6981f(length, 0, this.f7832j);
                j.put(this.f7831i, 0, f);
                int f2 = C2612ak.m6981f(length - f, 0, i2);
                byteBuffer.limit(byteBuffer.position() + f2);
                j.put(byteBuffer);
                byteBuffer.limit(limit);
                int i3 = i2 - f2;
                int i4 = this.f7832j - f;
                this.f7832j = i4;
                byte[] bArr = this.f7831i;
                System.arraycopy(bArr, f, bArr, 0, i4);
                byteBuffer.get(this.f7831i, this.f7832j, i3);
                this.f7832j += i3;
                j.flip();
            }
        }
    }

    /* renamed from: h */
    public final boolean mo6545h() {
        return super.mo6545h() && this.f7832j == 0;
    }

    /* renamed from: i */
    public final C2807c mo6501i(C2807c cVar) {
        if (cVar.f7841d == 2) {
            this.f7829g = true;
            return (this.f7826d == 0 && this.f7827e == 0) ? C2807c.f7838a : cVar;
        }
        throw new C2808d(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo6534k() {
        if (this.f7829g) {
            this.f7829g = false;
            int i = this.f7827e;
            int i2 = this.f7920b.f7842e;
            this.f7831i = new byte[(i * i2)];
            this.f7830h = this.f7826d * i2;
        }
        this.f7832j = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo6535l() {
        if (this.f7829g) {
            int i = this.f7832j;
            if (i > 0) {
                this.f7828f += (long) (i / this.f7920b.f7842e);
            }
            this.f7832j = 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo6536m() {
        this.f7831i = C2612ak.f7254f;
    }
}
