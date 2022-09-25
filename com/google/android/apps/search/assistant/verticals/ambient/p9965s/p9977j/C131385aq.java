package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j;

import com.google.android.libraries.assistant.contexttrigger.p1461e.C17692f;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.verticals.ambient.surface.mediarecommendations.MediaRecommendationsSuggestionProducer$produceSmartspaceCard$2", mo61344c = "MediaRecommendationsSuggestionProducer.kt", mo61345d = "invokeSuspend", mo61346e = {174, 176, 178, 186})
/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.j.aq */
/* compiled from: PG */
final class C131385aq extends C69572j implements C69630p {

    /* renamed from: a */
    int f359157a;

    /* renamed from: b */
    final /* synthetic */ C131386ar f359158b;

    /* renamed from: c */
    final /* synthetic */ C17692f f359159c;

    /* renamed from: d */
    private /* synthetic */ Object f359160d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C131385aq(C131386ar arVar, C17692f fVar, C69577g gVar) {
        super(2, gVar);
        this.f359158b = arVar;
        this.f359159c = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C131385aq) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        if (kotlinx.coroutines.C71647ct.m104637a(r1, r10) != r0) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007e, code lost:
        if (r11 != r0) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f359157a
            r2 = 2
            r3 = 1
            r4 = 3
            r5 = 0
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x001d
            if (r1 == r2) goto L_0x0019
            if (r1 == r4) goto L_0x0015
            p5462h.C69714l.m101134b(r11)
            goto L_0x00b9
        L_0x0015:
            p5462h.C69714l.m101134b(r11)
            goto L_0x0080
        L_0x0019:
            p5462h.C69714l.m101134b(r11)
            goto L_0x0072
        L_0x001d:
            java.lang.Object r1 = r10.f359160d
            kotlinx.coroutines.be r1 = (kotlinx.coroutines.C71604be) r1
            p5462h.C69714l.m101134b(r11)
            goto L_0x0051
        L_0x0025:
            p5462h.C69714l.m101134b(r11)
            java.lang.Object r11 = r10.f359160d
            kotlinx.coroutines.aw r11 = (kotlinx.coroutines.C71422aw) r11
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ap r1 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.ap
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r6 = r10.f359158b
            r1.<init>(r6, r5)
            kotlinx.coroutines.be r1 = kotlinx.coroutines.C71803m.m105042c(r11, r5, r5, r1, r4)
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ao r6 = new com.google.android.apps.search.assistant.verticals.ambient.s.j.ao
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r7 = r10.f359158b
            com.google.android.libraries.assistant.contexttrigger.e.f r8 = r10.f359159c
            r6.<init>(r7, r8, r5)
            kotlinx.coroutines.be r11 = kotlinx.coroutines.C71803m.m105042c(r11, r5, r5, r6, r4)
            r10.f359160d = r11
            r10.f359157a = r3
            java.lang.Object r1 = r1.mo62825a(r10)
            if (r1 == r0) goto L_0x00bc
            r9 = r1
            r1 = r11
            r11 = r9
        L_0x0051:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x009e
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r11 = r10.f359158b
            com.google.common.f.a.d r11 = r11.f359168h
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            java.lang.String r3 = "Quota reached. Producing default card."
            r11.mo56386p(r3)
            r10.f359160d = r5
            r10.f359157a = r2
            java.lang.Object r11 = kotlinx.coroutines.C71647ct.m104637a(r1, r10)
            if (r11 == r0) goto L_0x009d
        L_0x0072:
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r11 = r10.f359158b
            com.google.android.apps.search.assistant.verticals.ambient.s.j.aw r11 = r11.f359166f
            com.google.android.libraries.assistant.contexttrigger.e.f r1 = r10.f359159c
            r10.f359157a = r4
            java.lang.Object r11 = r11.mo110157a(r5, r1, r10)
            if (r11 == r0) goto L_0x009d
        L_0x0080:
            com.google.android.apps.search.assistant.verticals.ambient.s.j.au r11 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131389au) r11
            boolean r0 = r11 instanceof com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131387as
            if (r0 == 0) goto L_0x0090
            com.google.android.apps.search.assistant.verticals.ambient.m.bz r0 = new com.google.android.apps.search.assistant.verticals.ambient.m.bz
            com.google.android.apps.search.assistant.verticals.ambient.s.j.as r11 = (com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131387as) r11
            com.google.assistant.c.do r11 = r11.f359173a
            r0.<init>(r11)
            goto L_0x00bc
        L_0x0090:
            boolean r11 = r11 instanceof com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131388at
            if (r11 == 0) goto L_0x0097
            com.google.android.apps.search.assistant.verticals.ambient.m.cb r0 = com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130944cb.f358281a
            goto L_0x00bc
        L_0x0097:
            h.g r11 = new h.g
            r11.<init>()
            throw r11
        L_0x009d:
            return r0
        L_0x009e:
            com.google.android.apps.search.assistant.verticals.ambient.s.j.ar r11 = r10.f359158b
            com.google.common.f.a.d r11 = r11.f359168h
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            java.lang.String r2 = "Card production success!"
            r11.mo56386p(r2)
            r10.f359160d = r5
            r11 = 4
            r10.f359157a = r11
            java.lang.Object r11 = r1.mo62825a(r10)
            if (r11 != r0) goto L_0x00b9
            return r0
        L_0x00b9:
            r0 = r11
            com.google.android.apps.search.assistant.verticals.ambient.m.cc r0 = (com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130945cc) r0
        L_0x00bc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9977j.C131385aq.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C131385aq aqVar = new C131385aq(this.f359158b, this.f359159c, gVar);
        aqVar.f359160d = obj;
        return aqVar;
    }
}
