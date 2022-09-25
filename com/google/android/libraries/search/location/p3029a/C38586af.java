package com.google.android.libraries.search.location.p3029a;

import com.google.android.apps.gsa.location.p5874b.p5875a.C74642c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.logging.C38828b;
import com.google.android.libraries.search.logging.appflows.C38780c;
import com.google.android.libraries.search.logging.p3034a.C38768q;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2873a.C37173a;
import com.google.android.libraries.search.p3094q.p3095a.C39897b;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.dataservice.C46723bg;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58759qy;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C59448a;
import com.google.common.p4552o.C59603b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.OptionalLong;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.search.location.a.af */
/* compiled from: PG */
public final class C38586af implements C38627bs {

    /* renamed from: a */
    public static final C59071e f101990a = C59071e.m91332i("com.google.android.libraries.search.location.a.af");

    /* renamed from: b */
    final Level f101991b = Level.WARNING;

    /* renamed from: c */
    public final C42876ab f101992c;

    /* renamed from: d */
    public final C60888db f101993d;

    /* renamed from: e */
    public final C21370a f101994e;

    /* renamed from: f */
    public final C46723bg f101995f;

    /* renamed from: g */
    public final C37215b f101996g;

    /* renamed from: h */
    public final C38768q f101997h;

    /* renamed from: i */
    public final C38658cb f101998i;

    /* renamed from: j */
    public final Set f101999j = ConcurrentHashMap.newKeySet();

    /* renamed from: k */
    public final C46778cv f102000k;

    /* renamed from: l */
    private final C60888db f102001l;

    /* renamed from: m */
    private final C47770dh f102002m;

    /* renamed from: n */
    private final C38622bn f102003n;

    public C38586af(C42876ab abVar, C60888db dbVar, C60888db dbVar2, C47770dh dhVar, C21370a aVar, C46723bg bgVar, C38780c cVar, C38658cb cbVar, C46778cv cvVar, C38768q qVar, C38622bn bnVar) {
        this.f101992c = abVar;
        this.f101993d = dbVar;
        this.f102001l = dbVar2;
        this.f102002m = dhVar;
        this.f101994e = aVar;
        this.f101995f = bgVar;
        this.f101996g = cVar.mo41619a(C38828b.LOCATION_AGSA);
        this.f101998i = cbVar;
        this.f102000k = cvVar;
        this.f101997h = qVar;
        this.f102003n = bnVar;
    }

    /* renamed from: l */
    public static void m67879l(Set set, boolean z) {
        Collection.EL.forEach(set, new C38664h());
    }

    /* renamed from: n */
    static boolean m67880n(C38590aj ajVar) {
        return ajVar.equals(C38590aj.CONSENT_REASON_ACCEPTED) || ajVar.equals(C38590aj.CONSENT_REASON_TEMPORARILY_ALLOWED);
    }

    /* renamed from: p */
    private final C60870cx m67881p(C38632bx bxVar, C58833ax axVar) {
        return C47633f.m84733g(this.f102003n.mo41522b(axVar)).mo51516i(new C38671o(this, bxVar), this.f101993d).mo51513e(C39897b.class, new C38675s(this), this.f101993d).mo51513e(C38620bl.class, C38676t.f102143a, this.f101993d).mo51513e(Throwable.class, new C38677u(this), this.f101993d);
    }

    /* renamed from: a */
    public final C60870cx mo41505a() {
        return C47633f.m84733g(m67881p(C38632bx.f102079c, C58836b.f156633a)).mo51515h(C38661e.f102123a, this.f101993d).mo51514f(Throwable.class, new C38662f(this), this.f101993d);
    }

    /* renamed from: b */
    public final C60870cx mo41506b() {
        return C47633f.m84733g(m67881p(C38632bx.f102079c, C58836b.f156633a)).mo51515h(C38665i.f102126a, this.f101993d).mo51514f(Throwable.class, new C38666j(this), this.f101993d);
    }

