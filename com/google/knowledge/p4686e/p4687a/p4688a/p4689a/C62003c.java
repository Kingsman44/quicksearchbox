package com.google.knowledge.p4686e.p4687a.p4688a.p4689a;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58487gw;
import com.google.knowledge.p4686e.p4687a.p4688a.C62005b;
import p3186j$.util.Optional;

/* renamed from: com.google.knowledge.e.a.a.a.c */
/* compiled from: PG */
public final class C62003c implements C62005b {

    /* renamed from: a */
    private final C58487gw f167553a;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62003c(android.content.Context r7) {
        /*
            r6 = this;
            r6.<init>()
            android.content.res.Resources r7 = r7.getResources()     // Catch:{ IOException -> 0x0056 }
            r0 = 2132017502(0x7f14015e, float:1.9673284E38)
            java.io.InputStream r7 = r7.openRawResource(r0)     // Catch:{ IOException -> 0x0056 }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0036 }
            com.google.knowledge.e.a.d r1 = com.google.knowledge.p4686e.p4687a.C62008d.f167559b     // Catch:{ all -> 0x0036 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r1, (java.io.InputStream) r7, (com.google.protobuf.C62921ba) r0)     // Catch:{ all -> 0x0036 }
            com.google.knowledge.e.a.d r0 = (com.google.knowledge.p4686e.p4687a.C62008d) r0     // Catch:{ all -> 0x0036 }
            com.google.protobuf.cq r0 = r0.f167561a     // Catch:{ all -> 0x0036 }
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)     // Catch:{ all -> 0x0036 }
            com.google.knowledge.e.a.a.a.a r1 = com.google.knowledge.p4686e.p4687a.p4688a.p4689a.C62001a.f167551a     // Catch:{ all -> 0x0036 }
            com.google.knowledge.e.a.a.a.b r2 = com.google.knowledge.p4686e.p4687a.p4688a.p4689a.C62002b.f167552a     // Catch:{ all -> 0x0036 }
            j$.util.stream.Collector r1 = com.google.common.p4522b.C58370cn.m89401a(r1, r2)     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.collect(r1)     // Catch:{ all -> 0x0036 }
            com.google.common.b.gw r0 = (com.google.common.p4522b.C58487gw) r0     // Catch:{ all -> 0x0036 }
            if (r7 == 0) goto L_0x0033
            r7.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0033:
            r6.f167553a = r0
            return
        L_0x0036:
            r0 = move-exception
            if (r7 == 0) goto L_0x0055
            r7.close()     // Catch:{ all -> 0x003d }
            goto L_0x0055
        L_0x003d:
            r7 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x0055 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x0055 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0055 }
            r1[r4] = r7     // Catch:{ Exception -> 0x0055 }
            r2.invoke(r0, r1)     // Catch:{ Exception -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r7 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.knowledge.p4686e.p4687a.p4688a.p4689a.C62003c.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final Optional mo58484a(String str) {
        C58485gu b = this.f167553a.mo55277g(str);
        if (b.isEmpty()) {
            return Optional.empty();
        }
        return Optional.m71637of((String) b.get(0));
    }
}
