package com.google.android.apps.search.assistant.verticals.ambient.feedback.full;

import com.google.apps.tiktok.monitoring.feedback.C47474k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.time.Duration;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.feedback.full.y */
/* compiled from: PG */
public final /* synthetic */ class C130645y implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C130620aa f357786a;

    /* renamed from: b */
    public final /* synthetic */ C47474k f357787b;

    public /* synthetic */ C130645y(C130620aa aaVar, C47474k kVar) {
        this.f357786a = aaVar;
        this.f357787b = kVar;
    }

    public final void accept(Object obj) {
        C130620aa aaVar = this.f357786a;
        C47474k kVar = this.f357787b;
        C60870cx b = aaVar.f357741b.mo110328b((Duration) obj);
        C130642v vVar = C130642v.f357783a;
        kVar.mo51308b().mo55429h("Smartspace encrypted location trace", C60922j.m93044g(b, C47810es.m84963c(vVar), aaVar.f357740a));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
