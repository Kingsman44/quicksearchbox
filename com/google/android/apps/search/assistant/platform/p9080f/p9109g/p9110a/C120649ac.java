package com.google.android.apps.search.assistant.platform.p9080f.p9109g.p9110a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.g.a.ac */
/* compiled from: PG */
public final /* synthetic */ class C120649ac implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f335591a;

    public /* synthetic */ C120649ac(C60870cx cxVar) {
        this.f335591a = cxVar;
    }

    public final void accept(Object obj) {
        C33461o oVar = (C33461o) obj;
        this.f335591a.cancel(false);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
