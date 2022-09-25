package com.google.android.apps.search.podcasts.playerpanel;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.player.C140787e;
import com.google.android.apps.search.podcasts.show.C141121af;
import com.google.android.apps.search.podcasts.show.C141122ag;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.z */
/* compiled from: PG */
final class C140940z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140879aj f382695a;

    public C140940z(C140879aj ajVar) {
        this.f382695a = ajVar;
    }

    public final void run() {
        C140787e eVar;
        C140879aj ajVar = this.f382695a;
        C140923i iVar = ajVar.f382558k;
        if (iVar != null && (eVar = iVar.f382659a) != null) {
            C46496q f = ajVar.f382553f.mo50485f(ajVar.f382548a.requireActivity());
            C140646b bVar = eVar.f382282c.f381974a;
            if (bVar == null) {
                bVar = C140646b.f381993r;
            }
            C69664n.m101060f(bVar, "it.episode.show");
            C69664n.m101061g(bVar, "<this>");
            C141121af afVar = (C141121af) C141122ag.f383149c.createBuilder();
            String str = bVar.f381995a;
            afVar.copyOnWrite();
            str.getClass();
            ((C141122ag) afVar.instance).f383151a = str;
            f.mo50508d(R.id.podcasts_action_to_show, C46490k.m82868a(afVar.build()).mo50504d());
        }
    }
}
