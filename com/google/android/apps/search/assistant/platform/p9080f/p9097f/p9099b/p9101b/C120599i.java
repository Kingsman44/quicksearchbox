package com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.p9101b;

import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120578b;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9098a.C120579c;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.p9099b.C120583a;
import com.google.android.apps.search.assistant.platform.p9080f.p9123l.C120811d;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.f.b.b.i */
/* compiled from: PG */
public final class C120599i extends C68247h {

    /* renamed from: a */
    private final C68283d f335437a;

    /* renamed from: c */
    private final C68283d f335438c;

    /* renamed from: d */
    private final C68283d f335439d;

    /* renamed from: e */
    private final C68283d f335440e;

    public C120599i(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4) {
        super(aVar2, new C68277d(C120599i.class), aVar);
        this.f335437a = C68236af.m98549d(dVar);
        this.f335438c = C68236af.m98549d(dVar2);
        this.f335439d = C68236af.m98549d(dVar3);
        this.f335440e = C68236af.m98549d(dVar4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C120583a aVar = (C120583a) list.get(0);
        C120811d dVar = (C120811d) list.get(1);
        C68283d dVar2 = this.f335439d;
        C120579c cVar = (C120579c) list.get(2);
        C69664n.m101061g(aVar, "fluidActionsFulfillmentController");
        C69664n.m101061g(dVar, "request");
        C69664n.m101061g(dVar2, "onlineProducer");
        C69664n.m101061g(cVar, "fulfillmentProducerStateLoggerFactory");
        return C47633f.m84733g(aVar.mo104854a(dVar)).mo51516i(new C120591a(cVar.mo104844a(C120578b.FLUID_ACTIONS_AND_ONLINE), dVar2), C60826bg.f164896a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f335437a.mo60297gq(), this.f335438c.mo60297gq(), this.f335440e.mo60297gq());
    }
}
