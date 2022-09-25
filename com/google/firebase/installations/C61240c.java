package com.google.firebase.installations;

/* renamed from: com.google.firebase.installations.c */
/* compiled from: PG */
public final /* synthetic */ class C61240c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C61255g f165653a;

    public /* synthetic */ C61240c(C61255g gVar) {
        this.f165653a = gVar;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r13 = this;
            com.google.firebase.installations.g r0 = r13.f165653a
            java.lang.Object r1 = com.google.firebase.installations.C61255g.f165684a
            monitor-enter(r1)
            com.google.firebase.g r2 = r0.f165686b     // Catch:{ all -> 0x01cd }
            r2.mo57770f()     // Catch:{ all -> 0x01cd }
            android.content.Context r2 = r2.f165555c     // Catch:{ all -> 0x01cd }
            com.google.firebase.installations.b r2 = com.google.firebase.installations.C61233b.m93636b(r2)     // Catch:{ all -> 0x01cd }
            com.google.firebase.installations.b.d r3 = r0.f165688d     // Catch:{ all -> 0x01c6 }
            com.google.firebase.installations.b.f r3 = r3.mo57831a()     // Catch:{ all -> 0x01c6 }
            if (r2 == 0) goto L_0x001b
            r2.mo57811a()     // Catch:{ all -> 0x01cd }
        L_0x001b:
            monitor-exit(r1)     // Catch:{ all -> 0x01cd }
            boolean r1 = r3.mo57833j()     // Catch:{ i -> 0x01c1 }
            r2 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0099
            boolean r1 = r3.mo57836m()     // Catch:{ i -> 0x01c1 }
            if (r1 == 0) goto L_0x002b
            goto L_0x0099
        L_0x002b:
            com.google.firebase.installations.p r1 = r0.f165689e     // Catch:{ i -> 0x01c1 }
            boolean r1 = r1.mo57876c(r3)     // Catch:{ i -> 0x01c1 }
            if (r1 == 0) goto L_0x0098
            com.google.firebase.installations.c.e r1 = r0.f165687c     // Catch:{ i -> 0x01c1 }
            java.lang.String r5 = r0.mo57864c()     // Catch:{ i -> 0x01c1 }
            java.lang.String r6 = r3.mo57824e()     // Catch:{ i -> 0x01c1 }
            java.lang.String r7 = r0.mo57866e()     // Catch:{ i -> 0x01c1 }
            java.lang.String r8 = r3.mo57827g()     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.c.j r1 = r1.mo57857c(r5, r6, r7, r8)     // Catch:{ i -> 0x01c1 }
            int r5 = r1.mo57852c()     // Catch:{ i -> 0x01c1 }
            int r6 = r5 + -1
            if (r5 == 0) goto L_0x0097
            if (r6 == 0) goto L_0x0076
            if (r6 == r2) goto L_0x0070
            r1 = 2
            if (r6 != r1) goto L_0x0068
            r0.mo57869h(r4)     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.b.e r2 = r3.mo57822c()     // Catch:{ i -> 0x01c1 }
            r2.mo57817f(r1)     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.b.f r1 = r2.mo57812a()     // Catch:{ i -> 0x01c1 }
            goto L_0x0169
        L_0x0068:
            com.google.firebase.installations.i r1 = new com.google.firebase.installations.i     // Catch:{ i -> 0x01c1 }
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            r1.<init>(r2)     // Catch:{ i -> 0x01c1 }
            throw r1     // Catch:{ i -> 0x01c1 }
        L_0x0070:
            com.google.firebase.installations.b.f r1 = r3.mo57837n()     // Catch:{ i -> 0x01c1 }
            goto L_0x0169
        L_0x0076:
            java.lang.String r2 = r1.mo57851b()     // Catch:{ i -> 0x01c1 }
            long r4 = r1.mo57850a()     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.p r1 = r0.f165689e     // Catch:{ i -> 0x01c1 }
            long r6 = r1.mo57875a()     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.b.e r1 = r3.mo57822c()     // Catch:{ i -> 0x01c1 }
            r1.mo57813b(r2)     // Catch:{ i -> 0x01c1 }
            r1.mo57814c(r4)     // Catch:{ i -> 0x01c1 }
            r1.mo57818g(r6)     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.b.f r1 = r1.mo57812a()     // Catch:{ i -> 0x01c1 }
            goto L_0x0169
        L_0x0097:
            throw r4     // Catch:{ i -> 0x01c1 }
        L_0x0098:
            return
        L_0x0099:
            java.lang.String r1 = r3.mo57824e()     // Catch:{ i -> 0x01c1 }
            r5 = 4
            if (r1 == 0) goto L_0x0101
            java.lang.String r1 = r3.mo57824e()     // Catch:{ i -> 0x01c1 }
            int r1 = r1.length()     // Catch:{ i -> 0x01c1 }
            r6 = 11
            if (r1 != r6) goto L_0x0101
            com.google.firebase.installations.b.c r1 = r0.f165690f     // Catch:{ i -> 0x01c1 }
            android.content.SharedPreferences r6 = r1.f165649b     // Catch:{ i -> 0x01c1 }
            monitor-enter(r6)     // Catch:{ i -> 0x01c1 }
            java.lang.String[] r7 = com.google.firebase.installations.p4616b.C61236c.f165648a     // Catch:{ all -> 0x00fe }
            r8 = 0
        L_0x00b4:
            if (r8 >= r5) goto L_0x00fc
            r9 = r7[r8]     // Catch:{ all -> 0x00fe }
            java.lang.String r10 = r1.f165650c     // Catch:{ all -> 0x00fe }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fe }
            r11.<init>()     // Catch:{ all -> 0x00fe }
            java.lang.String r12 = "|T|"
            r11.append(r12)     // Catch:{ all -> 0x00fe }
            r11.append(r10)     // Catch:{ all -> 0x00fe }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x00fe }
            r11.append(r9)     // Catch:{ all -> 0x00fe }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x00fe }
            android.content.SharedPreferences r10 = r1.f165649b     // Catch:{ all -> 0x00fe }
            java.lang.String r9 = r10.getString(r9, r4)     // Catch:{ all -> 0x00fe }
            if (r9 == 0) goto L_0x00f9
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x00fe }
            if (r10 != 0) goto L_0x00f9
            java.lang.String r1 = "{"
            boolean r1 = r9.startsWith(r1)     // Catch:{ all -> 0x00fe }
            if (r1 == 0) goto L_0x00f6
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00f5 }
            r1.<init>(r9)     // Catch:{ JSONException -> 0x00f5 }
            java.lang.String r7 = "token"
            java.lang.String r9 = r1.getString(r7)     // Catch:{ JSONException -> 0x00f5 }
            goto L_0x00f6
        L_0x00f5:
            r9 = r4
        L_0x00f6:
            monitor-exit(r6)     // Catch:{ all -> 0x00fe }
            r11 = r9
            goto L_0x0102
        L_0x00f9:
            int r8 = r8 + 1
            goto L_0x00b4
        L_0x00fc:
            monitor-exit(r6)     // Catch:{ all -> 0x00fe }
            goto L_0x0101
        L_0x00fe:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00fe }
            throw r1     // Catch:{ i -> 0x01c1 }
        L_0x0101:
            r11 = r4
        L_0x0102:
            com.google.firebase.installations.c.e r6 = r0.f165687c     // Catch:{ i -> 0x01c1 }
            java.lang.String r7 = r0.mo57864c()     // Catch:{ i -> 0x01c1 }
            java.lang.String r8 = r3.mo57824e()     // Catch:{ i -> 0x01c1 }
            java.lang.String r9 = r0.mo57866e()     // Catch:{ i -> 0x01c1 }
            java.lang.String r10 = r0.mo57865d()     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.c.g r1 = r6.mo57856b(r7, r8, r9, r10, r11)     // Catch:{ i -> 0x01c1 }
            int r6 = r1.mo57844e()     // Catch:{ i -> 0x01c1 }
            int r7 = r6 + -1
            if (r6 == 0) goto L_0x01c0
            if (r7 == 0) goto L_0x0131
            if (r7 != r2) goto L_0x0129
            com.google.firebase.installations.b.f r1 = r3.mo57837n()     // Catch:{ i -> 0x01c1 }
            goto L_0x0169
        L_0x0129:
            com.google.firebase.installations.i r1 = new com.google.firebase.installations.i     // Catch:{ i -> 0x01c1 }
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            r1.<init>(r2)     // Catch:{ i -> 0x01c1 }
            throw r1     // Catch:{ i -> 0x01c1 }
        L_0x0131:
            java.lang.String r2 = r1.mo57841b()     // Catch:{ i -> 0x01c1 }
            java.lang.String r4 = r1.mo57842c()     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.p r6 = r0.f165689e     // Catch:{ i -> 0x01c1 }
            long r6 = r6.mo57875a()     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.c.j r8 = r1.mo57840a()     // Catch:{ i -> 0x01c1 }
            java.lang.String r8 = r8.mo57851b()     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.c.j r1 = r1.mo57840a()     // Catch:{ i -> 0x01c1 }
            long r9 = r1.mo57850a()     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.b.e r1 = r3.mo57822c()     // Catch:{ i -> 0x01c1 }
            r1.mo57815d(r2)     // Catch:{ i -> 0x01c1 }
            r1.mo57817f(r5)     // Catch:{ i -> 0x01c1 }
            r1.mo57813b(r8)     // Catch:{ i -> 0x01c1 }
            r1.mo57816e(r4)     // Catch:{ i -> 0x01c1 }
            r1.mo57814c(r9)     // Catch:{ i -> 0x01c1 }
            r1.mo57818g(r6)     // Catch:{ i -> 0x01c1 }
            com.google.firebase.installations.b.f r1 = r1.mo57812a()     // Catch:{ i -> 0x01c1 }
        L_0x0169:
            java.lang.Object r2 = com.google.firebase.installations.C61255g.f165684a
            monitor-enter(r2)
            com.google.firebase.g r4 = r0.f165686b     // Catch:{ all -> 0x01bd }
            r4.mo57770f()     // Catch:{ all -> 0x01bd }
            android.content.Context r4 = r4.f165555c     // Catch:{ all -> 0x01bd }
            com.google.firebase.installations.b r4 = com.google.firebase.installations.C61233b.m93636b(r4)     // Catch:{ all -> 0x01bd }
            com.google.firebase.installations.b.d r5 = r0.f165688d     // Catch:{ all -> 0x01b6 }
            r5.mo57832b(r1)     // Catch:{ all -> 0x01b6 }
            if (r4 == 0) goto L_0x0181
            r4.mo57811a()     // Catch:{ all -> 0x01bd }
        L_0x0181:
            monitor-exit(r2)     // Catch:{ all -> 0x01bd }
            r0.mo57870i(r3, r1)
            boolean r2 = r1.mo57835l()
            if (r2 == 0) goto L_0x0192
            java.lang.String r2 = r1.mo57824e()
            r0.mo57869h(r2)
        L_0x0192:
            boolean r2 = r1.mo57833j()
            if (r2 == 0) goto L_0x01a1
            com.google.firebase.installations.i r1 = new com.google.firebase.installations.i
            r1.<init>()
            r0.mo57867f(r1)
            return
        L_0x01a1:
            boolean r2 = r1.mo57834k()
            if (r2 == 0) goto L_0x01b2
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.mo57867f(r1)
            return
        L_0x01b2:
            r0.mo57868g(r1)
            return
        L_0x01b6:
            r0 = move-exception
            if (r4 == 0) goto L_0x01bc
            r4.mo57811a()     // Catch:{ all -> 0x01bd }
        L_0x01bc:
            throw r0     // Catch:{ all -> 0x01bd }
        L_0x01bd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x01bd }
            throw r0
        L_0x01c0:
            throw r4     // Catch:{ i -> 0x01c1 }
        L_0x01c1:
            r1 = move-exception
            r0.mo57867f(r1)
            return
        L_0x01c6:
            r0 = move-exception
            if (r2 == 0) goto L_0x01cc
            r2.mo57811a()     // Catch:{ all -> 0x01cd }
        L_0x01cc:
            throw r0     // Catch:{ all -> 0x01cd }
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01cd }
            goto L_0x01d1
        L_0x01d0:
            throw r0
        L_0x01d1:
            goto L_0x01d0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C61240c.run():void");
    }
}
