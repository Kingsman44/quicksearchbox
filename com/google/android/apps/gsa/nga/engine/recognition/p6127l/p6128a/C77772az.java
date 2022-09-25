package com.google.android.apps.gsa.nga.engine.recognition.p6127l.p6128a;

import com.google.android.apps.gsa.nga.engine.d.a.fa;
import com.google.android.apps.gsa.nga.engine.p5960as.C75042j;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p6029g.C76090f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.engine.p6142u.C78007b;
import com.google.android.apps.gsa.nga.engine.p6243v.C79359i;
import com.google.android.apps.gsa.nga.engine.p6243v.C79360j;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.p6260x.C79863k;
import com.google.android.apps.gsa.nga.shared.p6345h.C81251ap;
import com.google.android.apps.gsa.nga.shared.p6362r.C81451b;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.android.apps.search.assistant.platform.p9044c.p9055c.p9056a.p9057a.C120124o;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.speech.p5218j.C66999hh;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.l.a.az */
/* compiled from: PG */
public final class C77772az extends C79360j implements C75042j {

    /* renamed from: a */
    public static final C58974d f214232a = C58974d.m91136j();

    /* renamed from: b */
    static final Duration f214233b = Duration.ofSeconds(20);

    /* renamed from: c */
    public final fa f214234c;

    /* renamed from: d */
    public final C79851ai f214235d;

    /* renamed from: e */
    public final C77795bv f214236e;

    /* renamed from: f */
    public final C77817v f214237f;

    /* renamed from: g */
    public final C22871g f214238g;

    /* renamed from: h */
    public final C75050a f214239h;

    /* renamed from: i */
    public final C91142g f214240i;

    /* renamed from: j */
    public final C79863k f214241j;

    /* renamed from: k */
    public final C77756aj f214242k;

    /* renamed from: l */
    public final Optional f214243l;

    /* renamed from: m */
    private final C22871g f214244m;

    /* renamed from: n */
    private final C78007b f214245n;

    /* renamed from: o */
    private final C76092h f214246o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77772az(C77756aj ajVar, C22871g gVar, C22871g gVar2, C75050a aVar, C91142g gVar3, C79863k kVar, C76092h hVar, C79359i iVar, fa faVar, C79851ai aiVar, C77795bv bvVar, C77817v vVar, Optional optional, C78007b bVar) {
        super(iVar, hVar, C58528ij.m90013M(Integer.valueOf(C90126fx.f251750oh.f251802a), Integer.valueOf(C90126fx.f251596lm.f251802a), Integer.valueOf(C90126fx.f251042bO.f248757a), Integer.valueOf(C90126fx.f251137dD.f248757a)));
        C79359i iVar2 = iVar;
        this.f214242k = ajVar;
        this.f214244m = gVar;
        this.f214238g = gVar2;
        this.f214239h = aVar;
        this.f214240i = gVar3;
        this.f214241j = kVar;
        this.f214246o = hVar;
        this.f214234c = faVar;
        this.f214235d = aiVar;
        this.f214236e = bvVar;
        this.f214237f = vVar;
        this.f214243l = optional;
        this.f214245n = bVar;
    }

    /* renamed from: I */
    public final void mo71412I(C81251ap apVar) {
        if (apVar.equals(C81251ap.NGA_STARTUP_PREFERENCES)) {
            mo73920X();
        }
    }

    /* renamed from: gB */
    public final boolean mo72819gB() {
        C76090f b = this.f214246o.mo72021b();
        return C81451b.m129570a(b.mo72039e(), this.f214240i.mo85403h(C90126fx.f251750oh)) && b.mo72036b() == C120124o.CLASSIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: gD */
    public final boolean mo71822gD() {
        return !Objects.equals((C66999hh) this.f214237f.f214366j.get(), this.f214242k.mo72814a());
    }

    /* renamed from: h */
    public final C60870cx mo71202h() {
        ((C58970a) ((C58970a) f214232a.mo56224b()).mo56372aa(4455)).mo56386p("SodaLifecycleHandler.initialize()");
        C78007b bVar = this.f214245n;
        if (bVar != null) {
            bVar.mo72960b();
        }
        this.f214241j.mo74271b(C89849ae.NGA_SODA_INITIALIZATION_START);
        return C60922j.m93044g(C60846c.m92879h(C60838bs.m92859i(this.f214244m.mo28210j(this.f214244m.mo28202b("[NGA] GetSodaCoreConfig", new C77768av(this)), "[NGA] SodaLifecycleHandler.initialize", new C77769aw(this))), Throwable.class, new C77770ax(this), C60826bg.f164896a), new C77771ay(this), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C60870cx mo71203i() {
        return C118826c.m197213c(this.f214244m.mo28207g("[NGA] SodaLifecycleHandler.uninitialize", new C77764ar(this)));
    }

    /* renamed from: l */
    public final String mo71204l() {
        return "SodaLifecycleHandler";
    }

    /* renamed from: o */
    public final int mo71205o() {
        return 41;
    }
}
