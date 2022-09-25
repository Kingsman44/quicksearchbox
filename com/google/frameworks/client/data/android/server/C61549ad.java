package com.google.frameworks.client.data.android.server;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70703eh;
import p5488io.grpc.C70704ei;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70709en;
import p5488io.grpc.C70711ep;
import p5488io.grpc.Status;

/* renamed from: com.google.frameworks.client.data.android.server.ad */
/* compiled from: PG */
final class C61549ad implements C70705ej {

    /* renamed from: a */
    final /* synthetic */ C61550ae f166354a;

    /* renamed from: b */
    private final C70338di f166355b;

    /* renamed from: c */
    private final ConcurrentHashMap f166356c = new ConcurrentHashMap();

    public C61549ad(C61550ae aeVar, C70338di diVar) {
        this.f166354a = aeVar;
        this.f166355b = diVar;
    }

    /* renamed from: a */
    public final C70703eh mo39514a(C70704ei eiVar, C70334de deVar) {
        C60870cx a = this.f166354a.f166359c.f166361b.mo58126a(deVar, eiVar.mo62061f());
        if (a.isDone()) {
            try {
                return mo58117b(eiVar, deVar, C60856cj.m92909r(a));
            } catch (ExecutionException e) {
                return C61551af.m94300a(eiVar, Status.f186912j.mo61678e(e.getCause()).withDescription("Failed extracting call scope reference"));
            }
        } else {
            C61548ac acVar = new C61548ac(this.f166354a, eiVar, a);
            C47633f h = C47633f.m84733g(acVar.f166348b).mo51515h(new C61547ab(acVar, this, deVar), acVar.f166349c.f166359c.f166362c);
            C60856cj.m92911t(h.f164926b, C47810es.m84974n(acVar), acVar.f166349c.f166359c.f166362c);
            return acVar;
        }
    }

    /* renamed from: b */
    public final C70703eh mo58117b(C70704ei eiVar, C70334de deVar, Object obj) {
        if (obj == null) {
            return C61551af.m94300a(eiVar, Status.f186912j.withDescription("No call scope reference in call to ".concat(eiVar.toString())));
        }
        C70705ej ejVar = (C70705ej) this.f166356c.get(obj);
        if (ejVar == null) {
            C61550ae aeVar = this.f166354a;
            C70338di diVar = this.f166355b;
            C70711ep epVar = (C70711ep) aeVar.f166358b.get(obj);
            if (epVar == null) {
                C70298d b = aeVar.f166359c.f166361b.mo58127b(obj, aeVar.f166357a.f188456a);
                epVar = b != null ? b.mo17222gs() : null;
                if (epVar == null) {
                    epVar = C61551af.f166360a;
                }
                aeVar.f166358b.put(obj, epVar);
            }
            if (epVar != C61551af.f166360a) {
                Iterator it = epVar.mo62431a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ejVar = new C61613u(diVar);
                        break;
                    }
                    C70709en enVar = (C70709en) it.next();
                    if (enVar.f188450a.equals(diVar)) {
                        ejVar = enVar.f188451b;
                        break;
                    }
                }
            } else {
                ejVar = new C61614v(aeVar, obj);
            }
            this.f166356c.put(obj, ejVar);
        }
        return ejVar.mo39514a(eiVar, deVar);
    }
}
