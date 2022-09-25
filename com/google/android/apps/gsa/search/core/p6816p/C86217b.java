package com.google.android.apps.gsa.search.core.p6816p;

import com.google.assistant.p3897e.p3910e.p3911a.C51195j;
import com.google.assistant.p3897e.p3921j.C51807dw;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52076ei;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.p3926e.C51968fu;
import com.google.assistant.p3897e.p3921j.p3926e.C51971fx;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.search.core.p.b */
/* compiled from: PG */
public final class C86217b {

    /* renamed from: a */
    private static final C59071e f232988a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.b");

    /* renamed from: a */
    public static C51971fx m138691a(C51195j jVar) {
        C52076ei eiVar;
        C52076ei eiVar2;
        C51971fx fxVar = null;
        if ((jVar.f133266a & 128) != 0) {
            C52081en enVar = jVar.f133275j;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
            for (C52083ep epVar : enVar.f136684d) {
                if (epVar.f136692b == 4) {
                    eiVar = (C52076ei) epVar.f136693c;
                } else {
                    eiVar = C52076ei.f136664f;
                }
                C51809dy dyVar = eiVar.f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if ("ui.SHOW_SEARCH_RESULTS_PAGE".equals(dyVar.f135936b)) {
                    try {
                        if (epVar.f136692b == 4) {
                            eiVar2 = (C52076ei) epVar.f136693c;
                        } else {
                            eiVar2 = C52076ei.f136664f;
                        }
                        C51809dy dyVar2 = eiVar2.f136668c;
                        if (dyVar2 == null) {
                            dyVar2 = C51809dy.f135933f;
                        }
                        C51807dw dwVar = dyVar2.f135938d;
                        if (dwVar == null) {
                            dwVar = C51807dw.f135930b;
                        }
                        C52230ka kaVar = ((C52232kc) dwVar.f135932a.get(0)).f137066c;
                        if (kaVar == null) {
                            kaVar = C52230ka.f137057d;
                        }
                        fxVar = (C51971fx) C62942bv.parseFrom((C62942bv) C51971fx.f136380g, kaVar.f137061c);
                    } catch (C62974ct e) {
                        C59104x d = f232988a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "AssistantResponseUtils");
                        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(7719)).mo56386p("Error during parsing ShowRenderedHtmlUiArgs");
                    }
                }
            }
        }
        return fxVar;
    }

    /* renamed from: b */
    public static boolean m138692b(C51195j jVar) {
        C52076ei eiVar;
        if ((jVar.f133266a & 128) != 0) {
            C52081en enVar = jVar.f133275j;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
            for (C52083ep epVar : enVar.f136684d) {
                if (epVar.f136692b == 4) {
                    eiVar = (C52076ei) epVar.f136693c;
                } else {
                    eiVar = C52076ei.f136664f;
                }
                C51809dy dyVar = eiVar.f136668c;
                if (dyVar == null) {
                    dyVar = C51809dy.f135933f;
                }
                if ("ui.SHOW_RENDERED_CARD".equals(dyVar.f135936b)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m138693c(C51971fx fxVar) {
        if ((fxVar.f136382a & 2) == 0) {
            return false;
        }
        C51968fu fuVar = fxVar.f136384c;
        if (fuVar == null) {
            fuVar = C51968fu.f136374d;
        }
        if (!fuVar.f136378c || (fxVar.f136382a & 4) == 0) {
            return false;
        }
        C51968fu fuVar2 = fxVar.f136385d;
        if (fuVar2 == null) {
            fuVar2 = C51968fu.f136374d;
        }
        return fuVar2.f136378c;
    }
}
