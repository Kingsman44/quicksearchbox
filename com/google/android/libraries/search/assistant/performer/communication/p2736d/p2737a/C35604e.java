package com.google.android.libraries.search.assistant.performer.communication.p2736d.p2737a;

import com.google.common.base.C58833ax;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.d.a.e */
/* compiled from: PG */
public final /* synthetic */ class C35604e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C35606g f93443a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f93444b;

    /* renamed from: c */
    public final /* synthetic */ C35602c f93445c;

    public /* synthetic */ C35604e(C35606g gVar, C58833ax axVar, C35602c cVar) {
        this.f93443a = gVar;
        this.f93444b = axVar;
        this.f93445c = cVar;
    }

    public final void run() {
        Collection.EL.stream(this.f93443a.f93451c).forEach(new C35603d(this.f93444b, this.f93445c));
    }
}
