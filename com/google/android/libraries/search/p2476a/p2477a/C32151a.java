package com.google.android.libraries.search.p2476a.p2477a;

import android.app.Activity;
import com.google.android.libraries.search.p2476a.p2479c.p2480a.C32169d;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.api.controller.C45989b;
import com.google.apps.tiktok.account.api.controller.C46010bu;
import com.google.apps.tiktok.account.api.controller.C46012bw;
import com.google.apps.tiktok.account.api.controller.C46013bx;
import com.google.apps.tiktok.nav.gateway.C47494a;
import com.google.apps.tiktok.nav.gateway.C47502h;
import com.google.apps.tiktok.nav.gateway.C47503i;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;

/* renamed from: com.google.android.libraries.search.a.a.a */
/* compiled from: PG */
public final class C32151a implements C32158h {

    /* renamed from: a */
    public static final /* synthetic */ int f86347a = 0;

    /* renamed from: b */
    private static final C58485gu f86348b = C58485gu.m89847o(C32156f.class, C32155e.class);

    /* renamed from: d */
    public static final C58833ax m59928d(C58485gu guVar) {
        C47502h d = C47503i.m84541d();
        d.mo51352b(C58485gu.m89846n(C32169d.class));
        if (!guVar.isEmpty()) {
            ((C47494a) d).f123319b = m59930f(guVar);
        }
        return C58833ax.m90834k(d.mo51351a());
    }

    /* renamed from: e */
    public static final void m59929e(Activity activity, C45987ay ayVar, C45989b bVar, C58485gu guVar) {
        C46012bw e = C46013bx.m82201e(activity);
        e.mo50147b().mo55395g(C32169d.class);
        if (!guVar.isEmpty()) {
            ((C46010bu) e).f120853a = m59930f(guVar);
        }
        bVar.mo50083f(e.mo50146a());
        bVar.mo50082e(ayVar);
    }

    /* renamed from: f */
    private static C58485gu m59930f(C58485gu guVar) {
        C58480gp e = C58485gu.m89837e();
        C58485gu guVar2 = f86348b;
        int i = ((C58724pq) guVar2).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            Class cls = (Class) guVar2.get(i2);
            if (!guVar.contains(cls)) {
                e.mo55395g(cls);
            }
        }
        e.mo55396h(guVar);
        return e.mo55394f();
    }

    /* renamed from: a */
    public final C58833ax mo37970a() {
        return m59928d(C58485gu.m89845m());
    }

    /* renamed from: b */
    public final void mo37971b(Activity activity, C45987ay ayVar, C45989b bVar) {
        m59929e(activity, ayVar, bVar, C58485gu.m89845m());
    }

    /* renamed from: c */
    public final /* synthetic */ void mo37972c(C45989b bVar) {
        C32157g.m59941a();
    }
}
