package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122413be;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122414bf;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122545b;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5573a.C71389v;
import kotlinx.coroutines.p5573a.C71392y;
import kotlinx.coroutines.p5574b.C71506bj;
import kotlinx.coroutines.p5574b.C71552db;
import kotlinx.coroutines.p5574b.C71587n;
import kotlinx.coroutines.p5574b.C71592s;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;
import p5488io.grpc.p5526f.C70748n;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.aj */
/* compiled from: PG */
public final class C122483aj implements C122545b {

    /* renamed from: a */
    private final C122414bf f339563a;

    public C122483aj(C122414bf bfVar) {
        C69664n.m101061g(bfVar, "stub");
        this.f339563a = bfVar;
    }

    /* renamed from: a */
    public final C71587n mo105639a(C122108a aVar, C71587n nVar) {
        C69664n.m101061g(aVar, "contextFetcher");
        C122475ab abVar = new C122475ab(nVar);
        C71389v a = C71392y.m104158a(0, (C71387t) null, 7);
        C122478ae aeVar = new C122478ae(C71592s.m104510d(a));
        C122414bf bfVar = this.f339563a;
        return new C71552db(new C122482ai(C70748n.m103448a(bfVar.f189039a, C122413be.m201883i(), C71506bj.m104338d(abVar, aeVar), bfVar.f189040b, new C70334de()), this, aVar, a, (C69577g) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo105640b(com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9259b.C122108a r8, com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b r9, p5462h.p5466c.C69577g r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a.C122543y
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.y r0 = (com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a.C122543y) r0
            int r1 = r0.f339669d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f339669d = r1
            goto L_0x0018
        L_0x0013:
            com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.y r0 = new com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.y
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f339667b
            h.c.a.a r1 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r2 = r0.f339669d
            java.lang.String r3 = "fetchRequest.requestId"
            java.lang.String r4 = "value"
            java.lang.String r5 = "newBuilder()"
            r6 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r6) goto L_0x0031
            java.lang.Object r9 = r0.f339666a
            p5462h.C69714l.m101134b(r10)     // Catch:{ all -> 0x002f }
            goto L_0x0055
        L_0x002f:
            r8 = move-exception
            goto L_0x0090
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            p5462h.C69714l.m101134b(r10)
            com.google.android.apps.search.assistant.platform.ondevice.a.a.h r10 = r9.f338734d     // Catch:{ all -> 0x002f }
            if (r10 != 0) goto L_0x0042
            com.google.android.apps.search.assistant.platform.ondevice.a.a.h r10 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122099h.f338744c     // Catch:{ all -> 0x002f }
        L_0x0042:
            com.google.common.util.concurrent.cx r8 = r8.mo22397a(r10)     // Catch:{ all -> 0x002f }
            java.lang.String r10 = "contextFetcher.fetch(fetchRequest.request)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r10)     // Catch:{ all -> 0x002f }
            r0.f339666a = r9     // Catch:{ all -> 0x002f }
            r0.f339669d = r6     // Catch:{ all -> 0x002f }
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r8, r0)     // Catch:{ all -> 0x002f }
            if (r10 == r1) goto L_0x008f
        L_0x0055:
            com.google.android.apps.search.assistant.platform.ondevice.a.a.j r10 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122101j) r10     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.ondevice.a.a.d r8 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d.f338736e     // Catch:{ all -> 0x002f }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.ondevice.a.a.c r8 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122094c) r8     // Catch:{ all -> 0x002f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r5)     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.ondevice.a.a.f r8 = p5462h.p5473f.p5475b.C69664n.m101061g(r8, "builder")     // Catch:{ all -> 0x002f }
            r0 = r9
            com.google.android.apps.search.assistant.platform.ondevice.a.a.b r0 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b) r0     // Catch:{ all -> 0x002f }
            java.lang.String r0 = r0.f338732b     // Catch:{ all -> 0x002f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)     // Catch:{ all -> 0x002f }
            r8.mo105533b(r0)     // Catch:{ all -> 0x002f }
            java.lang.String r0 = "response"
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r0)     // Catch:{ all -> 0x002f }
            p5462h.p5473f.p5475b.C69664n.m101061g(r10, r4)     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.ondevice.a.a.c r0 = r8.f338743a     // Catch:{ all -> 0x002f }
            r0.copyOnWrite()     // Catch:{ all -> 0x002f }
            com.google.protobuf.bv r0 = r0.instance     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.ondevice.a.a.d r0 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d) r0     // Catch:{ all -> 0x002f }
            r10.getClass()     // Catch:{ all -> 0x002f }
            r0.f338740c = r10     // Catch:{ all -> 0x002f }
            r10 = 2
            r0.f338739b = r10     // Catch:{ all -> 0x002f }
            com.google.android.apps.search.assistant.platform.ondevice.a.a.d r8 = r8.mo105532a()     // Catch:{ all -> 0x002f }
            return r8
        L_0x008f:
            return r1
        L_0x0090:
            com.google.android.apps.search.assistant.platform.ondevice.a.a.d r10 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d.f338736e
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.apps.search.assistant.platform.ondevice.a.a.c r10 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122094c) r10
            p5462h.p5473f.p5475b.C69664n.m101060f(r10, r5)
            com.google.android.apps.search.assistant.platform.ondevice.a.a.f r10 = p5462h.p5473f.p5475b.C69664n.m101061g(r10, "builder")
            com.google.android.apps.search.assistant.platform.ondevice.a.a.b r9 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122093b) r9
            java.lang.String r9 = r9.f338732b
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r3)
            r10.mo105533b(r9)
            com.google.android.apps.search.assistant.platform.ondevice.a.a.l r9 = com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122103l.f338754c
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.search.assistant.platform.ondevice.a.a.k r9 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122102k) r9
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r5)
            java.lang.String r0 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r0)
            java.lang.String r8 = r8.toString()
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r4)
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.apps.search.assistant.platform.ondevice.a.a.l r0 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122103l) r0
            r8.getClass()
            int r1 = r0.f338756a
            r1 = r1 | r6
            r0.f338756a = r1
            r0.f338757b = r8
            com.google.protobuf.bv r8 = r9.build()
            java.lang.String r9 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)
            com.google.android.apps.search.assistant.platform.ondevice.a.a.l r8 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122103l) r8
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r4)
            com.google.android.apps.search.assistant.platform.ondevice.a.a.c r9 = r10.f338743a
            r9.copyOnWrite()
            com.google.protobuf.bv r9 = r9.instance
            com.google.android.apps.search.assistant.platform.ondevice.a.a.d r9 = (com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a.C122095d) r9
            r8.getClass()
            r9.f338740c = r8
            r8 = 3
            r9.f338739b = r8
            com.google.android.apps.search.assistant.platform.ondevice.a.a.d r8 = r10.mo105532a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a.C122483aj.mo105640b(com.google.android.apps.search.assistant.platform.ondevice.a.b.a, com.google.android.apps.search.assistant.platform.ondevice.a.a.b, h.c.g):java.lang.Object");
    }
}
