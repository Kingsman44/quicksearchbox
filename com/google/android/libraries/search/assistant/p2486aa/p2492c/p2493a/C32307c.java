package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import kotlinx.coroutines.C71422aw;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.speechbiasingcontext.service.impl.AccessSessionManager$Callbacks$onContextInvalidated$future$1", mo61344c = "AccessSessionManager.kt", mo61345d = "invokeSuspend", mo61346e = {242, 137, 150})
/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.c */
/* compiled from: PG */
final class C32307c extends C69572j implements C69630p {

    /* renamed from: a */
    Object f86536a;

    /* renamed from: b */
    Object f86537b;

    /* renamed from: c */
    Object f86538c;

    /* renamed from: d */
    Object f86539d;

    /* renamed from: e */
    int f86540e;

    /* renamed from: f */
    final /* synthetic */ C32313i f86541f;

    /* renamed from: g */
    final /* synthetic */ C32310f f86542g;

    /* renamed from: h */
    final /* synthetic */ C32796ar f86543h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32307c(C32313i iVar, C32310f fVar, C32796ar arVar, C69577g gVar) {
        super(2, gVar);
        this.f86541f = iVar;
        this.f86542g = fVar;
        this.f86543h = arVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32307c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public final java.lang.Object mo5193b(java.lang.Object r17) {
        /*
            r16 = this;
            r8 = r16
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r8.f86540e
            java.lang.String r9 = "empty()"
            r10 = 3
            java.lang.String r11 = "newBuilder()"
            r12 = 2
            r13 = 1
            r14 = 0
            if (r1 == 0) goto L_0x0039
            if (r1 == r13) goto L_0x002b
            if (r1 == r12) goto L_0x0021
            java.lang.Object r0 = r8.f86537b
            com.google.android.libraries.search.assistant.f.a.d.aw r0 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r0
            java.lang.Object r1 = r8.f86536a
            p5462h.C69714l.m101134b(r17)
            r2 = r17
            goto L_0x00f4
        L_0x0021:
            java.lang.Object r1 = r8.f86536a
            p5462h.C69714l.m101134b(r17)
            r15 = r1
            r1 = r17
            goto L_0x00cf
        L_0x002b:
            java.lang.Object r1 = r8.f86539d
            java.lang.Object r2 = r8.f86538c
            java.lang.Object r3 = r8.f86537b
            kotlinx.coroutines.j.b r3 = (kotlinx.coroutines.p5584j.C71788b) r3
            java.lang.Object r4 = r8.f86536a
            p5462h.C69714l.m101134b(r17)
            goto L_0x0057
        L_0x0039:
            p5462h.C69714l.m101134b(r17)
            h.f.b.ae r4 = new h.f.b.ae
            r4.<init>()
            com.google.android.libraries.search.assistant.aa.c.a.i r2 = r8.f86541f
            kotlinx.coroutines.j.b r3 = r2.f86574j
            com.google.android.libraries.search.assistant.aa.c.a.f r1 = r8.f86542g
            r8.f86536a = r4
            r8.f86537b = r3
            r8.f86538c = r2
            r8.f86539d = r1
            r8.f86540e = r13
            java.lang.Object r5 = r3.mo63025b(r14, r8)
            if (r5 == r0) goto L_0x03a4
        L_0x0057:
            r15 = r4
            com.google.android.libraries.search.assistant.aa.c.a.i r2 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32313i) r2     // Catch:{ all -> 0x039e }
            java.util.Map r2 = r2.f86575k     // Catch:{ all -> 0x039e }
            com.google.android.libraries.search.assistant.aa.c.a.f r1 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32310f) r1     // Catch:{ all -> 0x039e }
            com.google.android.libraries.search.assistant.f.a.d.cq r1 = r1.f86548a     // Catch:{ all -> 0x039e }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x039e }
            com.google.android.libraries.search.assistant.aa.c.a.a r1 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32262a) r1     // Catch:{ all -> 0x039e }
            if (r1 == 0) goto L_0x0394
            com.google.android.libraries.search.assistant.f.a.b r1 = r1.f86501a     // Catch:{ all -> 0x039e }
            if (r1 != 0) goto L_0x006e
            goto L_0x0394
        L_0x006e:
            r2 = r15
            h.f.b.ae r2 = (p5462h.p5473f.p5475b.C69648ae) r2     // Catch:{ all -> 0x039e }
            r2.f186027a = r1     // Catch:{ all -> 0x039e }
            r3.mo63026c(r14)
            com.google.android.libraries.search.assistant.aa.c.a.i r1 = r8.f86541f
            com.google.android.libraries.search.assistant.aa.c.a.t r1 = r1.f86571g
            com.google.android.libraries.search.assistant.aa.c.a.f r2 = r8.f86542g
            com.google.android.libraries.search.assistant.f.a.d.cq r2 = r2.f86548a
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            com.google.android.libraries.search.assistant.f.a.d.ar r3 = r8.f86543h
            com.google.android.libraries.search.assistant.f.a.d.ac r4 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac.f87950e
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.search.assistant.f.a.d.ab r4 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32780ab) r4
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r11)
            com.google.android.libraries.search.assistant.f.a.d.ae r4 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32782ad.m60760a(r4)
            r4.mo38293b(r3)
            com.google.android.libraries.search.assistant.f.a.d.ab r3 = r4.f87956a
            r3.copyOnWrite()
            com.google.protobuf.bv r3 = r3.instance
            com.google.android.libraries.search.assistant.f.a.d.ac r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32781ac) r3
            int r6 = r3.f87952a
            r6 = r6 | 4
            r3.f87952a = r6
            r3.f87955d = r13
            com.google.android.libraries.search.assistant.f.a.d.ac r4 = r4.mo38292a()
            com.google.android.libraries.search.assistant.aa.c.a.i r3 = r8.f86541f
            long r6 = r3.f86568d
            j$.time.Duration r6 = com.google.common.p4580v.p4582b.C60943b.m93086b(r6)
            r3 = r15
            h.f.b.ae r3 = (p5462h.p5473f.p5475b.C69648ae) r3
            java.lang.Object r3 = r3.f186027a
            com.google.android.libraries.search.assistant.f.a.b r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r9)
            r8.f86536a = r15
            r8.f86537b = r14
            r8.f86538c = r14
            r8.f86539d = r14
            r8.f86540e = r12
            r7 = r16
            java.lang.Object r1 = r1.mo38038a(r2, r3, r4, r5, r6, r7)
            if (r1 == r0) goto L_0x0393
        L_0x00cf:
            com.google.android.libraries.search.assistant.f.a.d.aw r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw) r1
            if (r1 != 0) goto L_0x00d6
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x00d6:
            com.google.android.libraries.search.assistant.aa.c.a.i r2 = r8.f86541f
            com.google.android.libraries.search.assistant.aa.c.a.j r2 = r2.f86572h
            r3 = r15
            h.f.b.ae r3 = (p5462h.p5473f.p5475b.C69648ae) r3
            java.lang.Object r3 = r3.f186027a
            com.google.android.libraries.search.assistant.f.a.b r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b) r3
            com.google.android.libraries.search.assistant.aa.c.a.f r4 = r8.f86542g
            com.google.android.libraries.search.assistant.f.a.d.cq r4 = r4.f86548a
            r8.f86536a = r15
            r8.f86537b = r1
            r8.f86540e = r10
            java.lang.Object r2 = r2.mo38037a(r3, r4, r14, r8)
            if (r2 != r0) goto L_0x00f2
            return r0
        L_0x00f2:
            r0 = r1
            r1 = r15
        L_0x00f4:
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.libraries.search.assistant.aa.c.a.i r3 = r8.f86541f
            com.google.android.libraries.search.assistant.aa.c.a.a.i r3 = r3.f86573i
            com.google.android.libraries.search.assistant.aa.c.a.f r3 = r8.f86542g
            com.google.android.libraries.search.assistant.f.a.d.cq r3 = r3.f86548a
            com.google.android.libraries.search.assistant.f.a.d.ar r4 = r8.f86543h
            java.lang.String r5 = "sessionToken"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r5)
            java.lang.String r6 = "contextKey"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r6)
            java.lang.String r6 = "contextResult"
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r6)
            java.util.Map r6 = com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32288i.f86516b
            java.lang.Object r4 = r6.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x011b
            h.a.am r4 = p5462h.p5463a.C69496am.f185918a
        L_0x011b:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r15 = p5462h.p5463a.C69540x.m100804k(r4, r7)
            r6.<init>(r15)
            java.util.Iterator r4 = r4.iterator()
        L_0x012a:
            boolean r15 = r4.hasNext()
            if (r15 == 0) goto L_0x013e
            java.lang.Object r15 = r4.next()
            com.google.android.libraries.search.assistant.aa.c.a.a.h r15 = (com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.p2494a.C32287h) r15
            com.google.speech.j.a.am r15 = r15.mo38031a(r3, r0)
            r6.add(r15)
            goto L_0x012a
        L_0x013e:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0147
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0147:
            java.util.Iterator r0 = r6.iterator()
        L_0x014b:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01c3
            java.lang.Object r3 = r0.next()
            com.google.speech.j.a.am r3 = (com.google.speech.p5218j.p5219a.C66709am) r3
            com.google.android.libraries.search.assistant.aa.c.a.i r4 = r8.f86541f
            com.google.android.libraries.search.assistant.aa.c.a.w r4 = r4.f86570f
            com.google.android.libraries.search.assistant.aa.c.a.f r15 = r8.f86542g
            com.google.android.libraries.search.assistant.f.a.d.cq r15 = r15.f86548a
            j$.util.Optional r14 = p3186j$.util.Optional.empty()
            p5462h.p5473f.p5475b.C69664n.m101060f(r14, r9)
            java.lang.String r10 = "contextUpdate"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r10)
            java.lang.String r10 = "locale"
            p5462h.p5473f.p5475b.C69664n.m101061g(r2, r10)
            p5462h.p5473f.p5475b.C69664n.m101061g(r15, r5)
            java.lang.String r10 = "requestId"
            p5462h.p5473f.p5475b.C69664n.m101061g(r14, r10)
            com.google.android.libraries.search.n.ct r10 = com.google.android.libraries.search.p3055n.C39666ct.f104415e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.search.n.cs r10 = (com.google.android.libraries.search.p3055n.C39665cs) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r11)
            com.google.android.libraries.search.n.cv r10 = com.google.android.libraries.search.p3055n.C39667cu.m69123a(r10)
            java.lang.String r13 = "value"
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r13)
            com.google.android.libraries.search.n.cs r13 = r10.f104423a
            r13.copyOnWrite()
            com.google.protobuf.bv r13 = r13.instance
            com.google.android.libraries.search.n.ct r13 = (com.google.android.libraries.search.p3055n.C39666ct) r13
            r3.getClass()
            r13.f104420c = r3
            r13.f104419b = r12
            com.google.android.libraries.search.n.az r3 = com.google.android.libraries.search.p3055n.C39276az.f103456b
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.android.libraries.search.n.ay r3 = (com.google.android.libraries.search.p3055n.C39275ay) r3
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r11)
            com.google.android.libraries.search.n.bb r3 = com.google.android.libraries.search.p3055n.C39352ba.m68757a(r3)
            r3.mo41782c()
            r3.mo41781b(r2)
            com.google.android.libraries.search.n.az r3 = r3.mo41780a()
            r10.mo41981b(r3)
            com.google.android.libraries.search.n.ct r3 = r10.mo41980a()
            r4.mo38040a(r3, r15, r14)
            r10 = 3
            r13 = 1
            r14 = 0
            goto L_0x014b
        L_0x01c3:
            com.google.android.libraries.search.assistant.aa.c.a.i r0 = r8.f86541f
            com.google.android.libraries.search.assistant.aa.b.a.c r0 = r0.f86567c
            h.f.b.ae r1 = (p5462h.p5473f.p5475b.C69648ae) r1
            java.lang.Object r1 = r1.f186027a
            com.google.android.libraries.search.assistant.f.a.b r1 = (com.google.android.libraries.search.assistant.p2517f.p2518a.C32603b) r1
            int r2 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32258c.f86485d
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Iterator r3 = r6.iterator()
        L_0x01d8:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x031a
            java.lang.Object r4 = r3.next()
            com.google.speech.j.a.am r4 = (com.google.speech.p5218j.p5219a.C66709am) r4
            int r6 = r4.f181467a
            r9 = 6
            java.lang.String r10 = "it"
            r11 = 16
            if (r6 != r9) goto L_0x022d
            java.lang.Object r6 = r4.f181468b
            com.google.speech.j.a.w r6 = (com.google.speech.p5218j.p5219a.C66756w) r6
            com.google.protobuf.cq r6 = r6.f181568a
            java.lang.String r9 = "contextUpdate.clearConte…uest.contextInputNameList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r9)
            int r9 = p5462h.p5463a.C69540x.m100804k(r6, r7)
            int r9 = p5462h.p5463a.C69505av.m100860b(r9)
            if (r9 >= r11) goto L_0x0205
            r9 = 16
        L_0x0205:
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>(r9)
            java.util.Iterator r6 = r6.iterator()
        L_0x020e:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0229
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            h.i r9 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60038a(r9, r5)
            java.lang.Object r14 = r9.f186052a
            java.lang.Object r9 = r9.f186053b
            r13.put(r14, r9)
            goto L_0x020e
        L_0x0229:
            r2.putAll(r13)
            goto L_0x027a
        L_0x022d:
            r9 = 1
            if (r6 != r9) goto L_0x027a
            java.lang.Object r6 = r4.f181468b
            com.google.speech.j.a.bd r6 = (com.google.speech.p5218j.p5219a.C66727bd) r6
            com.google.protobuf.cq r6 = r6.f181509a
            java.lang.String r13 = "contextUpdate.updateCont…tInputRequest.contextList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r13)
            int r13 = p5462h.p5463a.C69540x.m100804k(r6, r7)
            int r13 = p5462h.p5463a.C69505av.m100860b(r13)
            if (r13 >= r11) goto L_0x0247
            r13 = 16
        L_0x0247:
            java.util.LinkedHashMap r14 = new java.util.LinkedHashMap
            r14.<init>(r13)
            java.util.Iterator r6 = r6.iterator()
        L_0x0250:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x0277
            java.lang.Object r13 = r6.next()
            com.google.speech.j.a.ak r13 = (com.google.speech.p5218j.p5219a.C66707ak) r13
            java.lang.String r15 = r13.f181463d
            java.lang.String r9 = "it.name"
            p5462h.p5473f.p5475b.C69664n.m101060f(r15, r9)
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r10)
            int r9 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60040c(r13)
            h.i r9 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60038a(r15, r9)
            java.lang.Object r13 = r9.f186052a
            java.lang.Object r9 = r9.f186053b
            r14.put(r13, r9)
            r9 = 1
            goto L_0x0250
        L_0x0277:
            r2.putAll(r14)
        L_0x027a:
            int r6 = r4.f181469c
            if (r6 != r12) goto L_0x02d7
            java.lang.Object r4 = r4.f181470d
            com.google.speech.j.a.bf r4 = (com.google.speech.p5218j.p5219a.C66729bf) r4
            com.google.speech.j.a.at r4 = r4.f181514b
            if (r4 != 0) goto L_0x0288
            com.google.speech.j.a.at r4 = com.google.speech.p5218j.p5219a.C66716at.f181484b
        L_0x0288:
            com.google.protobuf.dn r4 = r4.f181486a
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            java.lang.String r5 = "contextUpdate.updateFeat…quest.features.featureMap"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r4.size()
            r5.<init>(r6)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x02a4:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x02d2
            java.lang.Object r6 = r4.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r9 = r6.getKey()
            java.lang.String r10 = "it.key"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r10)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r6 = r6.getValue()
            java.lang.String r10 = "it.value"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r10)
            com.google.speech.j.a.aq r6 = (com.google.speech.p5218j.p5219a.C66713aq) r6
            int r6 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60041d(r6)
            h.i r6 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60039b(r9, r6)
            r5.add(r6)
            goto L_0x02a4
        L_0x02d2:
            p5462h.p5463a.C69505av.m100877s(r2, r5)
            goto L_0x01d8
        L_0x02d7:
            r9 = 3
            if (r6 != r9) goto L_0x01d8
            java.lang.Object r4 = r4.f181470d
            com.google.speech.j.a.aa r4 = (com.google.speech.p5218j.p5219a.C66697aa) r4
            com.google.protobuf.cq r4 = r4.f181438a
            java.lang.String r6 = "contextUpdate.clearFeatu…sRequest.featureNamesList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r6)
            int r6 = p5462h.p5463a.C69540x.m100804k(r4, r7)
            int r6 = p5462h.p5463a.C69505av.m100860b(r6)
            if (r6 >= r11) goto L_0x02f0
            goto L_0x02f1
        L_0x02f0:
            r11 = r6
        L_0x02f1:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r11)
            java.util.Iterator r4 = r4.iterator()
        L_0x02fa:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x0315
            java.lang.Object r11 = r4.next()
            java.lang.String r11 = (java.lang.String) r11
            p5462h.p5473f.p5475b.C69664n.m101060f(r11, r10)
            h.i r11 = com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32256a.m60039b(r11, r5)
            java.lang.Object r13 = r11.f186052a
            java.lang.Object r11 = r11.f186053b
            r6.put(r13, r11)
            goto L_0x02fa
        L_0x0315:
            r2.putAll(r6)
            goto L_0x01d8
        L_0x031a:
            java.lang.String r3 = "accessSession"
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r3)
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r0.f86488c
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r3.readLock()
            int r6 = r3.getWriteHoldCount()
            if (r6 != 0) goto L_0x0330
            int r6 = r3.getReadHoldCount()
            goto L_0x0331
        L_0x0330:
            r6 = 0
        L_0x0331:
            r7 = 0
        L_0x0332:
            if (r7 >= r6) goto L_0x033a
            r4.unlock()
            int r7 = r7 + 1
            goto L_0x0332
        L_0x033a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r3.writeLock()
            r3.lock()
            java.util.Queue r0 = r0.f86487b     // Catch:{ all -> 0x0386 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0386 }
        L_0x0347:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0386 }
            if (r7 == 0) goto L_0x0362
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0386 }
            r9 = r7
            com.google.android.libraries.search.assistant.aa.b.a.d r9 = (com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32259d) r9     // Catch:{ all -> 0x0386 }
            com.google.android.libraries.search.assistant.f.a.d.d r9 = r9.f86491a     // Catch:{ all -> 0x0386 }
            com.google.android.libraries.search.assistant.f.a.d.d r10 = r1.mo38179a()     // Catch:{ all -> 0x0386 }
            boolean r9 = p5462h.p5473f.p5475b.C69664n.m101066l(r9, r10)     // Catch:{ all -> 0x0386 }
            if (r9 == 0) goto L_0x0347
            r14 = r7
            goto L_0x0363
        L_0x0362:
            r14 = 0
        L_0x0363:
            com.google.android.libraries.search.assistant.aa.b.a.d r14 = (com.google.android.libraries.search.assistant.p2486aa.p2490b.p2491a.C32259d) r14     // Catch:{ all -> 0x0386 }
            if (r14 != 0) goto L_0x0373
        L_0x0367:
            if (r5 >= r6) goto L_0x036f
            r4.lock()
            int r5 = r5 + 1
            goto L_0x0367
        L_0x036f:
            r3.unlock()
            goto L_0x0383
        L_0x0373:
            java.util.Map r0 = r14.f86497g     // Catch:{ all -> 0x0386 }
            r0.putAll(r2)     // Catch:{ all -> 0x0386 }
        L_0x0378:
            if (r5 >= r6) goto L_0x0380
            r4.lock()
            int r5 = r5 + 1
            goto L_0x0378
        L_0x0380:
            r3.unlock()
        L_0x0383:
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0386:
            r0 = move-exception
        L_0x0387:
            if (r5 >= r6) goto L_0x038f
            r4.lock()
            int r5 = r5 + 1
            goto L_0x0387
        L_0x038f:
            r3.unlock()
            throw r0
        L_0x0393:
            return r0
        L_0x0394:
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ all -> 0x039b }
            r1 = 0
            r3.mo63026c(r1)
            return r0
        L_0x039b:
            r0 = move-exception
            r1 = 0
            goto L_0x03a0
        L_0x039e:
            r0 = move-exception
            r1 = r14
        L_0x03a0:
            r3.mo63026c(r1)
            throw r0
        L_0x03a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a.C32307c.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32307c(this.f86541f, this.f86542g, this.f86543h, gVar);
    }
}
