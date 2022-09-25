package com.google.android.libraries.assistant.auto.ondevice.p713e;

import com.google.assistant.p3897e.p3917i.p3918a.C51544lq;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.auto.ondevice.e.r */
/* compiled from: PG */
public final class C11902r {

    /* renamed from: a */
    private static final C58974d f38278a = C58974d.m91135i("FeatureVeExtractor");

    /* renamed from: a */
    public static C58833ax m27718a(C52081en enVar) {
        C58833ax axVar;
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        Iterator it = exVar.f136712a.iterator();
        while (true) {
            if (!it.hasNext()) {
                axVar = C58836b.f156633a;
                break;
            }
            C52232kc kcVar = (C52232kc) it.next();
            if ("asst.response.logging.params".equals(kcVar.f137065b)) {
                C52230ka kaVar = kcVar.f137066c;
                if (kaVar == null) {
                    kaVar = C52230ka.f137057d;
                }
                if ("assistant.api.params.ResponseLoggingParams".equals(kaVar.f137060b)) {
                    try {
                        C52230ka kaVar2 = kcVar.f137066c;
                        if (kaVar2 == null) {
                            kaVar2 = C52230ka.f137057d;
                        }
                        axVar = C58833ax.m90834k((C51544lq) C62942bv.parseFrom((C62942bv) C51544lq.f134342j, kaVar2.f137061c));
                    } catch (C62974ct e) {
                        ((C58970a) ((C58970a) ((C58970a) f38278a.mo56226d()).mo56382g(e)).mo56372aa(43781)).mo56386p("ResponseLoggingParams could not be parsed from the ConversationParams");
                        axVar = C58836b.f156633a;
                    }
                }
            }
        }
        return axVar.mo56106b(C11901q.f38277a);
    }
}
