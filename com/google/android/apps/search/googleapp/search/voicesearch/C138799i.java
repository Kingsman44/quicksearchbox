package com.google.android.apps.search.googleapp.search.voicesearch;

import java.io.PrintWriter;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.search.voicesearch.i */
/* compiled from: PG */
public final /* synthetic */ class C138799i implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ PrintWriter f377551a;

    public /* synthetic */ C138799i(PrintWriter printWriter) {
        this.f377551a = printWriter;
    }

    public final void accept(Object obj) {
        this.f377551a.println((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
