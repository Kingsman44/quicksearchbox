package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f;

import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52513un;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58557jl;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Collections;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.f.b */
/* compiled from: PG */
public final class C11207b {
    /* renamed from: a */
    public static C58833ax m26562a(C51805du duVar) {
        C52230ka kaVar = (C52230ka) Collections.unmodifiableMap(duVar.f135929d).get("form_input");
        if (kaVar == null || !"assistant.api.client_input.FormInput".equals(kaVar.f137060b)) {
            return C58836b.f156633a;
        }
        try {
            return C58833ax.m90834k((C52492tt) C62942bv.parseFrom((C62942bv) C52492tt.f137803d, kaVar.f137061c));
        } catch (C62974ct unused) {
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public static C58833ax m26563b(C52081en enVar) {
        C52078ek ekVar;
        C52078ek ekVar2;
        C51805du duVar;
        if (enVar.f136684d.size() == 1) {
            C52083ep epVar = (C52083ep) C58557jl.m90133n(enVar.f136684d);
            if (epVar.f136692b == 3) {
                ekVar = (C52078ek) epVar.f136693c;
            } else {
                ekVar = C52078ek.f136671f;
            }
            if (ekVar.f136674b == 5) {
                if (epVar.f136692b == 3) {
                    ekVar2 = (C52078ek) epVar.f136693c;
                } else {
                    ekVar2 = C52078ek.f136671f;
                }
                if (ekVar2.f136674b == 5) {
                    duVar = (C51805du) ekVar2.f136675c;
                } else {
                    duVar = C51805du.f135924e;
                }
                if ("ui.FORM_INPUT".equals(duVar.f135927b)) {
                    return C58833ax.m90834k(duVar);
                }
                if ("ui.TAP".equals(duVar.f135927b)) {
                    return C58833ax.m90834k(duVar);
                }
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: c */
    public static C58833ax m26564c(C51805du duVar) {
        C52230ka kaVar = (C52230ka) Collections.unmodifiableMap(duVar.f135929d).get("update_form_visibility");
        if (kaVar == null || !"assistant.api.client_input.UpdateFormFieldVisibility".equals(kaVar.f137060b)) {
            return C58836b.f156633a;
        }
        try {
            return C58833ax.m90834k((C52513un) C62942bv.parseFrom((C62942bv) C52513un.f137850b, kaVar.f137061c));
        } catch (C62974ct unused) {
            return C58836b.f156633a;
        }
    }
}
