package com.google.common.util.concurrent;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.at */
/* compiled from: PG */
public final class C60812at {

    /* renamed from: a */
    private final C60802aj f164872a;

    public C60812at(C60802aj ajVar) {
        this.f164872a = ajVar;
    }

    /* renamed from: a */
    public final void mo57268a(Object obj, Executor executor) {
        executor.getClass();
        if (obj != null) {
            this.f164872a.mo57261b((Closeable) obj, executor);
        }
    }
}
