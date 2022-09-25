package com.google.android.apps.gsa.nga.engine.understanding.teleport;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6274a.C80047aa;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.List;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.teleport.f */
/* compiled from: PG */
public abstract class C79298f {
    /* renamed from: a */
    static C79298f m127225a(C79298f fVar, C79298f fVar2) {
        C58480gp e = C58485gu.m89837e();
        e.mo55396h(fVar.mo73862h());
        e.mo55396h((Iterable) Collection.EL.stream(fVar2.mo73862h()).map(new C79163a(fVar)).collect(C58370cn.f155946a));
        return m127227c(String.valueOf(fVar.mo73864j()).concat(String.valueOf(fVar2.mo73864j())), e.mo55394f());
    }

    /* renamed from: b */
    static C79298f m127226b(C79298f fVar, String str) {
        return m127227c(String.valueOf(fVar.mo73864j()).concat(str), fVar.mo73862h());
    }

    /* renamed from: c */
    public static C79298f m127227c(String str, List list) {
        return new C79316n(str, C58485gu.m89842j(list));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C79298f mo73858d() {
        C79298f c = m127227c(mo73864j(), mo73862h());
        int i = 0;
        while (true) {
            C79316n nVar = (C79316n) c;
            if (i >= nVar.f217814a.length()) {
                return c;
            }
            if (nVar.f217814a.charAt(i) == ' ') {
                int i2 = i + 1;
                while (i2 < nVar.f217814a.length() && nVar.f217814a.charAt(i2) == ' ') {
                    i2++;
                }
                if (i == 0) {
                    i = 0;
                } else if (i2 != nVar.f217814a.length()) {
                    if (i2 - i > 1) {
                        c = c.mo73859e(C79309g.m127241c(i, i2), " ");
                    }
                }
                c = c.mo73859e(C79309g.m127241c(i, i2), BuildConfig.FLAVOR);
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C79298f mo73859e(C79309g gVar, String str) {
        C79317o oVar = (C79317o) gVar;
        if (oVar.f217816a != oVar.f217817b || !str.isEmpty()) {
            return m127225a(m127226b(mo73860f(C79309g.m127241c(0, oVar.f217816a)), str), mo73860f(C79309g.m127241c(oVar.f217817b, mo73864j().length())));
        }
        return m127227c(mo73864j(), mo73862h());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C79298f mo73860f(C79309g gVar) {
        C79317o oVar = (C79317o) gVar;
        return m127227c(mo73864j().substring(oVar.f217816a, oVar.f217817b), (C58485gu) Collection.EL.stream(mo73862h()).filter(new C79244d(gVar)).map(new C79271e(gVar)).collect(C58370cn.f155946a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C80047aa mo73861g(int i) {
        return (C80047aa) mo73862h().get(i);
    }

    /* renamed from: h */
    public abstract C58485gu mo73862h();

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final C58485gu mo73863i() {
        return (C58485gu) Collection.EL.stream(mo73862h()).filter(C79217c.f217681a).collect(C58370cn.f155946a);
    }

    /* renamed from: j */
    public abstract String mo73864j();

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo73865k() {
        return !mo73862h().isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final boolean mo73866l() {
        return mo73864j().isEmpty() && !mo73865k();
    }
}
