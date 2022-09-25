package com.google.android.libraries.gsa.actionusermodel;

import com.google.android.libraries.gsa.actionusermodel.p1830c.C22106i;
import com.google.android.libraries.gsa.actionusermodel.p1830c.C22108k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.actionusermodel.bp */
/* compiled from: PG */
public final class C22086bp implements C22083bm {

    /* renamed from: a */
    public final C60950i f60885a;

    /* renamed from: b */
    private final C22871g f60886b;

    /* renamed from: c */
    private final C42876ab f60887c;

    /* renamed from: d */
    private C22108k f60888d = C22108k.f60936b;

    public C22086bp(C60950i iVar, C22871g gVar, C42876ab abVar) {
        this.f60885a = iVar;
        this.f60886b = gVar;
        this.f60887c = abVar;
    }

    /* renamed from: c */
    public static C58485gu m41330c(C22108k kVar, String str) {
        for (C22106i iVar : kVar.f60938a) {
            if (iVar.f60933b.equals(str)) {
                return C58485gu.m89842j(iVar.f60935d);
            }
        }
        return C58485gu.m89845m();
    }

    /* renamed from: a */
    public final C60870cx mo27345a(String str) {
        synchronized (this) {
            C58485gu c = m41330c(this.f60888d, str);
            if (c.isEmpty()) {
                return this.f60886b.mo28209i(this.f60887c.mo46042d(), "AumSessionManager.getAumResults from PDS", new C22084bn(str));
            }
            C60870cx i = C60856cj.m92900i(c);
            return i;
        }
    }

