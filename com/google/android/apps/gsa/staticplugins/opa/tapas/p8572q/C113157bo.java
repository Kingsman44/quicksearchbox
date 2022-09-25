package com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q.bo */
/* compiled from: PG */
public final class C113157bo {

    /* renamed from: a */
    private final Executor f313472a;

    public C113157bo(Executor executor) {
        this.f313472a = executor;
    }

    /* renamed from: a */
    public final C60870cx mo99891a(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            C113152bj bjVar = new C113152bj(entry.getKey());
            arrayList.add(C60922j.m93044g((C60870cx) entry.getValue(), C47810es.m84963c(bjVar), this.f313472a));
        }
        C60870cx o = C60856cj.m92906o(arrayList);
        C113153bk bkVar = C113153bk.f313468a;
        return C60922j.m93044g(o, C47810es.m84963c(bkVar), this.f313472a);
    }
}
