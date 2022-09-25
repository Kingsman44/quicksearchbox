package com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58833ax;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.a.d */
/* compiled from: PG */
public final /* synthetic */ class C35603d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C58833ax f93441a;

    /* renamed from: b */
    public final /* synthetic */ C35602c f93442b;

    public /* synthetic */ C35603d(C58833ax axVar, C35602c cVar) {
        this.f93441a = axVar;
        this.f93442b = cVar;
    }

    public final void accept(Object obj) {
        C46459k.m82829b(((C35601b) obj).mo21168a(this.f93441a, this.f93442b), "Side effect failed to run", new Object[0]);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
