package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.content.Context;
import com.google.android.libraries.onegoogle.account.p2345a.C30163h;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30305n;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30395bw;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30437e;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30439g;
import com.google.android.libraries.onegoogle.accountmenu.features.C30641x;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30323e;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30329k;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30462c;
import com.google.android.libraries.onegoogle.accountmenu.p2356d.C30464e;
import com.google.android.libraries.onegoogle.actions.C30802c;
import com.google.android.libraries.onegoogle.actions.C30807h;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.android.libraries.onegoogle.common.C30939z;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.b */
/* compiled from: PG */
final class C30676b {
    /* renamed from: a */
    public static C58485gu m57331a(Context context, C30305n nVar, C63644b bVar) {
        C58480gp gpVar = new C58480gp(4);
        C30939z zVar = new C30939z(nVar.mo35862m(), bVar, nVar.mo35858i());
        C30464e a = C30325g.m56486a(nVar, context);
        if (a != null) {
            C30901aa aaVar = new C30901aa(a.mo36064d());
            aaVar.mo36586a(zVar, true != C30325g.m56487b(context) ? 41 : 42);
            gpVar.mo55395g(a.mo36068i(new C30938y(aaVar)));
        }
        Object c = C30281j.m56319c(nVar.mo35858i().f81934a.f81883d);
        C30464e eVar = null;
        if (nVar.mo35860k().mo36183p().mo56113h() && c != null) {
            C30641x xVar = (C30641x) nVar.mo35860k().mo36183p().mo56107c();
            C30163h b = nVar.mo35852b().mo35551b(c);
            if (xVar.mo36346d() || b == null || b.mo35564b() != 2) {
                eVar = m57332b(C30329k.m56489a(context, nVar.mo35858i(), xVar), 6, zVar);
            }
        }
        if (eVar != null) {
            gpVar.mo55395g(eVar);
        }
        C30807h a2 = C30802c.m57499a(nVar.mo35858i(), nVar.mo35855e().mo35819c(), context);
        if (a2 != null) {
            C30462c g = C30464e.m56760g();
            g.mo36053f(a2.mo36494a());
            g.mo36052e(a2.mo36496c());
            g.mo36054g(a2.mo36500f());
            g.mo36050c(a2.mo36498e());
            g.mo36055h(a2.mo36497d());
            g.mo36056i(a2.mo36495b());
            gpVar.mo55395g(m57332b(g.mo36048a(), 11, zVar));
        }
        C30464e a3 = C30323e.m56485a(nVar, context);
        if (a3 != null) {
            gpVar.mo55395g(m57332b(a3, 12, zVar));
        }
        C58485gu f = gpVar.mo55394f();
        C58480gp gpVar2 = new C58480gp(4);
        int i = ((C58724pq) f).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C30437e eVar2 = new C30437e((C30464e) f.get(i2));
            eVar2.f82169x = C58833ax.m90834k(C30395bw.ALWAYS_HIDE_DIVIDER_CARD);
            gpVar2.mo55395g(new C30439g(new C30651a(eVar2)));
        }
        return gpVar2.mo55394f();
    }

    /* renamed from: b */
    private static C30464e m57332b(C30464e eVar, int i, C30939z zVar) {
        C30901aa aaVar = new C30901aa(eVar.mo36064d());
        aaVar.mo36586a(zVar, i);
        return eVar.mo36068i(new C30938y(aaVar));
    }
}
