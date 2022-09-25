package com.google.common.p4543n.p4546c;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: com.google.common.n.c.r */
/* compiled from: PG */
public final /* synthetic */ class C59410r implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C59417y f157623a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f157624b;

    public /* synthetic */ C59410r(C59417y yVar, C60870cx cxVar) {
        this.f157623a = yVar;
        this.f157624b = cxVar;
    }

    public final C60870cx apply(Object obj) {
        C59417y yVar = this.f157623a;
        C60870cx cxVar = this.f157624b;
        Exception exc = (Exception) obj;
        if (((C60873d) cxVar).value instanceof C60873d.C60875b) {
            return cxVar;
        }
        long c = yVar.f157635d.mo56917c(yVar.f157639h, yVar.f157637f.mo56158a(TimeUnit.MILLISECONDS));
        if (c < 0 || !yVar.f157636e.mo5941a(exc)) {
            C59417y.f157631a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", exc);
            int i = yVar.f157639h;
            throw new C59395c(exc);
        }
        C59417y.f157631a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", exc);
        yVar.mo56928g(c, TimeUnit.MILLISECONDS);
        return C60856cj.m92900i(C59417y.f157632b);
    }
}
