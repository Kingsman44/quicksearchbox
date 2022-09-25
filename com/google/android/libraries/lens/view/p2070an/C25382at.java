package com.google.android.libraries.lens.view.p2070an;

import com.google.android.libraries.lens.p2014e.C24201ad;
import com.google.android.libraries.lens.p2014e.C24207aj;
import com.google.android.libraries.lens.p2014e.C24208ak;
import com.google.android.libraries.lens.p2014e.C24209al;
import com.google.android.libraries.lens.view.p2093d.C25762k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.lens.view.an.at */
/* compiled from: PG */
final class C25382at implements C24209al {

    /* renamed from: a */
    public final C24201ad f69108a;

    /* renamed from: b */
    public final C25762k f69109b;

    /* renamed from: c */
    final /* synthetic */ C25383au f69110c;

    /* renamed from: d */
    private final C25436h f69111d;

    public C25382at(C25383au auVar, C24201ad adVar, C25762k kVar, C25436h hVar) {
        this.f69110c = auVar;
        this.f69108a = adVar;
        this.f69109b = kVar;
        this.f69111d = hVar;
    }

    /* renamed from: a */
    public final void mo29702a(Throwable th) {
        this.f69109b.mo30912b(th);
    }

    /* renamed from: b */
    public final void mo29703b(C24208ak akVar) {
        ((C58970a) ((C58970a) C25383au.f69112a.mo56224b()).mo56372aa(49860)).mo56354G("Query[%s] executing with interaction handler %s", this.f69108a.mo29680c(), this.f69111d.getClass().getSimpleName());
        C60870cx a = this.f69111d.mo30410a(this.f69108a, akVar.mo29696a());
        C25381as asVar = new C25381as(this, akVar);
        C60856cj.m92911t(a, C47810es.m84974n(asVar), this.f69110c.f69115b);
    }

    /* renamed from: c */
    public final void mo29704c(C24208ak akVar) {
        C25762k kVar = this.f69109b;
        C24207aj c = C24208ak.m45056e(this.f69108a).mo29698c();
        c.mo29694b(akVar.mo29696a());
        kVar.mo30913c(c.mo29693a(), false);
    }
}
