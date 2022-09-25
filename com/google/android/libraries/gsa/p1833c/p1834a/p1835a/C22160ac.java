package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.apps.gsa.shared.p6968aa.C89016an;
import com.google.android.apps.gsa.shared.p6968aa.C89036bg;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89038bi;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7012bb.p7016d.C89380h;
import com.google.android.apps.gsa.shared.p7012bb.p7018f.C89402a;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.libraries.gsa.p1833c.p1834a.C22205ad;
import com.google.android.libraries.gsa.p1833c.p1834a.C22209ah;
import com.google.android.libraries.gsa.p1833c.p1834a.C22267s;
import com.google.android.libraries.gsa.p1833c.p1834a.C22273y;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.gsa.c.a.a.ac */
/* compiled from: PG */
public final class C22160ac implements C89037bh {

    /* renamed from: e */
    private static final C59071e f61150e = C59071e.m91332i("com.google.android.libraries.gsa.c.a.a.ac");

    /* renamed from: a */
    public final C22198w f61151a;

    /* renamed from: b */
    public final C22172ao f61152b;

    /* renamed from: c */
    public final C22176as f61153c;

    /* renamed from: d */
    final AtomicReference f61154d;

    /* renamed from: f */
    private final C21370a f61155f;

    /* renamed from: g */
    private final C22170am f61156g;

    /* renamed from: h */
    private final C22181f f61157h;

    /* renamed from: i */
    private final C89016an f61158i;

    /* renamed from: j */
    private final C90021c f61159j;

    /* renamed from: k */
    private final C58833ax f61160k;

    /* renamed from: l */
    private final C22871g f61161l;

    /* renamed from: m */
    private C89038bi f61162m;

    /* renamed from: n */
    private final C22158aa f61163n = new C22158aa(this);

    /* renamed from: o */
    private final C22159ab f61164o;

    public C22160ac(C21370a aVar, C22170am amVar, C22181f fVar, C89016an anVar, C90021c cVar, C58833ax axVar, C22871g gVar) {
        C22198w wVar = new C22198w();
        C22172ao aoVar = new C22172ao();
        C22176as asVar = new C22176as();
        C22159ab abVar = new C22159ab(this);
        this.f61164o = abVar;
        this.f61154d = new AtomicReference();
        this.f61155f = aVar;
        this.f61156g = amVar;
        this.f61157h = fVar;
        this.f61158i = anVar;
        amVar.f61197r = abVar;
        this.f61159j = cVar;
        this.f61151a = wVar;
        this.f61152b = aoVar;
        this.f61153c = asVar;
        this.f61160k = axVar;
        this.f61161l = gVar;
    }

    /* renamed from: n */
    private final C89061q m41422n(int i, C89066v vVar, C58833ax axVar) {
        long j;
        long j2;
        C89038bi biVar = this.f61162m;
        if (biVar != null) {
            j2 = ((C22209ah) biVar).mo27465j(C22267s.f61528a);
            j = ((C22209ah) this.f61162m).mo27465j(C22273y.f61548a);
        } else {
            j2 = -1;
            j = -1;
        }
        return new C22193r(vVar, i, this.f61158i, this, this.f61156g, this.f61159j, j2, j, axVar, this.f61161l, this.f61155f);
    }

    /* renamed from: a */
    public final C89061q mo27376a(int i, C89066v vVar) {
        return m41422n(i, vVar, this.f61160k);
    }

    /* renamed from: b */
    public final C89062r mo27377b() {
        C22196u uVar;
        try {
            uVar = (C22196u) this.f61156g.mo27393b().get();
        } catch (InterruptedException | ExecutionException e) {
            C59104x c = f61150e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NetworkMonitor");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(48530)).mo56386p("Blocking getMaybeCachedDetailedConnectivityInfoFuture().get() failed");
            uVar = C22196u.f61276a;
        }
        return uVar.mo27407c();
    }

    /* renamed from: c */
    public final C60870cx mo27378c() {
        return C60922j.m93044g(this.f61156g.mo27392a(), C22201z.f61285a, C60826bg.f164896a);
    }

    /* renamed from: e */
    public final void mo27379e() {
        this.f61151a.mo27446d();
        this.f61152b.mo27446d();
        this.f61153c.mo27446d();
    }

    /* renamed from: f */
    public final void mo27380f() {
        C22181f fVar = this.f61157h;
        fVar.f61230c.mo28211k(fVar.f61232e.mo27392a(), "requestCellIfNoWifi", new C22178c(fVar));
    }

    /* renamed from: g */
    public final void mo27381g(C89038bi biVar) {
        this.f61162m = biVar;
        C22209ah ahVar = (C22209ah) biVar;
        C60856cj.m92911t(ahVar.mo27457a(), new C22205ad(ahVar, this.f61163n), C60826bg.f164896a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("NetworkMonitor");
        this.f61156g.mo17602gS(fVar);
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85291r("Network Changes");
        this.f61151a.mo27447e(e);
        e.mo85291r("RTTs");
        this.f61152b.mo27447e(e);
        e.mo85291r("Throughputs");
        this.f61153c.mo27447e(e);
    }

    /* renamed from: h */
    public final void mo27382h(C89036bg bgVar) {
        this.f61154d.set(bgVar);
        C22170am amVar = this.f61156g;
        amVar.f61183d.lock();
        try {
            if (!amVar.f61192m) {
                amVar.f61192m = true;
                amVar.f61189j.execute(new C22166ai(amVar));
            }
        } finally {
            amVar.f61183d.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public final void mo27383i() {
        C22170am amVar = this.f61156g;
        amVar.f61183d.lock();
        try {
            if (amVar.f61192m) {
                amVar.f61192m = false;
                amVar.f61196q = false;
                amVar.f61189j.execute(new C22164ag(amVar));
            }
            amVar.f61183d.unlock();
            this.f61154d.set((Object) null);
        } catch (Throwable th) {
            amVar.f61183d.unlock();
            throw th;
        }
    }

    /* renamed from: j */
    public final boolean mo27384j() {
        return this.f61156g.mo27394c();
    }

    /* renamed from: k */
    public final boolean mo27385k() {
        return this.f61156g.mo27395e();
    }

    /* renamed from: l */
    public final boolean mo27386l() {
        return this.f61156g.f61188i.isWifiEnabled();
    }

    /* renamed from: m */
    public final C89061q mo27387m(int i, C89066v vVar, C89380h hVar, C89402a aVar) {
        return m41422n(i, vVar, C58833ax.m90834k(new C22200y(hVar, aVar)));
    }
}
