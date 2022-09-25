package com.google.android.libraries.lens.view.p2051ab;

import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.lens.view.ab.d */
/* compiled from: PG */
public final class C24971d {

    /* renamed from: a */
    private static final C59071e f68119a = C59071e.m91332i("com.google.android.libraries.lens.view.ab.d");

    /* renamed from: a */
    public static int m46221a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.lens.p4707j.C62471cu m46222b(android.os.Bundle r9) {
        /*
            com.google.lens.j.cu r0 = com.google.lens.p4707j.C62471cu.f168676c
            if (r9 != 0) goto L_0x0005
            return r0
        L_0x0005:
            java.lang.String r1 = "open_filter"
            boolean r2 = r9.containsKey(r1)
            r3 = 0
            r4 = 3
            r5 = 1
            if (r2 == 0) goto L_0x0121
            java.lang.String r1 = r9.getString(r1)
            if (r1 != 0) goto L_0x0018
            goto L_0x014c
        L_0x0018:
            int r2 = r1.hashCode()
            r6 = 5
            r7 = 4
            r8 = 2
            switch(r2) {
                case -1331701063: goto L_0x0055;
                case -985774004: goto L_0x004b;
                case -485149584: goto L_0x0041;
                case -344460952: goto L_0x0037;
                case 3556653: goto L_0x002d;
                case 1052832078: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x005f
        L_0x0023:
            java.lang.String r2 = "translate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005f
            r1 = 1
            goto L_0x0060
        L_0x002d:
            java.lang.String r2 = "text"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005f
            r1 = 2
            goto L_0x0060
        L_0x0037:
            java.lang.String r2 = "shopping"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005f
            r1 = 0
            goto L_0x0060
        L_0x0041:
            java.lang.String r2 = "homework"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005f
            r1 = 4
            goto L_0x0060
        L_0x004b:
            java.lang.String r2 = "places"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005f
            r1 = 3
            goto L_0x0060
        L_0x0055:
            java.lang.String r2 = "dining"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005f
            r1 = 5
            goto L_0x0060
        L_0x005f:
            r1 = -1
        L_0x0060:
            if (r1 == 0) goto L_0x0104
            if (r1 == r5) goto L_0x00e7
            if (r1 == r8) goto L_0x00ca
            if (r1 == r4) goto L_0x00ab
            if (r1 == r7) goto L_0x008c
            if (r1 == r6) goto L_0x006e
            goto L_0x014c
        L_0x006e:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.lens.j.ce r0 = (com.google.lens.p4707j.C62455ce) r0
            com.google.lens.j.cg r1 = com.google.lens.p4707j.C62457cg.f168651c
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.lens.j.cu r2 = (com.google.lens.p4707j.C62471cu) r2
            r1.getClass()
            r2.f168679b = r1
            r2.f168678a = r7
            com.google.protobuf.bv r0 = r0.build()
            com.google.lens.j.cu r0 = (com.google.lens.p4707j.C62471cu) r0
            goto L_0x014c
        L_0x008c:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.lens.j.ce r0 = (com.google.lens.p4707j.C62455ce) r0
            com.google.lens.j.ck r1 = com.google.lens.p4707j.C62461ck.f168659a
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.lens.j.cu r2 = (com.google.lens.p4707j.C62471cu) r2
            r1.getClass()
            r2.f168679b = r1
            r1 = 7
            r2.f168678a = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.lens.j.cu r0 = (com.google.lens.p4707j.C62471cu) r0
            goto L_0x014c
        L_0x00ab:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.lens.j.ce r0 = (com.google.lens.p4707j.C62455ce) r0
            com.google.lens.j.cn r1 = com.google.lens.p4707j.C62464cn.f168661a
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.lens.j.cu r2 = (com.google.lens.p4707j.C62471cu) r2
            r1.getClass()
            r2.f168679b = r1
            r1 = 6
            r2.f168678a = r1
            com.google.protobuf.bv r0 = r0.build()
            com.google.lens.j.cu r0 = (com.google.lens.p4707j.C62471cu) r0
            goto L_0x014c
        L_0x00ca:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.lens.j.ce r0 = (com.google.lens.p4707j.C62455ce) r0
            com.google.lens.j.cr r1 = com.google.lens.p4707j.C62468cr.f168665d
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.lens.j.cu r2 = (com.google.lens.p4707j.C62471cu) r2
            r1.getClass()
            r2.f168679b = r1
            r2.f168678a = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.lens.j.cu r0 = (com.google.lens.p4707j.C62471cu) r0
            goto L_0x014c
        L_0x00e7:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.lens.j.ce r0 = (com.google.lens.p4707j.C62455ce) r0
            com.google.lens.j.ct r1 = com.google.lens.p4707j.C62470ct.f168670e
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.lens.j.cu r2 = (com.google.lens.p4707j.C62471cu) r2
            r1.getClass()
            r2.f168679b = r1
            r2.f168678a = r8
            com.google.protobuf.bv r0 = r0.build()
            com.google.lens.j.cu r0 = (com.google.lens.p4707j.C62471cu) r0
            goto L_0x014c
        L_0x0104:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.lens.j.ce r0 = (com.google.lens.p4707j.C62455ce) r0
            com.google.lens.j.cp r1 = com.google.lens.p4707j.C62466cp.f168663a
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.lens.j.cu r2 = (com.google.lens.p4707j.C62471cu) r2
            r1.getClass()
            r2.f168679b = r1
            r2.f168678a = r6
            com.google.protobuf.bv r0 = r0.build()
            com.google.lens.j.cu r0 = (com.google.lens.p4707j.C62471cu) r0
            goto L_0x014c
        L_0x0121:
            java.lang.String r1 = "lens_initial_parameters"
            boolean r2 = r9.containsKey(r1)
            if (r2 == 0) goto L_0x014c
            byte[] r2 = r9.getByteArray(r1)
            if (r2 == 0) goto L_0x014c
            com.google.protobuf.ba r6 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x013d }
            com.google.lens.j.cu r7 = com.google.lens.p4707j.C62471cu.f168676c     // Catch:{ ct -> 0x013d }
            com.google.protobuf.bv r2 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (byte[]) r2, (com.google.protobuf.C62921ba) r6)     // Catch:{ ct -> 0x013d }
            com.google.lens.j.cu r2 = (com.google.lens.p4707j.C62471cu) r2     // Catch:{ ct -> 0x013d }
            r0 = r2
            goto L_0x014c
        L_0x013d:
            r2 = move-exception
            com.google.common.f.e r6 = f68119a
            com.google.common.f.x r6 = r6.mo56225c()
            java.lang.String r7 = "Failed to parse lens initial parameters from byte array stored with key: '%s'"
            r8 = 49619(0xc1d3, float:6.9531E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r2)).mo56372aa(r8)).mo56389s(r7, r1)
        L_0x014c:
            java.lang.String r1 = "include_return_text_intent"
            boolean r9 = r9.getBoolean(r1, r3)
            if (r9 == 0) goto L_0x018b
            com.google.protobuf.bn r9 = r0.toBuilder()
            com.google.lens.j.ce r9 = (com.google.lens.p4707j.C62455ce) r9
            com.google.lens.j.cr r0 = com.google.lens.p4707j.C62468cr.f168665d
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.lens.j.cq r0 = (com.google.lens.p4707j.C62467cq) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.lens.j.cr r1 = (com.google.lens.p4707j.C62468cr) r1
            int r2 = r1.f168667a
            r2 = r2 | r5
            r1.f168667a = r2
            r1.f168668b = r5
            com.google.protobuf.bv r0 = r0.build()
            com.google.lens.j.cr r0 = (com.google.lens.p4707j.C62468cr) r0
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.lens.j.cu r1 = (com.google.lens.p4707j.C62471cu) r1
            r0.getClass()
            r1.f168679b = r0
            r1.f168678a = r4
            com.google.protobuf.bv r9 = r9.build()
            com.google.lens.j.cu r9 = (com.google.lens.p4707j.C62471cu) r9
            return r9
        L_0x018b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.p2051ab.C24971d.m46222b(android.os.Bundle):com.google.lens.j.cu");
    }
}
