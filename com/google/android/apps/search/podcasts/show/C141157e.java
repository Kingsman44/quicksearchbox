package com.google.android.apps.search.podcasts.show;

import android.view.View;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140649a;
import com.google.android.apps.search.podcasts.show.p10618d.C141156d;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.e */
/* compiled from: PG */
final class C141157e implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141159g f383241a;

    public C141157e(C141159g gVar) {
        this.f383241a = gVar;
    }

    public final void onClick(View view) {
        C140646b bVar = this.f383241a.f383243a.f383143a;
        if (bVar == null) {
            bVar = C140646b.f381993r;
        }
        C69664n.m101060f(bVar, "args.showItem");
        C47393f.m84237h(new C141156d(bVar, C140649a.PUBLICATION_DATE_ASC), view);
    }
}
