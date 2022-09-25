package com.google.android.apps.search.assistant.platform.pcp.p9337g;

import com.google.android.libraries.performance.primes.C31167ax;
import com.google.android.libraries.performance.primes.metrics.p2415i.C31520m;
import com.google.apps.tiktok.p3644h.p3647b.C47120c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3994s.p3995a.C53140cw;
import com.google.assistant.p3994s.p3995a.C53142cy;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.assistant.p3994s.p3995a.C53348ko;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.p4632a.C61349j;
import com.google.frameworks.client.data.android.p4632a.C61354o;
import com.google.frameworks.client.data.android.p4632a.C61355p;
import com.google.frameworks.client.data.android.p4632a.C61358s;
import com.google.frameworks.client.data.android.p4638e.C61409d;
import com.google.frameworks.client.data.p4631a.C61331a;
import com.google.p4017at.p4099l.p4100a.C54561b;
import com.google.p4017at.p4099l.p4100a.C54562c;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Optional;
import p5488io.grpc.C70297cz;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70846h;
import p5488io.grpc.C70888j;
import p5488io.grpc.C70899n;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;
import p5488io.grpc.p5533i.C70879r;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.g.c */
/* compiled from: PG */
public final /* synthetic */ class C124006c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C124012i f342516a;

    /* renamed from: b */
    public final /* synthetic */ C53348ko f342517b;

    public /* synthetic */ C124006c(C124012i iVar, C53348ko koVar) {
        this.f342516a = iVar;
        this.f342517b = koVar;
    }

    public final C60870cx apply(Object obj) {
        C124012i iVar = this.f342516a;
        C53348ko koVar = this.f342517b;
        C53140cw cwVar = (C53140cw) obj;
        C59104x b = C124012i.f342525a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "PCP.SyncManager");
        ((C59052c) ((C59052c) b).mo56372aa(35357)).mo56386p("PCP #startSync");
        C31520m c = C31167ax.m58112a().mo36912c();
        C124004a aVar = iVar.f342527c;
        C70334de deVar = new C70334de();
        deVar.mo62033h(C70297cz.m102495c(C61331a.m93818a(304380776), C70334de.f187480b), koVar.toByteArray());
        C70899n[] nVarArr = {new C70879r(deVar)};
        C70846h hVar = C61409d.f166071a;
        C47120c cVar = aVar.f342515b;
        C61349j jVar = new C61349j();
        C61354o a = C61355p.m93860a(C58528ij.m90011K("pseudonymous", "incognito"));
        a.f165916a = C58833ax.m90834k("AIzaSyA83c9vhTiWKbMqVq5pEuvjDOAfyu1MrS4");
        jVar.f165910b = C58833ax.m90834k(a.mo57929a());
        C54561b bVar = (C54561b) ((C54561b) ((C54561b) aVar.f342514a.mo17428b()).mo62576o(nVarArr)).mo62577p(hVar, new C61358s(jVar.mo57930b()));
        C70888j jVar2 = bVar.f189039a;
        C70338di diVar = C54562c.f143250a;
        if (diVar == null) {
            synchronized (C54562c.class) {
                diVar = C54562c.f143250a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.zerostateproxy.v1.ZeroStateProxy", "SyncPcpData");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53140cw.f139278h);
                    d.f187486b = C70850d.m103697c(C53142cy.f139288b);
                    diVar = d.mo62040a();
                    C54562c.f143250a = diVar;
                }
            }
        }
        C60870cx q = C60856cj.m92908q(C70876o.m103760a(jVar2.mo39510a(diVar, bVar.f189040b), cwVar), iVar.f342530f, TimeUnit.SECONDS, iVar.f342531g);
        C53306j a2 = C53306j.m86809a(cwVar.f139284e);
        if (a2 == null) {
            a2 = C53306j.UNKNOWNN;
        }
        C124011h hVar2 = new C124011h(c, Optional.m71637of(a2));
        C60856cj.m92911t(q, C47810es.m84974n(hVar2), iVar.f342526b);
        return C47633f.m84733g(q).mo51514f(TimeoutException.class, C124008e.f342519a, C60826bg.f164896a).mo51514f(RuntimeException.class, C124009f.f342520a, C60826bg.f164896a).mo51516i(new C124010g(iVar, cwVar), iVar.f342526b);
    }
}
