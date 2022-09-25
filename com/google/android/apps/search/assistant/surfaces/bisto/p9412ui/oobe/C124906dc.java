package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.net.Uri;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.dc */
/* compiled from: PG */
public final /* synthetic */ class C124906dc implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Uri.Builder f344626a;

    public /* synthetic */ C124906dc(Uri.Builder builder) {
        this.f344626a = builder;
    }

    public final void accept(Object obj) {
        this.f344626a.appendQueryParameter("sub", (String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
