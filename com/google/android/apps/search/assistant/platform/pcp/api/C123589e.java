package com.google.android.apps.search.assistant.platform.pcp.api;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123745bl;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.api.e */
/* compiled from: PG */
public final /* synthetic */ class C123589e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f341477a;

    public /* synthetic */ C123589e(C60870cx cxVar) {
        this.f341477a = cxVar;
    }

    public final Object call() {
        C60870cx cxVar = this.f341477a;
        C123745bl blVar = (C123745bl) C123746bm.f341818b.createBuilder();
        blVar.mo106124a((Iterable) C60856cj.m92909r(cxVar));
        return (C123746bm) blVar.build();
    }
}
