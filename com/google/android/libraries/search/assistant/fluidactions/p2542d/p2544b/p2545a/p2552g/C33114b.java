package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33105a;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33110f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52492tt;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.C52513un;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Collections;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.b */
/* compiled from: PG */
public final class C33114b {
    /* renamed from: a */
    public static C60870cx m61440a(Context context, C52081en enVar, C51936ep epVar, C33110f fVar, C32951d dVar, C37215b bVar) {
        Optional optional;
        Optional a = C33113a.m61437a(enVar, "ui.FORM_INPUT");
        if (!a.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        Optional c = C33113a.m61439c((C51805du) a.get());
        if (!c.isPresent() || (((C52492tt) c.get()).f137805a & 1) == 0 || (((C52492tt) c.get()).f137805a & 2) == 0) {
            return C60856cj.m92900i(Optional.empty());
        }
        C51953ff ffVar = ((C52492tt) c.get()).f137806b;
        if (ffVar == null) {
            ffVar = C51953ff.f136315l;
        }
        C51953ff ffVar2 = ffVar;
        C52507uh uhVar = ((C52492tt) c.get()).f137807c;
        if (uhVar == null) {
            uhVar = C52507uh.f137838b;
        }
        C52507uh uhVar2 = uhVar;
        if ((ffVar2.f136317a & 32) != 0) {
            C51936ep a2 = C51936ep.m86435a(ffVar2.f136323g);
            if (a2 == null) {
                a2 = C51936ep.DEFAULT;
            }
            if (a2 == epVar) {
                C52230ka kaVar = (C52230ka) Collections.unmodifiableMap(((C51805du) a.get()).f135929d).get("update_form_visibility");
                if (kaVar == null || !"assistant.api.client_input.UpdateFormFieldVisibility".equals(kaVar.f137060b)) {
                    optional = Optional.empty();
                } else {
                    try {
                        optional = Optional.m71637of((C52513un) C62942bv.parseFrom((C62942bv) C52513un.f137850b, kaVar.f137061c));
                    } catch (C62974ct unused) {
                        optional = Optional.empty();
                    }
                }
                Optional optional2 = optional;
                C33105a aVar = new C33105a();
                C52091ex exVar = enVar.f136685e;
                if (exVar == null) {
                    exVar = C52091ex.f136710b;
                }
                aVar.mo38530b(exVar);
                aVar.f88629a = new C33144e(bVar);
                aVar.mo38531c(dVar);
                return fVar.mo38501a(context, ffVar2, uhVar2, optional2, aVar.mo38529a());
            }
        }
        return C60856cj.m92900i(Optional.empty());
    }
}
