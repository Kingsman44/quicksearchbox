package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b;

import com.google.android.apps.gsa.search.shared.service.C87677ae;
import com.google.android.apps.gsa.search.shared.service.C88486g;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.k */
/* compiled from: PG */
public final class C34504k implements C34494a {

    /* renamed from: a */
    public static final Duration f91688a;

    /* renamed from: d */
    private static final Duration f91689d;

    /* renamed from: e */
    private static final ClientConfig f91690e;

    /* renamed from: b */
    public final C21370a f91691b;

    /* renamed from: c */
    public final C60888db f91692c;

    /* renamed from: f */
    private final C87677ae f91693f;

    /* renamed from: g */
    private final C60888db f91694g;

    static {
        Duration ofSeconds = Duration.ofSeconds(10);
        C69664n.m101060f(ofSeconds, "ofSeconds(10)");
        f91688a = ofSeconds;
        Duration ofSeconds2 = Duration.ofSeconds(5);
        C69664n.m101060f(ofSeconds2, "ofSeconds(5)");
        f91689d = ofSeconds2;
        C88486g gVar = new C88486g();
        gVar.f239201c = amo.VOICE_INTERACTION_SERVICE;
        gVar.f239199a = 562954248945792L;
        gVar.f239204f = "search";
        f91690e = new ClientConfig(gVar);
    }

    public C34504k(C87677ae aeVar, C21370a aVar, C60888db dbVar, C60888db dbVar2) {
        C69664n.m101061g(aeVar, "searchServiceClientFactory");
        C69664n.m101061g(aVar, "clock");
        C69664n.m101061g(dbVar, "uiThreadExecutor");
        C69664n.m101061g(dbVar2, "lightweightExecutor");
        this.f91693f = aeVar;
        this.f91691b = aVar;
        this.f91694g = dbVar;
        this.f91692c = dbVar2;
    }

