package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.p4751a.C62949a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.b */
/* compiled from: PG */
public final class C126949b {

    /* renamed from: a */
    public static final C59071e f349545a = C59071e.m91331h();

    /* renamed from: b */
    public final C37215b f349546b;

    /* renamed from: c */
    private final C127921c f349547c;

    public C126949b(C37215b bVar, C127921c cVar) {
        C69664n.m101061g(bVar, "assistantAppFlowLogger");
        C69664n.m101061g(cVar, "fcfLogger");
        this.f349546b = bVar;
        this.f349547c = cVar;
    }

    /* renamed from: b */
    public static final C37252a m207655b(C37258g gVar, C62910ar arVar) {
        C69664n.m101061g(gVar, "<this>");
        C69664n.m101061g(arVar, "elapsed");
        return gVar.mo40811d(C62949a.m95468c(arVar).toNanos());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.google.android.libraries.search.b.i.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: com.google.android.libraries.search.b.i.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: com.google.android.libraries.search.b.i.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo107868a(com.google.android.libraries.search.p2871b.p2895i.C37252a r8, p5462h.p5466c.C69577g r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126938a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a r0 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126938a) r0
            int r1 = r0.f349476e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f349476e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a r0 = new com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f349474c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f349476e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003b
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            p5462h.C69714l.m101134b(r9)
            goto L_0x007d
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            java.lang.Object r8 = r0.f349473b
            java.lang.Object r2 = r0.f349472a
            p5462h.C69714l.m101134b(r9)
            goto L_0x0059
        L_0x003b:
            p5462h.C69714l.m101134b(r9)
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r9 = r7.f349547c
            kotlinx.coroutines.aw r2 = r9.f352122a
            com.google.android.apps.search.assistant.surfaces.voice.h.d.b r6 = new com.google.android.apps.search.assistant.surfaces.voice.h.d.b
            r6.<init>(r9, r5)
            r9 = 3
            com.google.common.util.concurrent.cx r9 = kotlinx.coroutines.p5578d.C71663i.m104692e(r2, r5, r6, r9)
            r0.f349472a = r7
            r0.f349473b = r8
            r0.f349476e = r4
            java.lang.Object r9 = kotlinx.coroutines.p5578d.C71663i.m104690c(r9, r0)
            if (r9 == r1) goto L_0x0080
            r2 = r7
        L_0x0059:
            j.a.c.c.a.by r9 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71025by) r9
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.b r2 = (com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126949b) r2
            com.google.android.libraries.search.b.b r2 = r2.f349546b
            com.google.protobuf.bt r4 = p5535j.p5536a.p5545c.p5548c.p5549a.C71025by.f189421c
            r6 = r8
            com.google.android.libraries.search.b.i.b r6 = (com.google.android.libraries.search.p2871b.p2895i.C37253b) r6
            r6.mo40792p(r4, r9)
            com.google.common.util.concurrent.cx r8 = r2.mo19974a(r8)
            java.lang.String r9 = "assistantAppFlowLogger\n …ntMetadata, fcfMetadata))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            r0.f349472a = r5
            r0.f349473b = r5
            r0.f349476e = r3
            java.lang.Object r8 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)
            if (r8 != r1) goto L_0x007d
            return r1
        L_0x007d:
            h.q r8 = p5462h.C69788q.f186170a
            return r8
        L_0x0080:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b.C126949b.mo107868a(com.google.android.libraries.search.b.i.a, h.c.g):java.lang.Object");
    }
}
