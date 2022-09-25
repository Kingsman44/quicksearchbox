package com.google.android.libraries.assistant.pcp.p1570j.p1571a.p1572a;

import com.google.android.libraries.assistant.pcp.datastore.p1547a.p1548a.C18581b;
import com.google.android.libraries.assistant.pcp.p1544c.C18553a;
import com.google.android.libraries.assistant.pcp.p1570j.p1571a.C18795c;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.pcp.j.a.a.k */
/* compiled from: PG */
public final class C18793k implements C18795c {

    /* renamed from: a */
    public final C18553a f52923a;

    /* renamed from: b */
    public final Executor f52924b;

    /* renamed from: c */
    public final C18581b f52925c;

    /* renamed from: d */
    private final C60950i f52926d;

    public C18793k(C18581b bVar, C18553a aVar, C60950i iVar, Executor executor) {
        this.f52925c = bVar;
        this.f52923a = aVar;
        this.f52926d = iVar;
        this.f52924b = executor;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo24133a(com.google.assistant.p3803ag.p3809c.C49019dl r8, java.util.Set r9, p3186j$.util.Optional r10) {
        /*
            r7 = this;
            java.lang.String r0 = r8.f126796c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0009
            goto L_0x0039
        L_0x0009:
            int r0 = r8.f126795b
            if (r0 != 0) goto L_0x0010
            java.lang.String r8 = r8.f126796c
            goto L_0x0039
        L_0x0010:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            com.google.protobuf.cq r1 = r8.f126798e
            java.util.Iterator r1 = r1.iterator()
        L_0x001b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r1.next()
            com.google.assistant.ag.c.gu r2 = (com.google.assistant.p3803ag.p3809c.C49109gu) r2
            int r3 = r2.f127013a
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0037
            com.google.android.libraries.assistant.pcp.m.s r2 = com.google.android.libraries.assistant.pcp.p1583o.C19041r.m36458a(r8, r2)
            boolean r2 = r0.add(r2)
            if (r2 != 0) goto L_0x001b
        L_0x0037:
            java.lang.String r8 = r8.f126796c
        L_0x0039:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "DataElement is ill-formed."
            r8.<init>(r9)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60856cj.m92899h(r8)
            return r8
        L_0x0045:
            com.google.common.v.i r0 = r7.f52926d
            com.google.protobuf.fg r4 = com.google.protobuf.p4750c.C62950b.m95471b(r0)
            com.google.assistant.ag.c.ha r0 = r8.f126797d
            if (r0 != 0) goto L_0x0051
            com.google.assistant.ag.c.ha r0 = com.google.assistant.p3803ag.p3809c.C49116ha.f127027d
        L_0x0051:
            int r0 = r0.f127029a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0059
        L_0x0057:
            r3 = r8
            goto L_0x009e
        L_0x0059:
            java.lang.String r0 = r8.f126796c
            com.google.protobuf.bn r0 = r8.toBuilder()
            com.google.assistant.ag.c.dk r0 = (com.google.assistant.p3803ag.p3809c.C49018dk) r0
            com.google.assistant.ag.c.ha r8 = r8.f126797d
            if (r8 != 0) goto L_0x0067
            com.google.assistant.ag.c.ha r8 = com.google.assistant.p3803ag.p3809c.C49116ha.f127027d
        L_0x0067:
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.assistant.ag.c.gz r8 = (com.google.assistant.p3803ag.p3809c.C49114gz) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r1 = r8.instance
            com.google.assistant.ag.c.ha r1 = (com.google.assistant.p3803ag.p3809c.C49116ha) r1
            r4.getClass()
            r1.f127031c = r4
            int r2 = r1.f127029a
            r2 = r2 | 2
            r1.f127029a = r2
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.ag.c.ha r8 = (com.google.assistant.p3803ag.p3809c.C49116ha) r8
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.assistant.ag.c.dl r1 = (com.google.assistant.p3803ag.p3809c.C49019dl) r1
            r8.getClass()
            r1.f126797d = r8
            int r8 = r1.f126794a
            r8 = r8 | 4
            r1.f126794a = r8
            com.google.protobuf.bv r8 = r0.build()
            com.google.assistant.ag.c.dl r8 = (com.google.assistant.p3803ag.p3809c.C49019dl) r8
            goto L_0x0057
        L_0x009e:
            com.google.android.libraries.assistant.pcp.datastore.a.a.b r8 = r7.f52925c
            int r0 = r3.f126795b
            com.google.android.libraries.assistant.pcp.d.c r1 = new com.google.android.libraries.assistant.pcp.d.c
            r1.<init>(r0)
            java.lang.String r0 = r3.f126796c
            com.google.common.util.concurrent.cx r8 = r8.mo24076a(r1, r0)
            com.google.android.libraries.assistant.pcp.j.a.a.f r0 = new com.google.android.libraries.assistant.pcp.j.a.a.f
            r1 = r0
            r2 = r7
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            java.util.concurrent.Executor r9 = r7.f52924b
            com.google.common.util.concurrent.s r10 = com.google.apps.tiktok.tracing.C47810es.m84966f(r0)
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93045h(r8, r10, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.pcp.p1570j.p1571a.p1572a.C18793k.mo24133a(com.google.assistant.ag.c.dl, java.util.Set, j$.util.Optional):com.google.common.util.concurrent.cx");
    }

    /* renamed from: b */
    public final C60870cx mo24134b() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method NOT yet implemented."));
    }

    /* renamed from: c */
    public final C60870cx mo24135c() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method NOT yet implemented."));
    }

    /* renamed from: d */
    public final C60870cx mo24136d() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method NOT yet implemented."));
    }

    /* renamed from: e */
    public final C60870cx mo24137e() {
        return C60856cj.m92899h(new UnsupportedOperationException("Method NOT yet implemented."));
    }
}
