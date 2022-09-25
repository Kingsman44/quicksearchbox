package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.window;

import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.window.d */
/* compiled from: PG */
public final /* synthetic */ class C82170d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C82167bq f224600a;

    public /* synthetic */ C82170d(C82167bq bqVar) {
        this.f224600a = bqVar;
    }

    public final void accept(Object obj) {
        C82167bq bqVar = this.f224600a;
        bqVar.f224593b.mo76660b(C82165bo.NONE);
        bqVar.f224594c.mo76660b((C82166bp) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
