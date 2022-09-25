package com.google.android.apps.search.podcasts.player.impl;

import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.C140784d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.l */
/* compiled from: PG */
final class C140833l implements C60930r {

    /* renamed from: a */
    final /* synthetic */ C140806an f382457a;

    public C140833l(C140806an anVar) {
        this.f382457a = anVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C140806an anVar = this.f382457a;
        C140784d dVar = anVar.f382328C;
        if (dVar != null) {
            return C60856cj.m92900i(dVar);
        }
        C60870cx c = anVar.f382376n.mo115678c();
        C69664n.m101060f(c, "preferenceManager.preference");
        return C140989k.m228944b(c, C140832k.f382456a);
    }
}
