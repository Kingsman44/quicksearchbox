package com.google.android.apps.gsa.nga.shared.p6321am.p6322a;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60922j;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Future;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.shared.am.a.at */
/* compiled from: PG */
public final class C80905at {

    /* renamed from: a */
    public static final C59071e f221871a = C59071e.m91332i("com.google.android.apps.gsa.nga.shared.am.a.at");

    /* renamed from: a */
    public static C60870cx m128757a(C58485gu guVar, Function function) {
        return C60922j.m93044g(C60856cj.m92896e((C58485gu) Collection.EL.stream(guVar).map(function).collect(C58370cn.f155946a)), C80888ac.f221843a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public static C60870cx m128758b(C22871g gVar, String str, C60870cx cxVar, C60870cx cxVar2, BiFunction biFunction) {
        return C47638k.m84753d(cxVar, cxVar2).mo51520a(new C80893ah(biFunction, cxVar, cxVar2), new C80894ai(gVar, str));
    }

    /* renamed from: c */
    public static C60870cx m128759c(C58485gu guVar, Function function) {
        return C60922j.m93044g(C60856cj.m92896e((C58485gu) Collection.EL.stream(guVar).map(function).collect(C58370cn.f155946a)), new C80889ad(guVar), C60826bg.f164896a);
    }

    /* renamed from: d */
    public static C60870cx m128760d(C22871g gVar, String str, Iterable iterable) {
        C60870cx i = C60856cj.m92900i(Optional.empty());
        Iterator it = iterable.iterator();
        int i2 = 1;
        while (it.hasNext()) {
            i = gVar.mo28210j(i, String.format(Locale.US, "%s.firstNonEmpty.%d", new Object[]{str, Integer.valueOf(i2)}), new C80899an((C80904as) it.next()));
            i2++;
        }
        return i;
    }

    /* renamed from: e */
    public static C60870cx m128761e(C22871g gVar, String str, Predicate predicate, Iterable iterable) {
        C58480gp e = C58485gu.m89837e();
        C58801sm G = ((C58485gu) iterable).listIterator(0);
        while (G.hasNext()) {
            e.mo55395g(new C80890ae(gVar, (C80903ar) G.next(), str, predicate));
        }
        return m128760d(gVar, str, e.mo55394f());
    }

    /* renamed from: f */
    public static C60870cx m128762f(java.util.Collection collection, Function function) {
        return C60922j.m93044g(C60856cj.m92896e((C58485gu) Collection.EL.stream(collection).map(function).collect(C58370cn.f155946a)), C80895aj.f221861a, C60826bg.f164896a);
    }

    /* renamed from: g */
    public static void m128763g(C60870cx cxVar, C80902aq aqVar) {
        C60856cj.m92911t(cxVar, new C80900ao(aqVar), C60826bg.f164896a);
    }

    /* renamed from: h */
    public static void m128764h(String str, C60870cx cxVar, String str2, Object... objArr) {
        m128763g(cxVar, new C80898am(str, str2, objArr));
    }

    /* renamed from: i */
    public static void m128765i(C60870cx cxVar, Future future) {
        if (cxVar != null && (((C60873d) cxVar).value instanceof C60873d.C60875b) && future != null) {
            future.cancel(false);
        }
    }

    /* renamed from: j */
    public static void m128766j(C60870cx cxVar, C60870cx cxVar2) {
        if (!cxVar2.isDone()) {
            if (cxVar.isDone()) {
                m128765i(cxVar, cxVar2);
                return;
            }
            C80901ap apVar = new C80901ap(cxVar, cxVar2);
            cxVar.mo4106b(apVar, C60826bg.f164896a);
            cxVar2.mo4106b(apVar, C60826bg.f164896a);
        }
    }
}
