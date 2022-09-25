package com.google.android.apps.gsa.staticplugins.opa.morris2.p8395h.p8397b;

import com.google.android.apps.gsa.n.b;
import com.google.android.apps.gsa.n.g.i;
import com.google.android.apps.gsa.n.g.u;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1076c.C14645a;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C63062g;
import com.google.protobuf.C63070h;
import com.google.protobuf.C63088z;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p4985f.p5030q.p5032b.C65031ap;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65138c;
import com.google.protos.p4985f.p5030q.p5034d.p5035a.C65139d;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65767ay;
import com.google.protos.p5129p.p5131b.C65768az;
import com.google.protos.p5129p.p5131b.C65848q;
import com.google.protos.p5129p.p5131b.C65849r;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.h.b.c */
/* compiled from: PG */
public final class C109662c implements C14645a {

    /* renamed from: a */
    public static final C59071e f305417a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.morris2.h.b.c");

    /* renamed from: b */
    private final u f305418b;

    /* renamed from: c */
    private final i f305419c;

    /* renamed from: d */
    private final b f305420d;

    /* renamed from: e */
    private final C86054o f305421e;

    /* renamed from: f */
    private final C21370a f305422f;

    /* renamed from: g */
    private final C60887da f305423g;

    public C109662c(u uVar, i iVar, b bVar, C86054o oVar, C60887da daVar, C21370a aVar) {
        this.f305418b = uVar;
        this.f305419c = iVar;
        this.f305420d = bVar;
        this.f305421e = oVar;
        this.f305423g = daVar;
        this.f305422f = aVar;
    }

    /* renamed from: a */
    public final C58485gu mo21588a() {
        Geller a = this.f305420d.a();
        if (a == null) {
            ((C59052c) ((C59052c) f305417a.mo56226d()).mo56372aa(25132)).mo56386p("Geller was not provided.");
            return C58485gu.m89845m();
        }
        return a.mo27177d(C58837ba.m90858g(this.f305421e.mo79659F()), C65753ak.ASSISTANT_SETTINGS, "driving_settings", C65031ap.f176100j, C63662ac.f172144a, C65849r.f179002c);
    }

    /* renamed from: b */
    public final C60870cx mo21589b() {
        return mo97946c(this.f305421e.mo79659F());
    }

    /* renamed from: c */
    public final C60870cx mo97946c(String str) {
        if (str == null) {
            ((C59052c) ((C59052c) f305417a.mo56225c()).mo56372aa(25133)).mo56386p("Account name cannot be null while reading driving settings");
            return C60856cj.m92899h(new IllegalArgumentException("Cannot read settings with a null account name."));
        }
        C60870cx a = this.f305419c.a(str, C65753ak.ASSISTANT_SETTINGS, "driving_settings", C63662ac.f172144a, C65849r.f179002c);
        C109660a aVar = C109660a.f305416a;
        return C60922j.m93044g(a, C47810es.m84963c(aVar), this.f305423g);
    }

    /* renamed from: d */
    public final C60870cx mo21590d(C52686as asVar) {
        return mo97947e(asVar, this.f305421e.mo79659F());
    }

    /* renamed from: e */
    public final C60870cx mo97947e(C52686as asVar, String str) {
        if (str == null) {
            ((C59052c) ((C59052c) f305417a.mo56225c()).mo56372aa(25134)).mo56386p("Account name cannot be null while writing driving settings");
            return C60856cj.m92899h(new IllegalArgumentException("Cannot read settings with a null account name."));
        }
        long b = this.f305422f.mo26870b();
        C65767ay ayVar = (C65767ay) C65768az.f178793f.createBuilder();
        ayVar.copyOnWrite();
        C65768az azVar = (C65768az) ayVar.instance;
        azVar.f178795a |= 4;
        azVar.f178798d = "driving_settings";
        C65138c cVar = (C65138c) C65139d.f176307e.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(b);
        cVar.copyOnWrite();
        C65139d dVar = (C65139d) cVar.instance;
        dVar.f176309a |= 1;
        dVar.f176310b = micros;
        ayVar.copyOnWrite();
        C65768az azVar2 = (C65768az) ayVar.instance;
        C65139d dVar2 = (C65139d) cVar.build();
        dVar2.getClass();
        azVar2.f178796b = dVar2;
        azVar2.f178795a |= 1;
        C63062g gVar = (C63062g) C63070h.f170215c.createBuilder();
        gVar.copyOnWrite();
        ((C63070h) gVar.instance).f170217a = "type.googleapis.com/geller.oneplatform.AssistantSettingsElement";
        C65848q qVar = (C65848q) C65849r.f179002c.createBuilder();
        qVar.copyOnWrite();
        C65849r rVar = (C65849r) qVar.instance;
        asVar.getClass();
        rVar.f179005b = asVar;
        rVar.f179004a = 10;
        C63088z byteString = ((C65849r) qVar.build()).toByteString();
        gVar.copyOnWrite();
        byteString.getClass();
        ((C63070h) gVar.instance).f170218b = byteString;
        ayVar.copyOnWrite();
        C65768az azVar3 = (C65768az) ayVar.instance;
        C63070h hVar = (C63070h) gVar.build();
        hVar.getClass();
        azVar3.f178799e = hVar;
        azVar3.f178795a |= 8;
        C60870cx d = this.f305418b.d(str, C65753ak.ASSISTANT_SETTINGS, (C65768az) ayVar.build(), true);
        C60856cj.m92911t(d, C47810es.m84974n(new C109661b()), this.f305423g);
        return d;
    }
}
