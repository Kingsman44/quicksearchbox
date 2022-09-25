package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import android.content.Context;
import com.google.android.libraries.assistant.soda.C19343k;
import com.google.android.libraries.assistant.soda.Soda;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37254c;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37660hg;
import com.google.android.libraries.search.p2904c.C37662hi;
import com.google.android.libraries.search.p3055n.C39240a;
import com.google.android.libraries.search.p3055n.C39259ai;
import com.google.android.libraries.search.p3055n.C39260aj;
import com.google.android.libraries.search.p3055n.C39277b;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.C39390af;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a.C39383c;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3063a.C39384d;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3068f.p3069a.C39526i;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62950b;
import com.google.speech.p5218j.C67050je;
import com.google.speech.p5218j.C67056jk;
import com.google.speech.p5218j.C67086kn;
import com.google.speech.p5218j.C67087ko;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.n.c.a.h.br */
/* compiled from: PG */
public final class C39580br implements C39384d {

    /* renamed from: a */
    public static final C59071e f104168a = C59071e.m91332i("com.google.android.libraries.search.n.c.a.h.br");

    /* renamed from: b */
    public static final ByteBuffer f104169b = ByteBuffer.allocateDirect(0);

    /* renamed from: c */
    public final C37660hg f104170c;

    /* renamed from: d */
    public final C58833ax f104171d;

    /* renamed from: e */
    public final C58833ax f104172e;

    /* renamed from: f */
    public final ScheduledExecutorService f104173f;

    /* renamed from: g */
    public final Executor f104174g;

    /* renamed from: h */
    public final Executor f104175h;

    /* renamed from: i */
    public final C47632e f104176i;

    /* renamed from: j */
    public final AtomicReference f104177j = new AtomicReference(C39579bq.UNINITIALIZED);

    /* renamed from: k */
    public final C39526i f104178k;

    /* renamed from: l */
    public final C39606y f104179l;

    /* renamed from: m */
    public final boolean f104180m;

    /* renamed from: n */
    public final Duration f104181n;

    /* renamed from: o */
    public final boolean f104182o;

    /* renamed from: p */
    public C58833ax f104183p;

    /* renamed from: q */
    public C58833ax f104184q;

    /* renamed from: r */
    public C60870cx f104185r;

    /* renamed from: s */
    public C58833ax f104186s;

    /* renamed from: t */
    public C58833ax f104187t;

    /* renamed from: u */
    public C58833ax f104188u;

    /* renamed from: v */
    public C39390af f104189v;

    /* renamed from: w */
    private final C39542ag f104190w;

    public C39580br(ScheduledExecutorService scheduledExecutorService, Executor executor, Executor executor2, C37660hg hgVar, C39542ag agVar, C58833ax axVar, C58833ax axVar2, C39383c cVar, C39606y yVar, boolean z, C62910ar arVar, boolean z2, C39526i iVar) {
        C58836b bVar = C58836b.f156633a;
        this.f104183p = bVar;
        this.f104184q = bVar;
        this.f104185r = C60866ct.f164955a;
        C58836b bVar2 = C58836b.f156633a;
        this.f104186s = bVar2;
        this.f104187t = bVar2;
        this.f104188u = bVar2;
        this.f104173f = scheduledExecutorService;
        this.f104174g = executor;
        this.f104175h = executor2;
        this.f104190w = agVar;
        this.f104170c = hgVar;
        this.f104176i = new C47632e();
        this.f104171d = axVar;
        this.f104172e = axVar2;
        this.f104178k = iVar;
        this.f104179l = yVar;
        this.f104180m = z;
        this.f104181n = C62950b.m95473d(arVar);
        this.f104182o = z2;
        cVar.mo41795c(this);
    }

