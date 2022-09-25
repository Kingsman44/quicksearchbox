package com.google.android.apps.search.assistant.verticals.p9880a.p9888e.p9889a;

import com.google.assistant.p3931f.p3939c.C52829f;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.e.a.r */
/* compiled from: PG */
public final class C130376r {
    /* renamed from: a */
    public static C58485gu m212831a() {
        return C58485gu.m89834D(C130379u.f357301a, C130379u.f357302b, C130379u.f357303c, C130379u.f357304d, C130379u.f357305e, C130379u.f357306f, C130379u.f357307g, C130378t.f357299a, C130378t.f357300b, C130380v.f357308a, C130380v.f357309b, C130380v.f357310c, C130380v.f357311d, C130381w.f357312a, C130381w.f357313b, C130377s.f357297a, C130377s.f357298b, C130382x.f357314a, C130382x.f357315b);
    }

    /* renamed from: b */
    public static C58528ij m212832b(String str, C52829f fVar) {
        return m212834d(fVar, (C58495hd) Collection.EL.stream(m212831a()).filter(new C130361c(str)).collect(C58370cn.m89403c(C130370l.f357291a, C130362d.f357283a, C130363e.f357284a)));
    }

    /* renamed from: c */
    public static boolean m212833c(String str, C52829f fVar) {
        return !m212834d(fVar, (C58495hd) Collection.EL.stream(m212831a()).filter(new C130369k(str)).collect(C58370cn.m89403c(C130370l.f357291a, C130371m.f357292a, C130372n.f357293a))).isEmpty();
    }

    /* renamed from: d */
    private static C58528ij m212834d(C52829f fVar, C58495hd hdVar) {
        return (C58528ij) Collection.EL.stream(fVar.f138613a).flatMap(new C130373o(hdVar)).collect(C58370cn.f155947b);
    }
}
