package com.google.android.apps.search.podcasts.widgets.subscribebutton;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140303ax;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140645a;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.podcasts.widgets.subscribebutton.b */
/* compiled from: PG */
public final /* synthetic */ class C141269b implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C141270c f383538a;

    /* renamed from: b */
    public final /* synthetic */ C140646b f383539b;

    public /* synthetic */ C141269b(C141270c cVar, C140646b bVar) {
        this.f383538a = cVar;
        this.f383539b = bVar;
    }

    public final void onClick(View view) {
        C141270c cVar = this.f383538a;
        C140646b bVar = this.f383539b;
        C47393f.m84237h(new C140303ax(bVar), view);
        C140645a aVar = (C140645a) bVar.toBuilder();
        aVar.copyOnWrite();
        ((C140646b) aVar.instance).f382007m = true;
        cVar.mo116292a((C140646b) aVar.build());
    }
}
