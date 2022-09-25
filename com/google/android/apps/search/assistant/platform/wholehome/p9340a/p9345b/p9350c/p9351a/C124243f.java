package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.p9351a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9350c.C124237a;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.c.a.f */
/* compiled from: PG */
public final /* synthetic */ class C124243f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124248k f343045a;

    /* renamed from: b */
    public final /* synthetic */ C124237a f343046b;

    public /* synthetic */ C124243f(C124248k kVar, C124237a aVar) {
        this.f343045a = kVar;
        this.f343046b = aVar;
    }

    public final void run() {
        C124248k kVar = this.f343045a;
        C124237a aVar = this.f343046b;
        if (kVar.f343062f == null) {
            kVar.f343062f = aVar;
            return;
        }
        throw new IllegalStateException("ContextManager callbacks is already set");
    }
}
