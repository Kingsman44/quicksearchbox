package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.p9480a;

import com.google.frameworks.client.p4624a.p4625a.C61301b;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.a.d */
/* compiled from: PG */
public final class C126291d {
    /* renamed from: a */
    public static final C61301b m206499a(Throwable th) {
        Status b = m206500b(th);
        if (b != null) {
            return C126290c.m206496a(b);
        }
        return null;
    }

    /* renamed from: b */
    public static final Status m206500b(Throwable th) {
        if (th instanceof StatusException) {
            return ((StatusException) th).f186943a;
        }
        if (!(th instanceof C70761fa)) {
            return null;
        }
        return ((C70761fa) th).f188571a;
    }
}
