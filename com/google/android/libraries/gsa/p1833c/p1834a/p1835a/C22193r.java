package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89015am;
import com.google.android.apps.gsa.shared.p6968aa.C89016an;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89058n;
import com.google.android.apps.gsa.shared.p6968aa.C89059o;
import com.google.android.apps.gsa.shared.p6968aa.C89060p;
import com.google.android.apps.gsa.shared.p6968aa.C89061q;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C90008bn;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58336bg;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4552o.C60324oh;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.SettableFuture;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.c.a.a.r */
/* compiled from: PG */
final class C22193r implements C89061q {

    /* renamed from: d */
    private static final C58528ij f61263d = C58528ij.m90011K(C60324oh.OFFLINE, C60324oh.NETWORK_LEVEL_NOT_MET);

    /* renamed from: a */
    public final C22170am f61264a;

    /* renamed from: b */
    public final C22183h f61265b;

    /* renamed from: c */
    public final C58833ax f61266c;

    /* renamed from: e */
    private final SettableFuture f61267e = new SettableFuture();

    /* renamed from: f */
    private final SettableFuture f61268f = new SettableFuture();

    /* renamed from: g */
    private final C89066v f61269g;

    /* renamed from: h */
    private final C89016an f61270h;

    /* renamed from: i */
    private final C90021c f61271i;

    /* renamed from: j */
    private final C22871g f61272j;

    /* renamed from: k */
    private final C21370a f61273k;

    public C22193r(C89066v vVar, int i, C89016an anVar, C22160ac acVar, C22170am amVar, C90021c cVar, long j, long j2, C58833ax axVar, C22871g gVar, C21370a aVar) {
        this.f61269g = vVar;
        this.f61270h = anVar;
        this.f61264a = amVar;
        this.f61271i = cVar;
        this.f61266c = axVar;
        this.f61272j = gVar;
        this.f61273k = aVar;
        this.f61265b = new C22183h(i, acVar, j, j2);
    }

    /* renamed from: o */
    private final C60870cx m41485o() {
        C22183h hVar = this.f61265b;
        C22170am amVar = this.f61264a;
        Objects.requireNonNull(amVar);
        return hVar.mo27430e(new C22192q(amVar));
    }

    /* renamed from: a */
    public final long mo27431a() {
        return this.f61265b.f61240a;
    }

    /* renamed from: b */
    public final C89058n mo27432b(C89020ar arVar) {
        C89016an anVar = this.f61270h;
        C89015am amVar = new C89015am(arVar, anVar.f241223c, this.f61266c);
        anVar.mo82988c(amVar);
        this.f61265b.mo27428c(amVar);
        return amVar;
    }

    /* renamed from: c */
    public final C89059o mo27433c() {
        return this.f61265b;
    }

    /* renamed from: d */
    public final C89066v mo27434d() {
        return this.f61269g;
    }

    /* renamed from: e */
    public final C60870cx mo27435e() {
        return C60856cj.m92901j(this.f61265b.mo27429d(new C22184i(this)));
    }

