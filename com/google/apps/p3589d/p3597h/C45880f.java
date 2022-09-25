package com.google.apps.p3589d.p3597h;

import com.google.apps.p3589d.p3590a.C45685b;
import com.google.apps.p3589d.p3590a.C45699p;
import com.google.apps.p3589d.p3590a.C45703t;
import com.google.apps.p3589d.p3592c.C45728d;
import com.google.apps.p3589d.p3593d.C45743b;
import com.google.apps.p3589d.p3593d.C45755n;
import com.google.apps.p3589d.p3593d.C45764w;
import com.google.apps.p3589d.p3595f.C45806i;
import com.google.apps.p3589d.p3595f.C45819v;
import com.google.apps.p3589d.p3600k.C45941f;
import com.google.apps.p3589d.p3600k.C45944i;
import com.google.apps.p3589d.p3600k.C45946k;
import com.google.common.p4535g.C59203do;

/* renamed from: com.google.apps.d.h.f */
/* compiled from: PG */
public abstract class C45880f {

    /* renamed from: b */
    static final C45755n f120610b = C45755n.m81570c();

    /* renamed from: c */
    public final C45755n f120611c;

    protected C45880f(C45755n nVar) {
        this.f120611c = nVar;
    }

    /* renamed from: g */
    static final double m81887g(C45819v vVar) {
        return (vVar.f120480a / 1000.0d) * -250.0d;
    }

    /* renamed from: h */
    static final double m81888h(C45819v vVar) {
        return (vVar.f120480a / 1000.0d) * 750.0d;
    }

    /* renamed from: l */
    protected static final C45755n m81889l(C45764w wVar) {
        if (wVar.f120344i.f120342a.f120220a.size() == 1) {
            C45755n a = wVar.f120344i.mo49895a(0);
            int i = a.f120319h - 1;
            if ((i == 1 || i == 2 || i == 3 || i == 5 || i == 6 || i == 7 || i == 8 || i == 11) && C45806i.m81699a(a.f120314c) == 1 && a.f120316e == null && a.f120315d == null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: p */
    public static final C45880f m81890p(C45819v vVar) {
        return new C45878d(f120610b, vVar, C45946k.f120735e, C45946k.f120735e);
    }

    /* renamed from: q */
    static final C45946k m81891q(double d, double d2, double d3) {
        return C45946k.m82043h(C59203do.f157270a, -d2, d3, d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C45699p mo50000a(C45703t tVar, C45944i iVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C45879e mo50001b(C45944i iVar, C45944i iVar2);

    /* renamed from: c */
    public abstract C45946k mo50005c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo50002d(C45869aj ajVar, C45944i iVar, C45941f fVar);

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final double mo50013f() {
        return Math.max(mo50007r().mo50048b(), C59203do.f157270a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final double mo50014i() {
        return Math.max(-mo50007r().mo50050d(), C59203do.f157270a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C45699p mo50015j(C45944i iVar) {
        return C45699p.m81425d(iVar.mo50058f((mo50006m().f120480a / 1000.0d) * -250.0d), ((mo50006m().f120480a / 1000.0d) * 750.0d) - ((mo50006m().f120480a / 1000.0d) * -250.0d), C45946k.f120735e);
    }

    /* renamed from: k */
    public final C45699p mo50016k(C45703t tVar, C45944i iVar) {
        int i;
        C45755n nVar = this.f120611c;
        if (nVar == f120610b) {
            return mo50000a(tVar, iVar);
        }
        C45743b bVar = (C45743b) nVar.f120318g;
        if (tVar.mo49743a() == bVar.f120260b) {
            return mo50015j(iVar);
        }
        if (mo50010s()) {
            i = bVar.f120262d;
        } else {
            i = bVar.f120261c;
        }
        if (tVar.mo49743a() == i) {
            C45946k r = mo50007r();
            return mo50015j(iVar.mo50057e(r.mo50047a() - r.mo50049c()));
        } else if (bVar.f120260b > tVar.mo49743a() || tVar.mo49743a() > bVar.f120262d) {
            return C45699p.f120208d;
        } else {
            return mo50000a(tVar, iVar);
        }
    }

    /* renamed from: m */
    public abstract C45819v mo50006m();

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C45879e mo50017n(double d) {
        int i = (d > mo50007r().mo50060e() ? 1 : (d == mo50007r().mo50060e() ? 0 : -1));
        C45743b bVar = (C45743b) this.f120611c.f120318g;
        return C45879e.m81884c(i < 0 ? bVar.f120260b : bVar.f120261c);
    }

    /* renamed from: o */
    public final C45879e mo50018o(C45944i iVar, C45944i iVar2) {
        int i;
        C45879e b = mo50001b(iVar, iVar2);
        C45755n nVar = this.f120611c;
        if (nVar == f120610b || !b.mo49996b().mo49799e()) {
            return b;
        }
        C45743b bVar = (C45743b) nVar.f120318g;
        int i2 = bVar.f120260b;
        if (C45728d.m81508b(nVar)) {
            i = bVar.f120261c;
        } else {
            i = bVar.f120262d;
        }
        return new C45859a(b.mo49995a(), new C45685b(i2, i));
    }

    /* renamed from: r */
    public abstract C45946k mo50007r();

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo50010s() {
        return false;
    }

    /* renamed from: t */
    public int mo50008t() {
        return mo50003v();
    }

    /* renamed from: u */
    public int mo50009u() {
        return mo50003v();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public int mo50003v() {
        return this.f120611c.f120319h;
    }
}
