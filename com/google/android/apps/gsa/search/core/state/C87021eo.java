package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.gsa.p1876k.C22868d;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.p395al.p417d.p418a.C8575bc;

/* renamed from: com.google.android.apps.gsa.search.core.state.eo */
/* compiled from: PG */
final class C87021eo implements C22868d {

    /* renamed from: a */
    final /* synthetic */ Query f235017a;

    /* renamed from: b */
    final /* synthetic */ C87023eq f235018b;

    public C87021eo(C87023eq eqVar, Query query) {
        this.f235018b = eqVar;
        this.f235017a = query;
    }

    /* renamed from: gl */
    public final void mo17701gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C87023eq.f235022a.mo56225c()).mo56382g(th)).mo56372aa(8760)).mo56386p("Failed to get zero typing suggest");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17702gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h() && axVar.mo56107c() != null) {
            C87023eq eqVar = this.f235018b;
            eqVar.f235057v = this.f235017a;
            ((C85171a) eqVar.f235042g.mo27525b()).mo78764e(this.f235017a, (C8575bc) axVar.mo56107c());
        }
    }
}
