package com.google.android.libraries.p590as.p593b.p596b.p598b;

import com.google.android.libraries.p590as.p593b.p596b.C10846ba;
import com.google.android.libraries.p590as.p593b.p596b.C10865f;
import com.google.android.libraries.p590as.p593b.p596b.C10882h;
import com.google.android.libraries.p590as.p593b.p596b.C10949k;
import com.google.android.libraries.p590as.p593b.p596b.C10950l;
import com.google.android.libraries.p590as.p593b.p596b.p605h.C10886c;
import com.google.android.libraries.p590as.p593b.p596b.p605h.C10887d;
import com.google.android.libraries.p590as.p593b.p596b.p605h.C10889f;
import com.google.android.libraries.p590as.p593b.p596b.p605h.C10895l;
import com.google.android.libraries.p590as.p593b.p596b.p607i.C10921av;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2884l.C37206a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47636i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.as.b.b.b.u */
/* compiled from: PG */
public final class C10844u implements C10949k {

    /* renamed from: a */
    public static final C58974d f35894a = C58974d.m91134h("DefaultLPManager");

    /* renamed from: b */
    public final C60887da f35895b;

    /* renamed from: c */
    public final C10846ba f35896c;

    /* renamed from: d */
    public final C37215b f35897d;

    /* renamed from: e */
    public final Boolean f35898e;

    /* renamed from: f */
    private final C10895l f35899f;

    /* renamed from: g */
    private final C10921av f35900g;

    public C10844u(C10895l lVar, C10921av avVar, C60887da daVar, C10846ba baVar, C37215b bVar, Boolean bool) {
        this.f35899f = lVar;
        this.f35900g = avVar;
        this.f35895b = daVar;
        this.f35896c = baVar;
        this.f35897d = bVar;
        this.f35898e = bool;
    }

    /* renamed from: i */
    private final C60870cx m25860i(C60870cx cxVar, C60870cx cxVar2) {
        return C47638k.m84753d(cxVar, cxVar2).mo51520a(new C10836m(cxVar, cxVar2), this.f35895b);
    }

    /* renamed from: a */
    public final C60870cx mo19272a() {
        return C47633f.m84733g(mo19274c()).mo51516i(new C10826c(this), this.f35895b).mo51515h(C10827d.f35869a, this.f35895b);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C60870cx mo19273b(Object obj) {
        C58974d dVar = f35894a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(53990)).mo56386p("#deletePackage");
        this.f35897d.mo19974a(C37206a.f98748E);
        C10882h hVar = (C10882h) obj;
        int h = hVar.mo19290h();
        int i = h - 1;
        if (h == 0) {
            throw null;
        } else if (i == 1) {
            return C60922j.m93044g(this.f35900g.mo19273b(hVar), C47810es.m84963c(new C10824a(this)), this.f35895b);
        } else if (i != 2) {
            ((C58970a) ((C58970a) dVar.mo56225c()).mo56372aa(53991)).mo56389s("#deletePackage called with an undefined installation type. Returning undefined descriptor. Raw request descriptor: %s", obj);
            return C60856cj.m92900i(C10882h.f35968c);
        } else {
            ((C58970a) ((C58970a) dVar.mo56225c()).mo56372aa(53992)).mo56389s("#deletePackage called for a system partition LP. This makes no sense and is a noop: and LP will remain installed if it exists. Raw request descriptor: %s", obj);
            return C60856cj.m92900i(obj);
        }
    }

    /* renamed from: c */
    public final C60870cx mo19274c() {
        ((C58970a) ((C58970a) f35894a.mo56224b()).mo56372aa(53993)).mo56386p("#getAvailablePackages");
        this.f35897d.mo19974a(C37206a.f98744A);
        C60870cx c = this.f35900g.mo19274c();
        C10895l lVar = this.f35899f;
        ((C58970a) ((C58970a) C10895l.f35981a.mo56226d()).mo56372aa(54010)).mo56386p("#getAvailablePackages: Note there is not reason to call this method, as getInstalledPackages() returns the same LanguagePacks for this impl.");
        lVar.f35983c.mo19974a(C37206a.f98768Y);
        C60870cx i = m25860i(c, C47636i.m84742a(new C10886c(lVar), lVar.f35985e).mo51515h(new C10889f(lVar), lVar.f35984d));
        C10838o oVar = new C10838o(this);
        return C60922j.m93044g(i, C47810es.m84963c(oVar), this.f35895b);
    }

