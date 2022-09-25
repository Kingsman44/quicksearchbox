package com.google.ads.interactivemedia.p367v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ip */
/* compiled from: PG */
public final class C7017ip implements C6971gx {

    /* renamed from: b */
    private int f22473b;

    /* renamed from: c */
    private float f22474c = 1.0f;

    /* renamed from: d */
    private float f22475d = 1.0f;

    /* renamed from: e */
    private C6969gv f22476e = C6969gv.f22231a;

    /* renamed from: f */
    private C6969gv f22477f;

    /* renamed from: g */
    private C6969gv f22478g;

    /* renamed from: h */
    private C6969gv f22479h;

    /* renamed from: i */
    private boolean f22480i;

    /* renamed from: j */
    private C7016io f22481j;

    /* renamed from: k */
    private ByteBuffer f22482k;

    /* renamed from: l */
    private ShortBuffer f22483l;

    /* renamed from: m */
    private ByteBuffer f22484m;

    /* renamed from: n */
    private long f22485n;

    /* renamed from: o */
    private long f22486o;

    /* renamed from: p */
    private boolean f22487p;

    public C7017ip() {
        C6969gv gvVar = C6969gv.f22231a;
        this.f22477f = gvVar;
        this.f22478g = gvVar;
        this.f22479h = gvVar;
        ByteBuffer byteBuffer = f22236a;
        this.f22482k = byteBuffer;
        this.f22483l = byteBuffer.asShortBuffer();
        this.f22484m = f22236a;
        this.f22473b = -1;
    }

    /* renamed from: a */
    public final C6969gv mo15892a(C6969gv gvVar) {
        if (gvVar.f22234d == 2) {
            int i = this.f22473b;
            if (i == -1) {
                i = gvVar.f22232b;
            }
            this.f22476e = gvVar;
            C6969gv gvVar2 = new C6969gv(i, gvVar.f22233c, 2);
            this.f22477f = gvVar2;
            this.f22480i = true;
            return gvVar2;
        }
        throw new C6970gw(gvVar);
    }

    /* renamed from: b */
    public final boolean mo15893b() {
        if (this.f22477f.f22232b == -1) {
            return false;
        }
        if (Math.abs(this.f22474c - 4.0f) >= 1.0E-4f || Math.abs(this.f22475d - 4.0f) >= 1.0E-4f || this.f22477f.f22232b != this.f22476e.f22232b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo15894c(ByteBuffer byteBuffer) {
        C7016io ioVar = this.f22481j;
        ary.m19467t(ioVar);
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f22485n += (long) remaining;
            ioVar.mo16019a(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int e = ioVar.mo16023e();
        if (e > 0) {
            if (this.f22482k.capacity() < e) {
                ByteBuffer order = ByteBuffer.allocateDirect(e).order(ByteOrder.nativeOrder());
                this.f22482k = order;
                this.f22483l = order.asShortBuffer();
            } else {
                this.f22482k.clear();
                this.f22483l.clear();
            }
            ioVar.mo16020b(this.f22483l);
            this.f22486o += (long) e;
            this.f22482k.limit(e);
            this.f22484m = this.f22482k;
        }
    }

    /* renamed from: d */
    public final void mo15895d() {
        C7016io ioVar = this.f22481j;
        if (ioVar != null) {
            ioVar.mo16021c();
        }
        this.f22487p = true;
    }

    /* renamed from: e */
    public final ByteBuffer mo15896e() {
        ByteBuffer byteBuffer = this.f22484m;
        this.f22484m = f22236a;
        return byteBuffer;
    }

    /* renamed from: f */
    public final boolean mo15897f() {
        if (!this.f22487p) {
            return false;
        }
        C7016io ioVar = this.f22481j;
        return ioVar == null || ioVar.mo16023e() == 0;
    }

    /* renamed from: g */
    public final void mo15898g() {
        if (mo15893b()) {
            this.f22478g = this.f22476e;
            this.f22479h = this.f22477f;
            if (this.f22480i) {
                C6969gv gvVar = this.f22478g;
                this.f22481j = new C7016io(gvVar.f22232b, gvVar.f22233c, this.f22474c, this.f22475d, this.f22479h.f22232b);
            } else {
                C7016io ioVar = this.f22481j;
                if (ioVar != null) {
                    ioVar.mo16022d();
                }
            }
        }
        this.f22484m = f22236a;
        this.f22485n = 0;
        this.f22486o = 0;
        this.f22487p = false;
    }

    /* renamed from: h */
    public final void mo15899h() {
        this.f22474c = 1.0f;
        this.f22475d = 1.0f;
        this.f22476e = C6969gv.f22231a;
        C6969gv gvVar = C6969gv.f22231a;
        this.f22477f = gvVar;
        this.f22478g = gvVar;
        this.f22479h = gvVar;
        ByteBuffer byteBuffer = f22236a;
        this.f22482k = byteBuffer;
        this.f22483l = byteBuffer.asShortBuffer();
        this.f22484m = f22236a;
        this.f22473b = -1;
        this.f22480i = false;
        this.f22481j = null;
        this.f22485n = 0;
        this.f22486o = 0;
        this.f22487p = false;
    }

    /* renamed from: i */
    public final long mo16024i(long j) {
        long j2 = this.f22486o;
        if (j2 >= 1024) {
            int i = this.f22479h.f22232b;
            int i2 = this.f22478g.f22232b;
            if (i == i2) {
                return aeu.m18496N(j, this.f22485n, j2);
            }
            return aeu.m18496N(j, this.f22485n * ((long) i), j2 * ((long) i2));
        }
        double d = (double) this.f22474c;
        double d2 = (double) j;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (long) (d * d2);
    }

    /* renamed from: j */
    public final void mo16025j(float f) {
        if (this.f22475d != f) {
            this.f22475d = f;
            this.f22480i = true;
        }
    }

    /* renamed from: k */
    public final void mo16026k(float f) {
        if (this.f22474c != f) {
            this.f22474c = f;
            this.f22480i = true;
        }
    }
}
