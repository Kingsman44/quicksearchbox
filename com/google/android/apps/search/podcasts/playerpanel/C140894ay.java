package com.google.android.apps.search.podcasts.playerpanel;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140304ay;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.p4017at.p4082j.p4083a.C54458w;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.ay */
/* compiled from: PG */
final class C140894ay implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C140912ba f382582a;

    public C140894ay(C140912ba baVar) {
        this.f382582a = baVar;
    }

    public final void onClick(View view) {
        C140641b bVar = this.f382582a.f382623a.f380978a;
        if (bVar == null) {
            bVar = C140641b.f381972o;
        }
        C69664n.m101060f(bVar, "episodeActionsArgs.episodeItem");
        C47393f.m84237h(new C140304ay(bVar, C54458w.EPISODE_CLEAR), view);
    }
}
