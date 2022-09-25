package com.google.android.apps.gsa.staticplugins.opa.p8181ae;

import android.accounts.Account;
import android.content.Context;
import android.support.p031v4.app.C0154a;
import android.support.p031v4.app.C0167am;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6983ah.C89150g;
import com.google.android.apps.gsa.shared.p6983ah.C89157n;
import com.google.android.apps.gsa.shared.p6983ah.C89158o;
import com.google.android.apps.gsa.shared.p6983ah.C89160q;
import com.google.android.apps.gsa.staticplugins.opa.C109255ht;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.C147488c;
import com.google.android.libraries.p1969j.p1970a.p1974b.C23959i;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58743qi;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.p4184bj.p4193c.p4197c.C55960bg;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ae.d */
/* compiled from: PG */
public final class C106114d {

    /* renamed from: a */
    public static final C59071e f296123a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.ae.d");

    /* renamed from: b */
    public final C89012aj f296124b;

    /* renamed from: c */
    public boolean f296125c = false;

    /* renamed from: d */
    private final Context f296126d;

    /* renamed from: e */
    private final C0167am f296127e;

    /* renamed from: f */
    private final C86054o f296128f;

    /* renamed from: g */
    private final C68214a f296129g;

    /* renamed from: h */
    private final C89150g f296130h;

    /* renamed from: i */
    private final C58743qi f296131i = new C58459fv();

    public C106114d(Context context, C0167am amVar, C86054o oVar, C68214a aVar, C89150g gVar, C89012aj ajVar) {
        this.f296126d = context;
        this.f296127e = amVar;
        this.f296128f = oVar;
        this.f296129g = aVar;
        this.f296130h = gVar;
        this.f296124b = ajVar;
        try {
            C31760t.m59102i(context);
        } catch (Exception unused) {
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: a */
    public final void mo95283a(C55912b bVar) {
        if (this.f296125c) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        Account a = this.f296128f.mo79668a();
        if (a != null) {
            new C23959i().mo29370a(this.f296126d, a, bVar, C55960bg.ASSISTANT_JUST_IN_TIME_OPTIN, C106112b.f296121a);
            this.f296131i.mo54920x(a.name, bVar);
        }
    }

    /* renamed from: b */
    public final void mo95284b() {
        C58976aa aaVar = C58975e.f156826a;
        C23959i.f65517c = (C147488c) this.f296129g.mo27525b();
    }

    /* renamed from: c */
    public final void mo95285c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f296125c = false;
        C23959i.f65516b = new C106113c(this);
    }

    /* renamed from: d */
    public final void mo95286d(C109255ht htVar, C55912b bVar) {
        if (this.f296125c) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        Account a = this.f296128f.mo79668a();
        if (a != null) {
            C55960bg bgVar = C55960bg.ASSISTANT_JUST_IN_TIME_OPTIN;
            C106111a aVar = new C106111a();
            aVar.mo29376m(a, bVar, bgVar);
            aVar.f296120a = htVar;
            C89157n nVar = (C89157n) C89158o.f241716c.createBuilder();
            C89160q qVar = C89160q.CLIENT_OP_EXCLUSIVE_STATE;
            nVar.copyOnWrite();
            C89158o oVar = (C89158o) nVar.instance;
            oVar.f241719b = qVar.f241727f;
            oVar.f241718a |= 1;
            this.f296130h.mo83143q((C89158o) nVar.build());
            C0154a aVar2 = new C0154a(this.f296127e.mo545jw());
            aVar2.mo685r(aVar, "ConsentFragment");
            aVar2.mo509f();
        }
    }
}