    /* renamed from: f */
    public final C60870cx mo27436f() {
        return C60922j.m93044g(C60856cj.m92901j(m41485o()), C22187l.f61253a, C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo27437g() {
        return this.f61268f;
    }

    /* renamed from: h */
    public final C60870cx mo27438h(C89058n nVar) {
        return C60922j.m93045h(this.f61264a.mo27392a(), new C22189n(this, nVar), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final void mo27439i() {
        this.f61272j.mo28212l("Log connectivity check.", new C22188m(this));
    }

    /* renamed from: j */
    public final void mo27440j() {
        this.f61268f.mo57356n(C118826c.f331422a);
    }

    /* renamed from: k */
    public final void mo27441k() {
        this.f61267e.mo57356n(C118826c.f331422a);
    }

    /* renamed from: l */
    public final C89060p mo27442l(C22196u uVar, C22196u uVar2, C22196u uVar3) {
        C89060p pVar;
        char c;
        int i;
        C90457d dVar;
        C89062r c2 = uVar3.mo27407c();
        int i2 = c2.f241370b;
        int c3 = this.f61269g.mo83014c();
        if (i2 == 0) {
            pVar = new C89060p(C60324oh.OFFLINE, new C90457d(C89885b.HTTP_NO_CONNECTIVITY_VALUE));
        } else if (i2 == 2) {
            pVar = c3 == 1 ? C89060p.f241364b : new C89060p(C60324oh.NETWORK_LEVEL_NOT_MET, new C90457d(C89885b.HTTP_NETWORK_LEVEL_NOT_MET_VALUE));
        } else {
            if (c3 == 3) {
                if (c2.f241371c) {
                    pVar = new C89060p(C60324oh.NETWORK_LEVEL_NOT_MET, new C90457d(C89885b.HTTP_NETWORK_LEVEL_NOT_MET_VALUE));
                }
            } else if (c3 == 2 && c2.f241372d) {
                pVar = new C89060p(C60324oh.NETWORK_LEVEL_NOT_MET, new C90457d(C89885b.HTTP_NETWORK_LEVEL_NOT_MET_VALUE));
            }
            if (this.f61269g.mo83013b().mo83015a() != Integer.MAX_VALUE) {
                long j = this.f61265b.f61240a;
                if (j == -1) {
                    pVar = C89060p.f241365c;
                } else if (j > ((long) this.f61269g.mo83013b().mo83015a())) {
                    pVar = new C89060p(C60324oh.QUALITY_NOT_MET, new C90457d(C89885b.HTTP_NETWORK_QUALITY_NOT_MET_VALUE));
                }
            }
            if (this.f61269g.mo83013b().mo83016b() != 0) {
                long j2 = this.f61265b.f61241b;
                if (j2 == -1) {
                    pVar = C89060p.f241365c;
                } else if (j2 < ((long) this.f61269g.mo83013b().mo83016b())) {
                    pVar = new C89060p(C60324oh.QUALITY_NOT_MET, new C90457d(C89885b.HTTP_NETWORK_QUALITY_NOT_MET_VALUE));
                }
            }
            pVar = C89060p.f241366d;
        }
        if (this.f61271i.mo79746e(C90008bn.f246891e) || !f61263d.contains(pVar.f241367e)) {
            c = 1;
        } else {
            long c4 = this.f61273k.mo26871c();
            long a = c4 - uVar.mo27405a();
            long a2 = c4 - uVar2.mo27405a();
            long j3 = 5000;
            if (this.f61269g.mo83012a() != Long.MAX_VALUE) {
                j3 = Math.min(5000, this.f61269g.mo83012a());
            }
            c = a2 >= j3 ? 3 : a >= 10000 ? (char) 4 : 2;
            if (c == 2) {
                return new C89060p(C60324oh.UNSTABLE_NOT_MET, new C90457d(C89885b.HTTP_NO_CONNECTIVITY_VALUE));
            }
        }
        if (pVar.f241367e != C60324oh.OFFLINE) {
            return pVar;
        }
        if (uVar3.mo27411g() == null || uVar3.mo27414i() == null || uVar3.mo27412h() == null) {
            i = -1;
        } else {
            boolean m = uVar3.mo27418m();
            if (uVar3.mo27415j()) {
                i = m ? C89885b.HTTP_NO_CONNECTIVITY_AIRPLANE_MODE_WIFI_ON_VALUE : C89885b.HTTP_NO_CONNECTIVITY_AIRPLANE_MODE_WIFI_OFF_VALUE;
            } else if (!uVar3.mo27411g().booleanValue()) {
                i = m ? C89885b.HTTP_NO_CONNECTIVITY_NO_CELL_SUPPORT_WIFI_ON_VALUE : C89885b.HTTP_NO_CONNECTIVITY_NO_CELL_SUPPORT_WIFI_OFF_VALUE;
            } else if (uVar3.mo27414i().intValue() == 1) {
                i = m ? C89885b.HTTP_NO_CONNECTIVITY_NO_SIM_CARD_WIFI_ON_VALUE : C89885b.HTTP_NO_CONNECTIVITY_NO_SIM_CARD_WIFI_OFF_VALUE;
            } else if (uVar3.mo27414i().intValue() != 5) {
                i = m ? C89885b.HTTP_NO_CONNECTIVITY_SIM_CARD_ERROR_WIFI_ON_VALUE : C89885b.HTTP_NO_CONNECTIVITY_SIM_CARD_ERROR_WIFI_OFF_VALUE;
            } else {
                i = !uVar3.mo27416k() ? m ? C89885b.HTTP_NO_CONNECTIVITY_MOBILE_DATA_OFF_WIFI_ON_VALUE : C89885b.HTTP_NO_CONNECTIVITY_MOBILE_DATA_OFF_WIFI_OFF_VALUE : (!C58832aw.m90831a(uVar3.mo27412h(), true) || uVar3.mo27417l()) ? m ? C89885b.HTTP_NO_CONNECTIVITY_NO_DATA_CONNECTION_WIFI_ON_VALUE : C89885b.HTTP_NO_CONNECTIVITY_NO_DATA_CONNECTION_WIFI_OFF_VALUE : m ? C89885b.HTTP_NO_CONNECTIVITY_DATA_ROAMING_OFF_WIFI_ON_VALUE : C89885b.HTTP_NO_CONNECTIVITY_DATA_ROAMING_OFF_WIFI_OFF_VALUE;
            }
        }
        if (i == -1) {
            return pVar;
        }
        if (c == 4) {
            dVar = new C90457d((Throwable) new C90457d(65568), i);
        } else {
            dVar = new C90457d(i);
        }
        return new C89060p(C60324oh.OFFLINE, dVar);
    }

    /* renamed from: m */
    public final C60870cx mo27443m(C22196u uVar, C22196u uVar2, C22196u uVar3, C89058n nVar) {
        C89060p l = mo27442l(uVar, uVar2, uVar3);
        if (l.f241367e != C60324oh.UNSTABLE_NOT_MET) {
            if (l.f241367e == C60324oh.QUALITY_MET && !uVar3.mo27407c().equals(uVar.mo27407c())) {
                nVar.mo82968l();
            }
            return C60856cj.m92900i(l);
        }
        return this.f61272j.mo28203c("getStableConnectivityCheckResultFuture", 500, new C22190o(this, uVar, (C22196u) new C58336bg(C22186k.f61252a, C58701ou.f156429a).mo55812g(uVar2, uVar3), nVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ C60870cx mo27444n() {
        return C60922j.m93044g(m41485o(), new C22191p(this), C60826bg.f164896a);
    }
}
