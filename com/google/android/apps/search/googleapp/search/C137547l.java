package com.google.android.apps.search.googleapp.search;

import java.io.PrintWriter;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.googleapp.search.l */
/* compiled from: PG */
public final /* synthetic */ class C137547l implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ PrintWriter f374102a;

    public /* synthetic */ C137547l(PrintWriter printWriter) {
        this.f374102a = printWriter;
    }

    public final void accept(Object obj) {
        this.f374102a.println((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
