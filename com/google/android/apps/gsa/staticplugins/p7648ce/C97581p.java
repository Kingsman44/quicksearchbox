package com.google.android.apps.gsa.staticplugins.p7648ce;

/* renamed from: com.google.android.apps.gsa.staticplugins.ce.p */
/* compiled from: PG */
public final /* synthetic */ class C97581p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C97565ax f272599a;

    /* renamed from: b */
    public final /* synthetic */ int f272600b;

    public /* synthetic */ C97581p(C97565ax axVar, int i) {
        this.f272599a = axVar;
        this.f272600b = i;
    }

    public final void run() {
        C97565ax axVar = this.f272599a;
        axVar.f272542c.getApplication().onTrimMemory(this.f272600b);
    }
}
