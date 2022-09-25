package com.google.android.apps.search.googleapp.search.voicesearch;

import android.view.View;
import com.google.android.apps.search.soundsearch.p10653b.C141639a;
import com.google.android.apps.search.soundsearch.p10653b.C141640b;
import com.google.android.apps.search.soundsearch.p10653b.C141643e;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.ad */
/* compiled from: PG */
public final /* synthetic */ class C138699ad implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C138705aj f377230a;

    public /* synthetic */ C138699ad(C138705aj ajVar) {
        this.f377230a = ajVar;
    }

    public final void onClick(View view) {
        C138705aj ajVar = this.f377230a;
        ajVar.f377243h.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        C141639a aVar = ajVar.f377242g;
        C141640b bVar = (C141640b) C141643e.f384462c.createBuilder();
        bVar.copyOnWrite();
        C141643e eVar = (C141643e) bVar.instance;
        eVar.f384465b = 1;
        eVar.f384464a = 1 | eVar.f384464a;
        aVar.mo41490e((C141643e) bVar.build());
    }
}
