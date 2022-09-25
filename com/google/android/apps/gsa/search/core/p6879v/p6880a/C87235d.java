package com.google.android.apps.gsa.search.core.p6879v.p6880a;

import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4453d.C57960f;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.search.core.v.a.d */
/* compiled from: PG */
public final class C87235d {
    /* renamed from: a */
    public static void m141060a(AtomicBoolean atomicBoolean) {
        if (atomicBoolean.getAndSet(true)) {
            throw new IllegalStateException("Depending on both CompletedHttpResponse and HttpResponse producers is not allowed.");
        }
    }

    /* renamed from: b */
    public static void m141061b(C57960f fVar, C60870cx cxVar, C58833ax axVar) {
        if (!((Boolean) axVar.mo56109e(false)).booleanValue()) {
            fVar.mo54567b(new C87234c(cxVar));
        }
    }
}
