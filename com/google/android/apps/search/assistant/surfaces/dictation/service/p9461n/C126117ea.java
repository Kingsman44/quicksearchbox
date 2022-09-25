package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.ea */
/* compiled from: PG */
public final /* synthetic */ class C126117ea implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126141ey f347546a;

    /* renamed from: b */
    public final /* synthetic */ long f347547b;

    /* renamed from: c */
    public final /* synthetic */ C60930r f347548c;

    public /* synthetic */ C126117ea(C126141ey eyVar, long j, C60930r rVar) {
        this.f347546a = eyVar;
        this.f347547b = j;
        this.f347548c = rVar;
    }

    public final void run() {
        C126141ey eyVar = this.f347546a;
        long j = this.f347547b;
        C60930r rVar = this.f347548c;
        if (j == eyVar.f347590d.get()) {
            C60870cx k = C126141ey.m206245k(rVar);
            C126135es esVar = new C126135es(eyVar, j);
            C46459k.m82829b(C60922j.m93044g(k, C47810es.m84963c(esVar), eyVar.f347588b), "resolving idle UI update failed [SD]", new Object[0]);
        }
    }
}
