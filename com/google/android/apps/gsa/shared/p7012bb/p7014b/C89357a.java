package com.google.android.apps.gsa.shared.p7012bb.p7014b;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.common.base.C58833ax;
import com.google.p4449cd.C57937b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.shared.bb.b.a */
/* compiled from: PG */
public final class C89357a {
    /* renamed from: a */
    public static C90456c m145329a(Throwable th) {
        C90452a aVar;
        Throwable th2 = (Throwable) C57937b.m88572b(th, ExecutionException.class).mo56111f();
        C58833ax a = C57937b.m88571a(th2, C90456c.class);
        if (a.mo56113h()) {
            return (C90456c) a.mo56107c();
        }
        if (th2 instanceof CancellationException) {
            aVar = new C90452a(th2, 211, C89885b.INTERNAL_CANCELLATION_ERROR_SEE_STACK_TRACE_VALUE);
        } else {
            aVar = new C90452a(th2, 211, C89885b.INTERNAL_ERROR_SEE_STACK_TRACE_VALUE);
        }
        return aVar;
    }
}
