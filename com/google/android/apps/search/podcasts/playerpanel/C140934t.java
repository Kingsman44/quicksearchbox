package com.google.android.apps.search.podcasts.playerpanel;

import android.view.View;
import com.google.android.apps.search.podcasts.episode.C140234m;
import com.google.android.apps.search.podcasts.episode.C140235n;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46496q;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.t */
/* compiled from: PG */
final class C140934t implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C140879aj f382689a;

    public C140934t(C140879aj ajVar) {
        this.f382689a = ajVar;
    }

    public final void onClick(View view) {
        C140787e eVar;
        C140879aj ajVar = this.f382689a;
        C140923i iVar = ajVar.f382558k;
        if (iVar != null && (eVar = iVar.f382659a) != null) {
            C46496q f = ajVar.f382553f.mo50485f(ajVar.f382548a.requireActivity());
            C140234m mVar = (C140234m) C140235n.f380976c.createBuilder();
            C140641b bVar = eVar.f382282c;
            mVar.copyOnWrite();
            bVar.getClass();
            ((C140235n) mVar.instance).f380978a = bVar;
            C140923i iVar2 = ajVar.f382558k;
            boolean z = iVar2 != null ? iVar2.f382660b : false;
            mVar.copyOnWrite();
            ((C140235n) mVar.instance).f380979b = z;
            f.mo50508d(R.id.podcasts_action_to_player_actions_dialog, C46490k.m82868a(mVar.build()).mo50504d());
        }
    }
}
