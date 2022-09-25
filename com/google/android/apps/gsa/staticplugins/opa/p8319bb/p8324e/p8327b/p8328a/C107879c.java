package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8327b.p8328a;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111248k;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8491c.p8492a.C111255r;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import dagger.C68214a;
import dagger.p5294a.C68219e;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import java.util.Locale;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.b.a.c */
/* compiled from: PG */
public final class C107879c extends C68247h {

    /* renamed from: a */
    private final C68283d f300175a;

    /* renamed from: c */
    private final C68283d f300176c;

    /* renamed from: d */
    private final C68283d f300177d;

    /* renamed from: e */
    private final C69464a f300178e;

    /* renamed from: f */
    private final C68283d f300179f;

    public C107879c(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C69464a aVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C107879c.class), aVar);
        this.f300175a = C68236af.m98549d(dVar);
        this.f300176c = C68236af.m98549d(dVar2);
        this.f300177d = C68236af.m98549d(dVar3);
        this.f300178e = aVar3;
        this.f300179f = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C107880d dVar = (C107880d) list.get(0);
        C57981b bVar = (C57981b) list.get(1);
        C21370a aVar = (C21370a) list.get(2);
        C68214a a = C68219e.m98518a(this.f300178e);
        C58976aa aaVar = C58975e.f156826a;
        if (((C86124t) list.get(3)).mo79746e(C90063do.f249319bL) && ((C111248k) a.mo27525b()).mo99077b()) {
            ((C111248k) a.mo27525b()).mo99076a(C111255r.STREAMING, String.format(Locale.US, "Initial request sent at: %d\n", new Object[]{Long.valueOf(aVar.mo26870b())}));
        }
        return dVar.f300180a.mo78727a(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f300175a.mo60297gq(), this.f300176c.mo60297gq(), this.f300177d.mo60297gq(), this.f300179f.mo60297gq());
    }
}