    /* renamed from: c */
    public final C60870cx mo41507c() {
        C47538ax c = this.f102002m.mo51613c("getSilkPermissionState");
        try {
            C60870cx b = mo41506b();
            if (c != null) {
                c.close();
            }
            return b;
        } catch (Throwable th) {
            C38660d.m67953a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final C60870cx mo41508d() {
        C58833ax axVar;
        String uuid = UUID.randomUUID().toString();
        boolean z = Math.random() < 0.001d;
        if (z) {
            this.f101996g.mo19974a(C37173a.f96783c.mo40816j("flow_id", uuid));
        }
        C38632bx bxVar = C38632bx.f102079c;
        if (z) {
            axVar = C58833ax.m90834k(uuid);
        } else {
            axVar = C58836b.f156633a;
        }
        return C47633f.m84733g(m67881p(bxVar, axVar)).mo51515h(new C38679w(this, z, uuid), this.f101993d).mo51514f(Throwable.class, new C38680x(this, z, uuid), this.f101993d);
    }

    /* renamed from: e */
    public final C60870cx mo41509e() {
        C47538ax c = this.f102002m.mo51613c("hasAccessToLocationData");
        try {
            C60870cx d = mo41508d();
            if (c != null) {
                c.close();
            }
            return d;
        } catch (Throwable th) {
            C38660d.m67953a(th, th);
        }
        throw th;
    }

    /* renamed from: f */
    public final C60870cx mo41510f() {
        return this.f102003n.mo41522b(C58836b.f156633a);
    }

    /* renamed from: g */
    public final C60870cx mo41511g(C38590aj ajVar, C38626br brVar) {
        int a = C38593am.m67899a(brVar.f102072b);
        if (a == 0 || a != 4) {
            C59448a aVar = (C59448a) C59603b.f159814e.createBuilder();
            aVar.copyOnWrite();
            C59603b bVar = (C59603b) aVar.instance;
            bVar.f159817b = ajVar.f102015g;
            bVar.f159816a |= 1;
            aVar.copyOnWrite();
            C59603b bVar2 = (C59603b) aVar.instance;
            brVar.getClass();
            bVar2.f159819d = brVar;
            bVar2.f159816a |= 4;
            C60856cj.m92911t(C47633f.m84733g(mo41510f()).mo51516i(new C38670n(aVar), this.f101993d), C47810es.m84974n(new C38581aa(this)), this.f101993d);
        }
        return mo41512h(ajVar, OptionalLong.empty());
    }

    /* renamed from: h */
    public final C60870cx mo41512h(C38590aj ajVar, OptionalLong optionalLong) {
        return C47633f.m84733g(this.f101992c.mo46039a(new C38673q(this, ajVar, optionalLong), C60826bg.f164896a)).mo51515h(new C38674r(this, ajVar), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C60870cx mo41513i(C38632bx bxVar) {
        String uuid = UUID.randomUUID().toString();
        this.f101996g.mo19974a(C37173a.f96781a.mo40816j("flow_id", uuid));
        return C47633f.m84733g(m67881p(bxVar, C58833ax.m90834k(uuid))).mo51515h(new C38668l(this, uuid), this.f101993d).mo51514f(Throwable.class, new C38669m(this, uuid), this.f101993d);
    }

    /* renamed from: j */
    public final C60870cx mo41514j(C38632bx bxVar) {
        C47538ax c = this.f102002m.mo51613c("shouldPromptForConsent");
        try {
            C60870cx i = mo41513i(bxVar);
            if (c != null) {
                c.close();
            }
            return i;
        } catch (Throwable th) {
            C38660d.m67953a(th, th);
        }
        throw th;
    }

    /* renamed from: k */
    public final void mo41515k() {
        C60870cx d = this.f101992c.mo46042d();
        C38582ab abVar = new C38582ab(this);
        C60856cj.m92911t(d, C47810es.m84974n(abVar), C60826bg.f164896a);
    }

    /* renamed from: m */
    public final void mo41516m(Duration duration, long j) {
        C38678v vVar = new C38678v(this, j);
        C46459k.m82829b(C60856cj.m92902k(C47810es.m84965e(vVar), duration.toMillis(), TimeUnit.MILLISECONDS, this.f102001l), "Failed to schedule temporary allowance reset task", new Object[0]);
    }

    /* renamed from: o */
    public final void mo41517o(C74642c cVar) {
        this.f101999j.add(cVar);
        C58759qy qyVar = new C58759qy(cVar);
        C60870cx d = mo41508d();
        C38584ad adVar = new C38584ad(this, qyVar);
        C60856cj.m92911t(d, C47810es.m84974n(adVar), this.f101993d);
    }
}
