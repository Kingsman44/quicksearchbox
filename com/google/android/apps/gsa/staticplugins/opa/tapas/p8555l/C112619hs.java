package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import android.net.Uri;
import p3186j$.time.LocalTime;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.hs */
/* compiled from: PG */
public final /* synthetic */ class C112619hs implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Uri.Builder f312221a;

    public /* synthetic */ C112619hs(Uri.Builder builder) {
        this.f312221a = builder;
    }

    public final void accept(Object obj) {
        Uri.Builder builder = this.f312221a;
        int i = C112621hu.f312223b;
        builder.appendQueryParameter("suggested_time", ((LocalTime) obj).toString());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
