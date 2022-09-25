package com.google.android.apps.search.googleapp.search.voicesearch;

import android.view.View;
import com.google.android.apps.search.soundsearch.p10653b.C141639a;
import com.google.android.apps.search.soundsearch.p10653b.C141640b;
import com.google.android.apps.search.soundsearch.p10653b.C141643e;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.l */
/* compiled from: PG */
public final /* synthetic */ class C138802l implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C138859r f377555a;

    public /* synthetic */ C138802l(C138859r rVar) {
        this.f377555a = rVar;
    }

    public final void onClick(View view) {
        C138859r rVar = this.f377555a;
        rVar.f377707i.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C141639a aVar = rVar.f377706h;
        C141640b bVar = (C141640b) C141643e.f384462c.createBuilder();
        bVar.copyOnWrite();
        C141643e eVar = (C141643e) bVar.instance;
        eVar.f384465b = 1;
        eVar.f384464a = 1 | eVar.f384464a;
        aVar.mo41490e((C141643e) bVar.build());
    }
}
