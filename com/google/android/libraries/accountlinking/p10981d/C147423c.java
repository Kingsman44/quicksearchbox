package com.google.android.libraries.accountlinking.p10981d;

import com.google.android.libraries.accountlinking.C147432j;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.libraries.accountlinking.d.c */
/* compiled from: PG */
public final class C147423c {
    /* renamed from: a */
    public static C147432j m240342a(Throwable th) {
        Status.Code code;
        Status b = m240343b(th);
        if (b == null || ((code = b.getCode()) != Status.Code.DEADLINE_EXCEEDED && code != Status.Code.UNAVAILABLE)) {
            return new C147432j(1, "An error occurred in gRPC call", th);
        }
        return new C147432j(2, "Network error", th);
    }

    /* renamed from: b */
    public static Status m240343b(Throwable th) {
        Throwable a = C147422b.m240341a(th);
        if (a instanceof StatusException) {
            return ((StatusException) a).f186943a;
        }
        if (a instanceof C70761fa) {
            return ((C70761fa) a).f188571a;
        }
        return null;
    }
}
