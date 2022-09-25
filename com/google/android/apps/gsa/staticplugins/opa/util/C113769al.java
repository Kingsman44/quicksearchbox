package com.google.android.apps.gsa.staticplugins.opa.util;

import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14070ae;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14071af;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14077e;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.assistant.p3897e.p3929l.p3930a.C52686as;
import com.google.assistant.p3897e.p3929l.p3930a.C52690aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p4874ap.p4875a.p4876a.C63662ac;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65849r;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.al */
/* compiled from: PG */
final class C113769al implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ boolean f315074a;

    /* renamed from: b */
    final /* synthetic */ C113775ar f315075b;

    public C113769al(C113775ar arVar, boolean z) {
        this.f315075b = arVar;
        this.f315074a = z;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x d = C113775ar.f315097a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "MorrisOnboardingCtlr");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(28419)).mo56386p("Failed to read morris data.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C52686as asVar;
        C52686as asVar2;
        C14077e eVar = (C14077e) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (eVar.f42739g == null) {
            C14071af afVar = C14071af.f42714f;
        }
        C14071af afVar2 = eVar.f42739g;
        int b = C14070ae.m30359b((afVar2 == null ? C14071af.f42714f : afVar2).f42717b);
        if (b == 0 || b != 2) {
            if (afVar2 == null) {
                afVar2 = C14071af.f42714f;
            }
            int b2 = C14070ae.m30359b(afVar2.f42717b);
            if (b2 == 0 || b2 != 6) {
                return;
            }
        }
        C52690aw b3 = this.f315075b.f315103g.mo97942b();
        b3.name();
        if (this.f315074a && b3 == C52690aw.DEFAULT) {
            this.f315075b.mo100621b(C113774aq.DRIVING_SCREEN_NEW_USER, eVar, this.f315074a);
        } else if (b3 == C52690aw.ENABLED) {
            boolean z = this.f315075b.f315099c.checkSelfPermission("android.permission.ACTIVITY_RECOGNITION") == 0;
            boolean d = C36619a.m65148d(this.f315075b.f315099c);
            if (this.f315075b.f315101e.mo79746e(C90051dc.f248766A) && !z && !d) {
                this.f315075b.mo100621b(C113774aq.DRIVING_SCREEN_ALL_PERMISSIONS, eVar, this.f315074a);
            } else if (this.f315075b.f315101e.mo79746e(C90051dc.f248766A) && !z) {
                this.f315075b.mo100621b(C113774aq.DRIVING_SCREEN_AR_PERMISSION, eVar, this.f315074a);
            } else if (!d) {
                this.f315075b.mo100621b(C113774aq.DRIVING_SCREEN_NA_PERMISSION, eVar, this.f315074a);
            } else {
                if (!this.f315075b.f315101e.mo79746e(C90051dc.f248772G)) {
                    C113775ar arVar = this.f315075b;
                    String F = arVar.f315108l.mo79659F();
                    if (F != null) {
                        C60870cx c = arVar.f315107k.c(F, C65753ak.ASSISTANT_SETTINGS, "driving_settings", C63662ac.f172144a, C65849r.f179002c);
                        if (c.isDone()) {
                            try {
                                C58485gu guVar = (C58485gu) C60856cj.m92909r(c);
                                if (!guVar.isEmpty()) {
                                    Optional findFirst = Collection.EL.stream(guVar).findFirst();
                                    if (findFirst.isPresent() && ((C65849r) findFirst.get()).f179004a == 10) {
                                        C65849r rVar = (C65849r) findFirst.get();
                                        if (rVar.f179004a == 10) {
                                            asVar = (C52686as) rVar.f179005b;
                                        } else {
                                            asVar = C52686as.f138291q;
                                        }
                                        if (!asVar.f138297e) {
                                            C65849r rVar2 = (C65849r) findFirst.get();
                                            if (rVar2.f179004a == 10) {
                                                asVar2 = (C52686as) rVar2.f179005b;
                                            } else {
                                                asVar2 = C52686as.f138291q;
                                            }
                                            if (!asVar2.f138298f) {
                                                return;
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } catch (Exception e) {
                                C59104x c2 = C113775ar.f315097a.mo56225c();
                                c2.mo56378ag(C58975e.f156826a, "MorrisOnboardingCtlr");
                                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(28426)).mo56386p("Exception thrown by Future expected to be done");
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.f315075b.mo100621b(C113774aq.DRIVING_SCREEN_BT_PERMISSION, eVar, this.f315074a);
            }
        }
    }
}
