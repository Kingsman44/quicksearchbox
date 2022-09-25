package com.google.android.libraries.p10923ac.p10925b.p10937f;

import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.ac.b.f.n */
/* compiled from: PG */
public final /* synthetic */ class C147050n implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C147051o f397043a;

    /* renamed from: b */
    public final /* synthetic */ String f397044b;

    public /* synthetic */ C147050n(C147051o oVar, String str) {
        this.f397043a = oVar;
        this.f397044b = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx apply(java.lang.Object r14) {
        /*
            r13 = this;
            com.google.android.libraries.ac.b.f.o r0 = r13.f397043a
            java.lang.String r1 = r13.f397044b
            java.util.List r14 = (java.util.List) r14
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r14 = r14.iterator()
        L_0x000f:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L_0x0036
            java.lang.Object r3 = r14.next()
            com.google.android.libraries.ac.b.j.i r3 = (com.google.android.libraries.p10923ac.p10925b.p10943j.C147112i) r3
            com.google.protos.aw.b.dj r4 = r3.mo123929g()
            boolean r4 = com.google.android.libraries.p10923ac.p10925b.p10945l.C147182p.m240014b(r4)
            if (r4 == 0) goto L_0x000f
            android.accounts.Account r4 = r3.mo123925d()
            com.google.protos.aw.b.p r3 = r3.mo123928f()
            com.google.android.libraries.ac.b.b.b r5 = new com.google.android.libraries.ac.b.b.b
            r5.<init>(r4, r3)
            r2.add(r5)
            goto L_0x000f
        L_0x0036:
            com.google.android.libraries.ac.b.f.j r14 = r0.f397050f
            r3 = 0
            byte[] r1 = android.util.Base64.decode(r1, r3)     // Catch:{ ct -> 0x00f0 }
            com.google.protos.aw.b.cc r4 = com.google.protos.p4895aw.p4902b.C64020cc.f173121b     // Catch:{ ct -> 0x00f0 }
            com.google.protobuf.bv r1 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (byte[]) r1)     // Catch:{ ct -> 0x00f0 }
            com.google.protos.aw.b.cc r1 = (com.google.protos.p4895aw.p4902b.C64020cc) r1     // Catch:{ ct -> 0x00f0 }
            com.google.common.b.gp r4 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ ct -> 0x00f0 }
            com.google.protobuf.cq r1 = r1.f173123a     // Catch:{ ct -> 0x00f0 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ ct -> 0x00f0 }
        L_0x004f:
            boolean r5 = r1.hasNext()     // Catch:{ ct -> 0x00f0 }
            if (r5 == 0) goto L_0x00eb
            java.lang.Object r5 = r1.next()     // Catch:{ ct -> 0x00f0 }
            com.google.protos.aw.b.cb r5 = (com.google.protos.p4895aw.p4902b.C64019cb) r5     // Catch:{ ct -> 0x00f0 }
            java.lang.String r6 = r14.f397036a     // Catch:{ ct -> 0x00f0 }
            java.lang.String r7 = r5.f173116b     // Catch:{ ct -> 0x00f0 }
            boolean r6 = r6.equals(r7)     // Catch:{ ct -> 0x00f0 }
            if (r6 == 0) goto L_0x004f
            com.google.protobuf.z r6 = r5.f173117c     // Catch:{ ct -> 0x00f0 }
            com.google.protos.aw.b.br r7 = com.google.protos.p4895aw.p4902b.C64008br.f173093c     // Catch:{ ct -> 0x00f0 }
            com.google.protobuf.bv r6 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r7, (com.google.protobuf.C63088z) r6)     // Catch:{ ct -> 0x00f0 }
            com.google.protos.aw.b.br r6 = (com.google.protos.p4895aw.p4902b.C64008br) r6     // Catch:{ ct -> 0x00f0 }
            com.google.android.libraries.ac.b.f.e r7 = r14.f397037b     // Catch:{ ct -> 0x00f0 }
            int r8 = r6.f173095a     // Catch:{ ct -> 0x00f0 }
            r9 = 2
            r10 = 1
            if (r8 == 0) goto L_0x0081
            if (r8 == r10) goto L_0x007f
            if (r8 == r9) goto L_0x007d
            r11 = 0
            goto L_0x0082
        L_0x007d:
            r11 = 2
            goto L_0x0082
        L_0x007f:
            r11 = 1
            goto L_0x0082
        L_0x0081:
            r11 = 3
        L_0x0082:
            int r12 = r11 + -1
            if (r11 == 0) goto L_0x00e9
            if (r12 == 0) goto L_0x00c5
            if (r12 == r10) goto L_0x0095
            if (r12 != r9) goto L_0x008f
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ ct -> 0x00f0 }
            goto L_0x00d9
        L_0x008f:
            java.lang.AssertionError r14 = new java.lang.AssertionError     // Catch:{ ct -> 0x00f0 }
            r14.<init>()     // Catch:{ ct -> 0x00f0 }
            throw r14     // Catch:{ ct -> 0x00f0 }
        L_0x0095:
            boolean r8 = com.google.android.libraries.p10923ac.p10948d.p10953b.p10955b.p10963e.C147266a.m240143n()     // Catch:{ ct -> 0x00f0 }
            if (r8 != 0) goto L_0x009e
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ ct -> 0x00f0 }
            goto L_0x00d9
        L_0x009e:
            java.lang.Object r8 = r7.f397019d     // Catch:{ ct -> 0x00f0 }
            monitor-enter(r8)     // Catch:{ ct -> 0x00f0 }
            java.util.Map r9 = r7.f397016a     // Catch:{ all -> 0x00c2 }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ all -> 0x00c2 }
            android.accounts.Account r9 = (android.accounts.Account) r9     // Catch:{ all -> 0x00c2 }
            if (r9 == 0) goto L_0x00b1
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r9)     // Catch:{ all -> 0x00c2 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c2 }
            goto L_0x00d9
        L_0x00b1:
            com.google.common.util.concurrent.cx r9 = r7.mo123841a()     // Catch:{ all -> 0x00c2 }
            monitor-exit(r8)     // Catch:{ all -> 0x00c2 }
            com.google.android.libraries.ac.b.f.a r8 = new com.google.android.libraries.ac.b.f.a     // Catch:{ ct -> 0x00f0 }
            r8.<init>(r7, r6)     // Catch:{ ct -> 0x00f0 }
            java.util.concurrent.Executor r7 = r7.f397018c     // Catch:{ ct -> 0x00f0 }
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r9, r8, r7)     // Catch:{ ct -> 0x00f0 }
            goto L_0x00d9
        L_0x00c2:
            r14 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00c2 }
            throw r14     // Catch:{ ct -> 0x00f0 }
        L_0x00c5:
            android.accounts.Account r7 = new android.accounts.Account     // Catch:{ ct -> 0x00f0 }
            java.lang.String r9 = ""
            if (r8 != r10) goto L_0x00d0
            java.lang.Object r8 = r6.f173096b     // Catch:{ ct -> 0x00f0 }
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ ct -> 0x00f0 }
        L_0x00d0:
            java.lang.String r8 = "com.google"
            r7.<init>(r9, r8)     // Catch:{ ct -> 0x00f0 }
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60856cj.m92900i(r7)     // Catch:{ ct -> 0x00f0 }
        L_0x00d9:
            com.google.android.libraries.ac.b.f.i r8 = new com.google.android.libraries.ac.b.f.i     // Catch:{ ct -> 0x00f0 }
            r8.<init>(r6, r5)     // Catch:{ ct -> 0x00f0 }
            java.util.concurrent.Executor r5 = r14.f397038c     // Catch:{ ct -> 0x00f0 }
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60922j.m93044g(r7, r8, r5)     // Catch:{ ct -> 0x00f0 }
            r4.mo55395g(r5)     // Catch:{ ct -> 0x00f0 }
            goto L_0x004f
        L_0x00e9:
            r14 = 0
            throw r14     // Catch:{ ct -> 0x00f0 }
        L_0x00eb:
            com.google.common.b.gu r14 = r4.mo55394f()     // Catch:{ ct -> 0x00f0 }
            goto L_0x00f9
        L_0x00f0:
            r14 = move-exception
            com.google.common.util.concurrent.cx r14 = com.google.common.util.concurrent.C60856cj.m92899h(r14)
            com.google.common.b.gu r14 = com.google.common.p4522b.C58485gu.m89846n(r14)
        L_0x00f9:
            com.google.common.util.concurrent.cf r1 = com.google.common.util.concurrent.C60856cj.m92892a(r14)
            com.google.android.libraries.ac.b.f.l r3 = new com.google.android.libraries.ac.b.f.l
            r3.<init>(r0, r14, r2)
            com.google.android.libraries.ac.b.b.a.a r14 = r0.f397047c
            com.google.common.util.concurrent.cx r14 = r1.mo57334a(r3, r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p10923ac.p10925b.p10937f.C147050n.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
