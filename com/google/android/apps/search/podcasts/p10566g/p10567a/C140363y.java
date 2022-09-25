package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.view.View;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140371f;
import com.google.android.apps.search.podcasts.show.C141121af;
import com.google.android.apps.search.podcasts.show.C141122ag;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46496q;

/* renamed from: com.google.android.apps.search.podcasts.g.a.y */
/* compiled from: PG */
public final /* synthetic */ class C140363y implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C140364z f381292a;

    /* renamed from: b */
    public final /* synthetic */ C140371f f381293b;

    public /* synthetic */ C140363y(C140364z zVar, C140371f fVar) {
        this.f381292a = zVar;
        this.f381293b = fVar;
    }

    public final void onClick(View view) {
        C140364z zVar = this.f381292a;
        C140371f fVar = this.f381293b;
        C46496q d = zVar.f381294a.mo50483d(view);
        C141121af afVar = (C141121af) C141122ag.f383149c.createBuilder();
        String a = fVar.mo115619a();
        afVar.copyOnWrite();
        a.getClass();
        ((C141122ag) afVar.instance).f383151a = a;
        d.mo50508d(R.id.podcasts_action_to_show, C46490k.m82868a(afVar.build()).mo50504d());
        zVar.f381295b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
    }
}
