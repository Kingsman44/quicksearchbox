package com.google.android.apps.search.podcasts.player.impl;

import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.player.p10592a.C140767o;
import com.google.android.apps.search.podcasts.player.p10592a.C140769q;
import com.google.android.apps.search.podcasts.player.p10592a.C140770r;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.ae */
/* compiled from: PG */
final class C140797ae implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C140806an f382314a;

    public C140797ae(C140806an anVar) {
        this.f382314a = anVar;
    }

    public final void run() {
        C140806an anVar = this.f382314a;
        C140770r rVar = anVar.f382375m;
        C60870cx e = anVar.mo115883e();
        anVar.mo115897s(false);
        C46459k.m82829b(C140989k.m228944b(C140989k.m228945c(e, new C140769q(rVar)), new C140767o(e, anVar)), "Failed to set the next episode.", new Object[0]);
    }
}
