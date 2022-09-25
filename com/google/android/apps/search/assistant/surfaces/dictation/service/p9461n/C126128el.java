package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.el */
/* compiled from: PG */
public final /* synthetic */ class C126128el implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C126141ey f347563a;

    /* renamed from: b */
    public final /* synthetic */ long f347564b;

    /* renamed from: c */
    public final /* synthetic */ C60930r f347565c;

    /* renamed from: d */
    public final /* synthetic */ Function f347566d;

    public /* synthetic */ C126128el(C126141ey eyVar, long j, C60930r rVar, Function function) {
        this.f347563a = eyVar;
        this.f347564b = j;
        this.f347565c = rVar;
        this.f347566d = function;
    }

    public final void run() {
        C126141ey eyVar = this.f347563a;
        long j = this.f347564b;
        C60930r rVar = this.f347565c;
        Function function = this.f347566d;
        if (j == eyVar.f347590d.get()) {
            C46459k.m82829b(C60922j.m93045h(C126141ey.m206245k(rVar), C47810es.m84966f(new C126129em(eyVar, j, function)), eyVar.f347588b), "resolving idle UI update failed [SD]", new Object[0]);
        }
    }
}