    /* JADX WARNING: type inference failed for: r7v16, types: [com.google.protobuf.bn] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27346b(java.lang.String r7, com.google.android.libraries.gsa.actionusermodel.p1830c.C22104g r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.libraries.gsa.actionusermodel.c.k r0 = r6.f60888d     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bn r0 = r0.toBuilder()     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.j r0 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22107j) r0     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bv r1 = r0.instance     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.k r1 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22108k) r1     // Catch:{ all -> 0x00fd }
            com.google.protobuf.cq r1 = r1.f60938a     // Catch:{ all -> 0x00fd }
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch:{ all -> 0x00fd }
            j$.util.stream.Stream r1 = p3186j$.util.Collection.EL.stream(r1)     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.bo r2 = new com.google.android.libraries.gsa.actionusermodel.bo     // Catch:{ all -> 0x00fd }
            r2.<init>(r6)     // Catch:{ all -> 0x00fd }
            j$.util.stream.Stream r1 = r1.filter(r2)     // Catch:{ all -> 0x00fd }
            j$.util.stream.Collector r2 = com.google.common.p4522b.C58370cn.f155946a     // Catch:{ all -> 0x00fd }
            java.lang.Object r1 = r1.collect(r2)     // Catch:{ all -> 0x00fd }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00fd }
            r0.copyOnWrite()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.k r2 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22108k) r2     // Catch:{ all -> 0x00fd }
            com.google.protobuf.cq r3 = com.google.android.libraries.gsa.actionusermodel.p1830c.C22108k.emptyProtobufList()     // Catch:{ all -> 0x00fd }
            r2.f60938a = r3     // Catch:{ all -> 0x00fd }
            r0.copyOnWrite()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bv r2 = r0.instance     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.k r2 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22108k) r2     // Catch:{ all -> 0x00fd }
            r2.mo27360a()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.cq r2 = r2.f60938a     // Catch:{ all -> 0x00fd }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r1, (java.util.List) r2)     // Catch:{ all -> 0x00fd }
            r1 = -1
            r2 = 0
        L_0x0046:
            com.google.protobuf.bv r3 = r0.instance     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.k r3 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22108k) r3     // Catch:{ all -> 0x00fd }
            com.google.protobuf.cq r3 = r3.f60938a     // Catch:{ all -> 0x00fd }
            int r3 = r3.size()     // Catch:{ all -> 0x00fd }
            r4 = 1
            if (r2 >= r3) goto L_0x0063
            com.google.android.libraries.gsa.actionusermodel.c.i r3 = r0.mo27359a(r2)     // Catch:{ all -> 0x00fd }
            java.lang.String r3 = r3.f60933b     // Catch:{ all -> 0x00fd }
            boolean r3 = r3.equals(r7)     // Catch:{ all -> 0x00fd }
            if (r4 != r3) goto L_0x0060
            r1 = r2
        L_0x0060:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x0063:
            if (r1 >= 0) goto L_0x007f
            com.google.android.libraries.gsa.actionusermodel.c.i r2 = com.google.android.libraries.gsa.actionusermodel.p1830c.C22106i.f60930e     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.h r2 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22105h) r2     // Catch:{ all -> 0x00fd }
            r2.copyOnWrite()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.i r3 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22106i) r3     // Catch:{ all -> 0x00fd }
            r7.getClass()     // Catch:{ all -> 0x00fd }
            int r5 = r3.f60932a     // Catch:{ all -> 0x00fd }
            r4 = r4 | r5
            r3.f60932a = r4     // Catch:{ all -> 0x00fd }
            r3.f60933b = r7     // Catch:{ all -> 0x00fd }
            goto L_0x008a
        L_0x007f:
            com.google.android.libraries.gsa.actionusermodel.c.i r7 = r0.mo27359a(r1)     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bn r7 = r7.toBuilder()     // Catch:{ all -> 0x00fd }
            r2 = r7
            com.google.android.libraries.gsa.actionusermodel.c.h r2 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22105h) r2     // Catch:{ all -> 0x00fd }
        L_0x008a:
            com.google.common.v.i r7 = r6.f60885a     // Catch:{ all -> 0x00fd }
            j$.time.Instant r7 = r7.mo57444a()     // Catch:{ all -> 0x00fd }
            long r3 = r7.toEpochMilli()     // Catch:{ all -> 0x00fd }
            r2.copyOnWrite()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.i r7 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22106i) r7     // Catch:{ all -> 0x00fd }
            int r5 = r7.f60932a     // Catch:{ all -> 0x00fd }
            r5 = r5 | 2
            r7.f60932a = r5     // Catch:{ all -> 0x00fd }
            r7.f60934c = r3     // Catch:{ all -> 0x00fd }
            r2.copyOnWrite()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bv r7 = r2.instance     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.i r7 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22106i) r7     // Catch:{ all -> 0x00fd }
            r8.getClass()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.cq r3 = r7.f60935d     // Catch:{ all -> 0x00fd }
            boolean r4 = r3.mo58948c()     // Catch:{ all -> 0x00fd }
            if (r4 != 0) goto L_0x00bb
            com.google.protobuf.cq r3 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r3)     // Catch:{ all -> 0x00fd }
            r7.f60935d = r3     // Catch:{ all -> 0x00fd }
        L_0x00bb:
            com.google.protobuf.cq r7 = r7.f60935d     // Catch:{ all -> 0x00fd }
            r7.add(r8)     // Catch:{ all -> 0x00fd }
            if (r1 >= 0) goto L_0x00db
            com.google.protobuf.bv r7 = r2.build()     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.i r7 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22106i) r7     // Catch:{ all -> 0x00fd }
            r0.copyOnWrite()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bv r8 = r0.instance     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.k r8 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22108k) r8     // Catch:{ all -> 0x00fd }
            r7.getClass()     // Catch:{ all -> 0x00fd }
            r8.mo27360a()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.cq r8 = r8.f60938a     // Catch:{ all -> 0x00fd }
            r8.add(r7)     // Catch:{ all -> 0x00fd }
            goto L_0x00f3
        L_0x00db:
            com.google.protobuf.bv r7 = r2.build()     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.i r7 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22106i) r7     // Catch:{ all -> 0x00fd }
            r0.copyOnWrite()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.bv r8 = r0.instance     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.k r8 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22108k) r8     // Catch:{ all -> 0x00fd }
            r7.getClass()     // Catch:{ all -> 0x00fd }
            r8.mo27360a()     // Catch:{ all -> 0x00fd }
            com.google.protobuf.cq r8 = r8.f60938a     // Catch:{ all -> 0x00fd }
            r8.set(r1, r7)     // Catch:{ all -> 0x00fd }
        L_0x00f3:
            com.google.protobuf.bv r7 = r0.build()     // Catch:{ all -> 0x00fd }
            com.google.android.libraries.gsa.actionusermodel.c.k r7 = (com.google.android.libraries.gsa.actionusermodel.p1830c.C22108k) r7     // Catch:{ all -> 0x00fd }
            r6.f60888d = r7     // Catch:{ all -> 0x00fd }
            monitor-exit(r6)     // Catch:{ all -> 0x00fd }
            return
        L_0x00fd:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00fd }
            goto L_0x0101
        L_0x0100:
            throw r7
        L_0x0101:
            goto L_0x0100
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.actionusermodel.C22086bp.mo27346b(java.lang.String, com.google.android.libraries.gsa.actionusermodel.c.g):void");
    }
}
