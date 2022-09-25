package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c.C127022k;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c.C127023l;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9526c.C127026o;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127049g;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127051i;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127064v;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127110b;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f;
import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127485o;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.d */
/* compiled from: PG */
public final class C126977d {

    /* renamed from: c */
    private static final C59071e f349647c = C59071e.m91331h();

    /* renamed from: a */
    public final C126978e f349648a;

    /* renamed from: b */
    public final C127485o f349649b;

    /* renamed from: d */
    private final C71422aw f349650d;

    public C126977d(C126978e eVar, C127485o oVar, C71422aw awVar) {
        C69664n.m101061g(oVar, "entryPointService");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f349648a = eVar;
        this.f349649b = oVar;
        this.f349650d = awVar;
    }

    /* renamed from: a */
    public final C60870cx mo107875a(C127110b bVar) {
        C69664n.m101061g(bVar, "startRequest");
        return C71663i.m104692e(this.f349650d, (C71424ay) null, new C126976c(this, bVar, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final C60870cx mo107876b(C127114f fVar) {
        C69664n.m101061g(fVar, "stopRequest");
        C126978e eVar = this.f349648a;
        C127049g gVar = (C127049g) C127051i.f349864d.createBuilder();
        C69664n.m101060f(gVar, "newBuilder()");
        C127064v a = C69664n.m101061g(gVar, "builder");
        C127050h a2 = C127050h.m207796a(fVar.f350012b);
        if (a2 == null) {
            a2 = C127050h.UNRECOGNIZED;
        }
        C69664n.m101060f(a2, "stopRequest.cancellationReason");
        a.mo107918b(a2);
        C127026o oVar = (C127026o) eVar;
        return C47633f.m84733g(oVar.mo107897b()).mo51516i(new C127022k(oVar, a.mo107917a()), C60826bg.f164896a).mo51516i(C127023l.f349779a, C60826bg.f164896a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107877c(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126975b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.b r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126975b) r0
            int r1 = r0.f349643c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f349643c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.b r0 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f349641a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f349643c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            p5462h.C69714l.m101134b(r5)     // Catch:{ Exception -> 0x0027 }
            goto L_0x0079
        L_0x0027:
            r5 = move-exception
            goto L_0x005b
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.f r5 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127114f.f350009c     // Catch:{ Exception -> 0x0027 }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.e r5 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.actions.C127113e) r5     // Catch:{ Exception -> 0x0027 }
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r2)     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.h r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.f.h r2 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h.NEW_INTERACTION_START     // Catch:{ Exception -> 0x0027 }
            r5.mo107939b(r2)     // Catch:{ Exception -> 0x0027 }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.f r5 = r5.mo107938a()     // Catch:{ Exception -> 0x0027 }
            com.google.common.util.concurrent.cx r5 = r4.mo107876b(r5)     // Catch:{ Exception -> 0x0027 }
            r0.f349643c = r3     // Catch:{ Exception -> 0x0027 }
            java.lang.Object r5 = kotlinx.coroutines.p5578d.C71663i.m104690c(r5, r0)     // Catch:{ Exception -> 0x0027 }
            if (r5 != r1) goto L_0x0079
            return r1
        L_0x005b:
            com.google.common.f.e r0 = f349647c
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r5 = r0.mo56382g(r5)
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 37341(0x91dd, float:5.2326E-41)
            r0.<init>(r1)
            r5.mo56379ah(r0)
            java.lang.String r0 = "Failed to stopInteraction"
            r5.mo56386p(r0)
        L_0x0079:
            h.q r5 = p5462h.C69788q.f186170a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126977d.mo107877c(h.c.g):java.lang.Object");
    }
}
