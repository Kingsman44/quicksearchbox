package com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d;

import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.fcf.logging.FCFLogger$getFCFFeatureStatusMetadataOnCommit$1", mo61344c = "FCFLogger.kt", mo61345d = "invokeSuspend", mo61346e = {104})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.h.d.b */
/* compiled from: PG */
public final class C127920b extends C69572j implements C69630p {

    /* renamed from: a */
    Object f352118a;

    /* renamed from: b */
    Object f352119b;

    /* renamed from: c */
    int f352120c;

    /* renamed from: d */
    final /* synthetic */ C127921c f352121d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127920b(C127921c cVar, C69577g gVar) {
        super(2, gVar);
        this.f352121d = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127920b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.google.android.apps.search.assistant.surfaces.voice.h.d.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.google.android.apps.search.assistant.surfaces.voice.h.d.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.google.android.apps.search.assistant.surfaces.voice.h.d.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r0 = "value"
            java.lang.String r1 = "newBuilder()"
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r14.f352120c
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0014
            java.lang.Object r2 = r14.f352119b
            java.lang.Object r3 = r14.f352118a
            p5462h.C69714l.m101134b(r15)
            goto L_0x0028
        L_0x0014:
            p5462h.C69714l.m101134b(r15)
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r15 = r14.f352121d
            kotlinx.coroutines.j.b r3 = r15.f352123b
            r14.f352118a = r3
            r14.f352119b = r15
            r14.f352120c = r5
            java.lang.Object r6 = r3.mo63025b(r4, r14)
            if (r6 == r2) goto L_0x018d
            r2 = r15
        L_0x0028:
            j.a.c.c.a.by r15 = p5535j.p5536a.p5545c.p5548c.p5549a.C71025by.f189420b     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bn r15 = r15.createBuilder()     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.bx r15 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71024bx) r15     // Catch:{ all -> 0x0188 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r1)     // Catch:{ all -> 0x0188 }
            r6 = r2
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r6 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c) r6     // Catch:{ all -> 0x0188 }
            j$.util.concurrent.ConcurrentHashMap r6 = r6.f352124c     // Catch:{ all -> 0x0188 }
            java.util.Enumeration r6 = r6.keys()     // Catch:{ all -> 0x0188 }
            java.lang.String r7 = "featureNameToFeatureStatus.keys()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)     // Catch:{ all -> 0x0188 }
            java.util.Iterator r6 = p5462h.p5463a.C69540x.m100807n(r6)     // Catch:{ all -> 0x0188 }
        L_0x0045:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0188 }
            if (r7 == 0) goto L_0x0179
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cb r7 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71029cb) r7     // Catch:{ all -> 0x0188 }
            r8 = r2
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c) r8     // Catch:{ all -> 0x0188 }
            j$.util.concurrent.ConcurrentHashMap r8 = r8.f352124c     // Catch:{ all -> 0x0188 }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ all -> 0x0188 }
            java.lang.String r9 = "null cannot be cast to non-null type com.google.android.apps.search.assistant.surfaces.voice.fcf.proto.FeatureStatus"
            p5462h.p5473f.p5475b.C69664n.m101059e(r8, r9)     // Catch:{ all -> 0x0188 }
            com.google.android.apps.search.assistant.surfaces.voice.h.e.i r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i) r8     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cf r9 = p5535j.p5536a.p5545c.p5548c.p5549a.C71033cf.f189447d     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.bz r9 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71026bz) r9     // Catch:{ all -> 0x0188 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r1)     // Catch:{ all -> 0x0188 }
            java.lang.String r10 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r10)     // Catch:{ all -> 0x0188 }
            java.lang.String r10 = "feature"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r10)     // Catch:{ all -> 0x0188 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r0)     // Catch:{ all -> 0x0188 }
            r9.copyOnWrite()     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cf r10 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71033cf) r10     // Catch:{ all -> 0x0188 }
            int r11 = r7.f189440n     // Catch:{ all -> 0x0188 }
            r10.f189450b = r11     // Catch:{ all -> 0x0188 }
            int r11 = r10.f189449a     // Catch:{ all -> 0x0188 }
            r11 = r11 | r5
            r10.f189449a = r11     // Catch:{ all -> 0x0188 }
            int r10 = r8.f352149a     // Catch:{ all -> 0x0188 }
            r11 = 2
            if (r10 != r5) goto L_0x00d2
            j.a.c.c.a.ce r10 = p5535j.p5536a.p5545c.p5548c.p5549a.C71032ce.f189442e     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cd r10 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71031cd) r10     // Catch:{ all -> 0x0188 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r1)     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.ch r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")     // Catch:{ all -> 0x0188 }
            int r12 = r8.f352149a     // Catch:{ all -> 0x0188 }
            if (r12 != r5) goto L_0x00aa
            java.lang.Object r12 = r8.f352150b     // Catch:{ all -> 0x0188 }
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x0188 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0188 }
            goto L_0x00ab
        L_0x00aa:
            r12 = 0
        L_0x00ab:
            j.a.c.c.a.cd r13 = r10.f189452a     // Catch:{ all -> 0x0188 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bv r13 = r13.instance     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.ce r13 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71032ce) r13     // Catch:{ all -> 0x0188 }
            r13.f189444a = r5     // Catch:{ all -> 0x0188 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ all -> 0x0188 }
            r13.f189445b = r12     // Catch:{ all -> 0x0188 }
            r10.mo62601b()     // Catch:{ all -> 0x0188 }
            com.google.protobuf.cj r12 = new com.google.protobuf.cj     // Catch:{ all -> 0x0188 }
            com.google.protobuf.ch r8 = r8.f352151c     // Catch:{ all -> 0x0188 }
            com.google.protobuf.ci r13 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i.f352146d     // Catch:{ all -> 0x0188 }
            r12.<init>(r8, r13)     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cd r8 = r10.f189452a     // Catch:{ all -> 0x0188 }
            r8.mo62599a(r12)     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.ce r8 = r10.mo62600a()     // Catch:{ all -> 0x0188 }
            goto L_0x0128
        L_0x00d2:
            j.a.c.c.a.ce r10 = p5535j.p5536a.p5545c.p5548c.p5549a.C71032ce.f189442e     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cd r10 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71031cd) r10     // Catch:{ all -> 0x0188 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r1)     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.ch r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")     // Catch:{ all -> 0x0188 }
            int r12 = r8.f352149a     // Catch:{ all -> 0x0188 }
            if (r12 != r11) goto L_0x00ea
            java.lang.Object r12 = r8.f352150b     // Catch:{ all -> 0x0188 }
            com.google.android.apps.search.assistant.surfaces.voice.h.e.d r12 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127925d) r12     // Catch:{ all -> 0x0188 }
            goto L_0x00ec
        L_0x00ea:
            com.google.android.apps.search.assistant.surfaces.voice.h.e.d r12 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127925d.f352134b     // Catch:{ all -> 0x0188 }
        L_0x00ec:
            int r12 = r12.f352136a     // Catch:{ all -> 0x0188 }
            com.google.android.apps.search.assistant.surfaces.voice.h.e.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b.m209045a(r12)     // Catch:{ all -> 0x0188 }
            if (r12 != 0) goto L_0x00f6
            com.google.android.apps.search.assistant.surfaces.voice.h.e.b r12 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127923b.UNRECOGNIZED     // Catch:{ all -> 0x0188 }
        L_0x00f6:
            java.lang.String r13 = "curFeatureStatus.asrResult.asrStrategy"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r13)     // Catch:{ all -> 0x0188 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r12, r0)     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cd r13 = r10.f189452a     // Catch:{ all -> 0x0188 }
            r13.copyOnWrite()     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bv r13 = r13.instance     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.ce r13 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71032ce) r13     // Catch:{ all -> 0x0188 }
            int r12 = r12.getNumber()     // Catch:{ all -> 0x0188 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0188 }
            r13.f189445b = r12     // Catch:{ all -> 0x0188 }
            r13.f189444a = r11     // Catch:{ all -> 0x0188 }
            r10.mo62601b()     // Catch:{ all -> 0x0188 }
            com.google.protobuf.cj r12 = new com.google.protobuf.cj     // Catch:{ all -> 0x0188 }
            com.google.protobuf.ch r8 = r8.f352151c     // Catch:{ all -> 0x0188 }
            com.google.protobuf.ci r13 = com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9662e.C127930i.f352146d     // Catch:{ all -> 0x0188 }
            r12.<init>(r8, r13)     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cd r8 = r10.f189452a     // Catch:{ all -> 0x0188 }
            r8.mo62599a(r12)     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.ce r8 = r10.mo62600a()     // Catch:{ all -> 0x0188 }
        L_0x0128:
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r0)     // Catch:{ all -> 0x0188 }
            r9.copyOnWrite()     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bv r10 = r9.instance     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cf r10 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71033cf) r10     // Catch:{ all -> 0x0188 }
            r8.getClass()     // Catch:{ all -> 0x0188 }
            r10.f189451c = r8     // Catch:{ all -> 0x0188 }
            int r8 = r10.f189449a     // Catch:{ all -> 0x0188 }
            r8 = r8 | r11
            r10.f189449a = r8     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bv r8 = r9.build()     // Catch:{ all -> 0x0188 }
            java.lang.String r9 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.cf r8 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71033cf) r8     // Catch:{ all -> 0x0188 }
            r15.copyOnWrite()     // Catch:{ all -> 0x0188 }
            com.google.protobuf.bv r9 = r15.instance     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.by r9 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71025by) r9     // Catch:{ all -> 0x0188 }
            r8.getClass()     // Catch:{ all -> 0x0188 }
            com.google.protobuf.cq r10 = r9.f189423a     // Catch:{ all -> 0x0188 }
            boolean r11 = r10.mo58948c()     // Catch:{ all -> 0x0188 }
            if (r11 != 0) goto L_0x015f
            com.google.protobuf.cq r10 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r10)     // Catch:{ all -> 0x0188 }
            r9.f189423a = r10     // Catch:{ all -> 0x0188 }
        L_0x015f:
            com.google.protobuf.cq r9 = r9.f189423a     // Catch:{ all -> 0x0188 }
            r9.add(r8)     // Catch:{ all -> 0x0188 }
            r8 = r2
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c) r8     // Catch:{ all -> 0x0188 }
            com.google.common.b.ij r8 = r8.f352125d     // Catch:{ all -> 0x0188 }
            boolean r8 = r8.contains(r7)     // Catch:{ all -> 0x0188 }
            if (r8 != 0) goto L_0x0045
            r8 = r2
            com.google.android.apps.search.assistant.surfaces.voice.h.d.c r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127921c) r8     // Catch:{ all -> 0x0188 }
            j$.util.concurrent.ConcurrentHashMap r8 = r8.f352124c     // Catch:{ all -> 0x0188 }
            r8.remove(r7)     // Catch:{ all -> 0x0188 }
            goto L_0x0045
        L_0x0179:
            com.google.protobuf.bv r15 = r15.build()     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = "fcfFeatureStatusMetadata.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r0)     // Catch:{ all -> 0x0188 }
            j.a.c.c.a.by r15 = (p5535j.p5536a.p5545c.p5548c.p5549a.C71025by) r15     // Catch:{ all -> 0x0188 }
            r3.mo63026c(r4)
            return r15
        L_0x0188:
            r15 = move-exception
            r3.mo63026c(r4)
            throw r15
        L_0x018d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9653h.p9661d.C127920b.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127920b(this.f352121d, gVar);
    }
}
