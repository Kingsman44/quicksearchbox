package com.google.android.apps.search.googleapp.launcher.p10341b.p10351i;

import android.content.Context;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.i.c */
/* compiled from: PG */
public final /* synthetic */ class C136525c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Context f371695a;

    public /* synthetic */ C136525c(Context context) {
        this.f371695a = context;
    }

    public final void accept(Object obj) {
        this.f371695a.unregisterReceiver((C136530h) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
