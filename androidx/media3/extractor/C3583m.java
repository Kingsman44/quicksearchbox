package androidx.media3.extractor;

import androidx.media3.common.p136b.C2601a;

/* renamed from: androidx.media3.extractor.m */
/* compiled from: PG */
public class C3583m {

    /* renamed from: a */
    public final C3403g f11419a;

    /* renamed from: b */
    protected final C3574l f11420b;

    /* renamed from: c */
    protected C3440i f11421c;

    /* renamed from: d */
    private final int f11422d;

    protected C3583m(C3455j jVar, C3574l lVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.f11420b = lVar;
        this.f11422d = i;
        this.f11419a = new C3403g(jVar, j, j2, j3, j4, j5);
    }

    /* renamed from: e */
    protected static final int m10371e(C3327ab abVar, long j, C3350ay ayVar) {
        if (j == ((C3627q) abVar).f11566c) {
            return 0;
        }
        ayVar.f10122a = j;
        return 1;
    }

    /* renamed from: f */
    protected static final boolean m10372f(C3327ab abVar, long j) {
        C3627q qVar = (C3627q) abVar;
        long j2 = j - qVar.f11566c;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        qVar.mo7639q((int) j2);
        return true;
    }

    /* renamed from: a */
    public final int mo7487a(C3327ab abVar, C3350ay ayVar) {
        while (true) {
            C3440i iVar = this.f11421c;
            C2601a.m6829a(iVar);
            long j = iVar.f10613e;
            long j2 = iVar.f10614f;
            long j3 = iVar.f10615g;
            if (j2 - j <= ((long) this.f11422d)) {
                mo7490d();
                return m10371e(abVar, j, ayVar);
            } else if (!m10372f(abVar, j3)) {
                return m10371e(abVar, j3, ayVar);
            } else {
                ((C3627q) abVar).f11568e = 0;
                C3526k a = this.f11420b.mo7366a(abVar, iVar.f10610b);
                int i = a.f11025b;
                if (i == -3) {
                    mo7490d();
                    return m10371e(abVar, j3, ayVar);
                } else if (i == -2) {
                    long j4 = a.f11026c;
                    long j5 = a.f11027d;
                    iVar.f10611c = j4;
                    iVar.f10613e = j5;
                    iVar.mo7399b();
                } else if (i != -1) {
                    m10372f(abVar, a.f11027d);
                    long j6 = a.f11027d;
                    mo7490d();
                    return m10371e(abVar, a.f11027d, ayVar);
                } else {
                    long j7 = a.f11026c;
                    long j8 = a.f11027d;
                    iVar.f10612d = j7;
                    iVar.f10614f = j8;
                    iVar.mo7399b();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo7488b(long j) {
        long j2 = j;
        C3440i iVar = this.f11421c;
        if (iVar == null || iVar.f10609a != j2) {
            long a = this.f11419a.f10414a.mo7365a(j2);
            C3403g gVar = this.f11419a;
            this.f11421c = new C3440i(j, a, gVar.f10415b, gVar.f10416c, gVar.f10417d, gVar.f10418e);
        }
    }

    /* renamed from: c */
    public final boolean mo7489c() {
        return this.f11421c != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo7490d() {
        this.f11421c = null;
        this.f11420b.mo7367b();
    }
}
