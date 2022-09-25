package com.google.android.apps.search.assistant.platform.p9236j.p9237a;

import android.app.DirectAction;
import android.os.Bundle;
import com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.C122050j;
import com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2628c.C33875b;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33883a;
import com.google.android.libraries.search.assistant.invocation.p2632h.p2633a.C33884b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34037b;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.j.a.l */
/* compiled from: PG */
public final class C121655l implements C121669z {

    /* renamed from: a */
    public static final C59071e f337537a = C59071e.m91331h();

    /* renamed from: b */
    public final C122050j f337538b;

    /* renamed from: c */
    private final C71422aw f337539c;

    /* renamed from: d */
    private final C33875b f337540d;

    public C121655l(C71422aw awVar, C33875b bVar, C122050j jVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        this.f337539c = awVar;
        this.f337540d = bVar;
        this.f337538b = jVar;
    }

    /* renamed from: a */
    public final C60870cx mo105264a(C34053bp bpVar, C34037b bVar) {
        C69664n.m101061g(bpVar, "token");
        C69664n.m101061g(bVar, "clientId");
        return C71663i.m104692e(this.f337539c, (C71424ay) null, new C121573b(this, bpVar, (C69577g) null), 3);
    }

    /* renamed from: b */
    public final C60870cx mo105265b(C33883a aVar) {
        return C71663i.m104692e(this.f337539c, (C71424ay) null, new C121648e(this, aVar, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final C60870cx mo105266c(C33884b bVar) {
        return C71663i.m104692e(this.f337539c, (C71424ay) null, new C121650g(this, bVar, (C69577g) null), 3);
    }

    /* renamed from: d */
    public final C60870cx mo105267d(DirectAction directAction, Bundle bundle) {
        C69664n.m101061g(directAction, "action");
        C69664n.m101061g(bundle, "extras");
        return C71663i.m104692e(this.f337539c, (C71424ay) null, new C121652i(directAction, bundle, this, (C69577g) null), 3);
    }

    /* renamed from: e */
    public final C60870cx mo105268e(String str) {
        C69664n.m101061g(str, "activityId");
        return C71663i.m104692e(this.f337539c, (C71424ay) null, new C121654k(this, str, (C69577g) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b A[Catch:{ fa -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090 A[Catch:{ fa -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105281f(p5488io.grpc.p5526f.C70736b r8, p5462h.p5473f.p5474a.C69630p r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121539a
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.j.a.a r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121539a) r0
            int r1 = r0.f337275e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337275e = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.a.a r0 = new com.google.android.apps.search.assistant.platform.j.a.a
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f337273c
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337275e
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r8 = r0.f337272b
            java.lang.Object r9 = r0.f337271a
            p5462h.C69714l.m101134b(r10)     // Catch:{ fa -> 0x002b }
            goto L_0x0065
        L_0x002b:
            r10 = move-exception
            goto L_0x00a6
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            p5462h.C69714l.m101134b(r10)
            java.util.concurrent.atomic.AtomicReference r10 = new java.util.concurrent.atomic.AtomicReference
            r10.<init>()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            io.grpc.i.u r4 = new io.grpc.i.u
            r4.<init>(r10, r2)
            io.grpc.n[] r5 = new p5488io.grpc.C70899n[r3]     // Catch:{ fa -> 0x00a2 }
            r6 = 0
            r5[r6] = r4     // Catch:{ fa -> 0x00a2 }
            io.grpc.i.e r8 = r8.mo62576o(r5)     // Catch:{ fa -> 0x00a2 }
            java.lang.String r4 = "withInterceptors(interceptor)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r4)     // Catch:{ fa -> 0x00a2 }
            r0.f337271a = r10     // Catch:{ fa -> 0x00a2 }
            r0.f337272b = r2     // Catch:{ fa -> 0x00a2 }
            r0.f337275e = r3     // Catch:{ fa -> 0x00a2 }
            java.lang.Object r8 = r9.mo5192a(r8, r0)     // Catch:{ fa -> 0x00a2 }
            if (r8 == r1) goto L_0x00a1
            r9 = r10
            r10 = r8
            r8 = r2
        L_0x0065:
            com.google.bo.a.a.a.h r0 = new com.google.bo.a.a.a.h     // Catch:{ fa -> 0x002b }
            r0.<init>()     // Catch:{ fa -> 0x002b }
            io.grpc.Status r1 = p5488io.grpc.Status.f186902OK     // Catch:{ fa -> 0x002b }
            r0.mo54325d(r1)     // Catch:{ fa -> 0x002b }
            r0.mo54324c(r10)     // Catch:{ fa -> 0x002b }
            r10 = r9
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10     // Catch:{ fa -> 0x002b }
            java.lang.Object r10 = r10.get()     // Catch:{ fa -> 0x002b }
            if (r10 == 0) goto L_0x0087
            r10 = r9
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10     // Catch:{ fa -> 0x002b }
            java.lang.Object r10 = r10.get()     // Catch:{ fa -> 0x002b }
            io.grpc.de r10 = (p5488io.grpc.C70334de) r10     // Catch:{ fa -> 0x002b }
            r0.mo54323b(r10)     // Catch:{ fa -> 0x002b }
        L_0x0087:
            r10 = r8
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10     // Catch:{ fa -> 0x002b }
            java.lang.Object r10 = r10.get()     // Catch:{ fa -> 0x002b }
            if (r10 == 0) goto L_0x009c
            r10 = r8
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10     // Catch:{ fa -> 0x002b }
            java.lang.Object r10 = r10.get()     // Catch:{ fa -> 0x002b }
            io.grpc.de r10 = (p5488io.grpc.C70334de) r10     // Catch:{ fa -> 0x002b }
            r0.mo54326e(r10)     // Catch:{ fa -> 0x002b }
        L_0x009c:
            com.google.bo.a.a.a.i r8 = r0.mo54322a()     // Catch:{ fa -> 0x002b }
            goto L_0x00d6
        L_0x00a1:
            return r1
        L_0x00a2:
            r8 = move-exception
            r9 = r10
            r10 = r8
            r8 = r2
        L_0x00a6:
            com.google.bo.a.a.a.h r0 = new com.google.bo.a.a.a.h
            r0.<init>()
            io.grpc.Status r10 = r10.f188571a
            r0.mo54325d(r10)
            java.util.concurrent.atomic.AtomicReference r9 = (java.util.concurrent.atomic.AtomicReference) r9
            java.lang.Object r10 = r9.get()
            if (r10 == 0) goto L_0x00c1
            java.lang.Object r9 = r9.get()
            io.grpc.de r9 = (p5488io.grpc.C70334de) r9
            r0.mo54323b(r9)
        L_0x00c1:
            java.util.concurrent.atomic.AtomicReference r8 = (java.util.concurrent.atomic.AtomicReference) r8
            java.lang.Object r9 = r8.get()
            if (r9 == 0) goto L_0x00d2
            java.lang.Object r8 = r8.get()
            io.grpc.de r8 = (p5488io.grpc.C70334de) r8
            r0.mo54326e(r8)
        L_0x00d2:
            com.google.bo.a.a.a.i r8 = r0.mo54322a()
        L_0x00d6:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121655l.mo105281f(io.grpc.f.b, h.f.a.p, h.c.g):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105282g(p5462h.p5466c.C69577g r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121600c
            if (r0 == 0) goto L_0x0013
            r0 = r5
            com.google.android.apps.search.assistant.platform.j.a.c r0 = (com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121600c) r0
            int r1 = r0.f337387c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f337387c = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.j.a.c r0 = new com.google.android.apps.search.assistant.platform.j.a.c
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f337385a
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f337387c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p5462h.C69714l.m101134b(r5)
            goto L_0x003e
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            p5462h.C69714l.m101134b(r5)
            com.google.android.libraries.search.assistant.invocation.f.c.a.c.b r5 = r4.f337540d
            r0.f337387c = r3
            r2 = 0
            java.lang.Object r5 = r5.mo39102a(r2, r0)
            if (r5 != r1) goto L_0x003e
            return r1
        L_0x003e:
            io.grpc.j r5 = (p5488io.grpc.C70888j) r5
            com.google.android.apps.search.assistant.platform.j.a.df r0 = new com.google.android.apps.search.assistant.platform.j.a.df
            io.grpc.i r1 = p5488io.grpc.C70851i.f189015a
            java.lang.String r2 = "DEFAULT"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            r0.<init>(r5, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.p9236j.p9237a.C121655l.mo105282g(h.c.g):java.lang.Object");
    }
}
