package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.search.core.p6816p.C86251f;
import com.google.android.apps.gsa.search.core.state.p6872d.C86910ad;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.state.er */
/* compiled from: PG */
public final class C87024er implements C87143ik {

    /* renamed from: a */
    private final C87023eq f235062a;

    /* renamed from: b */
    private final C86842bk f235063b;

    /* renamed from: c */
    private final C86842bk f235064c;

    /* renamed from: d */
    private final C86842bk f235065d;

    /* renamed from: e */
    private final C86842bk f235066e;

    /* renamed from: f */
    private final C86842bk f235067f;

    /* renamed from: g */
    private final C86842bk f235068g;

    /* renamed from: h */
    private final C86842bk f235069h;

    public C87024er(C87023eq eqVar, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C68214a aVar7) {
        this.f235062a = eqVar;
        this.f235063b = new C86842bk(aVar);
        this.f235064c = new C86842bk(aVar2);
        this.f235065d = new C86842bk(aVar3);
        this.f235066e = new C86842bk(aVar4);
        this.f235067f = new C86842bk(aVar5);
        this.f235068g = new C86842bk(aVar6);
        this.f235069h = new C86842bk(aVar7);
    }

    /* renamed from: a */
    public final /* synthetic */ C87141ii mo80512a() {
        return this.f235062a;
    }

    /* renamed from: b */
    public final void mo80513b(C87135ic icVar) {
        boolean z;
        VoiceAction f;
        C87135ic icVar2 = icVar;
        this.f235063b.mo80534b(icVar2);
        this.f235064c.mo80534b(icVar2);
        this.f235065d.mo80534b(icVar2);
        this.f235066e.mo80534b(icVar2);
        this.f235067f.mo80534b(icVar2);
        this.f235068g.mo80534b(icVar2);
        this.f235069h.mo80534b(icVar2);
        C86842bk bkVar = this.f235063b;
        if (bkVar.f234552a || this.f235064c.f234552a || this.f235065d.f234552a || this.f235066e.f234552a || this.f235067f.f234552a || this.f235068g.f234552a || this.f235069h.f234552a) {
            C87023eq eqVar = this.f235062a;
            C86842bk bkVar2 = this.f235064c;
            C86842bk bkVar3 = this.f235065d;
            C86842bk bkVar4 = this.f235066e;
            C86842bk bkVar5 = this.f235067f;
            C86842bk bkVar6 = this.f235068g;
            C86842bk bkVar7 = this.f235069h;
            if (bkVar6.f234552a && !eqVar.f235024E) {
                eqVar.f235024E = true;
                eqVar.f235043h.mo78640y();
            }
            if (bkVar5.f234552a) {
                boolean u = ((C86812ai) bkVar5.mo80533a()).f234471a.mo81904u();
                eqVar.f235050o = u;
                if (u && !eqVar.f235060y.isEmpty()) {
                    for (byte[] q : eqVar.f235060y) {
                        eqVar.f235043h.mo78632q(q);
                    }
                    eqVar.f235060y.clear();
                }
            }
            C87171z zVar = (C87171z) bkVar2.mo80533a();
            ActionData actionData = zVar.f235555j;
            C58485gu guVar = null;
            boolean z2 = false;
            if (bkVar.f234552a || bkVar2.f234552a) {
                Query query = ((C87052fn) bkVar.mo80533a()).f235177m;
                if (!query.mo84403cj() || query.mo84397cd()) {
                    z = false;
                } else {
                    if (!query.mo84383cP(eqVar.f235054s)) {
                        C86251f fVar = eqVar.f235055t;
                        if (fVar != null) {
                            fVar.f233146e.cancel(true);
                            fVar.mo79946b();
                            fVar.mo79947c();
                        }
                        eqVar.f235055t = null;
                        eqVar.f235027H = 1;
                        eqVar.f235056u = false;
                        eqVar.f235058w.cancel(true);
                        eqVar.f235054s = query;
                        eqVar.f235053r = false;
                        z = eqVar.mo80641p(false);
                        if (query.mo84422dC()) {
                            eqVar.f235043h.mo78615K(0);
                            eqVar.f235051p = true;
                        }
                        eqVar.f235061z = false;
                        eqVar.f235028I = 1;
                        eqVar.f235023A = false;
                    } else {
                        z = false;
                    }
                    if (!eqVar.mo80640o(query) || eqVar.f235027H == 3) {
                        eqVar.mo80633e(query);
                    }
                }
                if (bkVar2.f234552a && actionData != null && actionData.mo81106r() != null && zVar.mo80791X()) {
                    VoiceAction f2 = zVar.mo80807f();
                    boolean z3 = zVar.f235558m;
                    zVar.f235558m = false;
                    if (z3) {
                        eqVar.f235061z = true;
                    } else if (eqVar.f235023A || (((f = zVar.mo80807f()) == null || !f.mo81083v()) && (f2 == null || !f2.mo81087y()))) {
                        if (!eqVar.f235061z && f2 != null && f2.mo81051A() && eqVar.f235037b.mo79745c(C90014bt.f247822oi).contains(actionData.f235998h.name()) && !actionData.mo81104p()) {
                            eqVar.f235061z = true;
                        }
                        if (eqVar.f235028I == 2 && !zVar.mo80808g().f236252f && !((TtsState) bkVar7.mo80533a()).mo80423y()) {
                            eqVar.mo80638m(zVar, ((C87052fn) bkVar.mo80533a()).f235177m);
                        }
                    } else {
                        eqVar.f235023A = true;
                    }
                    if (eqVar.f235028I == 1) {
                        if (!zVar.mo80808g().f236252f) {
                            eqVar.mo80638m((C87171z) bkVar2.mo80533a(), ((C87052fn) bkVar.mo80533a()).f235177m);
                        } else {
                            eqVar.f235028I = true != ((TtsState) bkVar7.mo80533a()).mo80423y() ? 2 : 3;
                        }
                    }
                    eqVar.mo80638m(zVar, ((C87052fn) bkVar.mo80533a()).f235177m);
                }
                z2 = z;
            }
            if (bkVar7.f234552a) {
                if (((TtsState) bkVar7.mo80533a()).mo80423y()) {
                    if (eqVar.f235028I == 2) {
                        eqVar.f235028I = 3;
                    }
                } else if (eqVar.f235028I == 3 && (eqVar.f235061z || eqVar.f235023A)) {
                    eqVar.mo80638m((C87171z) bkVar2.mo80533a(), ((C87052fn) bkVar.mo80533a()).f235177m);
                }
            }
            if (bkVar4.f234552a) {
                ((C86883ce) bkVar4.mo80533a()).mo80546e();
            }
            if (bkVar.f234552a || bkVar2.f234552a || bkVar3.f234552a) {
                if (bkVar3.f234552a) {
                    C86910ad adVar = (C86910ad) bkVar3.mo80533a();
                    if (adVar.f234705c.containsKey(2)) {
                        List list = (List) adVar.f234705c.get(2);
                        list.getClass();
                        guVar = C58485gu.m89842j(list);
                        list.clear();
                    }
                    if (guVar != null && !guVar.isEmpty()) {
                        eqVar.f235046k.addAll(guVar);
                        guVar.size();
                    }
                }
                if (!eqVar.f235046k.isEmpty() && !((C86883ce) bkVar4.mo80533a()).mo80546e()) {
                    eqVar.f235046k.size();
                    for (byte[] I : eqVar.f235046k) {
                        eqVar.f235043h.mo78613I(I);
                    }
                    eqVar.f235046k.clear();
                }
            }
            if (z2) {
                this.f235062a.mo80591ar();
            }
        }
    }
}
