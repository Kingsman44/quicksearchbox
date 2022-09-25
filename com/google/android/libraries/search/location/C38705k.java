package com.google.android.libraries.search.location;

import com.google.android.gms.location.C144889at;
import com.google.android.libraries.search.location.p3029a.p3032c.p3033a.C38641e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.location.k */
/* compiled from: PG */
public final /* synthetic */ class C38705k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C38712r f102201a;

    /* renamed from: b */
    public final /* synthetic */ C144889at f102202b;

    public /* synthetic */ C38705k(C38712r rVar, C144889at atVar) {
        this.f102201a = rVar;
        this.f102202b = atVar;
    }

    public final void accept(Object obj) {
        C38712r rVar = this.f102201a;
        ((C38641e) obj).mo41537a((C144889at) rVar.f102225e.get(this.f102202b));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
