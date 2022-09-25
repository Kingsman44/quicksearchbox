package com.google.android.apps.search.googleapp.search.voicesearch;

import java.io.PrintWriter;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.aa */
/* compiled from: PG */
public final /* synthetic */ class C138696aa implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ PrintWriter f377227a;

    public /* synthetic */ C138696aa(PrintWriter printWriter) {
        this.f377227a = printWriter;
    }

    public final void accept(Object obj) {
        this.f377227a.println((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
