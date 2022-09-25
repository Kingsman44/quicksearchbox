package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c;

import com.google.common.p4526f.C59071e;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.c.d */
/* compiled from: PG */
public final class C33877d implements C33875b {

    /* renamed from: a */
    private static final C59071e f90392a = C59071e.m91331h();

    /* renamed from: b */
    private final C33874a f90393b;

    /* renamed from: c */
    private final Map f90394c;

    public C33877d(C33874a aVar, Map map) {
        C69664n.m101061g(aVar, "processProvider");
        this.f90393b = aVar;
        this.f90394c = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo39102a(boolean r5, p5462h.p5466c.C69577g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c.C33876c
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.c r0 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c.C33876c) r0
            int r1 = r0.f90391e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f90391e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.c r0 = new com.google.android.libraries.search.assistant.invocation.f.c.a.c.c
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f90389c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f90391e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            boolean r5 = r0.f90388b
            java.lang.Object r0 = r0.f90387a
            p5462h.C69714l.m101134b(r6)     // Catch:{ all -> 0x002b }
            goto L_0x0047
        L_0x002b:
            r6 = move-exception
            goto L_0x00a0
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0035:
            p5462h.C69714l.m101134b(r6)
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.a r6 = r4.f90393b     // Catch:{ all -> 0x002b }
            r0.f90387a = r4     // Catch:{ all -> 0x002b }
            r0.f90388b = r5     // Catch:{ all -> 0x002b }
            r0.f90391e = r3     // Catch:{ all -> 0x002b }
            java.lang.Object r6 = r6.mo39101f(r5, r0)     // Catch:{ all -> 0x002b }
            if (r6 == r1) goto L_0x009f
            r0 = r4
        L_0x0047:
            com.google.android.libraries.search.assistant.invocation.f.c.a.a.cj r6 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a.C33824cj) r6     // Catch:{ all -> 0x002b }
            com.google.common.f.e r5 = f90392a
            com.google.common.f.x r1 = r5.mo56224b()
            com.google.common.f.c r1 = (com.google.common.p4526f.C59052c) r1
            com.google.common.f.n r2 = new com.google.common.f.n
            r3 = 51296(0xc860, float:7.1881E-41)
            r2.<init>(r3)
            r1.mo56379ah(r2)
            java.lang.String r2 = "Get Channel for %s"
            r1.mo56389s(r2, r6)
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.d r0 = (com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c.C33877d) r0
            java.util.Map r0 = r0.f90394c
            java.lang.Object r0 = r0.get(r6)
            io.grpc.j r0 = (p5488io.grpc.C70888j) r0
            if (r0 == 0) goto L_0x006e
            return r0
        L_0x006e:
            com.google.common.f.x r5 = r5.mo56226d()
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 51297(0xc861, float:7.1882E-41)
            r0.<init>(r1)
            r5.mo56379ah(r0)
            java.lang.String r0 = "Unknown ProcessLocation (%s) for VoiceInteractionSession"
            r5.mo56389s(r0, r6)
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.f r5 = new com.google.android.libraries.search.assistant.invocation.f.c.a.c.f
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.e r0 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c.C33878e.SESSION_LOCATION_UNKNOWN
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "VIS running in unknown location "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r2.concat(r6)
            r1 = 0
            r5.<init>(r0, r6, r1)
            throw r5
        L_0x009f:
            return r1
        L_0x00a0:
            boolean r0 = r6 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L_0x00a5
            goto L_0x00a9
        L_0x00a5:
            boolean r0 = r6 instanceof java.util.concurrent.TimeoutException
            if (r0 == 0) goto L_0x00bf
        L_0x00a9:
            if (r5 == 0) goto L_0x00b5
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.f r5 = new com.google.android.libraries.search.assistant.invocation.f.c.a.c.f
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.e r0 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c.C33878e.SESSION_START_TIMEOUT
            java.lang.String r1 = "VIS is not starting"
            r5.<init>(r0, r1, r6)
            goto L_0x00be
        L_0x00b5:
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.f r5 = new com.google.android.libraries.search.assistant.invocation.f.c.a.c.f
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.e r0 = com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c.C33878e.NO_SESSION
            java.lang.String r1 = "No running VIS"
            r5.<init>(r0, r1, r6)
        L_0x00be:
            throw r5
        L_0x00bf:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c.C33877d.mo39102a(boolean, h.c.g):java.lang.Object");
    }
}
