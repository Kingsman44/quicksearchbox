package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.p8730c;

import com.google.android.apps.gsa.search.core.google.C85908cb;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C85958dd;
import com.google.android.apps.gsa.search.core.google.C85963di;
import com.google.android.apps.gsa.search.core.google.C85966dl;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.shared.p7066m.C90085ej;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.c.e */
/* compiled from: PG */
public final /* synthetic */ class C116891e implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C85929cw f324528a;

    /* renamed from: b */
    public final /* synthetic */ Query f324529b;

    /* renamed from: c */
    public final /* synthetic */ C41642a f324530c;

    public /* synthetic */ C116891e(C85929cw cwVar, Query query, C41642a aVar) {
        this.f324528a = cwVar;
        this.f324529b = query;
        this.f324530c = aVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        String x;
        C85929cw cwVar = this.f324528a;
        Query query = this.f324529b;
        C41642a aVar = this.f324530c;
        String x2 = cwVar.f232330f.mo79758x(C90120fr.f250823ao);
        String bk = query.mo84352bk();
        String a = ((C85908cb) cwVar.f232336l.mo27525b()).mo79534a();
        if (aVar.mo44234b()) {
            x = cwVar.f232330f.mo79758x(C90085ej.f250232j);
        } else if (query.mo84405cl()) {
            x = cwVar.f232330f.mo79758x(C90085ej.f250233k);
        } else {
            x = cwVar.f232330f.mo79758x(C90120fr.f250845l);
        }
        String str = x;
        C85981c j = cwVar.mo79570j(x2, query, bk, a, (Long) null, true, false, false);
        j.mo79638d("pf", "i");
        cwVar.mo79579w(j, 2);
        ((C85958dd) cwVar.f232338n.mo27525b()).mo79624a(j, query, str);
        if (cwVar.mo79580y()) {
            C85929cw.m138092x(j);
        }
        ((C85963di) cwVar.f232342r.mo27525b()).mo79491a(j);
        return cwVar.mo79566f(j).mo79626b((C85966dl) null);
    }
}
