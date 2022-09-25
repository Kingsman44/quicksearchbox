package com.google.android.libraries.p1638aw.p1639a.p1640a;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.aw.a.a.e */
/* compiled from: PG */
public final /* synthetic */ class C19586e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C19589h f54515a;

    public /* synthetic */ C19586e(C19589h hVar) {
        this.f54515a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r11 = this;
            com.google.android.libraries.aw.a.a.h r0 = r11.f54515a
            r1 = 0
            android.content.Context r0 = r0.f54519b     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            r2 = 2132017461(0x7f140135, float:1.9673201E38)
            java.io.InputStream r0 = r0.openRawResource(r2)     // Catch:{ IOException -> 0x0025, all -> 0x0022 }
            com.google.protos.ao.c.c r2 = com.google.protos.p4868ao.p4873c.C63658c.f172137b     // Catch:{ IOException -> 0x0020 }
            com.google.protobuf.eb r2 = r2.getParserForType()     // Catch:{ IOException -> 0x0020 }
            java.lang.Object r2 = r2.mo59009h(r0)     // Catch:{ IOException -> 0x0020 }
            com.google.protos.ao.c.c r2 = (com.google.protos.p4868ao.p4873c.C63658c) r2     // Catch:{ IOException -> 0x0020 }
        L_0x001c:
            com.google.common.p4541l.C59337t.m92221a(r0)
            goto L_0x0047
        L_0x0020:
            r2 = move-exception
            goto L_0x0028
        L_0x0022:
            r0 = move-exception
            goto L_0x00c0
        L_0x0025:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x0028:
            com.google.common.f.e r3 = com.google.android.libraries.p1638aw.p1639a.p1640a.C19589h.f54518a     // Catch:{ all -> 0x00bc }
            com.google.common.f.x r3 = r3.mo56225c()     // Catch:{ all -> 0x00bc }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x00bc }
            com.google.common.f.x r2 = r3.mo56382g(r2)     // Catch:{ all -> 0x00bc }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00bc }
            r3 = 54068(0xd334, float:7.5765E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r3)     // Catch:{ all -> 0x00bc }
            com.google.common.f.c r2 = (com.google.common.p4526f.C59052c) r2     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "Error reading config, using defaults."
            r2.mo56386p(r3)     // Catch:{ all -> 0x00bc }
            com.google.protos.ao.c.c r2 = com.google.protos.p4868ao.p4873c.C63658c.f172137b     // Catch:{ all -> 0x00bc }
            goto L_0x001c
        L_0x0047:
            com.google.protobuf.dn r0 = r2.f172139a
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            com.google.android.libraries.aw.a.a.g r2 = new com.google.android.libraries.aw.a.a.g
            int r3 = r0.size()
            r2.<init>(r3)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x005e:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00bb
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r3.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x007e
            r3 = r4
            goto L_0x0084
        L_0x007e:
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = (java.lang.String) r3
        L_0x0084:
            char[] r4 = r4.toCharArray()
            int r5 = r4.length
            r6 = 0
            r7 = r1
        L_0x008b:
            if (r6 >= r5) goto L_0x00b8
            char r8 = r4[r6]
            if (r7 != 0) goto L_0x0093
            r7 = r2
            goto L_0x00a0
        L_0x0093:
            com.google.android.libraries.aw.a.a.g r9 = r7.f54516a
            if (r9 != 0) goto L_0x009e
            com.google.android.libraries.aw.a.a.g r9 = new com.google.android.libraries.aw.a.a.g
            r9.<init>()
            r7.f54516a = r9
        L_0x009e:
            com.google.android.libraries.aw.a.a.g r7 = r7.f54516a
        L_0x00a0:
            java.lang.Character r8 = java.lang.Character.valueOf(r8)
            java.lang.Object r9 = r7.get(r8)
            com.google.android.libraries.aw.a.a.f r9 = (com.google.android.libraries.p1638aw.p1639a.p1640a.C19587f) r9
            if (r9 != 0) goto L_0x00b4
            com.google.android.libraries.aw.a.a.f r9 = new com.google.android.libraries.aw.a.a.f
            r9.<init>()
            r7.put(r8, r9)
        L_0x00b4:
            r7 = r9
            int r6 = r6 + 1
            goto L_0x008b
        L_0x00b8:
            r7.f54517b = r3
            goto L_0x005e
        L_0x00bb:
            return r2
        L_0x00bc:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
        L_0x00c0:
            com.google.common.p4541l.C59337t.m92221a(r1)
            goto L_0x00c5
        L_0x00c4:
            throw r0
        L_0x00c5:
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p1638aw.p1639a.p1640a.C19586e.call():java.lang.Object");
    }
}
