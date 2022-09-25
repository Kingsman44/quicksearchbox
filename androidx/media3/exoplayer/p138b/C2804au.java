package androidx.media3.exoplayer.p138b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: androidx.media3.exoplayer.b.au */
/* compiled from: PG */
public final class C2804au implements C2809e {

    /* renamed from: b */
    public float f7811b = 1.0f;

    /* renamed from: c */
    public float f7812c = 1.0f;

    /* renamed from: d */
    public C2807c f7813d;

    /* renamed from: e */
    public C2807c f7814e;

    /* renamed from: f */
    public boolean f7815f;

    /* renamed from: g */
    public C2803at f7816g;

    /* renamed from: h */
    public long f7817h;

    /* renamed from: i */
    public long f7818i;

    /* renamed from: j */
    private int f7819j;

    /* renamed from: k */
    private C2807c f7820k = C2807c.f7838a;

    /* renamed from: l */
    private C2807c f7821l;

    /* renamed from: m */
    private ByteBuffer f7822m;

    /* renamed from: n */
    private ShortBuffer f7823n;

    /* renamed from: o */
    private ByteBuffer f7824o;

    /* renamed from: p */
    private boolean f7825p;

    public C2804au() {
        C2807c cVar = C2807c.f7838a;
        this.f7821l = cVar;
        this.f7813d = cVar;
        this.f7814e = cVar;
        ByteBuffer byteBuffer = f7843a;
        this.f7822m = byteBuffer;
        this.f7823n = byteBuffer.asShortBuffer();
        this.f7824o = f7843a;
        this.f7819j = -1;
    }

    /* renamed from: a */
    public final C2807c mo6540a(C2807c cVar) {
        if (cVar.f7841d == 2) {
            int i = this.f7819j;
            if (i == -1) {
                i = cVar.f7839b;
            }
            this.f7820k = cVar;
            C2807c cVar2 = new C2807c(i, cVar.f7840c, 2);
            this.f7821l = cVar2;
            this.f7815f = true;
            return cVar2;
        }
        throw new C2808d(cVar);
    }

    /* renamed from: b */
    public final ByteBuffer mo6541b() {
        int a;
        C2803at atVar = this.f7816g;
        if (atVar != null && (a = atVar.mo6537a()) > 0) {
            if (this.f7822m.capacity() < a) {
                ByteBuffer order = ByteBuffer.allocateDirect(a).order(ByteOrder.nativeOrder());
                this.f7822m = order;
                this.f7823n = order.asShortBuffer();
            } else {
                this.f7822m.clear();
                this.f7823n.clear();
            }
            ShortBuffer shortBuffer = this.f7823n;
            int min = Math.min(shortBuffer.remaining() / atVar.f7789a, atVar.f7797i);
            shortBuffer.put(atVar.f7796h, 0, atVar.f7789a * min);
            int i = atVar.f7797i - min;
            atVar.f7797i = i;
            short[] sArr = atVar.f7796h;
            int i2 = atVar.f7789a;
            System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
            this.f7818i += (long) a;
            this.f7822m.limit(a);
            this.f7824o = this.f7822m;
        }
        ByteBuffer byteBuffer = this.f7824o;
        this.f7824o = f7843a;
        return byteBuffer;
    }

    /* renamed from: c */
    public final void mo6542c() {
        if (mo6533g()) {
            this.f7813d = this.f7820k;
            this.f7814e = this.f7821l;
            if (this.f7815f) {
                C2807c cVar = this.f7813d;
                this.f7816g = new C2803at(cVar.f7839b, cVar.f7840c, this.f7811b, this.f7812c, this.f7814e.f7839b);
            } else {
                C2803at atVar = this.f7816g;
                if (atVar != null) {
                    atVar.f7795g = 0;
                    atVar.f7797i = 0;
                    atVar.f7798j = 0;
                    atVar.f7799k = 0;
                    atVar.f7800l = 0;
                    atVar.f7801m = 0;
                    atVar.f7802n = 0;
                    atVar.f7803o = 0;
                    atVar.f7804p = 0;
                    atVar.f7805q = 0;
                }
            }
        }
        this.f7824o = f7843a;
        this.f7817h = 0;
        this.f7818i = 0;
        this.f7825p = false;
    }

    /* renamed from: d */
    public final void mo6543d() {
        int i;
        C2803at atVar = this.f7816g;
        if (atVar != null) {
            int i2 = atVar.f7795g;
            float f = atVar.f7790b;
            float f2 = atVar.f7791c;
            int i3 = atVar.f7797i + ((int) ((((((float) i2) / (f / f2)) + ((float) atVar.f7798j)) / (atVar.f7792d * f2)) + 0.5f));
            short[] sArr = atVar.f7794f;
            int i4 = atVar.f7793e;
            atVar.f7794f = atVar.mo6539c(sArr, i2, i4 + i4 + i2);
            int i5 = 0;
            while (true) {
                int i6 = atVar.f7793e;
                i = i6 + i6;
                int i7 = atVar.f7789a;
                if (i5 >= i * i7) {
                    break;
                }
                atVar.f7794f[(i7 * i2) + i5] = 0;
                i5++;
            }
            atVar.f7795g += i;
            atVar.mo6538b();
            if (atVar.f7797i > i3) {
                atVar.f7797i = i3;
            }
            atVar.f7795g = 0;
            atVar.f7801m = 0;
            atVar.f7798j = 0;
        }
        this.f7825p = true;
    }

    /* renamed from: e */
    public final void mo6500e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C2803at atVar = this.f7816g;
            atVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f7817h += (long) remaining;
            int remaining2 = asShortBuffer.remaining();
            int i = atVar.f7789a;
            int i2 = remaining2 / i;
            int i3 = i * i2;
            atVar.f7794f = atVar.mo6539c(atVar.f7794f, atVar.f7795g, i2);
            asShortBuffer.get(atVar.f7794f, atVar.f7795g * atVar.f7789a, (i3 + i3) / 2);
            atVar.f7795g += i2;
            atVar.mo6538b();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: f */
    public final void mo6544f() {
        this.f7811b = 1.0f;
        this.f7812c = 1.0f;
        this.f7820k = C2807c.f7838a;
        C2807c cVar = C2807c.f7838a;
        this.f7821l = cVar;
        this.f7813d = cVar;
        this.f7814e = cVar;
        ByteBuffer byteBuffer = f7843a;
        this.f7822m = byteBuffer;
        this.f7823n = byteBuffer.asShortBuffer();
        this.f7824o = f7843a;
        this.f7819j = -1;
        this.f7815f = false;
        this.f7816g = null;
        this.f7817h = 0;
        this.f7818i = 0;
        this.f7825p = false;
    }

    /* renamed from: g */
    public final boolean mo6533g() {
        if (this.f7821l.f7839b == -1) {
            return false;
        }
        if (Math.abs(this.f7811b - 4.0f) >= 1.0E-4f || Math.abs(this.f7812c - 4.0f) >= 1.0E-4f || this.f7821l.f7839b != this.f7820k.f7839b) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo6545h() {
        if (!this.f7825p) {
            return false;
        }
        C2803at atVar = this.f7816g;
        return atVar == null || atVar.mo6537a() == 0;
    }
}
