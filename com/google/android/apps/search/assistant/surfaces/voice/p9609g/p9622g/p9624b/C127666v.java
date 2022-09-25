package com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b;

import com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127471c;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34039bb;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.entrypointcomponent.triggering.impl.MainAssistantTriggeringClientImpl$handleInvocationMessage$1", mo61344c = "MainAssistantTriggeringClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {357, 359, 363, 378, 384, 396, 394, 396, 396})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.g.g.b.v */
/* compiled from: PG */
final class C127666v extends C69572j implements C69626l {

    /* renamed from: a */
    Object f351493a;

    /* renamed from: b */
    int f351494b;

    /* renamed from: c */
    final /* synthetic */ C127643ae f351495c;

    /* renamed from: d */
    final /* synthetic */ C34039bb f351496d;

    /* renamed from: e */
    final /* synthetic */ C127471c f351497e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127666v(C127643ae aeVar, C34039bb bbVar, C127471c cVar, C69577g gVar) {
        super(1, gVar);
        this.f351495c = aeVar;
        this.f351496d = bbVar;
        this.f351497e = cVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C127666v(this.f351495c, this.f351496d, this.f351497e, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        r0 = (java.lang.String) r0;
        r3 = r1.f351495c.f351392m.mo105043a();
        p5462h.p5473f.p5475b.C69664n.m101060f(r3, "localeSettingsAccessor.preferredAssistantLocales");
        r1.f351493a = r0;
        r1.f351494b = 2;
        r3 = kotlinx.coroutines.p5578d.C71663i.m104690c(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (r3 != r2) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ae, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00af, code lost:
        p5462h.p5473f.p5475b.C69664n.m101060f(r3, "localeSettingsAccessor.p…dAssistantLocales.await()");
        r3 = (java.lang.Iterable) r3;
        r10 = new java.util.ArrayList(p5462h.p5463a.C69540x.m100804k(r3, 10));
        r3 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c9, code lost:
        if (r3.hasNext() == false) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
        r10.add(((java.util.Locale) r3.next()).toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d9, code lost:
        r3 = r1.f351495c.f351387h.mo62575n(10, java.util.concurrent.TimeUnit.SECONDS);
        p5462h.p5473f.p5475b.C69664n.m101060f(r3, "entryPointStub\n         …er(10L, TimeUnit.SECONDS)");
        r13 = r1.f351496d;
        r14 = r1.f351495c;
        r15 = r1.f351497e;
        r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127474f) com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g.f350983f.createBuilder();
        p5462h.p5473f.p5475b.C69664n.m101060f(r7, "newBuilder()");
        p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder");
        p5462h.p5473f.p5475b.C69664n.m101061g(r13, "value");
        r7.copyOnWrite();
        r13.getClass();
        ((com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r7.instance).f350986b = r13;
        r8 = p3186j$.time.Duration.ofNanos(r14.f351386g.mo26872d());
        p5462h.p5473f.p5475b.C69664n.m101060f(r8, "ofNanos(clock.elapsedRealtimeNanos())");
        r8 = com.google.protobuf.p4750c.p4751a.C62949a.m95466a(r8);
        p5462h.p5473f.p5475b.C69664n.m101061g(r8, "value");
        r7.copyOnWrite();
        r13 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r7.instance;
        r8.getClass();
        r13.f350988d = r8;
        r13.f350985a |= 1;
        p5462h.p5473f.p5475b.C69664n.m101061g(r15, "value");
        r7.copyOnWrite();
        r15.getClass();
        ((com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r7.instance).f350987c = r15;
        r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127486p) com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127487q.f351002c.createBuilder();
        p5462h.p5473f.p5475b.C69664n.m101060f(r8, "newBuilder()");
        r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder");
        r8.mo108092d(r0);
        r8.mo108091c(r8.mo108090b(), r10);
        r0 = r8.mo108089a();
        p5462h.p5473f.p5475b.C69664n.m101061g(r0, "value");
        r7.copyOnWrite();
        r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r7.instance;
        r0.getClass();
        r8.f350989e = r0;
        r8.f350985a |= 2;
        r0 = r7.build();
        p5462h.p5473f.p5475b.C69664n.m101060f(r0, "_builder.build()");
        r1.f351493a = null;
        r1.f351494b = 3;
        r0 = ((com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127485o) r3).mo108088c((com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r0, new p5488io.grpc.C70334de(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0192, code lost:
        if (r0 == r2) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0194, code lost:
        r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127477i) r0;
        r3 = r1.f351495c.f351389j;
        r7 = r1.f351496d;
        r1.f351493a = r0;
        r1.f351494b = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01a5, code lost:
        if (r3.mo108140h(r7, r1) == r2) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01a7, code lost:
        r3 = (com.google.common.p4526f.C59052c) com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.f351379a.mo56224b();
        r3.mo56379ah(new com.google.common.p4526f.C59094n(37544));
        r3.mo56389s("EntryEvent response: %s", r0);
        r0 = r1.f351495c.f351388i;
        r3 = r1.f351496d;
        r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126875f) com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126876g.f349351b.createBuilder();
        p5462h.p5473f.p5475b.C69664n.m101060f(r7, "newBuilder()");
        p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder");
        r3 = r3.f90720c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01d5, code lost:
        if (r3 != null) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01d7, code lost:
        r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01d9, code lost:
        p5462h.p5473f.p5475b.C69664n.m101060f(r3, "invocationPayload.token");
        p5462h.p5473f.p5475b.C69664n.m101061g(r3, "value");
        r7.copyOnWrite();
        r3.getClass();
        ((com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126876g) r7.instance).f349353a = r3;
        r3 = r7.build();
        p5462h.p5473f.p5475b.C69664n.m101060f(r3, "_builder.build()");
        r1.f351493a = null;
        r1.f351494b = 5;
        r0 = r0.mo107835b((com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126876g) r3, new p5488io.grpc.C70334de(), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0203, code lost:
        if (r0 == r2) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0205, code lost:
        r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126878i) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0207, code lost:
        r0 = r1.f351495c.f351389j;
        r3 = r1.f351496d.f90720c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x020f, code lost:
        if (r3 != null) goto L_0x0213;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0211, code lost:
        r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0213, code lost:
        p5462h.p5473f.p5475b.C69664n.m101060f(r3, "invocationPayload.token");
        r1.f351494b = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x021d, code lost:
        if (r0.mo108139g(r3, r1) != r2) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x021f, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r0 = (com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.f351379a.mo56225c()).mo56382g(r0);
        r4 = r1.f351496d.f90720c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0234, code lost:
        if (r4 == null) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0236, code lost:
        r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0238, code lost:
        p5462h.p5473f.p5475b.C69664n.m101060f(r4, "invocationPayload.token");
        r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r4);
        r0.mo56379ah(new com.google.common.p4526f.C59094n(37545));
        r0.mo56389s("Failed to send an EntryEvent %s", r4);
        r0 = r1.f351495c.f351389j;
        r3 = r1.f351496d.f90720c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0255, code lost:
        if (r3 == null) goto L_0x0257;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0257, code lost:
        r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0259, code lost:
        p5462h.p5473f.p5475b.C69664n.m101060f(r3, "invocationPayload.token");
        r4 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127546j.CANCELLED;
        p5462h.p5473f.p5475b.C69664n.m101061g(r3, "token");
        p5462h.p5473f.p5475b.C69664n.m101061g(r4, "endState");
        r0 = kotlinx.coroutines.p5578d.C71663i.m104692e(r0.f351261b, (kotlinx.coroutines.C71424ay) null, new com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127578k(r0, r3, r4, (p5462h.p5466c.C69577g) null), 3);
        r1.f351493a = null;
        r1.f351494b = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x027c, code lost:
        if (kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r1) == r2) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x027e, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x027f, code lost:
        r0 = r1.f351495c.f351389j;
        r3 = r1.f351496d.f90720c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0287, code lost:
        if (r3 != null) goto L_0x028b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0289, code lost:
        r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x028b, code lost:
        p5462h.p5473f.p5475b.C69664n.m101060f(r3, "invocationPayload.token");
        r1.f351494b = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0296, code lost:
        if (r0.mo108139g(r3, r1) != r2) goto L_0x0299;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0298, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x029b, code lost:
        return p5462h.C69788q.f186170a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x029c, code lost:
        r3 = r1.f351495c.f351389j;
        r4 = r1.f351496d.f90720c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02a4, code lost:
        if (r4 == null) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02a6, code lost:
        r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02a8, code lost:
        p5462h.p5473f.p5475b.C69664n.m101060f(r4, "invocationPayload.token");
        r1.f351493a = r0;
        r1.f351494b = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02b5, code lost:
        if (r3.mo108139g(r4, r1) == r2) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x02b7, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x02b9, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:3:0x0020, B:7:0x002d] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r0 = r1.f351494b
            java.lang.String r4 = "_builder.build()"
            java.lang.String r5 = "builder"
            java.lang.String r6 = "token"
            r7 = 2
            r8 = 1
            java.lang.String r9 = "newBuilder()"
            java.lang.String r11 = "value"
            java.lang.String r12 = "invocationPayload.token"
            switch(r0) {
                case 0: goto L_0x0057;
                case 1: goto L_0x004e;
                case 2: goto L_0x0044;
                case 3: goto L_0x003d;
                case 4: goto L_0x0034;
                case 5: goto L_0x002d;
                case 6: goto L_0x0028;
                case 7: goto L_0x0020;
                case 8: goto L_0x0028;
                default: goto L_0x0017;
            }
        L_0x0017:
            java.lang.Object r0 = r1.f351493a
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            p5462h.C69714l.m101134b(r18)
            goto L_0x02b8
        L_0x0020:
            p5462h.C69714l.m101134b(r18)     // Catch:{ all -> 0x0025 }
            goto L_0x027f
        L_0x0025:
            r0 = move-exception
            goto L_0x029c
        L_0x0028:
            p5462h.C69714l.m101134b(r18)
            goto L_0x0299
        L_0x002d:
            p5462h.C69714l.m101134b(r18)     // Catch:{ all -> 0x0054 }
            r0 = r18
            goto L_0x0205
        L_0x0034:
            java.lang.Object r0 = r1.f351493a
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.i r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127477i) r0
            p5462h.C69714l.m101134b(r18)     // Catch:{ all -> 0x0054 }
            goto L_0x01a7
        L_0x003d:
            p5462h.C69714l.m101134b(r18)     // Catch:{ all -> 0x0054 }
            r0 = r18
            goto L_0x0194
        L_0x0044:
            java.lang.Object r0 = r1.f351493a
            java.lang.String r0 = (java.lang.String) r0
            p5462h.C69714l.m101134b(r18)     // Catch:{ all -> 0x0054 }
            r3 = r18
            goto L_0x00af
        L_0x004e:
            p5462h.C69714l.m101134b(r18)     // Catch:{ all -> 0x0054 }
            r0 = r18
            goto L_0x0095
        L_0x0054:
            r0 = move-exception
            goto L_0x0220
        L_0x0057:
            p5462h.C69714l.m101134b(r18)
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r0 = r1.f351495c     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r0 = r0.f351389j     // Catch:{ all -> 0x0054 }
            com.google.android.libraries.search.assistant.invocation.o.a.bb r13 = r1.f351496d     // Catch:{ all -> 0x0054 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r13 = r13.f90720c     // Catch:{ all -> 0x0054 }
            if (r13 != 0) goto L_0x0066
            com.google.android.libraries.search.assistant.invocation.o.a.bp r13 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x0054 }
        L_0x0066:
            p5462h.p5473f.p5475b.C69664n.m101060f(r13, r12)     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r6)     // Catch:{ all -> 0x0054 }
            com.google.common.f.e r14 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.C127579l.f351260a     // Catch:{ all -> 0x0054 }
            com.google.common.f.x r14 = r14.mo56224b()     // Catch:{ all -> 0x0054 }
            com.google.common.f.c r14 = (com.google.common.p4526f.C59052c) r14     // Catch:{ all -> 0x0054 }
            java.lang.String r15 = "#attemptingInteractionStart: %s, starting recordUntrackedInvocationClosure"
            com.google.frameworks.client.a.a.b r13 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r13)     // Catch:{ all -> 0x0054 }
            com.google.common.f.n r3 = new com.google.common.f.n     // Catch:{ all -> 0x0054 }
            r10 = 37500(0x927c, float:5.2549E-41)
            r3.<init>(r10)     // Catch:{ all -> 0x0054 }
            r14.mo56379ah(r3)     // Catch:{ all -> 0x0054 }
            r14.mo56389s(r15, r13)     // Catch:{ all -> 0x0054 }
            r0.f351265f = r8     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r0 = r1.f351495c     // Catch:{ all -> 0x0054 }
            r1.f351494b = r8     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r0.mo108164g(r1)     // Catch:{ all -> 0x0054 }
            if (r0 != r2) goto L_0x0095
            return r2
        L_0x0095:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r3 = r1.f351495c     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.platform.h.f.b r3 = r3.f351392m     // Catch:{ all -> 0x0054 }
            com.google.common.util.concurrent.cx r3 = r3.mo105043a()     // Catch:{ all -> 0x0054 }
            java.lang.String r10 = "localeSettingsAccessor.preferredAssistantLocales"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r10)     // Catch:{ all -> 0x0054 }
            r1.f351493a = r0     // Catch:{ all -> 0x0054 }
            r1.f351494b = r7     // Catch:{ all -> 0x0054 }
            java.lang.Object r3 = kotlinx.coroutines.p5578d.C71663i.m104690c(r3, r1)     // Catch:{ all -> 0x0054 }
            if (r3 != r2) goto L_0x00af
            return r2
        L_0x00af:
            java.lang.String r10 = "localeSettingsAccessor.p…dAssistantLocales.await()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r10)     // Catch:{ all -> 0x0054 }
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ all -> 0x0054 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0054 }
            r13 = 10
            int r13 = p5462h.p5463a.C69540x.m100804k(r3, r13)     // Catch:{ all -> 0x0054 }
            r10.<init>(r13)     // Catch:{ all -> 0x0054 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0054 }
        L_0x00c5:
            boolean r13 = r3.hasNext()     // Catch:{ all -> 0x0054 }
            if (r13 == 0) goto L_0x00d9
            java.lang.Object r13 = r3.next()     // Catch:{ all -> 0x0054 }
            java.util.Locale r13 = (java.util.Locale) r13     // Catch:{ all -> 0x0054 }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0054 }
            r10.add(r13)     // Catch:{ all -> 0x0054 }
            goto L_0x00c5
        L_0x00d9:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r3 = r1.f351495c     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.o r3 = r3.f351387h     // Catch:{ all -> 0x0054 }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0054 }
            r14 = 10
            io.grpc.i.e r3 = r3.mo62575n(r14, r13)     // Catch:{ all -> 0x0054 }
            java.lang.String r13 = "entryPointStub\n         …er(10L, TimeUnit.SECONDS)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r13)     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.o r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127485o) r3     // Catch:{ all -> 0x0054 }
            com.google.android.libraries.search.assistant.invocation.o.a.bb r13 = r1.f351496d     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r14 = r1.f351495c     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.c r15 = r1.f351497e     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.g r16 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g.f350983f     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bn r16 = r16.createBuilder()     // Catch:{ all -> 0x0054 }
            r7 = r16
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.f r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127474f) r7     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r5)     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r13, r11)     // Catch:{ all -> 0x0054 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.g r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r8     // Catch:{ all -> 0x0054 }
            r13.getClass()     // Catch:{ all -> 0x0054 }
            r8.f350986b = r13     // Catch:{ all -> 0x0054 }
            com.google.android.libraries.f.a r8 = r14.f351386g     // Catch:{ all -> 0x0054 }
            long r13 = r8.mo26872d()     // Catch:{ all -> 0x0054 }
            j$.time.Duration r8 = p3186j$.time.Duration.ofNanos(r13)     // Catch:{ all -> 0x0054 }
            java.lang.String r13 = "ofNanos(clock.elapsedRealtimeNanos())"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r13)     // Catch:{ all -> 0x0054 }
            com.google.protobuf.ar r8 = com.google.protobuf.p4750c.p4751a.C62949a.m95466a(r8)     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r11)     // Catch:{ all -> 0x0054 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bv r13 = r7.instance     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.g r13 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r13     // Catch:{ all -> 0x0054 }
            r8.getClass()     // Catch:{ all -> 0x0054 }
            r13.f350988d = r8     // Catch:{ all -> 0x0054 }
            int r8 = r13.f350985a     // Catch:{ all -> 0x0054 }
            r14 = 1
            r8 = r8 | r14
            r13.f350985a = r8     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r15, r11)     // Catch:{ all -> 0x0054 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.g r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r8     // Catch:{ all -> 0x0054 }
            r15.getClass()     // Catch:{ all -> 0x0054 }
            r8.f350987c = r15     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.q r8 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127487q.f351002c     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.p r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.C127486p) r8     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.s r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")     // Catch:{ all -> 0x0054 }
            r8.mo108092d(r0)     // Catch:{ all -> 0x0054 }
            com.google.protobuf.a.b r0 = r8.mo108090b()     // Catch:{ all -> 0x0054 }
            r8.mo108091c(r0, r10)     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.q r0 = r8.mo108089a()     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r0, r11)     // Catch:{ all -> 0x0054 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.g r8 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r8     // Catch:{ all -> 0x0054 }
            r0.getClass()     // Catch:{ all -> 0x0054 }
            r8.f350989e = r0     // Catch:{ all -> 0x0054 }
            int r0 = r8.f350985a     // Catch:{ all -> 0x0054 }
            r10 = 2
            r0 = r0 | r10
            r8.f350985a = r0     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bv r0 = r7.build()     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r4)     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.g r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127475g) r0     // Catch:{ all -> 0x0054 }
            r7 = 0
            r1.f351493a = r7     // Catch:{ all -> 0x0054 }
            r7 = 3
            r1.f351494b = r7     // Catch:{ all -> 0x0054 }
            io.grpc.de r7 = new io.grpc.de     // Catch:{ all -> 0x0054 }
            r7.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r3.mo108088c(r0, r7, r1)     // Catch:{ all -> 0x0054 }
            if (r0 == r2) goto L_0x021f
        L_0x0194:
            com.google.android.apps.search.assistant.surfaces.voice.f.a.i.i r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9602i.C127477i) r0     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r3 = r1.f351495c     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r3 = r3.f351389j     // Catch:{ all -> 0x0054 }
            com.google.android.libraries.search.assistant.invocation.o.a.bb r7 = r1.f351496d     // Catch:{ all -> 0x0054 }
            r1.f351493a = r0     // Catch:{ all -> 0x0054 }
            r8 = 4
            r1.f351494b = r8     // Catch:{ all -> 0x0054 }
            java.lang.Object r3 = r3.mo108140h(r7, r1)     // Catch:{ all -> 0x0054 }
            if (r3 == r2) goto L_0x021f
        L_0x01a7:
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.f351379a     // Catch:{ all -> 0x0054 }
            com.google.common.f.x r3 = r3.mo56224b()     // Catch:{ all -> 0x0054 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0054 }
            java.lang.String r7 = "EntryEvent response: %s"
            com.google.common.f.n r8 = new com.google.common.f.n     // Catch:{ all -> 0x0054 }
            r10 = 37544(0x92a8, float:5.261E-41)
            r8.<init>(r10)     // Catch:{ all -> 0x0054 }
            r3.mo56379ah(r8)     // Catch:{ all -> 0x0054 }
            r3.mo56389s(r7, r0)     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r0 = r1.f351495c     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.a.a.e r0 = r0.f351388i     // Catch:{ all -> 0x0054 }
            com.google.android.libraries.search.assistant.invocation.o.a.bb r3 = r1.f351496d     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.a.a.g r7 = com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126876g.f349351b     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.a.a.f r7 = (com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126875f) r7     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r5)     // Catch:{ all -> 0x0054 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f90720c     // Catch:{ all -> 0x0054 }
            if (r3 != 0) goto L_0x01d9
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x0054 }
        L_0x01d9:
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r11)     // Catch:{ all -> 0x0054 }
            r7.copyOnWrite()     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bv r5 = r7.instance     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.a.a.g r5 = (com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126876g) r5     // Catch:{ all -> 0x0054 }
            r3.getClass()     // Catch:{ all -> 0x0054 }
            r5.f349353a = r3     // Catch:{ all -> 0x0054 }
            com.google.protobuf.bv r3 = r7.build()     // Catch:{ all -> 0x0054 }
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.a.a.g r3 = (com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126876g) r3     // Catch:{ all -> 0x0054 }
            r4 = 0
            r1.f351493a = r4     // Catch:{ all -> 0x0054 }
            r4 = 5
            r1.f351494b = r4     // Catch:{ all -> 0x0054 }
            io.grpc.de r4 = new io.grpc.de     // Catch:{ all -> 0x0054 }
            r4.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r0.mo107835b(r3, r4, r1)     // Catch:{ all -> 0x0054 }
            if (r0 == r2) goto L_0x021f
        L_0x0205:
            com.google.android.apps.search.assistant.surfaces.voice.a.a.i r0 = (com.google.android.apps.search.assistant.surfaces.voice.p9500a.p9501a.C126878i) r0     // Catch:{ all -> 0x0054 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r0 = r1.f351495c
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r0 = r0.f351389j
            com.google.android.libraries.search.assistant.invocation.o.a.bb r3 = r1.f351496d
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f90720c
            if (r3 != 0) goto L_0x0213
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x0213:
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)
            r4 = 6
            r1.f351494b = r4
            java.lang.Object r0 = r0.mo108139g(r3, r1)
            if (r0 != r2) goto L_0x0299
        L_0x021f:
            return r2
        L_0x0220:
            com.google.common.f.e r3 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127643ae.f351379a     // Catch:{ all -> 0x0025 }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x0025 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0025 }
            com.google.common.f.x r0 = r3.mo56382g(r0)     // Catch:{ all -> 0x0025 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "Failed to send an EntryEvent %s"
            com.google.android.libraries.search.assistant.invocation.o.a.bb r4 = r1.f351496d     // Catch:{ all -> 0x0025 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = r4.f90720c     // Catch:{ all -> 0x0025 }
            if (r4 != 0) goto L_0x0238
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x0025 }
        L_0x0238:
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r12)     // Catch:{ all -> 0x0025 }
            com.google.frameworks.client.a.a.b r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b.m63445a(r4)     // Catch:{ all -> 0x0025 }
            com.google.common.f.n r5 = new com.google.common.f.n     // Catch:{ all -> 0x0025 }
            r7 = 37545(0x92a9, float:5.2612E-41)
            r5.<init>(r7)     // Catch:{ all -> 0x0025 }
            r0.mo56379ah(r5)     // Catch:{ all -> 0x0025 }
            r0.mo56389s(r3, r4)     // Catch:{ all -> 0x0025 }
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r0 = r1.f351495c     // Catch:{ all -> 0x0025 }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r0 = r0.f351389j     // Catch:{ all -> 0x0025 }
            com.google.android.libraries.search.assistant.invocation.o.a.bb r3 = r1.f351496d     // Catch:{ all -> 0x0025 }
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f90720c     // Catch:{ all -> 0x0025 }
            if (r3 != 0) goto L_0x0259
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a     // Catch:{ all -> 0x0025 }
        L_0x0259:
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)     // Catch:{ all -> 0x0025 }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.a.j r4 = com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9612c.p9613a.C127546j.CANCELLED     // Catch:{ all -> 0x0025 }
            p5462h.p5473f.p5475b.C69664n.m101061g(r3, r6)     // Catch:{ all -> 0x0025 }
            java.lang.String r5 = "endState"
            p5462h.p5473f.p5475b.C69664n.m101061g(r4, r5)     // Catch:{ all -> 0x0025 }
            kotlinx.coroutines.aw r5 = r0.f351261b     // Catch:{ all -> 0x0025 }
            com.google.android.apps.search.assistant.surfaces.voice.g.c.k r6 = new com.google.android.apps.search.assistant.surfaces.voice.g.c.k     // Catch:{ all -> 0x0025 }
            r7 = 0
            r6.<init>(r0, r3, r4, r7)     // Catch:{ all -> 0x0025 }
            r3 = 3
            com.google.common.util.concurrent.cx r0 = kotlinx.coroutines.p5578d.C71663i.m104692e(r5, r7, r6, r3)     // Catch:{ all -> 0x0025 }
            r1.f351493a = r7     // Catch:{ all -> 0x0025 }
            r3 = 7
            r1.f351494b = r3     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = kotlinx.coroutines.p5578d.C71663i.m104690c(r0, r1)     // Catch:{ all -> 0x0025 }
            if (r0 != r2) goto L_0x027f
            return r2
        L_0x027f:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r0 = r1.f351495c
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r0 = r0.f351389j
            com.google.android.libraries.search.assistant.invocation.o.a.bb r3 = r1.f351496d
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = r3.f90720c
            if (r3 != 0) goto L_0x028b
            com.google.android.libraries.search.assistant.invocation.o.a.bp r3 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x028b:
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r12)
            r4 = 8
            r1.f351494b = r4
            java.lang.Object r0 = r0.mo108139g(r3, r1)
            if (r0 != r2) goto L_0x0299
            return r2
        L_0x0299:
            h.q r0 = p5462h.C69788q.f186170a
            return r0
        L_0x029c:
            com.google.android.apps.search.assistant.surfaces.voice.g.g.b.ae r3 = r1.f351495c
            com.google.android.apps.search.assistant.surfaces.voice.g.c.l r3 = r3.f351389j
            com.google.android.libraries.search.assistant.invocation.o.a.bb r4 = r1.f351496d
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = r4.f90720c
            if (r4 != 0) goto L_0x02a8
            com.google.android.libraries.search.assistant.invocation.o.a.bp r4 = com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp.f90753a
        L_0x02a8:
            p5462h.p5473f.p5475b.C69664n.m101060f(r4, r12)
            r1.f351493a = r0
            r5 = 9
            r1.f351494b = r5
            java.lang.Object r3 = r3.mo108139g(r4, r1)
            if (r3 != r2) goto L_0x02b8
            return r2
        L_0x02b8:
            goto L_0x02ba
        L_0x02b9:
            throw r0
        L_0x02ba:
            goto L_0x02b9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9609g.p9622g.p9624b.C127666v.mo5193b(java.lang.Object):java.lang.Object");
    }
}
