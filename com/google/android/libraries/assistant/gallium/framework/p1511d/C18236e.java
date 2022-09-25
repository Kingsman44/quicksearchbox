package com.google.android.libraries.assistant.gallium.framework.p1511d;

import com.google.android.libraries.assistant.gallium.framework.C18200ad;
import com.google.android.libraries.assistant.gallium.framework.C18201ae;
import com.google.android.libraries.assistant.gallium.framework.C18218av;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47815ex;
import com.google.apps.tiktok.tracing.C47816ey;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p5127o.C65651af;
import com.google.protos.p5127o.C65654ai;
import com.google.protos.p5127o.C65655aj;
import com.google.protos.p5127o.C65693s;
import com.google.protos.p5127o.C65694t;
import com.google.protos.p5127o.C65695u;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.gallium.framework.d.e */
/* compiled from: PG */
public final class C18236e implements C18201ae {

    /* renamed from: b */
    private static final C58974d f51793b = C58974d.m91136j();

    /* renamed from: a */
    public final Map f51794a = new ConcurrentHashMap();

    /* renamed from: c */
    private final Executor f51795c;

    /* renamed from: d */
    private final AtomicLong f51796d = new AtomicLong();

    public C18236e(Executor executor) {
        new ConcurrentHashMap();
        new AtomicLong();
        this.f51795c = executor;
    }

