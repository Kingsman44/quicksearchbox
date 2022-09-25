package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g;

import android.content.Context;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33109e;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33110f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2550e.C33111g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.p3926e.C51936ep;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.g.m */
/* compiled from: PG */
public final class C33125m implements C33111g {

    /* renamed from: a */
    final /* synthetic */ C33109e f88643a;

    /* renamed from: b */
    final /* synthetic */ C51936ep f88644b;

    /* renamed from: c */
    final /* synthetic */ C33110f f88645c;

    public C33125m(C33109e eVar, C51936ep epVar, C33110f fVar) {
        this.f88643a = eVar;
        this.f88644b = epVar;
        this.f88645c = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo38538a(Context context, C52081en enVar, C32951d dVar, C37215b bVar) {
        if (C33113a.m61438b(enVar).isPresent()) {
            return C33115c.m61441a(context, enVar, this.f88643a, dVar, bVar);
        }
        if (!C33126n.m61478a(enVar)) {
            return C60856cj.m92900i(Optional.empty());
        }
        return C33114b.m61440a(context, enVar, this.f88644b, this.f88645c, dVar, bVar);
    }
}
