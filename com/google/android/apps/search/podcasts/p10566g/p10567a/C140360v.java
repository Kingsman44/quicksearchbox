package com.google.android.apps.search.podcasts.p10566g.p10567a;

import android.os.Bundle;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;

/* renamed from: com.google.android.apps.search.podcasts.g.a.v */
/* compiled from: PG */
public final /* synthetic */ class C140360v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C140361w f381271a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f381272b;

    public /* synthetic */ C140360v(C140361w wVar, Bundle bundle) {
        this.f381271a = wVar;
        this.f381272b = bundle;
    }

    public final void onClick(View view) {
        C140361w wVar = this.f381271a;
        Bundle bundle = this.f381272b;
        wVar.f381274b.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
        wVar.f381273a.mo50483d(view).mo50508d(R.id.podcasts_action_to_show, bundle);
    }
}
