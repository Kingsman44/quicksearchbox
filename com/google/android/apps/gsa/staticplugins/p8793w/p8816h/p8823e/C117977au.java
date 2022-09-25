package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.apps.gsa.search.core.p6491a.C84370p;
import com.google.android.apps.gsa.search.core.p6519al.p6520a.C84605a;
import com.google.android.apps.gsa.search.core.p6816p.C86232bo;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b.C117889a;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b.C117890b;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b.C117893e;
import com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8820b.C117902n;
import com.google.android.apps.gsa.staticplugins.p8793w.p8827i.C118083b;
import com.google.android.libraries.gsa.conversation.p1855h.C22719w;
import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3917i.p3918a.C51533lf;
import com.google.assistant.p3897e.p3917i.p3918a.C51536li;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.au */
/* compiled from: PG */
public final class C117977au {

    /* renamed from: a */
    private static final C59071e f327455a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.w.h.e.au");

    /* renamed from: b */
    private static final C58485gu f327456b = C58485gu.m89848p("media.STOP", "media.PAUSE", "alarm.SNOOZE_ALARM");

    /* renamed from: a */
    static C52081en m196017a(C58833ax axVar) {
        C58838bb.m90868c(axVar.mo56113h());
        C52081en enVar = ((C51195j) axVar.mo56107c()).f133275j;
        return enVar == null ? C52081en.f136679i : enVar;
    }

    /* renamed from: b */
    static C60870cx m196018b(C58833ax axVar, C60870cx cxVar, C60870cx cxVar2) {
        return (!axVar.mo56113h() || !((Query) axVar.mo56107c()).mo84332bQ()) ? cxVar2 : cxVar;
    }

    /* renamed from: c */
    static C60870cx m196019c(C58833ax axVar, C84605a aVar, C118083b bVar, C52081en enVar, C58833ax axVar2, boolean z, C84370p pVar, C117902n nVar, C117893e eVar) {
        C58833ax axVar3;
        C58833ax axVar4;
        C51533lf lfVar;
        C58976aa aaVar = C58975e.f156826a;
        if (z) {
            eVar.f327226e.execute(new C117889a(eVar));
        }
        String num = Integer.toString(enVar.hashCode());
        C22719w wVar = new C22719w();
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        wVar.mo27876c(exVar);
        C58833ax b = wVar.mo27875b(C51536li.f134316k);
        if (!b.mo56113h() || (((C51536li) b.mo56107c()).f134318a & 2) == 0) {
            if (b.mo56113h()) {
                lfVar = (C51533lf) ((C51536li) b.mo56107c()).toBuilder();
            } else {
                lfVar = (C51533lf) C51536li.f134316k.createBuilder();
            }
            lfVar.copyOnWrite();
            C51536li liVar = (C51536li) lfVar.instance;
            num.getClass();
            liVar.f134318a |= 2;
            liVar.f134320c = num;
            wVar.mo27878e(lfVar.build());
            C52079el elVar = (C52079el) enVar.toBuilder();
            C52091ex a = wVar.mo27874a();
            elVar.copyOnWrite();
            C52081en enVar2 = (C52081en) elVar.instance;
            a.getClass();
            enVar2.f136685e = a;
            enVar2.f136681a |= 16;
            enVar = (C52081en) elVar.build();
        }
        C52091ex exVar2 = enVar.f136685e;
        if (exVar2 == null) {
            exVar2 = C52091ex.f136710b;
        }
        Iterator it = exVar2.f136712a.iterator();
        while (true) {
            if (!it.hasNext()) {
                axVar3 = C58836b.f156633a;
                break;
            }
            C52232kc kcVar = (C52232kc) it.next();
            if ("asst.request.logging.params".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.RequestLoggingParams".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        String str = ((C51536li) C62942bv.parseFrom((C62942bv) C51536li.f134316k, kaVar2.f137061c, C62921ba.m95368a())).f134320c;
                        axVar3 = str.isEmpty() ? C58836b.f156633a : C58833ax.m90834k(str);
                    } catch (C62974ct unused) {
                        axVar3 = C58836b.f156633a;
                    }
                }
            }
        }
        if (axVar.mo56113h()) {
            axVar4 = C58833ax.m90834k(new C84349ah((Query) axVar.mo56107c()));
        } else {
            axVar4 = C58836b.f156633a;
        }
        pVar.mo77922d(C60856cj.m92900i(C58833ax.m90834k(enVar)), aVar.mo78369a(C60856cj.m92900i(axVar2)), axVar4, bVar.mo103509c(), C60856cj.m92900i(bVar.mo103508b()));
        if (axVar3.mo56113h()) {
            return nVar.mo103481m((String) axVar3.mo56107c());
        }
        C59104x d = f327455a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ConvDeltaRndrPdcr");
        ((C59052c) ((C59052c) d).mo56372aa(18875)).mo56386p("Couldn't parse conversationDelta eventId, assuming rendering is done");
        return C118826c.f331423b;
    }

    /* renamed from: d */
    static C60870cx m196020d(C118083b bVar) {
        if (bVar.mo103508b().mo56113h()) {
            return ((C86232bo) bVar.mo103508b().mo56107c()).mo79865A();
        }
        return C60856cj.m92900i(C58836b.f156633a);
    }

    /* renamed from: e */
    static boolean m196021e(C52081en enVar) {
        for (C52083ep epVar : enVar.f136684d) {
            if (epVar.f136692b == 4) {
                C51809dy dyVar = ((C52076ei) epVar.f136693c).f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if (f327456b.contains(dyVar.f135936b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: f */
    static C87421i m196022f(boolean z, C117893e eVar) {
        if (z) {
            eVar.f327226e.execute(new C117890b(eVar));
        }
        return C87421i.f236079a;
    }
}
