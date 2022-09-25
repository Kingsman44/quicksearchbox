package com.google.android.libraries.p11012aj.p11014b;

import java.lang.Thread;

/* renamed from: com.google.android.libraries.aj.b.b */
/* compiled from: PG */
public final /* synthetic */ class C147598b implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ C147599c f398403a;

    /* renamed from: b */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f398404b;

    public /* synthetic */ C147598b(C147599c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f398403a = cVar;
        this.f398404b = uncaughtExceptionHandler;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        this.f398403a.mo124373b(this.f398404b, thread, th);
    }
}
