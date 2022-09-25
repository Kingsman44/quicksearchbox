package com.google.android.apps.gsa.search.core.udc;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.p10992b.p10993a.C147486a;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10990a.p10992b.p10993a.C147487b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* compiled from: PG */
public class FacsBroadcastReceiver extends C87221q {

    /* renamed from: a */
    public C147487b f235597a;

    /* renamed from: b */
    public C84413ad f235598b;

    public final void onReceive(Context context, Intent intent) {
        C60870cx a;
        C74507e.m120467c(22);
        mo80849a(context);
        if (this.f235598b.mo77966c() >= 19525000 && (a = this.f235597a.mo124243a(intent)) != null) {
            C147486a aVar = new C147486a(goAsync());
            C60856cj.m92911t(a, C47810es.m84974n(aVar), C60826bg.f164896a);
        }
    }
}