    /* renamed from: a */
    public final C60870cx mo41904a() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f104176i.mo51511a(new C39558aw(this), this.f104174g);
    }

    /* renamed from: b */
    public final C60870cx mo41905b(String str) {
        C39560ay ayVar = new C39560ay(this, str);
        return C60856cj.m92905n(C47810es.m84965e(ayVar), this.f104174g);
    }

    /* renamed from: d */
    public final C60870cx mo41906d() {
        C39565bc bcVar = new C39565bc(this);
        C60870cx m = C60856cj.m92904m(C47810es.m84978r(bcVar), this.f104174g);
        C39566bd bdVar = new C39566bd(this);
        return C60922j.m93045h(m, C47810es.m84966f(bdVar), this.f104174g);
    }

    /* renamed from: e */
    public final C60870cx mo41907e() {
        if (mo41913k()) {
            ((Soda) this.f104186s.mo56107c()).mo24342n(C58836b.f156633a);
            C59104x b = f104168a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b).mo56372aa(53759)).mo56386p("Unset the SodaAudioAdapter for exteranl Hotword verification.");
        } else {
            ((Soda) this.f104186s.mo56107c()).mo24342n(this.f104171d);
            C59104x b2 = f104168a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b2).mo56372aa(53756)).mo56386p("Set the SodaAudioAdapter");
        }
        if (this.f104177j.get() == C39579bq.UNINITIALIZED) {
            C59104x b3 = f104168a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b3).mo56372aa(53758)).mo56386p("Try to initialize soda");
            C39542ag agVar = this.f104190w;
            C39538ac d = ((C39583bu) this.f104188u.mo56107c()).mo41922d();
            String d2 = d.mo41893d();
            Context context = agVar.f104110b;
            C60870cx m = C60856cj.m92904m(C47810es.m84978r(new C39541af(d2, context)), agVar.f104111c);
            Context context2 = agVar.f104110b;
            C60870cx m2 = C60856cj.m92904m(C47810es.m84978r(new C39539ad(context2)), agVar.f104111c);
            C60870cx a = C47638k.m84751b(m, m2).mo51520a(new C39540ae(m, m2, d), agVar.f104111c);
            C39567be beVar = new C39567be(this);
            C60870cx g = C60922j.m93044g(a, C47810es.m84963c(beVar), this.f104174g);
            C39568bf bfVar = new C39568bf(this);
            return C60922j.m93045h(g, C47810es.m84966f(bfVar), this.f104174g);
        }
        C59104x b4 = f104168a.mo56224b();
        b4.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) b4).mo56372aa(53757)).mo56386p("Initialize soda not needed!");
        return mo41906d();
    }

    /* renamed from: f */
    public final C60870cx mo41908f(C39583bu buVar) {
        return this.f104176i.mo51512b(new C39545aj(this, buVar), this.f104174g);
    }

    /* renamed from: g */
    public final C60870cx mo41909g(C67056jk jkVar) {
        C60870cx a = ((C39605x) this.f104187t.mo56107c()).mo41949a("Hotword timeout");
        C39559ax axVar = new C39559ax(this, jkVar);
        return C60922j.m93044g(a, C47810es.m84963c(axVar), this.f104174g);
    }

    /* renamed from: h */
    public final C60870cx mo41910h(String str) {
        if (this.f104177j.get() == C39579bq.STARTED) {
            C59104x b = f104168a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
            ((C59052c) ((C59052c) b).mo56372aa(53763)).mo56389s("Soda is running, stop pushing audio %s", str);
            C60870cx a = ((C39605x) this.f104187t.mo56107c()).mo41949a(str);
            C39543ah ahVar = new C39543ah(this, str);
            return C60922j.m93045h(a, C47810es.m84966f(ahVar), this.f104174g);
        }
        C59104x d = f104168a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "SodaHotwordCntlr");
        ((C59052c) ((C59052c) d).mo56372aa(53762)).mo56389s("Soda is not running but receive a stop request %s", str);
        return C60866ct.f164955a;
    }

    /* renamed from: i */
    public final C67087ko mo41911i(C67050je jeVar, C37462ck ckVar) {
        C39259ai aiVar = (C39259ai) C39260aj.f103414f.createBuilder();
        aiVar.copyOnWrite();
        C39260aj ajVar = (C39260aj) aiVar.instance;
        jeVar.getClass();
        ajVar.f103420d = jeVar;
        ajVar.f103417a |= 4;
        aiVar.copyOnWrite();
        C39260aj ajVar2 = (C39260aj) aiVar.instance;
        ckVar.getClass();
        ajVar2.f103418b = ckVar;
        ajVar2.f103417a |= 1;
        C37662hi a = ((C39583bu) this.f104188u.mo56107c()).mo41920b().mo41899a();
        C39240a aVar = (C39240a) C39277b.f103459e.createBuilder();
        C37360ay ayVar = a.f100035d;
        if (ayVar == null) {
            ayVar = C37360ay.f99224l;
        }
        int i = ayVar.f99228c;
        aVar.copyOnWrite();
        C39277b bVar = (C39277b) aVar.instance;
        bVar.f103461a |= 1;
        bVar.f103462b = i;
        C37360ay ayVar2 = a.f100035d;
        if (ayVar2 == null) {
            ayVar2 = C37360ay.f99224l;
        }
        int i2 = ayVar2.f99229d;
        aVar.copyOnWrite();
        C39277b bVar2 = (C39277b) aVar.instance;
        bVar2.f103461a |= 2;
        bVar2.f103463c = i2;
        C37360ay ayVar3 = a.f100035d;
        if (ayVar3 == null) {
            ayVar3 = C37360ay.f99224l;
        }
        int i3 = ayVar3.f99230e;
        aVar.copyOnWrite();
        C39277b bVar3 = (C39277b) aVar.instance;
        bVar3.f103461a |= 4;
        bVar3.f103464d = i3;
        C39277b bVar4 = (C39277b) aVar.build();
        aiVar.copyOnWrite();
        C39260aj ajVar3 = (C39260aj) aiVar.instance;
        bVar4.getClass();
        ajVar3.f103419c = bVar4;
        ajVar3.f103417a |= 2;
        if (((C39583bu) this.f104188u.mo56107c()).mo41923e().mo56113h()) {
            C62910ar arVar = (C62910ar) ((C39583bu) this.f104188u.mo56107c()).mo41923e().mo56107c();
            aiVar.copyOnWrite();
            C39260aj ajVar4 = (C39260aj) aiVar.instance;
            arVar.getClass();
            ajVar4.f103421e = arVar;
            ajVar4.f103417a |= 8;
        }
        C67086kn knVar = (C67086kn) C67087ko.f182366n.createBuilder();
        knVar.mo58885m(C39260aj.f103415g, (C39260aj) aiVar.build());
        return (C67087ko) knVar.build();
    }

    /* renamed from: j */
    public final void mo41912j(C37254c cVar) {
        if (((C39583bu) this.f104188u.mo56107c()).mo41921c().mo41884c()) {
            this.f104178k.mo41869c(cVar);
        }
    }

    /* renamed from: k */
    public final boolean mo41913k() {
        return ((Boolean) ((C39583bu) this.f104188u.mo56107c()).mo41924f().mo56109e(false)).booleanValue();
    }

    /* renamed from: l */
    public final void mo41914l(C58833ax axVar, int i) {
        if (((C39583bu) this.f104188u.mo56107c()).mo41921c().mo41884c()) {
            this.f104178k.mo41872f(C37176a.f97285if.mo40806d(), axVar, i);
        }
    }

    /* renamed from: u */
    public final String mo41796u() {
        return "\t \t SodaHotwordDetectionController\n\t \t   Soda State: " + ((C39579bq) this.f104177j.get()).name() + "\n" + ((C19343k) this.f104171d.mo56107c()).mo24479i();
    }
}
