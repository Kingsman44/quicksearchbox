package com.google.android.libraries.social.populous.p3296e.p3298b;

/* renamed from: com.google.android.libraries.social.populous.e.b.g */
/* compiled from: PG */
public final class C42428g extends C42417an {

    /* renamed from: a */
    public String f111295a;

    /* renamed from: b */
    public String f111296b;

    /* renamed from: c */
    public Boolean f111297c;

    /* renamed from: d */
    public Boolean f111298d;

    /* renamed from: e */
    public Boolean f111299e;

    /* renamed from: f */
    public Boolean f111300f;

    /* renamed from: g */
    public Boolean f111301g;

    /* renamed from: h */
    public Boolean f111302h;

    /* renamed from: i */
    public Boolean f111303i;

    /* renamed from: j */
    public Boolean f111304j;

    /* renamed from: k */
    public Boolean f111305k;

    /* renamed from: l */
    public Boolean f111306l;

    /* renamed from: m */
    public Integer f111307m;

    /* renamed from: n */
    public Integer f111308n;

    /* renamed from: o */
    public Integer f111309o;

    /* renamed from: p */
    private int f111310p;

    /* renamed from: q */
    private int f111311q;

    /* renamed from: r */
    private long f111312r;

    /* renamed from: s */
    private long f111313s;

    /* renamed from: t */
    private byte f111314t;

    /* renamed from: a */
    public final C42418ao mo45416a() {
        if (this.f111314t == 15) {
            return new C42429h(this.f111310p, this.f111311q, this.f111312r, this.f111313s, this.f111295a, this.f111296b, this.f111297c, this.f111298d, this.f111299e, this.f111300f, this.f111301g, this.f111302h, this.f111303i, this.f111304j, this.f111305k, this.f111306l, this.f111307m, this.f111308n, this.f111309o);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f111314t & 1) == 0) {
            sb.append(" timesContacted");
        }
        if ((this.f111314t & 2) == 0) {
            sb.append(" fieldTimesUsed");
        }
        if ((this.f111314t & 4) == 0) {
            sb.append(" lastTimeContacted");
        }
        if ((this.f111314t & 8) == 0) {
            sb.append(" fieldLastTimeUsed");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo45417b(long j) {
        this.f111313s = j;
        this.f111314t = (byte) (this.f111314t | 8);
    }

    /* renamed from: c */
    public final void mo45418c(int i) {
        this.f111311q = i;
        this.f111314t = (byte) (this.f111314t | 2);
    }

    /* renamed from: d */
    public final void mo45419d(long j) {
        this.f111312r = j;
        this.f111314t = (byte) (this.f111314t | 4);
    }

    /* renamed from: e */
    public final void mo45420e(int i) {
        this.f111310p = i;
        this.f111314t = (byte) (this.f111314t | 1);
    }
}
