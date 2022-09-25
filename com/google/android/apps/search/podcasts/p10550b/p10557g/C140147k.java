package com.google.android.apps.search.podcasts.p10550b.p10557g;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.podcasts.b.g.k */
/* compiled from: PG */
public final /* synthetic */ class C140147k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C140133ai f380806a;

    /* renamed from: b */
    public final /* synthetic */ C140641b f380807b;

    public /* synthetic */ C140147k(C140133ai aiVar, C140641b bVar) {
        this.f380806a = aiVar;
        this.f380807b = bVar;
    }

    public final void accept(Object obj) {
        C140133ai aiVar = this.f380806a;
        C140641b bVar = this.f380807b;
        C140131ag agVar = (C140131ag) obj;
        C140646b bVar2 = bVar.f381974a;
        if (bVar2 == null) {
            bVar2 = C140646b.f381993r;
        }
        if (agVar.mo115470d(C140133ai.m227789a(bVar2), new C140155s(bVar))) {
            C140129ae aeVar = aiVar.f380788d;
            agVar.getClass();
            aeVar.mo115466a(agVar);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
