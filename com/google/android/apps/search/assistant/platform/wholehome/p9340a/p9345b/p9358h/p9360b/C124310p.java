package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.p9360b;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9358h.C124272a;
import com.google.assistant.p3741aa.p3742a.p3743a.C48160h;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.h.b.p */
/* compiled from: PG */
public final /* synthetic */ class C124310p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C124314t f343155a;

    /* renamed from: b */
    public final /* synthetic */ C48160h f343156b;

    public /* synthetic */ C124310p(C124314t tVar, C48160h hVar) {
        this.f343155a = tVar;
        this.f343156b = hVar;
    }

    public final void run() {
        C124314t tVar = this.f343155a;
        C48160h hVar = this.f343156b;
        C124272a aVar = tVar.f343163a.f343173j;
        if (aVar != null) {
            aVar.mo106342e(hVar);
            return;
        }
        throw new IllegalStateException("Usonia callbacks is not set");
    }
}
