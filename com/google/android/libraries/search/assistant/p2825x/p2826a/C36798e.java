package com.google.android.libraries.search.assistant.p2825x.p2826a;

import com.google.apps.tiktok.p3633d.p3634a.C46677o;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.quickphrasesmanager.impl.QuickPhrasesDebugDataProvider$getDebugData$1", mo61344c = "QuickPhrasesDebugDataProvider.kt", mo61345d = "invokeSuspend", mo61346e = {180})
/* renamed from: com.google.android.libraries.search.assistant.x.a.e */
/* compiled from: PG */
final class C36798e extends C69572j implements C69630p {

    /* renamed from: a */
    Object f95877a;

    /* renamed from: b */
    Object f95878b;

    /* renamed from: c */
    int f95879c;

    /* renamed from: d */
    final /* synthetic */ C46677o f95880d;

    /* renamed from: e */
    final /* synthetic */ C36805l f95881e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36798e(C46677o oVar, C36805l lVar, C69577g gVar) {
        super(2, gVar);
        this.f95880d = oVar;
        this.f95881e = lVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C36798e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.android.libraries.search.assistant.x.a.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: com.google.android.libraries.search.assistant.x.a.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: kotlinx.coroutines.j.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.android.libraries.search.assistant.x.a.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: kotlinx.coroutines.j.b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r12) {
        /*
            r11 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r11.f95879c
            r2 = 0
            if (r1 == 0) goto L_0x000f
            java.lang.Object r0 = r11.f95878b
            java.lang.Object r1 = r11.f95877a
            p5462h.C69714l.m101134b(r12)
            goto L_0x003a
        L_0x000f:
            p5462h.C69714l.m101134b(r12)
            com.google.apps.tiktok.d.a.o r12 = r11.f95880d
            com.google.common.b.gu r12 = r12.mo50698b()
            com.google.apps.tiktok.d.a.e r1 = com.google.apps.tiktok.p3633d.p3634a.C46667e.TEXT
            boolean r12 = r12.contains(r1)
            if (r12 != 0) goto L_0x0028
            com.google.apps.tiktok.d.a.g r12 = com.google.apps.tiktok.p3633d.p3634a.C46675m.f121943k
            java.lang.String r0 = "NO_DATA"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r0)
            return r12
        L_0x0028:
            com.google.android.libraries.search.assistant.x.a.l r12 = r11.f95881e
            kotlinx.coroutines.j.b r1 = r12.f95906d
            r11.f95877a = r1
            r11.f95878b = r12
            r3 = 1
            r11.f95879c = r3
            java.lang.Object r3 = r1.mo63025b(r2, r11)
            if (r3 == r0) goto L_0x0231
            r0 = r12
        L_0x003a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r12.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r3 = "QuickPhrasesManager:"
            r12.append(r3)     // Catch:{ all -> 0x022c }
            r3 = 10
            r12.append(r3)     // Catch:{ all -> 0x022c }
            java.lang.String r4 = "  Invocation source states:"
            r12.append(r4)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            com.google.common.f.e r4 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36805l.f95903a     // Catch:{ all -> 0x022c }
            r4 = r0
            com.google.android.libraries.search.assistant.x.a.l r4 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36805l) r4     // Catch:{ all -> 0x022c }
            com.google.common.b.eo r4 = r4.f95907e     // Catch:{ all -> 0x022c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x022c }
        L_0x005c:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x022c }
            java.lang.String r6 = "ms:"
            if (r5 == 0) goto L_0x0127
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x022c }
            java.lang.String r7 = "invocationSourceStatesBuffer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.x.a.d r5 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36797d) r5     // Catch:{ all -> 0x022c }
            j$.time.Duration r7 = r5.f95876b     // Catch:{ all -> 0x022c }
            long r7 = r7.toMillis()     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r9.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r10 = "    State at "
            r9.append(r10)     // Catch:{ all -> 0x022c }
            r9.append(r7)     // Catch:{ all -> 0x022c }
            r9.append(r6)     // Catch:{ all -> 0x022c }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x022c }
            r12.append(r6)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.invocation.o.i.c.b.g r6 = r5.f95875a     // Catch:{ all -> 0x022c }
            int r6 = r6.f92082e     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.invocation.o.i.c.b.f r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34679f.m63414a(r6)     // Catch:{ all -> 0x022c }
            if (r6 != 0) goto L_0x009b
            com.google.android.libraries.search.assistant.invocation.o.i.c.b.f r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34679f.UNKNOWN     // Catch:{ all -> 0x022c }
        L_0x009b:
            int r6 = r6.f92074d     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r7.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r8 = "      Status: "
            r7.append(r8)     // Catch:{ all -> 0x022c }
            r7.append(r6)     // Catch:{ all -> 0x022c }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x022c }
            r12.append(r6)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.invocation.o.i.c.b.g r6 = r5.f95875a     // Catch:{ all -> 0x022c }
            int r6 = r6.f92083f     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.invocation.o.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.m62690a(r6)     // Catch:{ all -> 0x022c }
            if (r6 != 0) goto L_0x00c0
            com.google.android.libraries.search.assistant.invocation.o.a.b r6 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b.CLIENT_UNKNOWN     // Catch:{ all -> 0x022c }
        L_0x00c0:
            int r6 = r6.getNumber()     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r7.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r8 = "      Client: "
            r7.append(r8)     // Catch:{ all -> 0x022c }
            r7.append(r6)     // Catch:{ all -> 0x022c }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x022c }
            r12.append(r6)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.invocation.o.i.c.b.g r6 = r5.f95875a     // Catch:{ all -> 0x022c }
            com.google.protobuf.cj r7 = new com.google.protobuf.cj     // Catch:{ all -> 0x022c }
            com.google.protobuf.ch r6 = r6.f92080b     // Catch:{ all -> 0x022c }
            com.google.protobuf.ci r8 = com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2687c.p2689b.C34680g.f92075c     // Catch:{ all -> 0x022c }
            r7.<init>(r6, r8)     // Catch:{ all -> 0x022c }
            java.lang.String r6 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36794ah.m65482b(r7)     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r7.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r8 = "      Active QuickPhrases "
            r7.append(r8)     // Catch:{ all -> 0x022c }
            r7.append(r6)     // Catch:{ all -> 0x022c }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x022c }
            r12.append(r6)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.invocation.o.i.c.b.g r5 = r5.f95875a     // Catch:{ all -> 0x022c }
            com.google.protobuf.cq r5 = r5.f92081d     // Catch:{ all -> 0x022c }
            java.lang.String r6 = "state.state.failedQuickPhrasesList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r6)     // Catch:{ all -> 0x022c }
            java.lang.String r5 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36794ah.m65481a(r5)     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r6.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r7 = "      Failed to configure QuickPhrases"
            r6.append(r7)     // Catch:{ all -> 0x022c }
            r6.append(r5)     // Catch:{ all -> 0x022c }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x022c }
            r12.append(r5)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            goto L_0x005c
        L_0x0127:
            java.lang.String r4 = "  QuickPhraseEvents:"
            r12.append(r4)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            r4 = r0
            com.google.android.libraries.search.assistant.x.a.l r4 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36805l) r4     // Catch:{ all -> 0x022c }
            com.google.common.b.eo r4 = r4.f95908f     // Catch:{ all -> 0x022c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x022c }
        L_0x0138:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x022c }
            if (r5 == 0) goto L_0x01a4
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x022c }
            java.lang.String r7 = "quickPhraseEventsBuffer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r7)     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.x.a.c r5 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36796c) r5     // Catch:{ all -> 0x022c }
            j$.time.Duration r7 = r5.f95874c     // Catch:{ all -> 0x022c }
            long r7 = r7.toMillis()     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r9.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r10 = "    Event emmited at "
            r9.append(r10)     // Catch:{ all -> 0x022c }
            r9.append(r7)     // Catch:{ all -> 0x022c }
            r9.append(r6)     // Catch:{ all -> 0x022c }
            java.lang.String r7 = r9.toString()     // Catch:{ all -> 0x022c }
            r12.append(r7)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r7 = r5.f95872a     // Catch:{ all -> 0x022c }
            com.google.frameworks.client.a.a.b r7 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r7)     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r8.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r9 = "      For invocation: "
            r8.append(r9)     // Catch:{ all -> 0x022c }
            r8.append(r7)     // Catch:{ all -> 0x022c }
            java.lang.String r7 = r8.toString()     // Catch:{ all -> 0x022c }
            r12.append(r7)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            java.util.List r5 = r5.f95873b     // Catch:{ all -> 0x022c }
            java.lang.String r5 = com.google.android.libraries.search.assistant.p2825x.p2826a.C36794ah.m65482b(r5)     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r7.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r8 = "      Triggered QuickPhrases"
            r7.append(r8)     // Catch:{ all -> 0x022c }
            r7.append(r5)     // Catch:{ all -> 0x022c }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x022c }
            r12.append(r5)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            goto L_0x0138
        L_0x01a4:
            java.lang.String r4 = "  Event retrievals:"
            r12.append(r4)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.x.a.l r0 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36805l) r0     // Catch:{ all -> 0x022c }
            com.google.common.b.eo r0 = r0.f95909g     // Catch:{ all -> 0x022c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x022c }
        L_0x01b4:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x022c }
            if (r4 == 0) goto L_0x0207
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x022c }
            java.lang.String r5 = "invocationFlowCollectionBuffer"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.x.a.b r4 = (com.google.android.libraries.search.assistant.p2825x.p2826a.C36795b) r4     // Catch:{ all -> 0x022c }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r5 = r4.f95870a     // Catch:{ all -> 0x022c }
            com.google.frameworks.client.a.a.b r5 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r5)     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r6.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r7 = "    Events for invocation "
            r6.append(r7)     // Catch:{ all -> 0x022c }
            r6.append(r5)     // Catch:{ all -> 0x022c }
            java.lang.String r5 = " "
            r6.append(r5)     // Catch:{ all -> 0x022c }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x022c }
            r12.append(r5)     // Catch:{ all -> 0x022c }
            j$.time.Duration r4 = r4.f95871b     // Catch:{ all -> 0x022c }
            long r4 = r4.toMillis()     // Catch:{ all -> 0x022c }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x022c }
            r6.<init>()     // Catch:{ all -> 0x022c }
            java.lang.String r7 = "were collected at "
            r6.append(r7)     // Catch:{ all -> 0x022c }
            r6.append(r4)     // Catch:{ all -> 0x022c }
            java.lang.String r4 = "ms"
            r6.append(r4)     // Catch:{ all -> 0x022c }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x022c }
            r12.append(r4)     // Catch:{ all -> 0x022c }
            r12.append(r3)     // Catch:{ all -> 0x022c }
            goto L_0x01b4
        L_0x0207:
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x022c }
            com.google.apps.tiktok.d.a.a r0 = new com.google.apps.tiktok.d.a.a     // Catch:{ all -> 0x022c }
            r0.<init>()     // Catch:{ all -> 0x022c }
            r3 = 0
            r0.mo50684b(r3)     // Catch:{ all -> 0x022c }
            com.google.apps.tiktok.d.a.e r3 = com.google.apps.tiktok.p3633d.p3634a.C46667e.TEXT     // Catch:{ all -> 0x022c }
            r0.mo50686d(r3)     // Catch:{ all -> 0x022c }
            com.google.protobuf.z r12 = com.google.protobuf.C63088z.m96143E(r12)     // Catch:{ all -> 0x022c }
            r0.f121916a = r12     // Catch:{ all -> 0x022c }
            com.google.apps.tiktok.d.a.g r12 = r0.mo50683a()     // Catch:{ all -> 0x022c }
            java.lang.String r0 = "builder()\n          .set…Data))\n          .build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r12, r0)     // Catch:{ all -> 0x022c }
            r1.mo63026c(r2)
            return r12
        L_0x022c:
            r12 = move-exception
            r1.mo63026c(r2)
            throw r12
        L_0x0231:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2825x.p2826a.C36798e.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C36798e(this.f95880d, this.f95881e, gVar);
    }
}
