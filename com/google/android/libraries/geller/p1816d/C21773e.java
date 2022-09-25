package com.google.android.libraries.geller.p1816d;

import com.google.android.apps.search.assistant.libraries.p8946b.p8948b.C119211a;
import com.google.android.libraries.p1730f.C21370a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.geller.d.e */
/* compiled from: PG */
public final class C21773e {

    /* renamed from: a */
    private static final long f60081a = TimeUnit.DAYS.toMillis(7);

    /* renamed from: b */
    private final C21370a f60082b;

    /* renamed from: c */
    private final C119211a f60083c;

    static {
        TimeUnit.DAYS.toMillis(14);
    }

    public C21773e(C119211a aVar, C21370a aVar2) {
        this.f60083c = aVar;
        this.f60082b = aVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r0 != false) goto L_0x0029;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.geller.p1816d.C21772d mo27107a(com.google.protos.p5129p.p5131b.C65753ak r6, com.google.protos.p5129p.p5130a.C65716ao r7, com.google.common.p4522b.C58485gu r8) {
        /*
            r5 = this;
            com.google.android.apps.search.assistant.libraries.b.b.a r0 = r5.f60083c
            com.google.protos.p.b.ak r1 = com.google.protos.p5129p.p5131b.C65753ak.UNKNOWN
            int r1 = r6.ordinal()
            r2 = 38
            if (r1 == r2) goto L_0x0025
            r2 = 45
            if (r1 == r2) goto L_0x0029
            r2 = 47
            if (r1 == r2) goto L_0x0022
            r2 = 89
            if (r1 == r2) goto L_0x001f
            r2 = 114(0x72, float:1.6E-43)
            if (r1 != r2) goto L_0x00b2
            boolean r0 = r0.f332467c
            goto L_0x0027
        L_0x001f:
            boolean r0 = r0.f332468d
            goto L_0x0027
        L_0x0022:
            boolean r0 = r0.f332466b
            goto L_0x0027
        L_0x0025:
            boolean r0 = r0.f332465a
        L_0x0027:
            if (r0 == 0) goto L_0x00b2
        L_0x0029:
            android.content.LocusId r0 = new android.content.LocusId
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            java.lang.String r4 = r6.name()
            r2[r3] = r4
            java.lang.String r3 = "GellerAiAiDataShare_shareData_%s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.<init>(r2)
            com.google.protos.p.a.b r2 = com.google.protos.p5129p.p5130a.C65717b.f178541f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.p.a.a r2 = (com.google.protos.p5129p.p5130a.C65701a) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.protos.p.a.b r3 = (com.google.protos.p5129p.p5130a.C65717b) r3
            int r6 = r6.f178757bE
            r3.f178544b = r6
            int r6 = r3.f178543a
            r6 = r6 | r1
            r3.f178543a = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.protos.p.a.b r6 = (com.google.protos.p5129p.p5130a.C65717b) r6
            r7.getClass()
            r6.f178545c = r7
            int r7 = r6.f178543a
            r7 = r7 | 2
            r6.f178543a = r7
            com.google.android.libraries.f.a r6 = r5.f60082b
            long r6 = r6.mo26870b()
            long r3 = f60081a
            long r6 = r6 + r3
            com.google.protobuf.fg r6 = com.google.protobuf.p4750c.C62953e.m95484i(r6)
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.protos.p.a.b r7 = (com.google.protos.p5129p.p5130a.C65717b) r7
            r6.getClass()
            r7.f178546d = r6
            int r6 = r7.f178543a
            r6 = r6 | 4
            r7.f178543a = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.protos.p.a.b r6 = (com.google.protos.p5129p.p5130a.C65717b) r6
            com.google.protobuf.cq r7 = r6.f178547e
            boolean r1 = r7.mo58948c()
            if (r1 != 0) goto L_0x009c
            com.google.protobuf.cq r7 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r7)
            r6.f178547e = r7
        L_0x009c:
            com.google.protobuf.cq r6 = r6.f178547e
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r8, (java.util.List) r6)
            com.google.protobuf.bv r6 = r2.build()
            android.view.contentcapture.DataShareRequest r7 = new android.view.contentcapture.DataShareRequest
            java.lang.String r8 = "application/x-binary"
            r7.<init>(r0, r8)
            com.google.android.libraries.geller.d.a r8 = new com.google.android.libraries.geller.d.a
            r8.<init>(r7, r6)
            return r8
        L_0x00b2:
            com.google.android.libraries.geller.d.f r6 = new com.google.android.libraries.geller.d.f
            java.lang.String r7 = "Could not share data to AiAi, ACL - corpus is not enabled"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.geller.p1816d.C21773e.mo27107a(com.google.protos.p.b.ak, com.google.protos.p.a.ao, com.google.common.b.gu):com.google.android.libraries.geller.d.d");
    }
}