    /* renamed from: d */
    public final C60870cx mo19275d() {
        ((C58970a) ((C58970a) f35894a.mo56224b()).mo56372aa(53994)).mo56386p("#getInstalledPackages");
        this.f35897d.mo19974a(C37206a.f98745B);
        C60870cx d = this.f35900g.mo19275d();
        C10895l lVar = this.f35899f;
        lVar.f35983c.mo19974a(C37206a.f98771aa);
        C60870cx i = m25860i(d, C47636i.m84742a(new C10886c(lVar), lVar.f35985e).mo51515h(new C10887d(lVar), lVar.f35984d));
        C10825b bVar = new C10825b(this);
        return C60922j.m93044g(i, C47810es.m84963c(bVar), this.f35895b);
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C60870cx mo19276e(Object obj) {
        C60870cx cxVar;
        C58974d dVar = f35894a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(53995)).mo56386p("#getPackage");
        this.f35897d.mo19974a(C37206a.f98749F);
        C10882h hVar = (C10882h) obj;
        int h = hVar.mo19290h();
        int i = h - 1;
        if (h == 0) {
            throw null;
        } else if (i == 1) {
            return C60922j.m93044g(this.f35900g.mo19276e(hVar), C47810es.m84963c(new C10830g(this)), this.f35895b);
        } else if (i != 2) {
            ((C58970a) ((C58970a) dVar.mo56225c()).mo56372aa(53996)).mo56389s("#getPackage called with an undefined installation type. Returning unpopulated LanguagePackPackage. Raw request descriptor: %s", obj);
            return C60856cj.m92900i(C10950l.m25964e(hVar));
        } else {
            C10895l lVar = this.f35899f;
            lVar.f35983c.mo19974a(C37206a.f98773ac);
            int h2 = hVar.mo19290h();
            if (h2 != 0) {
                if (h2 != 3 || !hVar.mo19284c().mo56113h()) {
                    ((C58970a) ((C58970a) C10895l.f35981a.mo56225c()).mo56372aa(54013)).mo56389s("#getPackage was called on a descriptor that was invalid for system partition LanguagePacks. Call this method only on descriptors returned from #getAvailablePackages() or #getInstalledPackages(): %s.", obj);
                    cxVar = C60856cj.m92900i(C10950l.m25964e(hVar));
                } else {
                    cxVar = C60856cj.m92900i(C10950l.m25963d(hVar, ((C10865f) hVar.mo19284c().mo56107c()).mo19306a()));
                    lVar.f35983c.mo19974a(C37206a.f98774ad);
                }
                return C60922j.m93044g(cxVar, C47810es.m84963c(new C10831h(this)), this.f35895b);
            }
            throw null;
        }
    }

    /* renamed from: f */
    public final C60870cx mo19277f() {
        ((C58970a) ((C58970a) f35894a.mo56224b()).mo56372aa(53997)).mo56386p("#getRequestedPackages");
        this.f35897d.mo19974a(C37206a.f98746C);
        C60870cx f = this.f35900g.mo19277f();
        ((C58970a) ((C58970a) C10895l.f35981a.mo56226d()).mo56372aa(54014)).mo56386p("#getRequestedPackages: There is not reason to call this method, as the result is always empty.");
        C60870cx i = m25860i(f, C60856cj.m92900i(C58485gu.m89845m()));
        C10828e eVar = new C10828e(this);
        return C60922j.m93044g(i, C47810es.m84963c(eVar), this.f35895b);
    }

    /* renamed from: g */
    public final C60870cx mo19278g() {
        C60870cx d = mo19275d();
        C60870cx f = mo19277f();
        C60870cx c = mo19274c();
        C10840q qVar = new C10840q(this);
        C60870cx h = C60922j.m93045h(d, C47810es.m84966f(qVar), this.f35895b);
        C60870cx b = C47638k.m84753d(d, f).mo51521b(new C10841r(this, d, f), this.f35895b);
        C60870cx a = C47638k.m84753d(d, f, c).mo51520a(new C10842s(this, d, f, c), this.f35895b);
        return C47638k.m84753d(h, b, a).mo51520a(new C10843t(h, b, a), this.f35895b);
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C60870cx mo19279h(Object obj) {
        C58974d dVar = f35894a;
        ((C58970a) ((C58970a) dVar.mo56224b()).mo56372aa(53998)).mo56386p("#installPackage");
        this.f35897d.mo19974a(C37206a.f98747D);
        Optional.empty();
        C10882h hVar = (C10882h) obj;
        int h = hVar.mo19290h();
        int i = h - 1;
        if (h == 0) {
            throw null;
        } else if (i == 1) {
            return C60922j.m93044g(this.f35900g.mo19279h(hVar), C47810es.m84963c(new C10833j(this)), this.f35895b);
        } else if (i != 2) {
            ((C58970a) ((C58970a) dVar.mo56225c()).mo56372aa(53999)).mo56389s("#installPackage called with an undefined installation type. Returning undefined descriptor. Raw request descriptor: %s", obj);
            return C60856cj.m92900i(C10882h.f35968c);
        } else {
            ((C58970a) ((C58970a) dVar.mo56226d()).mo56372aa(54000)).mo56389s("#installPackage called for a system partition LP. This makes no sense and is a noop: and LP will remain installed if it exists. Raw request descriptor: %s", obj);
            return C60856cj.m92900i(obj);
        }
    }
}
