package com.google.android.libraries.gsa.p1833c.p1834a.p1835a;

import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.libraries.gsa.c.a.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C22162ae implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C22170am f61172a;

    public /* synthetic */ C22162ae(C22170am amVar) {
        this.f61172a = amVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.net.NetworkInfo$State} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v63, resolved type: java.lang.Integer} */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01b0, code lost:
        if (com.google.common.base.C58832aw.m90831a(r3.f61194o.mo27412h(), true) != false) goto L_0x01b2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01de A[Catch:{ all -> 0x02fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0255 A[Catch:{ all -> 0x02f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x028d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02ad A[Catch:{ all -> 0x02f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143 A[SYNTHETIC, Splitter:B:63:0x0143] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r22 = this;
            java.lang.String r1 = "Failed to get active network info"
            r2 = r22
            com.google.android.libraries.gsa.c.a.a.am r3 = r2.f61172a
            android.net.ConnectivityManager r0 = r3.f61186g     // Catch:{ SecurityException -> 0x0335, IllegalArgumentException -> 0x0302 }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0335, IllegalArgumentException -> 0x0302 }
            android.net.ConnectivityManager r5 = r3.f61186g     // Catch:{ SecurityException -> 0x0335, IllegalArgumentException -> 0x0302 }
            android.net.Network r1 = r5.getActiveNetwork()     // Catch:{ SecurityException -> 0x0335, IllegalArgumentException -> 0x0302 }
            if (r0 == 0) goto L_0x0022
            com.google.android.libraries.gsa.c.a.a.x r5 = new com.google.android.libraries.gsa.c.a.a.x
            int r6 = r0.getType()
            int r7 = r0.getSubtype()
            r5.<init>(r6, r7)
            goto L_0x0024
        L_0x0022:
            com.google.android.libraries.gsa.c.a.a.x r5 = com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22199x.f61279a
        L_0x0024:
            if (r0 == 0) goto L_0x002e
            boolean r8 = r0.isConnectedOrConnecting()
            if (r8 == 0) goto L_0x002e
            r10 = 1
            goto L_0x002f
        L_0x002e:
            r10 = 0
        L_0x002f:
            android.net.ConnectivityManager r8 = r3.f61186g
            boolean r8 = r8.isActiveNetworkMetered()
            if (r8 == 0) goto L_0x006d
            int r9 = android.os.Build.VERSION.SDK_INT
            r11 = 30
            if (r9 < r11) goto L_0x006d
            android.net.ConnectivityManager r9 = r3.f61186g
            android.net.Network r11 = r9.getActiveNetwork()
            android.net.NetworkCapabilities r9 = r9.getNetworkCapabilities(r11)
            if (r9 == 0) goto L_0x006d
            r8 = 25
            boolean r8 = r9.hasCapability(r8)
            if (r8 == 0) goto L_0x006b
            com.google.android.apps.gsa.shared.m.c r8 = r3.f61191l
            com.google.android.apps.gsa.shared.m.h r9 = com.google.android.apps.gsa.shared.p7066m.C90073dy.f249771f
            com.google.common.b.gu r8 = r8.mo79749o(r9)
            android.telephony.TelephonyManager r9 = r3.f61187h
            int r9 = r9.getSimCarrierId()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x006b
            r11 = 0
            goto L_0x006e
        L_0x006b:
            r11 = 1
            goto L_0x006e
        L_0x006d:
            r11 = r8
        L_0x006e:
            if (r11 == 0) goto L_0x007a
            if (r0 == 0) goto L_0x007a
            boolean r8 = r0.isRoaming()
            if (r8 == 0) goto L_0x007a
            r12 = 1
            goto L_0x007b
        L_0x007a:
            r12 = 0
        L_0x007b:
            int r13 = r5.f61281c
            int r14 = r5.f61282d
            if (r0 == 0) goto L_0x0084
            r0.getDetailedState()
        L_0x0084:
            com.google.android.apps.gsa.shared.aa.r r8 = new com.google.android.apps.gsa.shared.aa.r
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14)
            android.net.wifi.WifiManager r0 = r3.f61188i
            boolean r9 = r0.isWifiEnabled()
            android.telephony.TelephonyManager r0 = r3.f61187h
            boolean r10 = r0.isDataEnabled()
            android.telephony.TelephonyManager r0 = r3.f61187h
            boolean r11 = r0.isDataRoamingEnabled()
            boolean r12 = r3.mo27394c()
            boolean r0 = r8.mo83040a()
            if (r0 == 0) goto L_0x00a9
            r13 = 0
            r14 = 0
            goto L_0x010c
        L_0x00a9:
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            android.net.ConnectivityManager r0 = r3.f61186g
            android.net.Network[] r15 = r0.getAllNetworks()
            int r7 = r15.length
            r6 = 0
        L_0x00b6:
            if (r6 >= r7) goto L_0x010b
            r4 = r15[r6]
            android.net.ConnectivityManager r0 = r3.f61186g     // Catch:{ NullPointerException -> 0x00c4 }
            android.net.NetworkInfo r0 = r0.getNetworkInfo(r4)     // Catch:{ NullPointerException -> 0x00c4 }
            r17 = r7
            r13 = 0
            goto L_0x00fb
        L_0x00c4:
            r0 = move-exception
            com.google.common.f.e r17 = com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22170am.f61180a
            com.google.common.f.x r13 = r17.mo56225c()
            java.lang.String r2 = "getNetworkInfo() has failed"
            r17 = r7
            r7 = 48533(0xbd95, float:6.8009E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56382g(r0)).mo56372aa(r7)).mo56386p(r2)
            com.google.common.base.ax r0 = r3.f61190k
            boolean r0 = r0.mo56113h()
            if (r0 == 0) goto L_0x00f9
            com.google.common.base.ax r0 = r3.f61190k
            java.lang.Object r0 = r0.mo56107c()
            dagger.a r0 = (dagger.C68214a) r0
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r0 = (com.google.android.apps.gsa.shared.logger.C89911f) r0
            r2 = 73259020(0x45dd80c, float:2.6077629E-36)
            r7 = 29
            r13 = 0
            com.google.android.apps.gsa.shared.logger.e r0 = r0.mo83755a(r13, r2, r7)
            r0.mo83721a()
            goto L_0x00fa
        L_0x00f9:
            r13 = 0
        L_0x00fa:
            r0 = r13
        L_0x00fb:
            if (r0 == 0) goto L_0x0104
            android.net.NetworkInfo$State r0 = r0.getState()
            r14.put(r4, r0)
        L_0x0104:
            int r6 = r6 + 1
            r2 = r22
            r7 = r17
            goto L_0x00b6
        L_0x010b:
            r13 = 0
        L_0x010c:
            boolean r0 = r8.mo83040a()
            if (r0 != 0) goto L_0x0137
            android.telephony.TelephonyManager r0 = r3.f61187h
            boolean r0 = r0.isNetworkRoaming()
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r0)
            android.telephony.TelephonyManager r0 = r3.f61187h
            int r0 = r0.getSimState()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.net.ConnectivityManager r2 = r3.f61186g
            r4 = 0
            android.net.NetworkInfo r2 = r2.getNetworkInfo(r4)
            if (r2 == 0) goto L_0x0131
            r2 = 1
            goto L_0x0132
        L_0x0131:
            r2 = 0
        L_0x0132:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L_0x0139
        L_0x0137:
            r0 = r13
            r2 = r0
        L_0x0139:
            boolean r4 = r3.mo27396f()
            if (r4 != 0) goto L_0x0143
            com.google.android.libraries.gsa.c.a.a.u r0 = com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22196u.f61276a
            goto L_0x0367
        L_0x0143:
            com.google.common.b.hd r4 = com.google.common.p4522b.C58729pv.f156485a     // Catch:{ all -> 0x02fa }
            com.google.android.libraries.gsa.c.a.a.u r6 = r3.f61194o     // Catch:{ all -> 0x02fa }
            com.google.android.libraries.gsa.c.a.a.x r6 = r6.mo27408e()     // Catch:{ all -> 0x02fa }
            boolean r6 = r6.equals(r5)     // Catch:{ all -> 0x02fa }
            r7 = 1
            r6 = r6 ^ r7
            com.google.android.libraries.gsa.c.a.a.u r15 = r3.f61194o     // Catch:{ all -> 0x02fa }
            com.google.android.apps.gsa.shared.aa.r r15 = r15.mo27407c()     // Catch:{ all -> 0x02fa }
            boolean r15 = r15.equals(r8)     // Catch:{ all -> 0x02fa }
            r15 = r15 ^ r7
            if (r12 == 0) goto L_0x0162
            if (r9 != 0) goto L_0x0162
            r7 = 1
            goto L_0x0163
        L_0x0162:
            r7 = 0
        L_0x0163:
            if (r15 != 0) goto L_0x01d7
            if (r9 == 0) goto L_0x0171
            com.google.android.libraries.gsa.c.a.a.u r15 = r3.f61194o     // Catch:{ all -> 0x02fa }
            boolean r15 = r15.mo27418m()     // Catch:{ all -> 0x02fa }
            if (r15 != 0) goto L_0x0171
            goto L_0x01d7
        L_0x0171:
            if (r10 == 0) goto L_0x017c
            com.google.android.libraries.gsa.c.a.a.u r15 = r3.f61194o     // Catch:{ all -> 0x02fa }
            boolean r15 = r15.mo27416k()     // Catch:{ all -> 0x02fa }
            if (r15 != 0) goto L_0x017c
            goto L_0x01d7
        L_0x017c:
            if (r11 == 0) goto L_0x0187
            com.google.android.libraries.gsa.c.a.a.u r15 = r3.f61194o     // Catch:{ all -> 0x02fa }
            boolean r15 = r15.mo27417l()     // Catch:{ all -> 0x02fa }
            if (r15 != 0) goto L_0x0187
            goto L_0x01d7
        L_0x0187:
            if (r12 != 0) goto L_0x0192
            com.google.android.libraries.gsa.c.a.a.u r15 = r3.f61194o     // Catch:{ all -> 0x02fa }
            boolean r15 = r15.mo27415j()     // Catch:{ all -> 0x02fa }
            if (r15 == 0) goto L_0x0192
            goto L_0x01d7
        L_0x0192:
            r16 = r4
            r15 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x02fa }
            boolean r4 = com.google.common.base.C58832aw.m90831a(r13, r4)     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x01b3
            com.google.android.libraries.gsa.c.a.a.u r4 = r3.f61194o     // Catch:{ all -> 0x02fa }
            java.lang.Boolean r4 = r4.mo27412h()     // Catch:{ all -> 0x02fa }
            r17 = r6
            r15 = 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x02fa }
            boolean r4 = com.google.common.base.C58832aw.m90831a(r4, r6)     // Catch:{ all -> 0x02fa }
            if (r4 == 0) goto L_0x01b5
        L_0x01b2:
            goto L_0x01db
        L_0x01b3:
            r17 = r6
        L_0x01b5:
            r4 = 5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x02fa }
            boolean r6 = com.google.common.base.C58832aw.m90831a(r0, r6)     // Catch:{ all -> 0x02fa }
            if (r6 == 0) goto L_0x01d5
            com.google.android.libraries.gsa.c.a.a.u r6 = r3.f61194o     // Catch:{ all -> 0x02fa }
            java.lang.Integer r6 = r6.mo27414i()     // Catch:{ all -> 0x02fa }
            if (r6 == 0) goto L_0x01d5
            com.google.android.libraries.gsa.c.a.a.u r6 = r3.f61194o     // Catch:{ all -> 0x02fa }
            java.lang.Integer r6 = r6.mo27414i()     // Catch:{ all -> 0x02fa }
            int r6 = r6.intValue()     // Catch:{ all -> 0x02fa }
            if (r6 == r4) goto L_0x01d5
            goto L_0x01b2
        L_0x01d5:
            r4 = 0
            goto L_0x01dc
        L_0x01d7:
            r16 = r4
            r17 = r6
        L_0x01db:
            r4 = 1
        L_0x01dc:
            if (r14 == 0) goto L_0x0255
            com.google.common.b.gz r6 = new com.google.common.b.gz     // Catch:{ all -> 0x02fa }
            r15 = 4
            r6.<init>(r15)     // Catch:{ all -> 0x02fa }
            java.util.Set r14 = r14.entrySet()     // Catch:{ all -> 0x02fa }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x02fa }
        L_0x01ec:
            boolean r16 = r14.hasNext()     // Catch:{ all -> 0x02fa }
            if (r16 == 0) goto L_0x0249
            java.lang.Object r16 = r14.next()     // Catch:{ all -> 0x02fa }
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16     // Catch:{ all -> 0x02fa }
            java.lang.Object r18 = r16.getKey()     // Catch:{ all -> 0x02fa }
            r15 = r18
            android.net.Network r15 = (android.net.Network) r15     // Catch:{ all -> 0x02fa }
            r18 = r4
            com.google.android.libraries.gsa.c.a.a.u r4 = r3.f61194o     // Catch:{ all -> 0x02fa }
            com.google.common.b.hd r4 = r4.mo27410f()     // Catch:{ all -> 0x02fa }
            java.lang.Object r4 = r4.get(r15)     // Catch:{ all -> 0x02fa }
            android.net.NetworkInfo$State r4 = (android.net.NetworkInfo.State) r4     // Catch:{ all -> 0x02fa }
            java.lang.Object r16 = r16.getValue()     // Catch:{ all -> 0x02fa }
            r20 = r14
            r14 = r16
            android.net.NetworkInfo$State r14 = (android.net.NetworkInfo.State) r14     // Catch:{ all -> 0x02fa }
            if (r4 != 0) goto L_0x0220
            r21 = r3
            r19 = r7
        L_0x021e:
            r4 = 1
            goto L_0x023e
        L_0x0220:
            android.net.NetworkInfo$State[] r16 = com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22170am.f61181b     // Catch:{ all -> 0x02fa }
            r21 = r3
            r19 = r7
            r3 = 0
        L_0x0227:
            r7 = 4
            if (r3 >= r7) goto L_0x0236
            r7 = r16[r3]     // Catch:{ all -> 0x02f6 }
            if (r7 == r4) goto L_0x0234
            if (r7 != r14) goto L_0x0231
            goto L_0x0234
        L_0x0231:
            int r3 = r3 + 1
            goto L_0x0227
        L_0x0234:
            r14 = r7
            goto L_0x0239
        L_0x0236:
            android.net.NetworkInfo$State r3 = android.net.NetworkInfo.State.UNKNOWN     // Catch:{ all -> 0x02f6 }
            r14 = r3
        L_0x0239:
            if (r14 == r4) goto L_0x023c
            goto L_0x021e
        L_0x023c:
            r4 = r18
        L_0x023e:
            r6.mo55429h(r15, r14)     // Catch:{ all -> 0x02f6 }
            r7 = r19
            r14 = r20
            r3 = r21
            r15 = 4
            goto L_0x01ec
        L_0x0249:
            r21 = r3
            r18 = r4
            r19 = r7
            r3 = 0
            com.google.common.b.hd r4 = r6.mo55427f(r3)     // Catch:{ all -> 0x02f6 }
            goto L_0x025d
        L_0x0255:
            r21 = r3
            r19 = r7
            r18 = r4
            r4 = r16
        L_0x025d:
            com.google.android.libraries.gsa.c.a.a.t r3 = com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22196u.m41513n(r8)     // Catch:{ all -> 0x02f6 }
            r6 = r3
            com.google.android.libraries.gsa.c.a.a.a r6 = (com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22157a) r6     // Catch:{ all -> 0x02f6 }
            r6.f61136b = r5     // Catch:{ all -> 0x02f6 }
            r6 = r3
            com.google.android.libraries.gsa.c.a.a.a r6 = (com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22157a) r6     // Catch:{ all -> 0x02f6 }
            r6.f61137c = r1     // Catch:{ all -> 0x02f6 }
            r3.mo27375f(r9)     // Catch:{ all -> 0x02f6 }
            r3.mo27372c(r10)     // Catch:{ all -> 0x02f6 }
            r3.mo27373d(r11)     // Catch:{ all -> 0x02f6 }
            r3.mo27371b(r12)     // Catch:{ all -> 0x02f6 }
            r1 = r3
            com.google.android.libraries.gsa.c.a.a.a r1 = (com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22157a) r1     // Catch:{ all -> 0x02f6 }
            r1.f61138d = r13     // Catch:{ all -> 0x02f6 }
            r1 = r3
            com.google.android.libraries.gsa.c.a.a.a r1 = (com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22157a) r1     // Catch:{ all -> 0x02f6 }
            r1.f61139e = r0     // Catch:{ all -> 0x02f6 }
            r0 = r3
            com.google.android.libraries.gsa.c.a.a.a r0 = (com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22157a) r0     // Catch:{ all -> 0x02f6 }
            r0.f61140f = r2     // Catch:{ all -> 0x02f6 }
            r0 = r3
            com.google.android.libraries.gsa.c.a.a.a r0 = (com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22157a) r0     // Catch:{ all -> 0x02f6 }
            r0.f61141g = r4     // Catch:{ all -> 0x02f6 }
            if (r18 == 0) goto L_0x0298
            if (r19 != 0) goto L_0x0298
            r2 = r21
            com.google.android.libraries.f.a r0 = r2.f61185f     // Catch:{ all -> 0x02f4 }
            long r0 = r0.mo26871c()     // Catch:{ all -> 0x02f4 }
            goto L_0x02a0
        L_0x0298:
            r2 = r21
            com.google.android.libraries.gsa.c.a.a.u r0 = r2.f61194o     // Catch:{ all -> 0x02f4 }
            long r0 = r0.mo27405a()     // Catch:{ all -> 0x02f4 }
        L_0x02a0:
            r3.mo27374e(r0)     // Catch:{ all -> 0x02f4 }
            com.google.android.libraries.gsa.c.a.a.u r0 = r3.mo27370a()     // Catch:{ all -> 0x02f4 }
            r2.f61194o = r0     // Catch:{ all -> 0x02f4 }
            boolean r0 = r2.f61192m     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02eb
            boolean r0 = r2.f61196q     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02b3
            if (r17 == 0) goto L_0x02ca
        L_0x02b3:
            com.google.android.libraries.gsa.c.a.a.ab r0 = r2.f61197r     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02ca
            com.google.android.libraries.gsa.c.a.a.ab r0 = r2.f61197r     // Catch:{ all -> 0x02f4 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x02f4 }
            r1.<init>()     // Catch:{ all -> 0x02f4 }
            com.google.android.libraries.gsa.c.a.a.ac r0 = r0.f61149a     // Catch:{ all -> 0x02f4 }
            com.google.android.libraries.gsa.c.a.a.w r0 = r0.f61151a     // Catch:{ all -> 0x02f4 }
            com.google.android.libraries.gsa.c.a.a.v r3 = new com.google.android.libraries.gsa.c.a.a.v     // Catch:{ all -> 0x02f4 }
            r3.<init>(r1, r5)     // Catch:{ all -> 0x02f4 }
            r0.mo27445c(r3)     // Catch:{ all -> 0x02f4 }
        L_0x02ca:
            boolean r0 = r2.f61196q     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02d3
            if (r18 == 0) goto L_0x02d1
            goto L_0x02d3
        L_0x02d1:
            r1 = 1
            goto L_0x02e9
        L_0x02d3:
            com.google.android.libraries.gsa.c.a.a.ab r0 = r2.f61197r     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02d1
            com.google.android.libraries.gsa.c.a.a.ab r0 = r2.f61197r     // Catch:{ all -> 0x02f4 }
            com.google.android.libraries.gsa.c.a.a.ac r0 = r0.f61149a     // Catch:{ all -> 0x02f4 }
            java.util.concurrent.atomic.AtomicReference r0 = r0.f61154d     // Catch:{ all -> 0x02f4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02f4 }
            com.google.android.apps.gsa.shared.aa.bg r0 = (com.google.android.apps.gsa.shared.p6968aa.C89036bg) r0     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02d1
            r0.mo17963e(r8)     // Catch:{ all -> 0x02f4 }
            goto L_0x02d1
        L_0x02e9:
            r2.f61196q = r1     // Catch:{ all -> 0x02f4 }
        L_0x02eb:
            com.google.android.libraries.gsa.c.a.a.u r0 = r2.f61194o     // Catch:{ all -> 0x02f4 }
            java.util.concurrent.locks.Lock r1 = r2.f61183d
            r1.unlock()
            goto L_0x0367
        L_0x02f4:
            r0 = move-exception
            goto L_0x02fc
        L_0x02f6:
            r0 = move-exception
            r2 = r21
            goto L_0x02fc
        L_0x02fa:
            r0 = move-exception
            r2 = r3
        L_0x02fc:
            java.util.concurrent.locks.Lock r1 = r2.f61183d
            r1.unlock()
            throw r0
        L_0x0302:
            r0 = move-exception
            r2 = r3
            com.google.common.base.ax r3 = r2.f61190k
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0326
            com.google.common.base.ax r2 = r2.f61190k
            java.lang.Object r2 = r2.mo56107c()
            dagger.a r2 = (dagger.C68214a) r2
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r2 = (com.google.android.apps.gsa.shared.logger.C89911f) r2
            r3 = 36260378(0x2294a1a, float:1.2437425E-37)
            r4 = 29
            com.google.android.apps.gsa.shared.logger.e r2 = r2.mo83755a(r0, r3, r4)
            r2.mo83721a()
        L_0x0326:
            com.google.common.f.e r2 = com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22170am.f61180a
            com.google.common.f.x r2 = r2.mo56225c()
            r3 = 48540(0xbd9c, float:6.8019E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r3)).mo56386p(r1)
            com.google.android.libraries.gsa.c.a.a.u r0 = com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22196u.f61276a
            goto L_0x0367
        L_0x0335:
            r0 = move-exception
            r2 = r3
            com.google.common.base.ax r3 = r2.f61190k
            boolean r3 = r3.mo56113h()
            if (r3 == 0) goto L_0x0359
            com.google.common.base.ax r2 = r2.f61190k
            java.lang.Object r2 = r2.mo56107c()
            dagger.a r2 = (dagger.C68214a) r2
            java.lang.Object r2 = r2.mo27525b()
            com.google.android.apps.gsa.shared.logger.f r2 = (com.google.android.apps.gsa.shared.logger.C89911f) r2
            r3 = 33246984(0x1fb4f08, float:9.231624E-38)
            r4 = 29
            com.google.android.apps.gsa.shared.logger.e r2 = r2.mo83755a(r0, r3, r4)
            r2.mo83721a()
        L_0x0359:
            com.google.common.f.e r2 = com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22170am.f61180a
            com.google.common.f.x r2 = r2.mo56225c()
            r3 = 48539(0xbd9b, float:6.8018E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r3)).mo56386p(r1)
            com.google.android.libraries.gsa.c.a.a.u r0 = com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22196u.f61276a
        L_0x0367:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.gsa.p1833c.p1834a.p1835a.C22162ae.mo17947a():java.lang.Object");
    }
}
