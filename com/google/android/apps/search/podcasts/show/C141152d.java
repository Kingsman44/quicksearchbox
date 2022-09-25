package com.google.android.apps.search.podcasts.show;

import android.view.View;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.show.p10618d.C141155c;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.show.d */
/* compiled from: PG */
final class C141152d implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141159g f383232a;

    /* renamed from: b */
    final /* synthetic */ boolean f383233b;

    public C141152d(C141159g gVar, boolean z) {
        this.f383232a = gVar;
        this.f383233b = z;
    }

    public final void onClick(View view) {
        C140646b bVar = this.f383232a.f383243a.f383143a;
        if (bVar == null) {
            bVar = C140646b.f381993r;
        }
        C69664n.m101060f(bVar, "args.showItem");
        C47393f.m84237h(new C141155c(bVar, !this.f383233b), view);
    }
}
