package com.google.android.apps.search.podcasts.widgets.subscribebutton;

import android.view.View;
import com.google.android.apps.search.podcasts.p10565f.C140303ax;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.subscribebutton.f */
/* compiled from: PG */
public final class C141273f implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C141276i f383545a;

    /* renamed from: b */
    final /* synthetic */ C140646b f383546b;

    public C141273f(C141276i iVar, C140646b bVar) {
        this.f383545a = iVar;
        this.f383546b = bVar;
    }

    public final void onClick(View view) {
        this.f383545a.mo116297a(true);
        C47393f.m84237h(new C140303ax(this.f383546b), view);
        C141276i iVar = this.f383545a;
        C69664n.m101060f(view, "v");
        iVar.f383552d.mo50483d(view).mo50508d(R.id.podcasts_action_to_show_subscription_settings, C46490k.m82868a(this.f383546b).mo50504d());
    }
}
