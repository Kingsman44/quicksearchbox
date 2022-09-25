package com.google.frameworks.client.data.android;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p3340w.p3342b.C43212b;
import com.google.android.libraries.p3340w.p3342b.C43219i;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.C70903r;
import p5488io.grpc.p5523c.C70261e;
import p5488io.grpc.p5525e.C70549hc;

/* renamed from: com.google.frameworks.client.data.android.av */
/* compiled from: PG */
public final class C61380av {
    /* renamed from: a */
    public static /* synthetic */ C70888j m93904a(C69464a aVar, C61377as asVar) {
        C19559g.m37303b();
        C61413f fVar = (C61413f) asVar;
        C70261e b = C70261e.m102411b(fVar.f166073b.getHost(), fVar.f166073b.getPort(), (CronetEngine) aVar.mo17428b());
        String str = fVar.f166077f;
        if (str == null) {
            str = new CronetEngine.Builder(fVar.f166072a).getDefaultUserAgent();
        }
        C70549hc hcVar = b.f187275c;
        hcVar.f188040h = str;
        hcVar.mo62290e(fVar.f166075d);
        b.f187275c.mo62294i(fVar.f166074c);
        b.f187275c.mo62291f(fVar.f166082k, TimeUnit.MILLISECONDS);
        int i = fVar.f166083l;
        C58838bb.m90869d(i >= 0, "maxMessageSize must be >= 0");
        b.f187277e = i;
        ScheduledExecutorService scheduledExecutorService = fVar.f166076e;
        if (scheduledExecutorService != null) {
            b.mo61906d(scheduledExecutorService);
        }
        C61530n nVar = fVar.f166079h;
        if (nVar != null) {
            C58800sl lA = nVar.mo58109a().iterator();
            while (true) {
                if (!lA.hasNext()) {
                    break;
                } else if (((C61529m) lA.next()).mo58106a() != null) {
                    b.f187275c.f188045m = true;
                    C58480gp e = C58485gu.m89837e();
                    C58800sl lA2 = nVar.mo58109a().iterator();
                    while (lA2.hasNext()) {
                        C61529m mVar = (C61529m) lA2.next();
                        C58490gz gzVar = new C58490gz(4);
                        C58490gz gzVar2 = new C58490gz(4);
                        gzVar2.mo55429h("service", mVar.mo58108c());
                        if (mVar.mo58107b() != null) {
                            gzVar2.mo55429h("method", C70338di.m102601b(mVar.mo58107b().f187497b));
                        }
                        gzVar.mo55429h("name", C58485gu.m89846n(gzVar2.mo55427f(true)));
                        C61527l a = mVar.mo58106a();
                        if (a == null || !a.mo58105a()) {
                            e.mo55395g(gzVar.mo55427f(true));
                        } else {
                            throw null;
                        }
                    }
                    b.f187275c.f188047o = C70549hc.m103039b(C58495hd.m89900n("methodConfig", e.mo55394f()));
                }
            }
        }
        Integer num = fVar.f166080i;
        if (num != null) {
            int intValue = num.intValue();
            b.f187280h = true;
            b.f187281i = intValue;
        }
        Integer num2 = fVar.f166081j;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            b.f187278f = true;
            b.f187279g = intValue2;
        }
        return C70903r.m103829a(b.f187275c.mo57963c(), Arrays.asList(new C70899n[]{new C43212b(new C43219i(fVar.f166078g))}));
    }
}
