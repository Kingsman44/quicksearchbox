package com.google.android.libraries.lens.p1995c.p1996a;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.libraries.lens.c.a.o */
/* compiled from: PG */
public final /* synthetic */ class C24087o implements ThreadFactory {

    /* renamed from: a */
    public static final /* synthetic */ C24087o f65786a = new C24087o();

    private /* synthetic */ C24087o() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "LensSvConn");
    }
}
