package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124272a;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.e */
/* compiled from: PG */
public final /* synthetic */ class C124299e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124315u f343134a;

    /* renamed from: b */
    public final /* synthetic */ C124272a f343135b;

    public /* synthetic */ C124299e(C124315u uVar, C124272a aVar) {
        this.f343134a = uVar;
        this.f343135b = aVar;
    }

    public final void run() {
        C124315u uVar = this.f343134a;
        C124272a aVar = this.f343135b;
        if (uVar.f343173j == null) {
            uVar.f343173j = aVar;
            return;
        }
        throw new IllegalStateException("Usonia callbacks is already set");
    }
}
