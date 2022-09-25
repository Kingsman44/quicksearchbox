package com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j;

import com.google.android.apps.search.assistant.surfaces.dictation.service.p9460m.C125926o;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.j.ab */
/* compiled from: PG */
public final class C125811ab {

    /* renamed from: a */
    public final C71422aw f346733a;

    /* renamed from: b */
    private final C125836b f346734b;

    /* renamed from: c */
    private final C125926o f346735c;

    public C125811ab(C125836b bVar, C125926o oVar, C71422aw awVar) {
        C69664n.m101061g(oVar, "eligibilityChecker");
        C69664n.m101061g(awVar, "lightweightScope");
        this.f346734b = bVar;
        this.f346735c = oVar;
        this.f346733a = awVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107122a(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125885z
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.z r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125885z) r0
            int r1 = r0.f346956d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f346956d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.z r0 = new com.google.android.apps.search.assistant.surfaces.dictation.service.j.z
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f346954b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f346956d
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.lang.Object r0 = r0.f346953a
            p5462h.C69714l.m101134b(r5)
            goto L_0x0041
        L_0x0029:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0031:
            p5462h.C69714l.m101134b(r5)
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.b r5 = r4.f346734b
            r0.f346953a = r4
            r0.f346956d = r3
            java.lang.Object r5 = r5.mo107127a(r0)
            if (r5 == r1) goto L_0x00a2
            r0 = r4
        L_0x0041:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.d r5 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125863d) r5
            if (r5 != 0) goto L_0x0060
            com.google.common.f.e r5 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125812ac.f346736a
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 36692(0x8f54, float:5.1416E-41)
            r0.<init>(r1)
            r5.mo56379ah(r0)
            java.lang.String r0 = "No active keyboard found, not requesting download in any locales [SD]"
            r5.mo56386p(r0)
            h.a.ao r5 = p5462h.p5463a.C69498ao.f185920a
            return r5
        L_0x0060:
            com.google.android.apps.search.assistant.surfaces.dictation.service.j.ab r0 = (com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125811ab) r0
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.o r0 = r0.f346735c
            com.google.android.apps.search.assistant.surfaces.dictation.service.m.w r5 = r5.f346893b
            com.google.android.apps.gsa.nga.api.a.af r5 = r5.f347148c
            java.lang.String r1 = "configurationData"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r1)
            com.google.protobuf.cq r5 = r5.a
            java.lang.String r1 = "configurationData.localesList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p5462h.p5463a.C69540x.m100804k(r5, r2)
            r1.<init>(r2)
            java.util.Iterator r5 = r5.iterator()
        L_0x0083:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r5.next()
            java.lang.String r2 = (java.lang.String) r2
            java.util.Locale r2 = java.util.Locale.forLanguageTag(r2)
            r1.add(r2)
            goto L_0x0083
        L_0x0097:
            java.util.Set r5 = p5462h.p5463a.C69540x.m100846ab(r1)
            com.google.common.b.ij r0 = r0.f347104b
            java.util.Set r5 = p5462h.p5463a.C69540x.m100844Z(r5, r0)
            return r5
        L_0x00a2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9451j.C125811ab.mo107122a(h.c.g):java.lang.Object");
    }
}
