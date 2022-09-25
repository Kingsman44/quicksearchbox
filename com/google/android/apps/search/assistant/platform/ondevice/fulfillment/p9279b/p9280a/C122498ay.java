package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122396ao;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.ay */
/* compiled from: PG */
public final /* synthetic */ class C122498ay implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122501ba f339585a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f339586b;

    public /* synthetic */ C122498ay(C122501ba baVar, Throwable th) {
        this.f339585a = baVar;
        this.f339586b = th;
    }

    public final void run() {
        C122501ba baVar = this.f339585a;
        Throwable th = this.f339586b;
        C122396ao aoVar = C122396ao.PART;
        int i = baVar.f339596c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            baVar.f339596c = 3;
            baVar.f339594a = Optional.m71637of(th);
            Collection.EL.stream(baVar.f339595b.values()).forEach(new C122496aw(th));
            baVar.f339595b.clear();
        } else if (i2 == 1) {
            C59104x d = C122504bd.f339601a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ODNLUFFSvcCnctnImpl");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(34785)).mo56386p("onError called after onCompleted");
        } else if (i2 == 2) {
            C59104x d2 = C122504bd.f339601a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ODNLUFFSvcCnctnImpl");
            ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(th)).mo56372aa(34786)).mo56386p("onError called twice");
        }
    }
}
