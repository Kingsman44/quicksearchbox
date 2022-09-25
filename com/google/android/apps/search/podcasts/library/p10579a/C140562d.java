package com.google.android.apps.search.podcasts.library.p10579a;

import android.view.View;
import com.google.android.apps.search.podcasts.library.p10580b.C140567b;
import com.google.android.apps.search.podcasts.p10601r.C140976e;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.podcasts.library.a.d */
/* compiled from: PG */
public final /* synthetic */ class C140562d implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C140563e f381740a;

    /* renamed from: b */
    public final /* synthetic */ C140567b f381741b;

    public /* synthetic */ C140562d(C140563e eVar, C140567b bVar) {
        this.f381740a = eVar;
        this.f381741b = bVar;
    }

    public final void onClick(View view) {
        C140563e eVar = this.f381740a;
        C140567b bVar = this.f381741b;
        eVar.f381743b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        eVar.f381742a.mo50483d(view).mo50508d(R.id.podcasts_action_to_episode, C140976e.m228928a(bVar.f381764a));
    }
}
