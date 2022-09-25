package com.google.android.libraries.search.assistant.p2705n.p2706a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2705n.C34836d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34821a;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34824d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34825e;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34827g;
import com.google.android.libraries.search.assistant.p2705n.p2708b.C34834b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.C71688dx;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70761fa;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

/* renamed from: com.google.android.libraries.search.assistant.n.a.d */
/* compiled from: PG */
public final class C34830d {

    /* renamed from: a */
    private static final C34819a f92393a = C34819a.m63580c(C34825e.f92385b, C34827g.UNKNOWN_EXCEPTION);

    /* renamed from: a */
    public static C34831e m63594a(C34822b bVar) {
        return new C34831e(bVar);
    }

    /* renamed from: b */
    public static C34822b m63595b(Throwable th) {
        C34819a aVar;
        C34821a aVar2 = (C34821a) C34822b.f92358d.createBuilder();
        if (th.getMessage() != null) {
            String message = th.getMessage();
            aVar2.copyOnWrite();
            C34822b bVar = (C34822b) aVar2.instance;
            message.getClass();
            bVar.f92360a |= 1;
            bVar.f92361b = message;
        }
        if (th instanceof C34820a) {
            aVar = ((C34820a) th).mo23265a();
        } else if (th instanceof StatusException) {
            StatusException statusException = (StatusException) th;
            aVar = m63597d(statusException.f186943a, statusException.f186944b);
        } else if (th instanceof C70761fa) {
            C70761fa faVar = (C70761fa) th;
            aVar = m63597d(faVar.f188571a, faVar.f188572b);
        } else if ((th instanceof TimeoutException) || (th instanceof C71688dx)) {
            aVar = C34819a.m63580c(C34825e.f92385b, C34827g.TIMEOUT_EXCEPTION);
        } else {
            aVar = th instanceof CancellationException ? C34819a.m63580c(C34825e.f92385b, C34827g.CANCELLATION_EXCEPTION) : f92393a;
        }
        C34834b d = aVar.mo39521d();
        aVar2.copyOnWrite();
        C34822b bVar2 = (C34822b) aVar2.instance;
        d.getClass();
        bVar2.f92362c = d;
        bVar2.f92360a |= 2;
        return (C34822b) aVar2.build();
    }

    /* renamed from: c */
    public static boolean m63596c(C34819a aVar) {
        switch (((C34836d) aVar).f92406a.f92404b) {
            case 355518931:
            case 355518932:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    private static C34819a m63597d(Status status, C70334de deVar) {
        C34819a aVar = deVar != null ? (C34819a) deVar.mo62027b(C34829c.f92392a) : null;
        if (aVar != null) {
            return aVar;
        }
        return C34819a.m63580c(C34825e.f92384a, C34824d.m63587a(status.getCode().value()));
    }
}
