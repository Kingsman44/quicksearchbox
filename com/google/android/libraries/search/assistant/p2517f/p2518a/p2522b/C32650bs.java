package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.android.libraries.search.assistant.p2517f.p2532b.p2533a.C32916k;
import com.google.common.p4522b.C58322at;
import com.google.common.p4522b.C58459fv;
import com.google.common.p4522b.C58671nr;
import java.util.Map;
import java.util.Set;
import p3186j$.time.Instant;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.bs */
/* compiled from: PG */
public final class C32650bs implements C32916k {

    /* renamed from: a */
    public final C58671nr f87515a = new C58459fv();

    /* renamed from: b */
    public final C32649br f87516b;

    /* renamed from: c */
    private final C32664cf f87517c;

    public C32650bs(int i, C32664cf cfVar) {
        this.f87517c = cfVar;
        this.f87516b = new C32649br(i, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r6.minus(r3).compareTo(r5) <= 0) goto L_0x0053;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32642bk mo38214a(com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32879y r5, p3186j$.time.Duration r6, p5462h.p5473f.p5474a.C69615a r7) {
        /*
            r4 = this;
            java.lang.String r0 = "request"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r0)
            com.google.android.libraries.search.assistant.f.a.d.be r1 = r5.f88115b
            if (r1 != 0) goto L_0x000b
            com.google.android.libraries.search.assistant.f.a.d.be r1 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be.f87993c
        L_0x000b:
            java.lang.String r2 = "request.fetchContextRequest"
            p5462h.p5473f.p5475b.C69664n.m101060f(r1, r2)
            com.google.android.libraries.search.assistant.f.a.b.br r2 = r4.f87516b
            java.lang.Object r2 = r2.get(r1)
            com.google.android.libraries.search.assistant.f.a.b.bp r2 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32647bp) r2
            if (r2 == 0) goto L_0x005c
            java.lang.Object r3 = r2.f87508a
            com.google.android.libraries.search.assistant.f.a.b.cx r3 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32682cx) r3
            boolean r3 = r3.mo38245d()
            if (r3 != 0) goto L_0x005c
            boolean r3 = r2.f87511d
            if (r3 != 0) goto L_0x0053
            if (r6 == 0) goto L_0x0053
            int r3 = r5.f88114a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0053
            com.google.protobuf.ar r5 = r5.f88117d
            if (r5 != 0) goto L_0x0036
            com.google.protobuf.ar r5 = com.google.protobuf.C62910ar.f169858c
        L_0x0036:
            java.lang.String r3 = "request.maxAge"
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r3)
            j$.time.Duration r5 = com.google.protobuf.p4750c.p4751a.C62949a.m95468c(r5)
            java.lang.String r3 = "maxAge"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r3)
            j$.time.Duration r3 = r2.f87510c
            if (r3 == 0) goto L_0x005c
            j$.time.Duration r3 = r6.minus(r3)
            int r5 = r3.compareTo((p3186j$.time.Duration) r5)
            if (r5 <= 0) goto L_0x0053
            goto L_0x005c
        L_0x0053:
            com.google.android.libraries.search.assistant.f.a.b.bk r5 = new com.google.android.libraries.search.assistant.f.a.b.bk
            java.lang.Object r6 = r2.f87508a
            r7 = 1
            r5.<init>(r6, r7)
            return r5
        L_0x005c:
            java.lang.Object r5 = r7.mo5672a()
            com.google.android.libraries.search.assistant.f.a.b.cy r5 = (com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32683cy) r5
            com.google.android.libraries.search.assistant.f.a.b.bp r7 = new com.google.android.libraries.search.assistant.f.a.b.bp
            java.lang.Object r2 = r5.f87588a
            com.google.android.libraries.search.assistant.f.a.b.cf r3 = r4.f87517c
            p5462h.p5473f.p5475b.C69664n.m101061g(r1, r0)
            java.util.concurrent.ConcurrentMap r0 = r3.f87550a
            com.google.android.libraries.search.assistant.f.a.d.ar r3 = r1.f87996b
            if (r3 != 0) goto L_0x0073
            com.google.android.libraries.search.assistant.f.a.d.ar r3 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
        L_0x0073:
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto L_0x007e
            r0 = 15000(0x3a98, float:2.102E-41)
            goto L_0x0082
        L_0x007e:
            int r0 = r0.intValue()
        L_0x0082:
            boolean r3 = r5.f87589b
            r7.<init>(r2, r0, r6, r3)
            com.google.android.libraries.search.assistant.f.a.b.br r6 = r4.f87516b
            r6.put(r1, r7)
            com.google.common.b.nr r6 = r4.f87515a
            com.google.android.libraries.search.assistant.f.a.d.ar r7 = r1.f87996b
            if (r7 != 0) goto L_0x0094
            com.google.android.libraries.search.assistant.f.a.d.ar r7 = com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar.f87973c
        L_0x0094:
            r6.mo54920x(r7, r1)
            com.google.android.libraries.search.assistant.f.a.b.bk r6 = new com.google.android.libraries.search.assistant.f.a.b.bk
            java.lang.Object r5 = r5.f87588a
            r7 = 0
            r6.<init>(r5, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b.C32650bs.mo38214a(com.google.android.libraries.search.assistant.f.a.d.y, j$.time.Duration, h.f.a.a):com.google.android.libraries.search.assistant.f.a.b.bk");
    }

    /* renamed from: b */
    public final C32648bq mo38215b() {
        Map snapshot = this.f87516b.snapshot();
        C69664n.m101060f(snapshot, "resultCache.snapshot()");
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : snapshot.entrySet()) {
            i += ((C32810be) entry.getKey()).getSerializedSize();
            Integer a = C32651bt.m60534a((C32682cx) ((C32647bp) entry.getValue()).f87508a);
            if (a != null) {
                i += a.intValue();
            } else {
                i2 += ((C32647bp) entry.getValue()).f87509b;
            }
        }
        return new C32648bq(i, i2);
    }

    /* renamed from: c */
    public final void mo38216c() {
        this.f87515a.mo54917u();
        this.f87516b.evictAll();
    }

    /* renamed from: d */
    public final void mo38217d() {
        for (C32647bp bpVar : this.f87516b.snapshot().values()) {
            ((C32682cx) bpVar.f87508a).mo38244c();
        }
        mo38216c();
    }

    /* renamed from: e */
    public final Object mo38184e(String str, Instant instant, C69577g gVar) {
        String str2;
        StringBuilder sb = new StringBuilder();
        String concat = String.valueOf(str).concat("\t");
        sb.append(concat + "Size: " + mo38215b().f87512a);
        sb.append(10);
        sb.append(concat + "EvictionCount: " + this.f87516b.evictionCount());
        sb.append(10);
        sb.append(concat + "HitCount: " + this.f87516b.hitCount());
        sb.append(10);
        sb.append(concat + "MissCount: " + this.f87516b.missCount());
        sb.append(10);
        sb.append(concat + "PutCount: " + this.f87516b.putCount());
        sb.append(10);
        sb.append(String.valueOf(str).concat("ContextKeys:"));
        sb.append(10);
        Set<C32796ar> D = this.f87515a.mo54951D();
        C69664n.m101060f(D, "keyToRequestMap.keySet()");
        for (C32796ar arVar : D) {
            sb.append(concat.concat(String.valueOf(C32602g.m60429b(arVar))));
            sb.append(10);
            Set<C32810be> h = ((C58322at) this.f87515a).mo54986h(arVar);
            C69664n.m101060f(h, "keyToRequestMap.get(contextKey)");
            for (C32810be beVar : h) {
                C32647bp bpVar = (C32647bp) this.f87516b.get(beVar);
                if (bpVar != null) {
                    C32682cx cxVar = (C32682cx) bpVar.f87508a;
                    sb.append(concat + "\t" + cxVar.mo38243b());
                    if (cxVar instanceof C32721ei) {
                        sb.append("\tOwners: " + ((C32721ei) cxVar).f87702c.get());
                    }
                    sb.append("\tIsCachedIndefinitely: " + bpVar.f87511d);
                    if (bpVar.f87510c != null) {
                        long epochMilli = instant.toEpochMilli();
                        long millis = bpVar.f87510c.toMillis();
                        sb.append("\tContext age: " + (epochMilli - millis) + " ms");
                    }
                    Integer a = C32651bt.m60534a((C32682cx) bpVar.f87508a);
                    if (a != null) {
                        str2 = a.intValue() + " bytes";
                    } else {
                        str2 = "UNKNOWN";
                    }
                    sb.append("\tEstimated size: " + bpVar.f87509b + " bytes\tSize: " + str2);
                    sb.append(10);
                }
            }
        }
        return sb.toString();
    }
}
