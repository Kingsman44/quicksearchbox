package com.google.mediapipe.p4722a;

import java.lang.Thread;

/* renamed from: com.google.mediapipe.a.c */
/* compiled from: PG */
public final /* synthetic */ class C62701c implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final /* synthetic */ C62707i f169280a;

    /* renamed from: b */
    public final /* synthetic */ Object f169281b;

    public /* synthetic */ C62701c(C62707i iVar, Object obj) {
        this.f169280a = iVar;
        this.f169281b = obj;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C62707i iVar = this.f169280a;
        Object obj = this.f169281b;
        synchronized (obj) {
            iVar.f169305b = th;
            obj.notify();
        }
    }
}
