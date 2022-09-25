package com.google.android.apps.gsa.nga.shared.android;

import android.content.Intent;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.e */
/* compiled from: PG */
public final /* synthetic */ class C80949e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C80954j f221945a;

    public /* synthetic */ C80949e(C80954j jVar) {
        this.f221945a = jVar;
    }

    public final void accept(Object obj) {
        C80954j jVar = this.f221945a;
        Intent intent = (Intent) obj;
        Object obj2 = jVar.f221949b.get();
        if (obj2 != null) {
            ((C80951g) jVar).f221947a.mo73592a(obj2, intent);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
