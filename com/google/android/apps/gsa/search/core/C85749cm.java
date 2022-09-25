package com.google.android.apps.gsa.search.core;

import android.net.Uri;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.search.core.cm */
/* compiled from: PG */
public final /* synthetic */ class C85749cm implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Uri.Builder f231855a;

    public /* synthetic */ C85749cm(Uri.Builder builder) {
        this.f231855a = builder;
    }

    public final void accept(Object obj) {
        this.f231855a.appendPath((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
