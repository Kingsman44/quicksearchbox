package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.p8520a;

import android.net.Uri;
import com.google.protos.p4850an.p4853b.C63358b;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.o.a.e */
/* compiled from: PG */
public final /* synthetic */ class C111668e implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Uri.Builder f310446a;

    public /* synthetic */ C111668e(Uri.Builder builder) {
        this.f310446a = builder;
    }

    public final void accept(Object obj) {
        Uri.Builder builder = this.f310446a;
        C63358b bVar = (C63358b) obj;
        int i = C111671h.f310452c;
        builder.appendQueryParameter("hour", String.valueOf(bVar.f171222e)).appendQueryParameter("minute", String.valueOf(bVar.f171223f));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
