package com.google.android.libraries.web.contrib.debug.internal;

import java.io.PrintWriter;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.web.contrib.debug.internal.t */
/* compiled from: PG */
public final /* synthetic */ class C43496t implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ PrintWriter f113603a;

    public /* synthetic */ C43496t(PrintWriter printWriter) {
        this.f113603a = printWriter;
    }

    public final void accept(Object obj) {
        this.f113603a.println((String) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
