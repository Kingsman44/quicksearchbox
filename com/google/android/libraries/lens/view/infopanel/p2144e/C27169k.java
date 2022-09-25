package com.google.android.libraries.lens.view.infopanel.p2144e;

import android.view.View;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.lens.view.p2078at.C25537t;
import com.google.android.libraries.lens.view.utils.C28133v;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.p4017at.p4056g.p4057a.p4058a.C53992b;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.k */
/* compiled from: PG */
public final /* synthetic */ class C27169k implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C27177s f74258a;

    /* renamed from: b */
    public final /* synthetic */ C27178t f74259b;

    public /* synthetic */ C27169k(C27177s sVar, C27178t tVar) {
        this.f74258a = sVar;
        this.f74259b = tVar;
    }

    public final void onClick(View view) {
        C27177s sVar = this.f74258a;
        C27178t tVar = this.f74259b;
        sVar.f74281e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C25537t tVar2 = sVar.f74279c.f74301a;
        C53992b bVar = tVar.mo32610a().f141825e;
        if (bVar == null) {
            bVar = C53992b.f141653e;
        }
        tVar2.mo30556f(C28133v.m52416b(bVar.f141655a == 3 ? (String) bVar.f141656b : BuildConfig.FLAVOR));
    }
}
