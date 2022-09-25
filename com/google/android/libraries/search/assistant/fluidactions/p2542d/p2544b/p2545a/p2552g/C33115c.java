package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33105a;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33109e;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2553c.C33144e;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.c */
/* compiled from: PG */
public final class C33115c {
    /* renamed from: a */
    public static C60870cx m61441a(Context context, C52081en enVar, C33109e eVar, C32951d dVar, C37215b bVar) {
        Optional b = C33113a.m61438b(enVar);
        if (!b.isPresent()) {
            return C60856cj.m92900i(Optional.empty());
        }
        C52070ec ecVar = (C52070ec) b.get();
        C33105a aVar = new C33105a();
        aVar.mo38531c(dVar);
        C52091ex exVar = enVar.f136685e;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        aVar.mo38530b(exVar);
        aVar.f88629a = new C33144e(bVar);
        return eVar.mo38500a(context, ecVar, aVar.mo38529a());
    }
}
