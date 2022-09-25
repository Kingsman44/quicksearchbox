package com.google.android.apps.search.googleapp.search.srp.p10436f;

import android.view.View;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.apps.search.googleapp.search.voicesearch.p10472d.C138792c;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.f.k */
/* compiled from: PG */
final class C137849k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C137843g f375057a;

    public C137849k(C137843g gVar) {
        this.f375057a = gVar;
    }

    public final void onClick(View view) {
        C137843g gVar = this.f375057a;
        gVar.f375030e.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        if (gVar.f375046u.f375183b) {
            C47393f.m84237h(new C138792c(gVar.mo114000e().trim()), view);
            return;
        }
        String trim = gVar.mo114000e().trim();
        C137418g gVar2 = gVar.mo113999c().f374092f;
        if (gVar2 == null) {
            gVar2 = C137418g.f373767r;
        }
        C47393f.m84237h(new C137837a(trim, gVar2.f373771c), view);
    }
}
