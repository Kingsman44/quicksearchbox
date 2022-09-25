package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import androidx.p104d.p105a.C2164c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.bj */
/* compiled from: PG */
public final /* synthetic */ class C124467bj implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124475br f343492a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f343493b;

    public /* synthetic */ C124467bj(C124475br brVar, Throwable th) {
        this.f343492a = brVar;
        this.f343493b = th;
    }

    public final void run() {
        C124475br brVar = this.f343492a;
        Throwable th = this.f343493b;
        for (C2164c d : brVar.f343506e.values()) {
            d.mo5439d(th);
        }
        brVar.f343505d.mo104263a(Optional.ofNullable(th));
        brVar.mo106431e();
    }
}
