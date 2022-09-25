package com.google.android.apps.search.podcasts.playerpanel;

import com.google.android.apps.search.podcasts.p10601r.C140976e;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.y */
/* compiled from: PG */
final class C140939y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140879aj f382694a;

    public C140939y(C140879aj ajVar) {
        this.f382694a = ajVar;
    }

    public final void run() {
        C140787e eVar;
        C140879aj ajVar = this.f382694a;
        C140923i iVar = ajVar.f382558k;
        if (iVar != null && (eVar = iVar.f382659a) != null) {
            ajVar.f382553f.mo50485f(ajVar.f382548a.requireActivity()).mo50508d(R.id.podcasts_action_to_episode, C140976e.m228928a(eVar.f382282c));
        }
    }
}
