package com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.ui.controller.UiControllerService$getEntryComponent$2", mo61344c = "UiControllerService.kt", mo61345d = "invokeSuspend", mo61346e = {104, 105})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.k */
/* compiled from: PG */
final class C127093k extends C69572j implements C69630p {

    /* renamed from: a */
    int f349955a;

    /* renamed from: b */
    final /* synthetic */ C127097o f349956b;

    /* renamed from: c */
    private /* synthetic */ Object f349957c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127093k(C127097o oVar, C69577g gVar) {
        super(2, gVar);
        this.f349956b = oVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127093k) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0063  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r9) {
        /*
            r8 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f349955a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0016
            if (r1 == r2) goto L_0x000e
            p5462h.C69714l.m101134b(r9)
            goto L_0x0058
        L_0x000e:
            java.lang.Object r1 = r8.f349957c
            kotlinx.coroutines.be r1 = (kotlinx.coroutines.C71604be) r1
            p5462h.C69714l.m101134b(r9)
            goto L_0x0041
        L_0x0016:
            p5462h.C69714l.m101134b(r9)
            java.lang.Object r9 = r8.f349957c
            kotlinx.coroutines.aw r9 = (kotlinx.coroutines.C71422aw) r9
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.i r1 = new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.i
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.o r4 = r8.f349956b
            r1.<init>(r4, r3)
            r4 = 3
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r9, r3, r3, r1, r4)
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.j r5 = new com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.j
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.a.o r6 = r8.f349956b
            r5.<init>(r6, r3)
            kotlinx.coroutines.be r9 = kotlinx.coroutines.C71803m.m105042c(r9, r3, r3, r5, r4)
            r8.f349957c = r9
            r8.f349955a = r2
            java.lang.Object r1 = r1.mo62825a(r8)
            if (r1 == r0) goto L_0x007e
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x0041:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x004c
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r9 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127097o.f349968b
            goto L_0x007d
        L_0x004c:
            r8.f349957c = r3
            r9 = 2
            r8.f349955a = r9
            java.lang.Object r9 = r1.mo62825a(r8)
            if (r9 != r0) goto L_0x0058
            return r0
        L_0x0058:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0063
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r9 = com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127097o.f349969c
            goto L_0x007d
        L_0x0063:
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r9 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129676j.f355890c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.g r9 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129660g) r9
            java.lang.String r0 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r0)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.l r9 = p5462h.p5473f.p5475b.C69664n.m101061g(r9, "builder")
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.i r0 = com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host.C129662i.INPUT
            r9.mo109191c(r0)
            com.google.android.apps.search.assistant.surfaces.voice.ui.host.j r9 = r9.mo109189a()
        L_0x007d:
            return r9
        L_0x007e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9533a.C127093k.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C127093k kVar = new C127093k(this.f349956b, gVar);
        kVar.f349957c = obj;
        return kVar;
    }
}
