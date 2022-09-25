package com.google.android.apps.search.podcasts.show;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140305az;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.p4017at.p4082j.p4083a.C54397cw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.j */
/* compiled from: PG */
final class C141162j implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141169q f383248a;

    public C141162j(C141169q qVar) {
        this.f383248a = qVar;
    }

    public final void onClick(View view) {
        C140646b bVar = this.f383248a.f383255a.f383147a;
        if (bVar == null) {
            bVar = C140646b.f381993r;
        }
        C69664n.m101060f(bVar, "showActionsArgs.showItem");
        C47393f.m84237h(new C140305az(bVar, C54397cw.SHOW_CLEAR), view);
    }
}
