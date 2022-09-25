package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.p9284a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122959k;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9292h.C122964p;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.C61920cc;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.annotator.impl.a.aj */
/* compiled from: PG */
public final /* synthetic */ class C122630aj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C122641au f339831a;

    /* renamed from: b */
    public final /* synthetic */ C122640at f339832b;

    /* renamed from: c */
    public final /* synthetic */ C61920cc f339833c;

    /* renamed from: d */
    public final /* synthetic */ Runnable f339834d;

    /* renamed from: e */
    public final /* synthetic */ C122964p f339835e;

    public /* synthetic */ C122630aj(C122641au auVar, C122640at atVar, C122964p pVar, C61920cc ccVar, Runnable runnable) {
        this.f339831a = auVar;
        this.f339832b = atVar;
        this.f339835e = pVar;
        this.f339833c = ccVar;
        this.f339834d = runnable;
    }

    public final void accept(Object obj) {
        C122959k kVar = (C122959k) obj;
        kVar.mo105795d(new C122625ae(this.f339831a, kVar, this.f339832b, this.f339835e, this.f339833c, this.f339834d));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
