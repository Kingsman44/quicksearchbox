package com.google.android.apps.gsa.shared.util;

import com.google.assistant.p3897e.p3917i.p3918a.C51546ls;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.shared.util.av */
/* compiled from: PG */
public final class C90738av {

    /* renamed from: a */
    private static final C59071e f253814a = C59071e.m91332i("com.google.android.apps.gsa.shared.util.av");

    /* renamed from: a */
    public final int mo85088a(C52091ex exVar) {
        if (exVar == null) {
            return 2;
        }
        for (C52232kc kcVar : exVar.f136712a) {
            if ("asst.routine.execution.params".equals(kcVar.f137065b) && (kcVar.f137064a & 2) != 0) {
                try {
                    C52230ka kaVar = kcVar.f137066c;
                    if (kaVar == null) {
                        kaVar = C52230ka.f137057d;
                    }
                    return ((C51546ls) C62942bv.parseFrom((C62942bv) C51546ls.f134354b, kaVar.f137061c, C62921ba.m95368a())).f134356a ? 5 : 4;
                } catch (C62974ct e) {
                    ((C59052c) ((C59052c) ((C59052c) f253814a.mo56225c()).mo56382g(e)).mo56372aa(11324)).mo56386p("Failed to parse RoutineExecutionParams.");
                    return 6;
                }
            }
        }
        return 3;
    }
}
