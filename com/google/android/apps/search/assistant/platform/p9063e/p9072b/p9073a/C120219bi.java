package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9014b.C119672a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d.C119682a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d.C119684c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d.C119690i;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d.C119692k;
import com.google.android.libraries.search.assistant.p2585i.C33480d;
import com.google.android.libraries.search.assistant.p2703l.C34794h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51806dv;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51808dx;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52075eh;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52082eo;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.bi */
/* compiled from: PG */
public final /* synthetic */ class C120219bi implements Function {

    /* renamed from: a */
    public final /* synthetic */ C120221bk f334554a;

    public /* synthetic */ C120219bi(C120221bk bkVar) {
        this.f334554a = bkVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C52076ei eiVar;
        C120221bk bkVar = this.f334554a;
        C52083ep epVar = (C52083ep) obj;
        C52082eo eoVar = (C52082eo) epVar.toBuilder();
        if (epVar.f136692b == 4) {
            eiVar = (C52076ei) epVar.f136693c;
        } else {
            eiVar = C52076ei.f136664f;
        }
        C52075eh ehVar = (C52075eh) eiVar.toBuilder();
        C51809dy dyVar = eiVar.f136668c;
        if (dyVar == null) {
            dyVar = C51809dy.f135933f;
        }
        C119692k kVar = bkVar.f334559d;
        if ("ui.SHOW_SEARCH_RESULTS_PAGE".equals(dyVar.f135936b)) {
            synchronized (kVar.f333501e) {
                if (kVar.f333503g == null) {
                    C34794h a = kVar.f333498b.mo39515a(new C119690i(kVar));
                    kVar.f333503g = a.f92324a;
                    kVar.f333505i.mo38849b(new C119684c(a));
                    C58976aa aaVar = C58975e.f156826a;
                    String str = kVar.f333503g.f92323b;
                }
            }
            C33480d dVar = C119672a.f333469a;
            C51807dw dwVar = dyVar.f135938d;
            if (dwVar == null) {
                dwVar = C51807dw.f135930b;
            }
            C51971fx fxVar = (C51971fx) dVar.mo38883d(dwVar.f135932a);
            if ((fxVar.f136382a & 8) != 0) {
                kVar.f333500d.execute(C47810es.m84977q(new C119682a(kVar, fxVar.f136386e)));
                C58976aa aaVar2 = C58975e.f156826a;
            } else {
                C58976aa aaVar3 = C58975e.f156826a;
            }
            C51808dx dxVar = (C51808dx) dyVar.toBuilder();
            C51806dv dvVar = (C51806dv) C51807dw.f135930b.createBuilder();
            dvVar.mo53733c(C119672a.f333470b.mo38881b(kVar.f333503g));
            dxVar.mo53736a((C51807dw) dvVar.build());
            dyVar = (C51809dy) dxVar.build();
        }
        C51809dy a2 = bkVar.f334560e.mo104493a(dyVar);
        ehVar.copyOnWrite();
        C52076ei eiVar2 = (C52076ei) ehVar.instance;
        a2.getClass();
        eiVar2.f136668c = a2;
        eiVar2.f136666a |= 32;
        eoVar.copyOnWrite();
        C52083ep epVar2 = (C52083ep) eoVar.instance;
        C52076ei eiVar3 = (C52076ei) ehVar.build();
        eiVar3.getClass();
        epVar2.f136693c = eiVar3;
        epVar2.f136692b = 4;
        return (C52083ep) eoVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
