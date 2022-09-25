package com.google.android.apps.search.assistant.verticals.automation.routines.p10025c;

import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.c.b */
/* compiled from: PG */
public final /* synthetic */ class C131852b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f360082a;

    /* renamed from: b */
    public final /* synthetic */ String f360083b;

    public /* synthetic */ C131852b(AtomicReference atomicReference, String str) {
        this.f360082a = atomicReference;
        this.f360083b = str;
    }

    public final void run() {
        DesugarAtomicReference.getAndUpdate(this.f360082a, new C131854c(this.f360083b));
    }
}