    /* renamed from: d */
    private static long m35542d(C65695u uVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C65655aj.f178400d);
        uVar.mo58887l(r0);
        if (uVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C65655aj.f178400d);
            uVar.mo58887l(r02);
            Object l = uVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            return ((C65655aj) obj).f178403b;
        }
        ((C58970a) ((C58970a) f51793b.mo56226d()).mo56372aa(47085)).mo56386p("No tracing token extension could be found in the request side channel.");
        return -1;
    }

    /* renamed from: a */
    public final C60870cx mo23678a(C65651af afVar, C18200ad adVar) {
        C47558bi a;
        try {
            C65693s sVar = afVar.f178392c;
            if (sVar == null) {
                sVar = C65693s.f178486d;
            }
            C65695u uVar = sVar.f178490c;
            if (uVar == null) {
                uVar = C65695u.f178492a;
            }
            long d = m35542d(uVar);
            Map map = this.f51794a;
            Long valueOf = Long.valueOf(d);
            if (!map.containsKey(valueOf)) {
                ((C58970a) ((C58970a) f51793b.mo56226d()).mo56372aa(47086)).mo56386p("Can't find a trace reference, running untraced! This most likely happened due to not using the Java API for sending Gallium requests.");
                C18234c cVar = new C18234c(adVar, afVar);
                return C60856cj.m92905n(C47810es.m84965e(cVar), this.f51795c);
            }
            C47573bx a2 = ((C47816ey) this.f51794a.get(valueOf)).mo51644a();
            try {
                a = C47831fm.m85006a("Calling from Gallium into Java");
                C18235d dVar = new C18235d(adVar, afVar);
                C60870cx n = C60856cj.m92905n(C47810es.m84965e(dVar), this.f51795c);
                a.mo51417a(n);
                a.close();
                C47831fm.m85013h(((C47815ex) a2).f123840a);
                return n;
            } catch (Throwable th) {
                C47831fm.m85013h(((C47815ex) a2).f123840a);
                throw th;
            }
            throw th;
        } catch (C18218av e) {
            return C60856cj.m92899h(e);
        } catch (Exception e2) {
            return C60856cj.m92899h(C18218av.m35481d(e2));
        } catch (Throwable th2) {
            C18232a.m35539a(th, th2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0117  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo23679b(com.google.protos.p5127o.C65651af r8, com.google.android.libraries.assistant.gallium.framework.C18200ad r9) {
        /*
            r7 = this;
            com.google.protos.o.s r0 = r8.f178392c
            if (r0 != 0) goto L_0x0006
            com.google.protos.o.s r0 = com.google.protos.p5127o.C65693s.f178486d
        L_0x0006:
            com.google.protos.o.u r0 = r0.f178490c
            if (r0 != 0) goto L_0x000c
            com.google.protos.o.u r0 = com.google.protos.p5127o.C65695u.f178492a
        L_0x000c:
            long r0 = m35542d(r0)
            java.util.Map r2 = r7.f51794a
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.containsKey(r3)
            r3 = 1
            r4 = -1
            if (r2 != 0) goto L_0x0024
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x009d
            r0 = r4
        L_0x0024:
            com.google.common.f.a.d r2 = f51793b
            com.google.common.f.x r2 = r2.mo56226d()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r6 = 47087(0xb7ef, float:6.5983E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r6)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            java.util.Map r6 = r7.f51794a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r6.containsKey(r0)
            if (r3 == r0) goto L_0x0044
            java.lang.String r0 = "No valid trace token"
            goto L_0x0046
        L_0x0044:
            java.lang.String r0 = "An already used trace token"
        L_0x0046:
            java.lang.String r1 = "%s was found in the request side channel, so as a fallback, we are adding a token by copying the request. Make sure you attach a valid trace token to the request using TracingAdapter.attachTracingExtensions() to avoid the potentially high cost of copying the entire request proto."
            r2.mo56389s(r1, r0)
            com.google.protobuf.bn r0 = r8.toBuilder()
            com.google.protos.o.ae r0 = (com.google.protos.p5127o.C65650ae) r0
            com.google.protos.o.s r1 = r8.f178392c
            if (r1 != 0) goto L_0x0057
            com.google.protos.o.s r1 = com.google.protos.p5127o.C65693s.f178486d
        L_0x0057:
            com.google.protobuf.bn r1 = r1.toBuilder()
            com.google.protos.o.r r1 = (com.google.protos.p5127o.C65692r) r1
            com.google.protos.o.s r8 = r8.f178392c
            if (r8 != 0) goto L_0x0063
            com.google.protos.o.s r8 = com.google.protos.p5127o.C65693s.f178486d
        L_0x0063:
            com.google.protos.o.u r8 = r8.f178490c
            if (r8 != 0) goto L_0x0069
            com.google.protos.o.u r8 = com.google.protos.p5127o.C65695u.f178492a
        L_0x0069:
            com.google.protos.o.u r8 = r7.mo23680c(r8)
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.protos.o.s r2 = (com.google.protos.p5127o.C65693s) r2
            r8.getClass()
            r2.f178490c = r8
            int r8 = r2.f178488a
            r8 = r8 | 2
            r2.f178488a = r8
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.protos.o.af r8 = (com.google.protos.p5127o.C65651af) r8
            com.google.protobuf.bv r1 = r1.build()
            com.google.protos.o.s r1 = (com.google.protos.p5127o.C65693s) r1
            r1.getClass()
            r8.f178392c = r1
            int r1 = r8.f178390a
            r1 = r1 | 2
            r8.f178390a = r1
            com.google.protobuf.bv r8 = r0.build()
            com.google.protos.o.af r8 = (com.google.protos.p5127o.C65651af) r8
        L_0x009d:
            com.google.protos.o.s r0 = r8.f178392c
            if (r0 != 0) goto L_0x00a3
            com.google.protos.o.s r0 = com.google.protos.p5127o.C65693s.f178486d
        L_0x00a3:
            com.google.protos.o.u r0 = r0.f178490c
            if (r0 != 0) goto L_0x00a9
            com.google.protos.o.u r0 = com.google.protos.p5127o.C65695u.f178492a
        L_0x00a9:
            long r0 = m35542d(r0)
            java.util.Map r2 = r7.f51794a
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.containsKey(r6)
            if (r2 != 0) goto L_0x0117
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x0118
            com.google.protos.o.s r0 = r8.f178392c
            if (r0 != 0) goto L_0x00c3
            com.google.protos.o.s r0 = com.google.protos.p5127o.C65693s.f178486d
        L_0x00c3:
            com.google.protos.o.u r0 = r0.f178490c
            if (r0 != 0) goto L_0x00c9
            com.google.protos.o.u r0 = com.google.protos.p5127o.C65695u.f178492a
        L_0x00c9:
            long r0 = m35542d(r0)
            java.lang.String r2 = "Calling from Java into Gallium"
            com.google.apps.tiktok.tracing.bi r2 = com.google.apps.tiktok.tracing.C47831fm.m85006a(r2)     // Catch:{ av -> 0x0108 }
            java.util.Map r3 = r7.f51794a     // Catch:{ all -> 0x00fe }
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00fe }
            com.google.apps.tiktok.tracing.ey r5 = com.google.apps.tiktok.tracing.C47816ey.m84988b()     // Catch:{ all -> 0x00fe }
            r3.put(r4, r5)     // Catch:{ all -> 0x00fe }
            r3 = r9
            com.google.android.libraries.assistant.gallium.framework.t r3 = (com.google.android.libraries.assistant.gallium.framework.C18317t) r3     // Catch:{ all -> 0x00fe }
            java.util.Iterator r3 = r3.f51955a     // Catch:{ all -> 0x00fe }
            com.google.android.libraries.assistant.gallium.framework.t r9 = (com.google.android.libraries.assistant.gallium.framework.C18317t) r9     // Catch:{ all -> 0x00fe }
            com.google.android.libraries.assistant.gallium.framework.ad r9 = r9.f51956b     // Catch:{ all -> 0x00fe }
            com.google.common.util.concurrent.cx r8 = com.google.android.libraries.assistant.gallium.framework.GalliumIpc.m35423i(r3, r8, r9)     // Catch:{ all -> 0x00fe }
            com.google.android.libraries.assistant.gallium.framework.d.b r9 = new com.google.android.libraries.assistant.gallium.framework.d.b     // Catch:{ all -> 0x00fe }
            r9.<init>(r7, r0)     // Catch:{ all -> 0x00fe }
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x00fe }
            r8.mo4106b(r9, r3)     // Catch:{ all -> 0x00fe }
            r2.mo51417a(r8)     // Catch:{ all -> 0x00fe }
            r2.close()     // Catch:{ av -> 0x0108 }
            return r8
        L_0x00fe:
            r8 = move-exception
            r2.close()     // Catch:{ all -> 0x0103 }
            goto L_0x0107
        L_0x0103:
            r9 = move-exception
            com.google.android.libraries.assistant.gallium.framework.p1511d.C18232a.m35539a(r8, r9)     // Catch:{ av -> 0x0108 }
        L_0x0107:
            throw r8     // Catch:{ av -> 0x0108 }
        L_0x0108:
            r8 = move-exception
            java.util.Map r9 = r7.f51794a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.remove(r0)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92899h(r8)
            return r8
        L_0x0117:
            r4 = r0
        L_0x0118:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.Object[] r9 = new java.lang.Object[r3]
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r9[r0] = r1
            java.lang.String r0 = "Trace token %d still invalid, even after replacing it. This should never happen."
            java.lang.String r9 = java.lang.String.format(r0, r9)
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.gallium.framework.p1511d.C18236e.mo23679b(com.google.protos.o.af, com.google.android.libraries.assistant.gallium.framework.ad):com.google.common.util.concurrent.cx");
    }

    /* renamed from: c */
    public final C65695u mo23680c(C65695u uVar) {
        C65694t tVar = (C65694t) uVar.toBuilder();
        C62940bt btVar = C65655aj.f178400d;
        C65654ai aiVar = (C65654ai) C65655aj.f178399c.createBuilder();
        long andIncrement = this.f51796d.getAndIncrement();
        aiVar.copyOnWrite();
        C65655aj ajVar = (C65655aj) aiVar.instance;
        ajVar.f178402a |= 1;
        ajVar.f178403b = andIncrement;
        tVar.mo58885m(btVar, (C65655aj) aiVar.build());
        return (C65695u) tVar.build();
    }
}
