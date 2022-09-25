package com.google.android.apps.search.assistant.libraries.p8956c.p8957a;

import com.google.android.libraries.social.populous.android.C42181t;
import org.chromium.net.NetworkException;
import org.chromium.net.QuicException;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.libraries.c.a.c */
/* compiled from: PG */
public final class C119257c {
    /* renamed from: a */
    public static final boolean m197952a(Throwable th) {
        if (!(th instanceof C70761fa)) {
            return false;
        }
        C70761fa faVar = (C70761fa) th;
        if (faVar.f188571a.getCode().equals(Status.Code.UNAUTHENTICATED) || faVar.f188571a.getCode().equals(Status.Code.INVALID_ARGUMENT)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m197953b(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        Optional a = C119256b.f332583a.mo104261a(th);
        if (!a.isPresent()) {
            return false;
        }
        Object obj = a.get();
        C69664n.m101060f(obj, "networkExceptionOptional.get()");
        C119256b bVar = (C119256b) obj;
        C69664n.m101061g(bVar, C42181t.f110467a);
        NetworkException networkException = bVar.f332584b;
        C69664n.m101061g(networkException, C42181t.f110467a);
        if (networkException.immediatelyRetryable()) {
            return true;
        }
        if (!(networkException instanceof QuicException)) {
            return networkException.getCronetInternalErrorCode() != 0;
        }
        QuicException quicException = (QuicException) networkException;
        return (quicException.getCronetInternalErrorCode() == 0 || quicException.getQuicDetailedErrorCode() == 0) ? false : true;
    }
}
