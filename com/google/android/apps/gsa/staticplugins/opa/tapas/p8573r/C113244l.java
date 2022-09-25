package com.google.android.apps.gsa.staticplugins.opa.tapas.p8573r;

import androidx.work.C4632m;
import androidx.work.C4645z;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.opa.C83581al;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48678am;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65822cz;
import com.google.protos.p5129p.p5131b.C65824da;
import dagger.C68214a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.r.l */
/* compiled from: PG */
public final class C113244l implements C113240h {

    /* renamed from: a */
    public static final C59071e f313583a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.r.l");

    /* renamed from: b */
    private final C86124t f313584b;

    /* renamed from: c */
    private final Executor f313585c;

    /* renamed from: d */
    private final C68214a f313586d;

    /* renamed from: e */
    private final u f313587e;

    /* renamed from: f */
    private final C21370a f313588f;

    /* renamed from: g */
    private final C86054o f313589g;

    public C113244l(C86124t tVar, C90851k kVar, C68214a aVar, u uVar, C21370a aVar2, C86054o oVar) {
        this.f313584b = tVar;
        this.f313585c = kVar.mo85208a("tapasOfflineBackground");
        this.f313586d = aVar;
        this.f313587e = uVar;
        this.f313588f = aVar2;
        this.f313589g = oVar;
    }

    /* renamed from: a */
    public final C60870cx mo99917a(C48678am amVar) {
        C60870cx cxVar;
        if (this.f313584b.mo79746e(C90063do.f249458ds)) {
            String valueOf = String.valueOf(1);
            String F = this.f313589g.mo79659F();
            if (F == null) {
                C59104x b = f313583a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "TapasOfflineDataManager");
                ((C59052c) ((C59052c) b).mo56372aa(27986)).mo56386p("User not signed in for Geller write.");
                cxVar = C60856cj.m92900i(new C4645z(C4632m.f14549a));
            } else if (C58837ba.m90859h(valueOf)) {
                C59104x b2 = f313583a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "TapasOfflineDataManager");
                ((C59052c) ((C59052c) b2).mo56372aa(27985)).mo56386p("Invalid Geller Key");
                cxVar = C60856cj.m92900i(new C4645z(C4632m.f14549a));
            } else {
                long micros = TimeUnit.MILLISECONDS.toMicros(this.f313588f.mo26870b());
                C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
                C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
                cVar.copyOnWrite();
                C65139d dVar = (C65139d) cVar.instance;
                dVar.f176309a |= 1;
                dVar.f176310b = micros;
                ayVar.copyOnWrite();
                C65768az azVar = (C65768az) ayVar.instance;
                C65139d dVar2 = (C65139d) cVar.build();
                dVar2.getClass();
                azVar.f178796b = dVar2;
                azVar.f178795a |= 1;
                ayVar.copyOnWrite();
                C65768az azVar2 = (C65768az) ayVar.instance;
                valueOf.getClass();
                azVar2.f178795a |= 4;
                azVar2.f178798d = valueOf;
                C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
                gVar.copyOnWrite();
                ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.TapasOfflineElement";
                C65822cz czVar = (C65822cz) C65824da.f178945c.createBuilder();
                czVar.copyOnWrite();
                C65824da daVar = (C65824da) czVar.instance;
                amVar.getClass();
                daVar.f178948b = amVar;
                daVar.f178947a |= 1;
                C63088z byteString = ((C65824da) czVar.build()).toByteString();
                gVar.copyOnWrite();
                byteString.getClass();
                ((C63070h) gVar.instance).f170218b = byteString;
                ayVar.copyOnWrite();
                C65768az azVar3 = (C65768az) ayVar.instance;
                C63070h hVar = (C63070h) gVar.build();
                hVar.getClass();
                azVar3.f178799e = hVar;
                azVar3.f178795a |= 8;
                cxVar = C60922j.m93044g(C60838bs.m92859i(this.f313587e.d(F, C65753ak.TAPAS_OFFLINE_RANKED, (C65768az) ayVar.build(), false)), C113241i.f313580a, this.f313585c);
            }
        } else {
            cxVar = C60922j.m93044g(C60838bs.m92859i(((C83581al) this.f313586d.mo27525b()).mo76940o(amVar)), C113242j.f313581a, this.f313585c);
        }
        return C60922j.m93044g(cxVar, C113243k.f313582a, this.f313585c);
    }
}
