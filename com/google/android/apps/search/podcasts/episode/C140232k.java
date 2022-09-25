package com.google.android.apps.search.podcasts.episode;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140304ay;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.p4017at.p4082j.p4083a.C54458w;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.episode.k */
/* compiled from: PG */
final class C140232k implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C140233l f380971a;

    public C140232k(C140233l lVar) {
        this.f380971a = lVar;
    }

    public final void onClick(View view) {
        C140641b bVar = this.f380971a.f380972a.f380978a;
        if (bVar == null) {
            bVar = C140641b.f381972o;
        }
        C69664n.m101060f(bVar, "episodeActionsArgs.episodeItem");
        C47393f.m84237h(new C140304ay(bVar, C54458w.EPISODE_RECOMMEND_MORE), view);
    }
}
