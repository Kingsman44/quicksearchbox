package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.common.p4522b.C58557jl;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Collections;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.a */
/* compiled from: PG */
public final class C33113a {
    /* renamed from: a */
    public static Optional m61437a(C52081en enVar, String str) {
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
                if (str.equals(duVar.f135927b)) {
                    return Optional.m71637of(duVar);
                }
            }
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public static Optional m61438b(C52081en enVar) {
        C52078ek ekVar;
        C52078ek ekVar2;
        C52070ec ecVar;
        if (enVar.f136684d.size() == 1) {
            C52083ep epVar = (C52083ep) C58557jl.m90133n(enVar.f136684d);
            if (epVar.f136692b == 3) {
                ekVar = (C52078ek) epVar.f136693c;
            } else {
                ekVar = C52078ek.f136671f;
            }
            if (ekVar.f136674b == 3) {
                if (epVar.f136692b == 3) {
                    ekVar2 = (C52078ek) epVar.f136693c;
                } else {
                    ekVar2 = C52078ek.f136671f;
                }
                if (ekVar2.f136674b == 3) {
                    ecVar = (C52070ec) ekVar2.f136675c;
                } else {
                    ecVar = C52070ec.f136651d;
                }
                return Optional.m71637of(ecVar);
            }
        }
        return Optional.empty();
    }

    /* renamed from: c */
    public static Optional m61439c(C51805du duVar) {
        C52230ka kaVar = (C52230ka) Collections.unmodifiableMap(duVar.f135929d).get("form_input");
        if (kaVar == null || !"assistant.api.client_input.FormInput".equals(kaVar.f137060b)) {
            return Optional.empty();
        }
        try {
            return Optional.m71637of((C52492tt) C62942bv.parseFrom((C62942bv) C52492tt.f137803d, kaVar.f137061c));
        } catch (C62974ct unused) {
            return Optional.empty();
        }
    }
}
