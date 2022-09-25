package com.google.android.libraries.search.location;

import com.google.android.gms.location.C144889at;
import com.google.android.libraries.search.location.p3029a.p3032c.p3033a.C38641e;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.location.j */
/* compiled from: PG */
public final /* synthetic */ class C38704j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C38712r f102198a;

    /* renamed from: b */
    public final /* synthetic */ C144889at f102199b;

    /* renamed from: c */
    public final /* synthetic */ C39226b f102200c;

    public /* synthetic */ C38704j(C38712r rVar, C144889at atVar, C39226b bVar) {
        this.f102198a = rVar;
        this.f102199b = atVar;
        this.f102200c = bVar;
    }

    public final void accept(Object obj) {
        C38712r rVar = this.f102198a;
        C144889at atVar = this.f102199b;
        ((C38641e) obj).mo41538c((C144889at) rVar.f102225e.get(atVar), this.f102200c);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
