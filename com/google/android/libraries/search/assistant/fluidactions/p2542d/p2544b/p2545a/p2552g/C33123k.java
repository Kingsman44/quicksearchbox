package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33101w;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33105a;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33108d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33111g;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52271lo;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import java.util.Arrays;
import java.util.Collections;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.k */
/* compiled from: PG */
public final class C33123k implements C33111g {
    /* renamed from: a */
    public final C60870cx mo38538a(Context context, C52081en enVar, C32951d dVar, C37215b bVar) {
        Optional optional;
        if (!C33113a.m61437a(enVar, "ui.TAP").isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        Optional a = C33113a.m61437a(enVar, "ui.TAP");
        if (!a.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C52230ka kaVar = (C52230ka) Collections.unmodifiableMap(((C51805du) a.get()).f135929d).get("tap_input");
        if (kaVar == null || !"assistant.api.client_input.TapInput".equals(kaVar.f137060b)) {
            optional = Optional.empty();
        } else {
            try {
                optional = Optional.m71637of((C52271lo) C62942bv.parseFrom((C62942bv) C52271lo.f137214c, kaVar.f137061c, C62921ba.m95368a()));
            } catch (C62974ct unused) {
                optional = Optional.empty();
            }
        }
        if (!optional.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C52271lo loVar = (C52271lo) optional.get();
        C33105a aVar = new C33105a();
        aVar.mo38531c(dVar);
        aVar.f88629a = new C33144e(bVar);
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        aVar.mo38530b(exVar);
        C33108d a2 = aVar.mo38529a();
        if (loVar.f137217b.isEmpty()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C51809dy dyVar = (C51809dy) C33101w.f88619a.get(loVar.f137217b);
        if (dyVar == null) {
            return C60856cj.m92900i(Optional.empty());
        }
        return C60856cj.m92900i(Optional.m71637of(C33118f.m61461b(Arrays.asList(new C51809dy[]{dyVar}), C58733pz.f156496a, a2.mo38534c())));
    }
}
