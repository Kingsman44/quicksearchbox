package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.view.View;
import com.google.android.apps.search.podcasts.p10566g.p10568b.C140367b;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.podcasts.g.a.i */
/* compiled from: PG */
public final /* synthetic */ class C140347i implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C140348j f381227a;

    /* renamed from: b */
    public final /* synthetic */ C140367b f381228b;

    public /* synthetic */ C140347i(C140348j jVar, C140367b bVar) {
        this.f381227a = jVar;
        this.f381228b = bVar;
    }

    public final void onClick(View view) {
        C140348j jVar = this.f381227a;
        C140367b bVar = this.f381228b;
        if (jVar.f381231c) {
            jVar.f381230b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        }
        jVar.f381229a.mo50483d(view).mo50508d(R.id.podcasts_action_to_episode, C140976e.m228928a(bVar.f381305a));
    }
}
