package com.google.android.apps.gsa.staticplugins.accl.p7338h;

import com.google.android.apps.gsa.search.core.google.p6790a.C85812bd;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.h.d */
/* compiled from: PG */
public final class C92849d implements C85812bd {

    /* renamed from: a */
    private static final C59071e f259059a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.accl.h.d");

    /* renamed from: a */
    public final C58833ax mo79460a(Query query) {
        if (query.mo84364bx("android.opa.extra.CONVERSATION_DELTA")) {
            try {
                C52091ex exVar = ((C52081en) C62942bv.parseFrom((C62942bv) C52081en.f136679i, query.mo84439dT())).f136685e;
                if (exVar == null) {
                    exVar = C52091ex.f136710b;
                }
                for (C52232kc kcVar : exVar.f136712a) {
                    if ("asst.dialog.state.params".equals(kcVar.f137065b)) {
                        C52230ka kaVar = kcVar.f137066c;
                        if (kaVar == null) {
                            kaVar = C52230ka.f137057d;
                        }
                        if ("assistant.api.params.DialogStateParams".equals(kaVar.f137060b)) {
                            return C58833ax.m90834k(kcVar);
                        }
                    }
                }
            } catch (C62974ct unused) {
                C59104x d = f259059a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "DialogStatePPF");
                ((C59052c) ((C59052c) d).mo56372aa(13473)).mo56386p("Unable to parse ConversationDelta included in Query");
                return C58836b.f156633a;
            }
        }
        return C58836b.f156633a;
    }
}
