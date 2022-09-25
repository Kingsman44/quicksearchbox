package com.google.android.apps.search.podcasts.episode;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140305az;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.episode.d */
/* compiled from: PG */
final class C140225d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C140233l f380964a;

    public C140225d(C140233l lVar) {
        this.f380964a = lVar;
    }

    public final void onClick(View view) {
        C140641b bVar = this.f380964a.f380972a.f380978a;
        if (bVar == null) {
            bVar = C140641b.f381972o;
        }
        C140646b bVar2 = bVar.f381974a;
        if (bVar2 == null) {
            bVar2 = C140646b.f381993r;
        }
        C69664n.m101060f(bVar2, "episodeActionsArgs.episodeItem.show");
        C47393f.m84237h(new C140305az(bVar2, C54397cw.SHOW_HIDE), view);
    }
}
