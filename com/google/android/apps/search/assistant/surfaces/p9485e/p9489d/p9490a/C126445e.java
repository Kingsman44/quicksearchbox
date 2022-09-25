package com.google.android.apps.search.assistant.surfaces.p9485e.p9489d.p9490a;

import com.google.android.libraries.search.assistant.p2705n.C34819a;
import com.google.android.libraries.search.assistant.p2783s.p2784a.C36381b;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65575d;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65579h;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65581j;
import com.google.protos.p5068j.p5069a.p5070a.p5111b.p5112a.p5113a.p5117b.p5118a.C65582k;
import com.google.speech.p5208h.C66608cf;
import com.google.speech.p5208h.C66610ch;
import com.google.speech.p5208h.C66611ci;
import kotlinx.coroutines.p5573a.C71348ab;
import kotlinx.coroutines.p5573a.C71361ao;
import org.chromium.net.NetworkException;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70761fa;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.surfaces.e.d.a.e */
/* compiled from: PG */
public final class C126445e implements C70862aj {

    /* renamed from: a */
    final /* synthetic */ C71361ao f348231a;

    public C126445e(C71361ao aoVar) {
        this.f348231a = aoVar;
    }

    /* renamed from: a */
    public final void mo20121a() {
        C71361ao aoVar = this.f348231a;
        C66608cf cfVar = (C66608cf) C66611ci.f181206g.createBuilder();
        C66610ch chVar = C66610ch.DONE_SUCCESS;
        cfVar.copyOnWrite();
        C66611ci ciVar = (C66611ci) cfVar.instance;
        ciVar.f181209b = chVar.f181205e;
        ciVar.f181208a |= 1;
        C62942bv build = cfVar.build();
        C69664n.m101060f(build, "newBuilder().setStatus(S…tus.DONE_SUCCESS).build()");
        C71348ab.m103986d(aoVar.mo62730w(build));
        this.f348231a.mo62727D((Throwable) null);
    }

    /* renamed from: b */
    public final void mo20122b(Throwable th) {
        C36381b bVar;
        C34819a aVar;
        C69664n.m101061g(th, C42181t.f110467a);
        C71361ao aoVar = this.f348231a;
        C69664n.m101061g(th, "cause");
        if (th instanceof C70761fa) {
            C70761fa faVar = (C70761fa) th;
            C69664n.m101061g(faVar, "cause");
            if (faVar.getCause() instanceof NetworkException) {
                C62940bt btVar = C65582k.f178253b;
                Throwable cause = faVar.getCause();
                C69664n.m101059e(cause, "null cannot be cast to non-null type org.chromium.net.NetworkException");
                C65575d a = C65575d.m96735a(((NetworkException) cause).getErrorCode());
                if (a == null) {
                    a = C65575d.UNKNOWN_OR_INTERNAL;
                }
                aVar = C34819a.m63580c(btVar, a);
            } else {
                C62940bt btVar2 = C65582k.f178252a;
                C65579h a2 = C65579h.m96739a(faVar.f188571a.getCode().value());
                if (a2 == null) {
                    a2 = C65579h.UNKNOWN_OR_OK;
                }
                aVar = C34819a.m63580c(btVar2, a2);
            }
            bVar = new C36381b(faVar, aVar);
        } else {
            bVar = new C36381b(th, C34819a.m63580c(C65582k.f178255d, C65581j.UNKNOWN_NETWORK_ERROR));
        }
        aoVar.mo62727D(bVar);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo20123c(Object obj) {
        C66611ci ciVar = (C66611ci) obj;
        C69664n.m101061g(ciVar, "value");
        if ((ciVar.f181208a & 1) != 0) {
            C66610ch a = C66610ch.m97260a(ciVar.f181209b);
            if (a == null) {
                a = C66610ch.IN_PROGRESS;
            }
            if (a == C66610ch.DONE_ERROR) {
                C71361ao aoVar = this.f348231a;
                int i = ciVar.f181210c;
                aoVar.mo62727D(new C36381b((Throwable) null, C34819a.m63580c(C65582k.f178255d, C65581j.UNKNOWN_SERVER_ERROR)));
                return;
            }
            return;
        }
        C71348ab.m103986d(this.f348231a.mo62730w(ciVar));
    }
}
