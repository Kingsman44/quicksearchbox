package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9100a;

import android.content.Context;
import com.google.android.apps.gsa.binaries.satin.app.aos;
import com.google.android.apps.search.assistant.platform.p9005b.p9036b.C119935d;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120576a;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.C120583a;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120813f;
import com.google.android.libraries.search.assistant.fluidactions.p2538b.C32951d;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.Optional;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.b.a.g */
/* compiled from: PG */
public final class C120590g implements C120583a {

    /* renamed from: a */
    public static final C59071e f335410a = C59071e.m91331h();

    /* renamed from: b */
    public final C37215b f335411b;

    /* renamed from: c */
    public final Context f335412c;

    /* renamed from: d */
    public final C119935d f335413d;

    /* renamed from: e */
    public final C32951d f335414e;

    /* renamed from: f */
    public final aos f335415f;

    /* renamed from: g */
    private final C71422aw f335416g;

    public C120590g(C37215b bVar, aos aos, C71422aw awVar, Context context, C119935d dVar, C32951d dVar2) {
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(aos, "fluidActionsFulfillmentFactory");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(context, "context");
        C69664n.m101061g(dVar, "contextProvider");
        this.f335411b = bVar;
        this.f335415f = aos;
        this.f335416g = awVar;
        this.f335412c = context;
        this.f335413d = dVar;
        this.f335414e = dVar2;
    }

    /* renamed from: b */
    public static final C120589f m199745b(Optional optional) {
        return new C120589f(optional, new C120576a((C52081en) optional.orElse(C52081en.f136679i)));
    }

    /* renamed from: a */
    public final C60870cx mo104854a(C120811d dVar) {
        C69664n.m101061g(dVar, "request");
        C58976aa aaVar = C58975e.f156826a;
        if (dVar.f335967a == 2 && ((C120813f) dVar.f335968b).f335971a.size() != 0) {
            return C71663i.m104692e(this.f335416g, (C71424ay) null, new C120588e(dVar, this, (C69577g) null), 3);
        }
        Optional empty = Optional.empty();
        C69664n.m101060f(empty, "empty()");
        return C60856cj.m92900i(m199745b(empty));
    }
}
