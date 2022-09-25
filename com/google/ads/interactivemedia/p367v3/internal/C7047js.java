package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.js */
/* compiled from: PG */
public class C7047js {

    /* renamed from: a */
    protected final C7041jm f22562a;

    /* renamed from: b */
    protected final C7046jr f22563b;

    /* renamed from: c */
    protected C7043jo f22564c;

    /* renamed from: d */
    private final int f22565d;

    protected C7047js(C7044jp jpVar, C7046jr jrVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.f22563b = jrVar;
        this.f22565d = i;
        this.f22562a = new C7041jm(jpVar, j, j2, j3, j4, j5);
    }

    /* renamed from: f */
    protected static final int m20885f(C7050jv jvVar, long j, C7067kl klVar) {
        if (j == jvVar.mo16099l()) {
            return 0;
        }
        klVar.f22624a = j;
        return 1;
    }

    /* renamed from: g */
    protected static final boolean m20886g(C7050jv jvVar, long j) {
        long l = j - jvVar.mo16099l();
        if (l < 0 || l > 262144) {
            return false;
        }
        jvVar.mo16091d((int) l);
        return true;
    }

    /* renamed from: a */
    public final C7070ko mo16081a() {
        return this.f22562a;
    }

    /* renamed from: b */
    public final void mo16082b(long j) {
        long j2 = j;
        C7043jo joVar = this.f22564c;
        if (joVar == null || joVar.f22550a != j2) {
            C7043jo joVar2 = r1;
            C7043jo joVar3 = new C7043jo(j, this.f22562a.mo16077d(j2), 0, this.f22562a.f22546c, this.f22562a.f22547d, this.f22562a.f22548e, this.f22562a.f22549f);
            this.f22564c = joVar2;
        }
    }

    /* renamed from: c */
    public final boolean mo16083c() {
        return this.f22564c != null;
    }

    /* renamed from: d */
    public final int mo16084d(C7050jv jvVar, C7067kl klVar) {
        while (true) {
            C7043jo joVar = this.f22564c;
            ary.m19466s(joVar);
            long c = joVar.f22555f;
            long d = joVar.f22556g;
            long e = joVar.f22557h;
            if (d - c <= ((long) this.f22565d)) {
                mo16085e();
                return m20885f(jvVar, c, klVar);
            } else if (!m20886g(jvVar, e)) {
                return m20885f(jvVar, e, klVar);
            } else {
                jvVar.mo16097j();
                C7045jq b = this.f22563b.mo16080b(jvVar, joVar.f22551b);
                int d2 = b.f22559b;
                if (d2 == -3) {
                    mo16085e();
                    return m20885f(jvVar, e, klVar);
                } else if (d2 == -2) {
                    C7043jo.m20874h(joVar, b.f22560c, b.f22561d);
                } else if (d2 != -1) {
                    m20886g(jvVar, b.f22561d);
                    long unused = b.f22561d;
                    mo16085e();
                    return m20885f(jvVar, b.f22561d, klVar);
                } else {
                    C7043jo.m20873g(joVar, b.f22560c, b.f22561d);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo16085e() {
        this.f22564c = null;
        this.f22563b.mo16079a();
    }
}
