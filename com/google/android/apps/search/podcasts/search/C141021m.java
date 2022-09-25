package com.google.android.apps.search.podcasts.search;

import android.view.View;
import com.google.android.apps.search.podcasts.search.p10609a.C141000a;
import com.google.android.apps.search.podcasts.searchresults.C141042f;
import com.google.android.apps.search.podcasts.searchresults.C141043g;
import com.google.android.apps.search.podcasts.searchresults.C141044h;
import com.google.android.apps.search.podcasts.searchresults.C141045i;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46496q;

/* renamed from: com.google.android.apps.search.podcasts.search.m */
/* compiled from: PG */
final class C141021m implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141022n f382840a;

    /* renamed from: b */
    final /* synthetic */ C141000a f382841b;

    public C141021m(C141022n nVar, C141000a aVar) {
        this.f382840a = nVar;
        this.f382841b = aVar;
    }

    public final void onClick(View view) {
        C141022n nVar = this.f382840a;
        C46496q c = nVar.f382843b.mo50482c(nVar.f382842a);
        C141044h hVar = (C141044h) C141045i.f382906c.createBuilder();
        C141042f fVar = (C141042f) C141043g.f382903b.createBuilder();
        String str = this.f382841b.f382801a.f142897a;
        fVar.copyOnWrite();
        str.getClass();
        ((C141043g) fVar.instance).f382905a = str;
        hVar.copyOnWrite();
        C141045i iVar = (C141045i) hVar.instance;
        C141043g gVar = (C141043g) fVar.build();
        gVar.getClass();
        iVar.f382909b = gVar;
        iVar.f382908a = 1;
        c.mo50508d(R.id.podcasts_action_to_search_results, C46490k.m82868a(hVar.build()).mo50504d());
    }
}
