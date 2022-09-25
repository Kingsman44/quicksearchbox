package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120419b;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.C33663f;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33641b;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33642c;
import com.google.android.libraries.search.assistant.invocation.p2601d.p2609b.p2610a.p2611a.C33643d;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60817ay;
import com.google.protobuf.C62940bt;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.util.function.Consumer;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71105ex;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71106ey;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.f */
/* compiled from: PG */
public final class C120398f implements C120419b {

    /* renamed from: a */
    public static final C59071e f334900a = C59071e.m91331h();

    /* renamed from: b */
    public final Executor f334901b;

    /* renamed from: c */
    private final C37215b f334902c;

    /* renamed from: d */
    private final C34053bp f334903d;

    /* renamed from: e */
    private final C33643d f334904e;

    public C120398f(Executor executor, C33643d dVar, C37215b bVar, C34053bp bpVar) {
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(bVar, "appFlowLogger");
        C69664n.m101061g(bpVar, "invocationToken");
        this.f334901b = executor;
        this.f334904e = dVar;
        this.f334902c = bVar;
        this.f334903d = bpVar;
    }

    /* renamed from: a */
    public final C47630c mo104744a(Consumer consumer) {
        C59052c cVar = (C59052c) f334900a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "ConvEngine.Audio");
        cVar.mo56379ah(new C59094n(35445));
        cVar.mo56386p("#open");
        C33643d dVar = this.f334904e;
        C47630c c = new C47630c(new C60817ay(C71663i.m104692e(dVar.f89898b, (C71424ay) null, new C33641b(dVar, new C120395c(consumer), (C69577g) null), 3))).mo51505c(new C33642c(dVar), dVar.f89899c);
        C37215b bVar = this.f334902c;
        C37258g gVar = C37176a.f97201hA;
        C62940bt btVar = C71106ey.f189648d;
        C71105ex exVar = (C71105ex) C71106ey.f189647c.createBuilder();
        String b = C34711b.m63446b(this.f334903d);
        exVar.copyOnWrite();
        C71106ey eyVar = (C71106ey) exVar.instance;
        eyVar.f189650a |= 1;
        eyVar.f189651b = b;
        bVar.mo19974a(gVar.mo40812e(btVar, exVar.build()));
        return new C47630c(c.mo51505c(new C120393a(this), this.f334901b).f123559a.mo57271c(C33663f.class, C47810es.m84970j(C120394b.f334894a), this.f334901b));
    }
}
