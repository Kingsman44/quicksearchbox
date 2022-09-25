package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.podcasts.b.g.m */
/* compiled from: PG */
public final /* synthetic */ class C140149m implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C140133ai f380809a;

    /* renamed from: b */
    public final /* synthetic */ C140646b f380810b;

    /* renamed from: c */
    public final /* synthetic */ boolean f380811c;

    public /* synthetic */ C140149m(C140133ai aiVar, C140646b bVar, boolean z) {
        this.f380809a = aiVar;
        this.f380810b = bVar;
        this.f380811c = z;
    }

    public final void accept(Object obj) {
        C140133ai aiVar = this.f380809a;
        C140131ag agVar = (C140131ag) obj;
        if (agVar.mo115470d(C140133ai.m227789a(this.f380810b), new C140145i(this.f380811c))) {
            C140129ae aeVar = aiVar.f380788d;
            agVar.getClass();
            aeVar.mo115466a(agVar);
            aiVar.mo115476g();
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
