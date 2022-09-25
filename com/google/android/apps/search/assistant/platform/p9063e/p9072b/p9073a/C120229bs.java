package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.C33461o;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.bs */
/* compiled from: PG */
public final /* synthetic */ class C120229bs implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f334572a;

    public /* synthetic */ C120229bs(C60870cx cxVar) {
        this.f334572a = cxVar;
    }

    public final void accept(Object obj) {
        C33461o oVar = (C33461o) obj;
        this.f334572a.cancel(false);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
