package com.google.android.apps.gsa.nga.shared.p6417x;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.gsa.p1876k.p1877a.C22854h;
import com.google.common.base.C58839bc;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.time.Duration;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.shared.x.aj */
/* compiled from: PG */
public final class C83349aj {
    /* renamed from: a */
    public static C60870cx m132646a(C83358h hVar, C58839bc bcVar) {
        C83351al alVar = new C83351al(hVar, bcVar);
        alVar.f227180a.mo76658d(alVar.f227181b);
        alVar.mo76655c(alVar.f227180a.mo76657c());
        return alVar;
    }

    /* renamed from: b */
    public static void m132647b(C22871g gVar, C83357g gVar2, Object obj, String str) {
        gVar.mo28212l(String.format("[NGA] postValue.%s", new Object[]{str}), new C83366p(gVar2, obj));
    }

    /* renamed from: c */
    public static void m132648c(C22871g gVar, C83356f fVar, Object obj, Duration duration, String str) {
        if (duration.isZero()) {
            m132647b(gVar, fVar, obj, str);
            return;
        }
        String format = String.format("[NGA] postValue.%s", new Object[]{str});
        gVar.mo28212l(format, new C83364n(fVar, gVar, format, duration, obj, str));
    }

    /* renamed from: d */
    public static void m132649d(C83358h hVar, C90919bp bpVar) {
        Class a = hVar.mo76656a();
        C22872h.m42742b(a);
        hVar.mo76658d(bpVar);
        new C22854h(a, new C83368r(bpVar, hVar)).run();
    }

    /* renamed from: e */
    public static C83358h m132650e(C83358h hVar, C83358h hVar2, C83358h hVar3, C83358h hVar4, C83358h hVar5, C83358h hVar6, C83358h hVar7, C83358h hVar8, C83348ai aiVar) {
        return new C83342ac(hVar.mo76656a(), C58528ij.m90015O(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8), aiVar, hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8);
    }

    /* renamed from: f */
    public static C83358h m132651f(C83358h hVar, C83358h hVar2, C83358h hVar3, C83358h hVar4, C83358h hVar5, C83358h hVar6, C83358h hVar7, C83347ah ahVar) {
        return new C83341ab(hVar.mo76656a(), C58528ij.m90015O(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7), ahVar, hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7);
    }

    /* renamed from: g */
    public static C83358h m132652g(C83358h hVar, C83358h hVar2, C83358h hVar3, C83358h hVar4, C83358h hVar5, C83358h hVar6, C83346ag agVar) {
        return new C83340aa(hVar.mo76656a(), C58528ij.m90015O(hVar, hVar2, hVar3, hVar4, hVar5, hVar6, new C83358h[0]), agVar, hVar, hVar2, hVar3, hVar4, hVar5, hVar6);
    }

    /* renamed from: h */
    public static C83358h m132653h(C83358h hVar, C83358h hVar2, C83358h hVar3, C83358h hVar4, C83358h hVar5, C83345af afVar) {
        return new C83376z(hVar.mo76656a(), C58528ij.m90014N(hVar, hVar2, hVar3, hVar4, hVar5), afVar, hVar, hVar2, hVar3, hVar4, hVar5);
    }

    /* renamed from: i */
    public static C83358h m132654i(C83358h hVar, C83358h hVar2, C83358h hVar3, C83358h hVar4, C83344ae aeVar) {
        return new C83375y(hVar.mo76656a(), C58528ij.m90013M(hVar, hVar2, hVar3, hVar4), aeVar, hVar, hVar2, hVar3, hVar4);
    }

    /* renamed from: j */
    public static C83358h m132655j(C83358h hVar, C83358h hVar2, C83358h hVar3, C83343ad adVar) {
        return new C83374x(hVar.mo76656a(), C58528ij.m90012L(hVar, hVar2, hVar3), adVar, hVar, hVar2, hVar3);
    }

    /* renamed from: k */
    public static C83358h m132656k(C83358h hVar, C83358h hVar2, BiFunction biFunction) {
        return new C83373w(hVar.mo76656a(), C58528ij.m90011K(hVar, hVar2), biFunction, hVar, hVar2);
    }

    /* renamed from: l */
    public static C83358h m132657l(Class cls, C58528ij ijVar, Function function) {
        return new C83372v(cls, C58528ij.m90006F(ijVar), function, ijVar);
    }

    /* renamed from: m */
    public static C83358h m132658m(C83358h hVar, Function function) {
        return new C83370t(hVar.mo76656a(), new C58759qy(hVar), function, hVar);
    }
}
