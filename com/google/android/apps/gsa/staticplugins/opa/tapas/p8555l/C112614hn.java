package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import android.net.Uri;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.hn */
/* compiled from: PG */
public final /* synthetic */ class C112614hn implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Uri.Builder f312216a;

    public /* synthetic */ C112614hn(Uri.Builder builder) {
        this.f312216a = builder;
    }

    public final void accept(Object obj) {
        int i = C112621hu.f312223b;
        this.f312216a.appendQueryParameter("suggested_length_millis", (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