    /* renamed from: b */
    private final Object m63225b(C69615a aVar, C69577g gVar) {
        Object c = C71663i.m104690c(C60856cj.m92903l(C47810es.m84977q(new C34503j(aVar)), this.f91694g), gVar);
        return c == C69554a.COROUTINE_SUSPENDED ? c : C69788q.f186170a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.google.android.apps.gsa.search.shared.service.aa} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e3 A[Catch:{ Exception -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39375a(com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r22, p5462h.p5466c.C69577g r23) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            boolean r2 = r0 instanceof com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b.C34498e
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.e r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b.C34498e) r2
            int r3 = r2.f91679g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f91679g = r3
            goto L_0x001c
        L_0x0017:
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.e r2 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.e
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.f91677e
            h.c.a.a r3 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r4 = r2.f91679g
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x0074
            if (r4 == r8) goto L_0x0061
            if (r4 == r7) goto L_0x004f
            if (r4 == r6) goto L_0x0046
            if (r4 != r5) goto L_0x003e
            java.lang.Object r3 = r2.f91674b
            com.google.android.apps.gsa.search.shared.service.aa r3 = (com.google.android.apps.gsa.search.shared.service.C87673aa) r3
            java.lang.Object r2 = r2.f91673a
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.k r2 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b.C34504k) r2
            p5462h.C69714l.m101134b(r0)
            goto L_0x0100
        L_0x003e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0046:
            java.lang.Object r2 = r2.f91673a
            java.lang.Exception r2 = (java.lang.Exception) r2
            p5462h.C69714l.m101134b(r0)
            goto L_0x0140
        L_0x004f:
            java.lang.Object r4 = r2.f91675c
            java.lang.Object r7 = r2.f91674b
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r7 = (com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData) r7
            java.lang.Object r8 = r2.f91673a
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.k r8 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b.C34504k) r8
            p5462h.C69714l.m101134b(r0)     // Catch:{ Exception -> 0x005e }
            goto L_0x00e8
        L_0x005e:
            r0 = move-exception
            goto L_0x0127
        L_0x0061:
            java.lang.Object r4 = r2.f91676d
            java.lang.Object r8 = r2.f91675c
            java.lang.Object r10 = r2.f91674b
            com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData r10 = (com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData) r10
            java.lang.Object r11 = r2.f91673a
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.k r11 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b.C34504k) r11
            p5462h.C69714l.m101134b(r0)
            r0 = r4
            r4 = r8
            r8 = r11
            goto L_0x00a2
        L_0x0074:
            p5462h.C69714l.m101134b(r0)
            com.google.android.apps.gsa.search.shared.service.ae r0 = r1.f91693f
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = f91690e
            com.google.android.apps.gsa.search.shared.service.aa r0 = r0.mo81958a(r9, r9, r4)
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.d r4 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.d
            r4.<init>(r1)
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.f r10 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.f
            r10.<init>(r0, r4)
            r2.f91673a = r1
            r11 = r22
            r2.f91674b = r11
            r2.f91675c = r0
            r2.f91676d = r4
            r2.f91679g = r8
            java.lang.Object r8 = r1.m63225b(r10, r2)
            if (r8 == r3) goto L_0x0141
            r8 = r1
            r10 = r11
            r20 = r4
            r4 = r0
            r0 = r20
        L_0x00a2:
            r2.f91673a = r8     // Catch:{ Exception -> 0x005e }
            r2.f91674b = r10     // Catch:{ Exception -> 0x005e }
            r2.f91675c = r4     // Catch:{ Exception -> 0x005e }
            r2.f91676d = r9     // Catch:{ Exception -> 0x005e }
            r2.f91679g = r7     // Catch:{ Exception -> 0x005e }
            r7 = r0
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.d r7 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b.C34497d) r7     // Catch:{ Exception -> 0x005e }
            kotlinx.coroutines.z r7 = r7.f91672b     // Catch:{ Exception -> 0x005e }
            j$.time.Duration r11 = f91688a     // Catch:{ Exception -> 0x005e }
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.c r12 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.c     // Catch:{ Exception -> 0x005e }
            r12.<init>(r7)     // Catch:{ Exception -> 0x005e }
            long r13 = r11.toMillis()     // Catch:{ Exception -> 0x005e }
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x005e }
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.d r0 = (com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b.C34497d) r0     // Catch:{ Exception -> 0x005e }
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.k r0 = r0.f91671a     // Catch:{ Exception -> 0x005e }
            com.google.android.libraries.f.a r11 = r0.f91691b     // Catch:{ Exception -> 0x005e }
            r15 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            com.google.common.util.concurrent.db r0 = r0.f91692c     // Catch:{ Exception -> 0x005e }
            r18 = r11
            r19 = r0
            com.google.common.util.concurrent.cx r0 = com.google.common.android.concurrent.C58301z.m89281a(r12, r13, r15, r17, r18, r19)     // Catch:{ Exception -> 0x005e }
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.b r11 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.b     // Catch:{ Exception -> 0x005e }
            r11.<init>(r0)     // Catch:{ Exception -> 0x005e }
            r7.mo62873s(r11)     // Catch:{ Exception -> 0x005e }
            java.lang.Object r0 = r7.mo62825a(r2)     // Catch:{ Exception -> 0x005e }
            h.c.a.a r7 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED     // Catch:{ Exception -> 0x005e }
            if (r0 == r7) goto L_0x00e5
            h.q r0 = p5462h.C69788q.f186170a     // Catch:{ Exception -> 0x005e }
        L_0x00e5:
            if (r0 == r3) goto L_0x0126
            r7 = r10
        L_0x00e8:
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.h r0 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.h
            r6 = r4
            com.google.android.apps.gsa.search.shared.service.aa r6 = (com.google.android.apps.gsa.search.shared.service.C87673aa) r6
            r0.<init>(r7, r6)
            r2.f91673a = r8
            r2.f91674b = r4
            r2.f91675c = r9
            r2.f91679g = r5
            java.lang.Object r0 = r8.m63225b(r0, r2)
            if (r0 == r3) goto L_0x0126
            r3 = r4
            r2 = r8
        L_0x0100:
            h.f.b.ae r0 = new h.f.b.ae
            r0.<init>()
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.i r4 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.i
            com.google.android.apps.gsa.search.shared.service.aa r3 = (com.google.android.apps.gsa.search.shared.service.C87673aa) r3
            r4.<init>(r0, r3)
            j$.time.Duration r3 = f91689d
            long r5 = r3.toMillis()
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.google.android.libraries.f.a r10 = r2.f91691b
            com.google.common.util.concurrent.db r11 = r2.f91694g
            com.google.common.util.concurrent.cx r2 = com.google.common.android.concurrent.C58301z.m89281a(r4, r5, r7, r9, r10, r11)
            r0.f186027a = r2
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x0126:
            return r3
        L_0x0127:
            com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.g r5 = new com.google.android.libraries.search.assistant.invocation.o.i.a.a.b.g
            com.google.android.apps.gsa.search.shared.service.aa r4 = (com.google.android.apps.gsa.search.shared.service.C87673aa) r4
            r5.<init>(r4)
            r2.f91673a = r0
            r2.f91674b = r9
            r2.f91675c = r9
            r2.f91676d = r9
            r2.f91679g = r6
            java.lang.Object r2 = r8.m63225b(r5, r2)
            if (r2 != r3) goto L_0x013f
            return r3
        L_0x013f:
            r2 = r0
        L_0x0140:
            throw r2
        L_0x0141:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2675a.p2677b.C34504k.mo39375a(com.google.android.apps.gsa.shared.speech.HotwordDetectedEventData, h.c.g):java.lang.Object");
    }
}
