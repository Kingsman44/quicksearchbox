package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import android.net.Uri;
import p3186j$.time.LocalTime;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.gr */
/* compiled from: PG */
public final /* synthetic */ class C112589gr implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Uri.Builder f312187a;

    public /* synthetic */ C112589gr(Uri.Builder builder) {
        this.f312187a = builder;
    }

    public final void accept(Object obj) {
        Uri.Builder builder = this.f312187a;
        LocalTime localTime = (LocalTime) obj;
        int i = C112621hu.f312223b;
        builder.appendQueryParameter("hour", String.valueOf(localTime.getHour())).appendQueryParameter("minute", String.valueOf(localTime.getMinute()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
