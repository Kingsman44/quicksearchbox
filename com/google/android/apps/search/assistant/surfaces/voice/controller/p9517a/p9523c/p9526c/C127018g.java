package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126933a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126974a;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127051i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a.C127072f;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9530g.p9531a.C127081o;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.p9536b.C127130a;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.c.g */
/* compiled from: PG */
public final class C127018g implements C126974a {

    /* renamed from: a */
    public static final C59071e f349763a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f349764b;

    /* renamed from: c */
    public final C127012af f349765c;

    /* renamed from: d */
    public final C126933a f349766d;

    /* renamed from: e */
    public final C127072f f349767e;

    /* renamed from: f */
    public final boolean f349768f;

    /* renamed from: g */
    public C127081o f349769g;

    /* renamed from: h */
    public final C127130a f349770h;

    /* renamed from: i */
    private final Executor f349771i;

    /* renamed from: j */
    private final C47632e f349772j = new C47632e();

    public C127018g(C71422aw awVar, C127012af afVar, C126933a aVar, Executor executor, C127130a aVar2, C127072f fVar, boolean z) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(afVar, "conversationStateManager");
        C69664n.m101061g(aVar, "conversationConnectionManager");
        C69664n.m101061g(executor, "lightweightExecutor");
        C69664n.m101061g(aVar2, "errorDataStore");
        this.f349764b = awVar;
        this.f349765c = afVar;
        this.f349766d = aVar;
        this.f349771i = executor;
        this.f349770h = aVar2;
        this.f349767e = fVar;
        this.f349768f = !z;
    }

    /* renamed from: c */
    private final C60870cx m207758c(C69626l lVar) {
        C60870cx b = this.f349772j.mo51512b(new C127017f(this, lVar), this.f349771i);
        C69664n.m101060f(b, "private fun <T> withSequ…} }, lightweightExecutor)");
        return b;
    }

    /* renamed from: a */
    public final C60870cx mo107873a(C119851cs csVar, C127289i iVar) {
        C69664n.m101061g(csVar, "request");
        C69664n.m101061g(iVar, "queryContext");
        return m207758c(new C127014c(this, csVar, iVar, (C69577g) null));
    }

    /* renamed from: b */
    public final C60870cx mo107874b(C127051i iVar) {
        C69664n.m101061g(iVar, "request");
        return m207758c(new C127015d(this, iVar, (C69577g) null));
    }
}
