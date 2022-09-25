package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9088c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119779aa;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120508e;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.C120419b;
import com.google.android.libraries.search.assistant.p2511d.C32558u;
import com.google.android.libraries.search.assistant.p2570h.p2571a.p2576c.p2577a.C33447g;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47630c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71604be;
import kotlinx.coroutines.C71816z;
import kotlinx.coroutines.p5584j.C71788b;
import kotlinx.coroutines.p5584j.C71799m;
import p5460g.p5461a.C69464a;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.c.q */
/* compiled from: PG */
public final class C120498q implements C120508e {

    /* renamed from: a */
    public static final C59071e f335119a = C59071e.m91331h();

    /* renamed from: b */
    public final C120419b f335120b;

    /* renamed from: c */
    public final C120506y f335121c;

    /* renamed from: d */
    public final C37215b f335122d;

    /* renamed from: e */
    public final C71422aw f335123e;

    /* renamed from: f */
    public final Executor f335124f;

    /* renamed from: g */
    public final C69464a f335125g;

    /* renamed from: h */
    public final C119779aa f335126h;

    /* renamed from: i */
    public final C71788b f335127i = new C71799m();

    /* renamed from: j */
    public C71604be f335128j;

    /* renamed from: k */
    public final C71816z f335129k = new C71816z();

    /* renamed from: l */
    public final C33447g f335130l;

    public C120498q(C120419b bVar, C33447g gVar, C120506y yVar, C37215b bVar2, C71422aw awVar, Executor executor, C69464a aVar, C119779aa aaVar) {
        C69664n.m101061g(gVar, "shutdownHookRegistry");
        C69664n.m101061g(yVar, "audioStats");
        C69664n.m101061g(bVar2, "appFlowLogger");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(aaVar, "audioConfiguration");
        this.f335120b = bVar;
        this.f335130l = gVar;
        this.f335121c = yVar;
        this.f335122d = bVar2;
        this.f335123e = awVar;
        this.f335124f = executor;
        this.f335125g = aVar;
        this.f335126h = aaVar;
    }

    /* renamed from: a */
    public final C47630c mo104774a() {
        return C32558u.m60376a(this.f335123e, new C120484c(this, (C69577g) null));
    }

    /* renamed from: b */
    public final void mo104775b() {
        this.f335129k.mo62909P(C69788q.f186170a);
    }
}
