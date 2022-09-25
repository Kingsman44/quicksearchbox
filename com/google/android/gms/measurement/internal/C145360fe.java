package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.fe */
/* compiled from: PG */
final class C145360fe implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145389gg f392921a;

    /* renamed from: b */
    final /* synthetic */ C145361ff f392922b;

    public C145360fe(C145361ff ffVar, C145389gg ggVar) {
        this.f392922b = ffVar;
        this.f392921a = ggVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0490, code lost:
        if (android.text.TextUtils.isEmpty(r2.f392771l) == false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05e6, code lost:
        if (android.text.TextUtils.isEmpty(r0.f392771l) == false) goto L_0x05e8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x03f8  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0475  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0178  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01a5 A[Catch:{ IllegalStateException -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ae A[Catch:{ IllegalStateException -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01d0 A[Catch:{ IllegalStateException -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0327 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.String r0 = "admob_app_id"
            com.google.android.gms.measurement.internal.ff r1 = r15.f392922b
            com.google.android.gms.measurement.internal.gg r2 = r15.f392921a
            com.google.android.gms.measurement.internal.fc r3 = r1.mo120966as()
            r3.mo120904g()
            com.google.android.gms.measurement.internal.ab r3 = r1.f392937g
            r3.mo120774k()
            com.google.android.gms.measurement.internal.al r3 = new com.google.android.gms.measurement.internal.al
            r3.<init>(r1)
            r3.mo121003l()
            r1.f392947q = r3
            com.google.android.gms.measurement.internal.dp r3 = new com.google.android.gms.measurement.internal.dp
            long r4 = r2.f393060f
            r3.<init>(r1, r4)
            r3.mo120950b()
            r1.f392948r = r3
            com.google.android.gms.measurement.internal.dr r2 = new com.google.android.gms.measurement.internal.dr
            r2.<init>(r1)
            r2.mo120950b()
            r1.f392945o = r2
            com.google.android.gms.measurement.internal.it r2 = new com.google.android.gms.measurement.internal.it
            r2.<init>(r1)
            r2.mo120950b()
            r1.f392946p = r2
            com.google.android.gms.measurement.internal.ke r2 = r1.f392941k
            r2.mo121004m()
            com.google.android.gms.measurement.internal.ek r2 = r1.f392938h
            r2.mo121004m()
            com.google.android.gms.measurement.internal.dp r2 = r1.f392948r
            boolean r4 = r2.f392901a
            if (r4 != 0) goto L_0x0648
            com.google.android.gms.measurement.internal.ff r4 = r2.f393011w
            android.content.Context r4 = r4.f392931a
            java.lang.String r4 = r4.getPackageName()
            com.google.android.gms.measurement.internal.ff r5 = r2.f393011w
            android.content.Context r5 = r5.f392931a
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r6 = "Unknown"
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r8 = ""
            r9 = 0
            java.lang.String r10 = "unknown"
            if (r5 != 0) goto L_0x0079
            com.google.android.gms.measurement.internal.ff r11 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r11 = r11.mo120965ar()
            com.google.android.gms.measurement.internal.dv r11 = r11.f392795c
            java.lang.String r12 = "PackageManager is null, app identity information might be inaccurate. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r4)
            r11.mo120895b(r12, r13)
            goto L_0x00d8
        L_0x0079:
            java.lang.String r10 = r5.getInstallerPackageName(r4)     // Catch:{ IllegalArgumentException -> 0x007e }
            goto L_0x008f
        L_0x007e:
            com.google.android.gms.measurement.internal.ff r11 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r11 = r11.mo120965ar()
            com.google.android.gms.measurement.internal.dv r11 = r11.f392795c
            java.lang.String r12 = "Error retrieving app installer package name. appId"
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r4)
            r11.mo120895b(r12, r13)
        L_0x008f:
            if (r10 != 0) goto L_0x0094
            java.lang.String r10 = "manual_install"
            goto L_0x009d
        L_0x0094:
            java.lang.String r11 = "com.android.vending"
            boolean r11 = r11.equals(r10)
            if (r11 == 0) goto L_0x009d
            r10 = r8
        L_0x009d:
            com.google.android.gms.measurement.internal.ff r11 = r2.f393011w     // Catch:{ NameNotFoundException -> 0x00c5 }
            android.content.Context r11 = r11.f392931a     // Catch:{ NameNotFoundException -> 0x00c5 }
            java.lang.String r11 = r11.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c5 }
            android.content.pm.PackageInfo r11 = r5.getPackageInfo(r11, r9)     // Catch:{ NameNotFoundException -> 0x00c5 }
            if (r11 == 0) goto L_0x00d8
            android.content.pm.ApplicationInfo r12 = r11.applicationInfo     // Catch:{ NameNotFoundException -> 0x00c5 }
            java.lang.CharSequence r12 = r5.getApplicationLabel(r12)     // Catch:{ NameNotFoundException -> 0x00c5 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ NameNotFoundException -> 0x00c5 }
            if (r13 != 0) goto L_0x00bc
            java.lang.String r12 = r12.toString()     // Catch:{ NameNotFoundException -> 0x00c5 }
            goto L_0x00bd
        L_0x00bc:
            r12 = r6
        L_0x00bd:
            java.lang.String r6 = r11.versionName     // Catch:{ NameNotFoundException -> 0x00c2 }
            int r7 = r11.versionCode     // Catch:{ NameNotFoundException -> 0x00c2 }
            goto L_0x00d8
        L_0x00c2:
            r11 = r6
            r6 = r12
            goto L_0x00c6
        L_0x00c5:
            r11 = r6
        L_0x00c6:
            com.google.android.gms.measurement.internal.ff r12 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r12 = r12.mo120965ar()
            com.google.android.gms.measurement.internal.dv r12 = r12.f392795c
            java.lang.String r13 = "Error retrieving package info. appId, appName"
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r4)
            r12.mo120896c(r13, r14, r6)
            r6 = r11
        L_0x00d8:
            r2.f392761b = r4
            r2.f392764e = r10
            r2.f392762c = r6
            r2.f392763d = r7
            r6 = 0
            r2.f392765f = r6
            com.google.android.gms.measurement.internal.ff r10 = r2.f393011w
            java.lang.String r10 = r10.f392932b
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r11 = 1
            if (r10 != 0) goto L_0x00fd
            com.google.android.gms.measurement.internal.ff r10 = r2.f393011w
            java.lang.String r10 = r10.f392933c
            java.lang.String r12 = "am"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x00fd
            r10 = 1
            goto L_0x00fe
        L_0x00fd:
            r10 = 0
        L_0x00fe:
            com.google.android.gms.measurement.internal.ff r12 = r2.f393011w
            int r12 = r12.mo120964a()
            switch(r12) {
                case 0: goto L_0x0178;
                case 1: goto L_0x016a;
                case 2: goto L_0x015c;
                case 3: goto L_0x014e;
                case 4: goto L_0x0140;
                case 5: goto L_0x0132;
                case 6: goto L_0x0124;
                case 7: goto L_0x0116;
                default: goto L_0x0107;
            }
        L_0x0107:
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()
            com.google.android.gms.measurement.internal.dv r13 = r13.f392801i
            java.lang.String r14 = "App measurement disabled due to denied storage consent"
            r13.mo120894a(r14)
            goto L_0x0185
        L_0x0116:
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()
            com.google.android.gms.measurement.internal.dv r13 = r13.f392801i
            java.lang.String r14 = "App measurement disabled via the global data collection setting"
            r13.mo120894a(r14)
            goto L_0x0185
        L_0x0124:
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()
            com.google.android.gms.measurement.internal.dv r13 = r13.f392800h
            java.lang.String r14 = "App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics"
            r13.mo120894a(r14)
            goto L_0x0185
        L_0x0132:
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()
            com.google.android.gms.measurement.internal.dv r13 = r13.f392803k
            java.lang.String r14 = "App measurement disabled via the init parameters"
            r13.mo120894a(r14)
            goto L_0x0185
        L_0x0140:
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()
            com.google.android.gms.measurement.internal.dv r13 = r13.f392801i
            java.lang.String r14 = "App measurement disabled via the manifest"
            r13.mo120894a(r14)
            goto L_0x0185
        L_0x014e:
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()
            com.google.android.gms.measurement.internal.dv r13 = r13.f392801i
            java.lang.String r14 = "App measurement disabled by setAnalyticsCollectionEnabled(false)"
            r13.mo120894a(r14)
            goto L_0x0185
        L_0x015c:
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()
            com.google.android.gms.measurement.internal.dv r13 = r13.f392803k
            java.lang.String r14 = "App measurement deactivated via the init parameters"
            r13.mo120894a(r14)
            goto L_0x0185
        L_0x016a:
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()
            com.google.android.gms.measurement.internal.dv r13 = r13.f392801i
            java.lang.String r14 = "App measurement deactivated via the manifest"
            r13.mo120894a(r14)
            goto L_0x0185
        L_0x0178:
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r13 = r13.mo120965ar()
            com.google.android.gms.measurement.internal.dv r13 = r13.f392803k
            java.lang.String r14 = "App measurement collection enabled"
            r13.mo120894a(r14)
        L_0x0185:
            r2.f392770k = r8
            r2.f392771l = r8
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.x r14 = r13.f392936f
            if (r10 == 0) goto L_0x0195
            com.google.android.gms.measurement.internal.ff r10 = r2.f393011w
            java.lang.String r10 = r10.f392932b
            r2.f392771l = r10
        L_0x0195:
            android.content.Context r10 = r13.f392931a     // Catch:{ IllegalStateException -> 0x01ed }
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w     // Catch:{ IllegalStateException -> 0x01ed }
            java.lang.String r13 = r13.f392944n     // Catch:{ IllegalStateException -> 0x01ed }
            java.lang.String r10 = com.google.android.gms.measurement.internal.C145422hm.m236342b(r10, r13)     // Catch:{ IllegalStateException -> 0x01ed }
            boolean r13 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x01ed }
            if (r11 == r13) goto L_0x01a6
            r8 = r10
        L_0x01a6:
            r2.f392770k = r8     // Catch:{ IllegalStateException -> 0x01ed }
            boolean r8 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x01ed }
            if (r8 != 0) goto L_0x01ce
            com.google.android.gms.measurement.internal.ff r8 = r2.f393011w     // Catch:{ IllegalStateException -> 0x01ed }
            android.content.Context r8 = r8.f392931a     // Catch:{ IllegalStateException -> 0x01ed }
            com.google.android.gms.measurement.internal.ff r10 = r2.f393011w     // Catch:{ IllegalStateException -> 0x01ed }
            java.lang.String r10 = r10.f392944n     // Catch:{ IllegalStateException -> 0x01ed }
            com.google.android.gms.common.internal.C143919bh.m233958a(r8)     // Catch:{ IllegalStateException -> 0x01ed }
            android.content.res.Resources r13 = r8.getResources()     // Catch:{ IllegalStateException -> 0x01ed }
            boolean r14 = android.text.TextUtils.isEmpty(r10)     // Catch:{ IllegalStateException -> 0x01ed }
            if (r14 != 0) goto L_0x01c4
            goto L_0x01c8
        L_0x01c4:
            java.lang.String r10 = com.google.android.gms.measurement.internal.C145352ex.m236168a(r8)     // Catch:{ IllegalStateException -> 0x01ed }
        L_0x01c8:
            java.lang.String r8 = com.google.android.gms.measurement.internal.C145352ex.m236169b(r0, r13, r10)     // Catch:{ IllegalStateException -> 0x01ed }
            r2.f392771l = r8     // Catch:{ IllegalStateException -> 0x01ed }
        L_0x01ce:
            if (r12 != 0) goto L_0x01ff
            com.google.android.gms.measurement.internal.ff r8 = r2.f393011w     // Catch:{ IllegalStateException -> 0x01ed }
            com.google.android.gms.measurement.internal.dx r8 = r8.mo120965ar()     // Catch:{ IllegalStateException -> 0x01ed }
            com.google.android.gms.measurement.internal.dv r8 = r8.f392803k     // Catch:{ IllegalStateException -> 0x01ed }
            java.lang.String r10 = "App measurement enabled for app package, google app id"
            java.lang.String r12 = r2.f392761b     // Catch:{ IllegalStateException -> 0x01ed }
            java.lang.String r13 = r2.f392770k     // Catch:{ IllegalStateException -> 0x01ed }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ IllegalStateException -> 0x01ed }
            if (r13 == 0) goto L_0x01e7
            java.lang.String r13 = r2.f392771l     // Catch:{ IllegalStateException -> 0x01ed }
            goto L_0x01e9
        L_0x01e7:
            java.lang.String r13 = r2.f392770k     // Catch:{ IllegalStateException -> 0x01ed }
        L_0x01e9:
            r8.mo120896c(r10, r12, r13)     // Catch:{ IllegalStateException -> 0x01ed }
            goto L_0x01ff
        L_0x01ed:
            r8 = move-exception
            com.google.android.gms.measurement.internal.ff r10 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r10 = r10.mo120965ar()
            com.google.android.gms.measurement.internal.dv r10 = r10.f392795c
            java.lang.String r12 = "Fetching Google App Id failed with exception. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C145325dx.m236116a(r4)
            r10.mo120896c(r12, r4, r8)
        L_0x01ff:
            r4 = 0
            r2.f392767h = r4
            com.google.android.gms.measurement.internal.ff r8 = r2.f393011w
            com.google.android.gms.measurement.internal.x r10 = r8.f392936f
            com.google.android.gms.measurement.internal.ab r8 = r8.f392937g
            java.util.List r8 = r8.mo120781t()
            if (r8 != 0) goto L_0x020f
            goto L_0x0242
        L_0x020f:
            boolean r10 = r8.isEmpty()
            if (r10 == 0) goto L_0x0223
            com.google.android.gms.measurement.internal.ff r8 = r2.f393011w
            com.google.android.gms.measurement.internal.dx r8 = r8.mo120965ar()
            com.google.android.gms.measurement.internal.dv r8 = r8.f392800h
            java.lang.String r10 = "Safelisted event list is empty. Ignoring"
            r8.mo120894a(r10)
            goto L_0x0244
        L_0x0223:
            java.util.Iterator r10 = r8.iterator()
        L_0x0227:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0242
            java.lang.Object r12 = r10.next()
            java.lang.String r12 = (java.lang.String) r12
            com.google.android.gms.measurement.internal.ff r13 = r2.f393011w
            com.google.android.gms.measurement.internal.ke r13 = r13.mo120977o()
            java.lang.String r14 = "safelisted event"
            boolean r12 = r13.mo121267X(r14, r12)
            if (r12 != 0) goto L_0x0227
            goto L_0x0244
        L_0x0242:
            r2.f392767h = r8
        L_0x0244:
            if (r5 == 0) goto L_0x0251
            com.google.android.gms.measurement.internal.ff r5 = r2.f393011w
            android.content.Context r5 = r5.f392931a
            boolean r5 = com.google.android.gms.common.p10782e.C143871a.m233880a(r5)
            r2.f392769j = r5
            goto L_0x0253
        L_0x0251:
            r2.f392769j = r9
        L_0x0253:
            com.google.android.gms.measurement.internal.ff r5 = r2.f393011w
            java.util.concurrent.atomic.AtomicInteger r5 = r5.f392955y
            r5.incrementAndGet()
            r2.f392901a = r11
            com.google.android.gms.measurement.internal.dx r2 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392801i
            com.google.android.gms.measurement.internal.ab r5 = r1.f392937g
            r5.mo120770f()
            r8 = 74009(0x12119, double:3.65653E-319)
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "App measurement initialized, version"
            r2.mo120895b(r8, r5)
            com.google.android.gms.measurement.internal.dx r2 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392801i
            java.lang.String r5 = "To enable debug logging run: adb shell setprop log.tag.FA VERBOSE"
            r2.mo120894a(r5)
            java.lang.String r2 = r3.mo120874e()
            java.lang.String r3 = r1.f392932b
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x02b3
            com.google.android.gms.measurement.internal.ke r3 = r1.mo120977o()
            boolean r3 = r3.mo121271aa(r2)
            if (r3 == 0) goto L_0x02a0
            com.google.android.gms.measurement.internal.dx r2 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392801i
            java.lang.String r3 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none."
            r2.mo120894a(r3)
            goto L_0x02b3
        L_0x02a0:
            com.google.android.gms.measurement.internal.dx r3 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r3 = r3.f392801i
            java.lang.String r5 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app "
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r5.concat(r2)
            r3.mo120894a(r2)
        L_0x02b3:
            com.google.android.gms.measurement.internal.dx r2 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392802j
            java.lang.String r3 = "Debug-level message logging enabled"
            r2.mo120894a(r3)
            int r2 = r1.f392954x
            java.util.concurrent.atomic.AtomicInteger r3 = r1.f392955y
            int r3 = r3.get()
            if (r2 == r3) goto L_0x02e3
            com.google.android.gms.measurement.internal.dx r2 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392795c
            int r3 = r1.f392954x
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.util.concurrent.atomic.AtomicInteger r5 = r1.f392955y
            int r5 = r5.get()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.String r8 = "Not all components initialized"
            r2.mo120896c(r8, r3, r5)
        L_0x02e3:
            r1.f392949s = r11
            com.google.android.gms.measurement.internal.ff r1 = r15.f392922b
            com.google.android.gms.measurement.internal.gg r2 = r15.f392921a
            com.google.android.gms.measurement.api.internal.InitializationParams r2 = r2.f393061g
            com.google.android.gms.measurement.internal.fc r3 = r1.mo120966as()
            r3.mo120904g()
            com.google.android.gms.measurement.internal.ek r3 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ad r3 = r3.mo120923c()
            com.google.android.gms.measurement.internal.ek r5 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ff r8 = r5.f393011w
            r5.mo120904g()
            android.content.SharedPreferences r5 = r5.mo120921a()
            java.lang.String r8 = "consent_source"
            r9 = 100
            int r5 = r5.getInt(r8, r9)
            com.google.android.gms.measurement.internal.ab r8 = r1.f392937g
            com.google.android.gms.measurement.internal.ff r10 = r8.f393011w
            java.lang.String r10 = "google_analytics_default_allow_ad_storage"
            java.lang.Boolean r8 = r8.mo120773j(r10)
            com.google.android.gms.measurement.internal.ab r10 = r1.f392937g
            com.google.android.gms.measurement.internal.ff r12 = r10.f393011w
            java.lang.String r12 = "google_analytics_default_allow_analytics_storage"
            java.lang.Boolean r10 = r10.mo120773j(r12)
            r12 = -10
            if (r8 != 0) goto L_0x0329
            if (r10 == 0) goto L_0x033b
        L_0x0329:
            com.google.android.gms.measurement.internal.ek r13 = r1.mo120971g()
            boolean r13 = r13.mo120928j(r12)
            if (r13 == 0) goto L_0x033b
            com.google.android.gms.measurement.internal.ad r2 = new com.google.android.gms.measurement.internal.ad
            r2.<init>(r8, r10)
            r9 = -10
            goto L_0x0397
        L_0x033b:
            com.google.android.gms.measurement.internal.dp r8 = r1.mo120969d()
            java.lang.String r8 = r8.mo120875f()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            r10 = 30
            if (r8 != 0) goto L_0x0367
            if (r5 == 0) goto L_0x035b
            if (r5 == r10) goto L_0x035b
            r8 = 10
            if (r5 == r8) goto L_0x035b
            if (r5 == r10) goto L_0x035b
            if (r5 == r10) goto L_0x035b
            r8 = 40
            if (r5 != r8) goto L_0x0367
        L_0x035b:
            com.google.android.gms.measurement.internal.hg r2 = r1.mo120972j()
            com.google.android.gms.measurement.internal.ad r5 = com.google.android.gms.measurement.internal.C145224ad.f392558a
            long r13 = r1.f392956z
            r2.mo121110x(r5, r12, r13)
            goto L_0x0396
        L_0x0367:
            com.google.android.gms.measurement.internal.dp r5 = r1.mo120969d()
            java.lang.String r5 = r5.mo120875f()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0396
            if (r2 == 0) goto L_0x0396
            android.os.Bundle r5 = r2.f392417g
            if (r5 == 0) goto L_0x0396
            com.google.android.gms.measurement.internal.ek r5 = r1.mo120971g()
            boolean r5 = r5.mo120928j(r10)
            if (r5 == 0) goto L_0x0396
            android.os.Bundle r2 = r2.f392417g
            com.google.android.gms.measurement.internal.ad r2 = com.google.android.gms.measurement.internal.C145224ad.m235919a(r2)
            com.google.android.gms.measurement.internal.ad r5 = com.google.android.gms.measurement.internal.C145224ad.f392558a
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x0396
            r9 = 30
            goto L_0x0397
        L_0x0396:
            r2 = r4
        L_0x0397:
            if (r2 == 0) goto L_0x03a3
            com.google.android.gms.measurement.internal.hg r3 = r1.mo120972j()
            long r12 = r1.f392956z
            r3.mo121110x(r2, r9, r12)
            r3 = r2
        L_0x03a3:
            com.google.android.gms.measurement.internal.hg r2 = r1.mo120972j()
            r2.mo121084A(r3)
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            com.google.android.gms.measurement.internal.eh r2 = r2.f392851d
            r2.mo120915a()
            long r2 = r2.f392834a
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x03d5
            com.google.android.gms.measurement.internal.dx r2 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392803k
            long r5 = r1.f392956z
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "Persisting first open"
            r2.mo120895b(r5, r3)
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            com.google.android.gms.measurement.internal.eh r2 = r2.f392851d
            long r5 = r1.f392956z
            r2.mo120916b(r5)
        L_0x03d5:
            com.google.android.gms.measurement.internal.hg r2 = r1.mo120972j()
            com.google.android.gms.measurement.internal.q r2 = r2.f393144e
            boolean r3 = r2.mo121299b()
            if (r3 == 0) goto L_0x03f2
            boolean r3 = r2.mo121300c()
            if (r3 == 0) goto L_0x03f2
            com.google.android.gms.measurement.internal.ff r2 = r2.f393402a
            com.google.android.gms.measurement.internal.ek r2 = r2.mo120971g()
            com.google.android.gms.measurement.internal.ej r2 = r2.f392867t
            r2.mo120920b(r4)
        L_0x03f2:
            boolean r2 = r1.mo120981s()
            if (r2 != 0) goto L_0x0475
            boolean r0 = r1.mo120980r()
            if (r0 == 0) goto L_0x063e
            com.google.android.gms.measurement.internal.ke r0 = r1.mo120977o()
            java.lang.String r2 = "android.permission.INTERNET"
            boolean r0 = r0.mo121269Z(r2)
            if (r0 != 0) goto L_0x0415
            com.google.android.gms.measurement.internal.dx r0 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r2 = "App is missing INTERNET permission"
            r0.mo120894a(r2)
        L_0x0415:
            com.google.android.gms.measurement.internal.ke r0 = r1.mo120977o()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.mo121269Z(r2)
            if (r0 != 0) goto L_0x042c
            com.google.android.gms.measurement.internal.dx r0 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r2 = "App is missing ACCESS_NETWORK_STATE permission"
            r0.mo120894a(r2)
        L_0x042c:
            android.content.Context r0 = r1.f392931a
            com.google.android.gms.common.e.c r2 = com.google.android.gms.common.p10782e.C143873c.f389983a
            com.google.android.gms.common.e.b r0 = r2.mo119351a(r0)
            boolean r0 = r0.mo119349c()
            if (r0 != 0) goto L_0x0468
            com.google.android.gms.measurement.internal.ab r0 = r1.f392937g
            boolean r0 = r0.mo120780q()
            if (r0 != 0) goto L_0x0468
            android.content.Context r0 = r1.f392931a
            boolean r0 = com.google.android.gms.measurement.internal.C145495ke.m236487af(r0)
            if (r0 != 0) goto L_0x0455
            com.google.android.gms.measurement.internal.dx r0 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r2 = "AppMeasurementReceiver not registered/enabled"
            r0.mo120894a(r2)
        L_0x0455:
            android.content.Context r0 = r1.f392931a
            boolean r0 = com.google.android.gms.measurement.internal.C145495ke.m236489am(r0)
            if (r0 != 0) goto L_0x0468
            com.google.android.gms.measurement.internal.dx r0 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r2 = "AppMeasurementService not registered/enabled"
            r0.mo120894a(r2)
        L_0x0468:
            com.google.android.gms.measurement.internal.dx r0 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392795c
            java.lang.String r2 = "Uploading is not possible. App measurement disabled"
            r0.mo120894a(r2)
            goto L_0x063e
        L_0x0475:
            com.google.android.gms.measurement.internal.dp r2 = r1.mo120969d()
            java.lang.String r2 = r2.mo120875f()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0492
            com.google.android.gms.measurement.internal.dp r2 = r1.mo120969d()
            r2.mo120949a()
            java.lang.String r2 = r2.f392771l
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0556
        L_0x0492:
            com.google.android.gms.measurement.internal.ke r2 = r1.mo120977o()
            com.google.android.gms.measurement.internal.dp r3 = r1.mo120969d()
            java.lang.String r3 = r3.mo120875f()
            com.google.android.gms.measurement.internal.ek r5 = r1.mo120971g()
            r5.mo120904g()
            android.content.SharedPreferences r5 = r5.mo120921a()
            java.lang.String r6 = "gmp_app_id"
            java.lang.String r5 = r5.getString(r6, r4)
            com.google.android.gms.measurement.internal.dp r7 = r1.mo120969d()
            r7.mo120949a()
            java.lang.String r7 = r7.f392771l
            com.google.android.gms.measurement.internal.ek r8 = r1.mo120971g()
            r8.mo120904g()
            android.content.SharedPreferences r8 = r8.mo120921a()
            java.lang.String r8 = r8.getString(r0, r4)
            boolean r2 = r2.mo121274ag(r3, r5, r7, r8)
            if (r2 == 0) goto L_0x051b
            com.google.android.gms.measurement.internal.dx r2 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r2 = r2.f392801i
            java.lang.String r3 = "Rechecking which service to use due to a GMP App Id change"
            r2.mo120894a(r3)
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            r2.mo120904g()
            java.lang.Boolean r3 = r2.mo120924d()
            android.content.SharedPreferences r5 = r2.mo120921a()
            android.content.SharedPreferences$Editor r5 = r5.edit()
            r5.clear()
            r5.apply()
            if (r3 == 0) goto L_0x04f6
            r2.mo120925f(r3)
        L_0x04f6:
            com.google.android.gms.measurement.internal.dr r2 = r1.mo120970e()
            r2.mo120883f()
            com.google.android.gms.measurement.internal.it r2 = r1.f392946p
            r2.mo121154j()
            com.google.android.gms.measurement.internal.it r2 = r1.f392946p
            r2.mo121153i()
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            com.google.android.gms.measurement.internal.eh r2 = r2.f392851d
            long r7 = r1.f392956z
            r2.mo120916b(r7)
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ej r2 = r2.f392853f
            r2.mo120920b(r4)
        L_0x051b:
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            com.google.android.gms.measurement.internal.dp r3 = r1.mo120969d()
            java.lang.String r3 = r3.mo120875f()
            r2.mo120904g()
            android.content.SharedPreferences r2 = r2.mo120921a()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r6, r3)
            r2.apply()
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            com.google.android.gms.measurement.internal.dp r3 = r1.mo120969d()
            r3.mo120949a()
            java.lang.String r3 = r3.f392771l
            r2.mo120904g()
            android.content.SharedPreferences r2 = r2.mo120921a()
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r2.putString(r0, r3)
            r2.apply()
        L_0x0556:
            com.google.android.gms.measurement.internal.ek r0 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ad r0 = r0.mo120923c()
            com.google.android.gms.measurement.internal.ac r2 = com.google.android.gms.measurement.internal.C145223ac.ANALYTICS_STORAGE
            boolean r0 = r0.mo120786f(r2)
            if (r0 != 0) goto L_0x056f
            com.google.android.gms.measurement.internal.ek r0 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ej r0 = r0.f392853f
            r0.mo120920b(r4)
        L_0x056f:
            com.google.android.gms.measurement.internal.hg r0 = r1.mo120972j()
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ej r2 = r2.f392853f
            r2.mo120919a()
            java.lang.String r2 = r2.f392844a
            java.util.concurrent.atomic.AtomicReference r0 = r0.f393143d
            r0.set(r2)
            boolean r0 = p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68922p.m99945c()
            if (r0 == 0) goto L_0x05cb
            com.google.android.gms.measurement.internal.ab r0 = r1.f392937g
            com.google.android.gms.measurement.internal.dk r2 = com.google.android.gms.measurement.internal.C145313dl.f392723ac
            boolean r0 = r0.mo120776m(r4, r2)
            if (r0 == 0) goto L_0x05cb
            com.google.android.gms.measurement.internal.ke r0 = r1.mo120977o()
            com.google.android.gms.measurement.internal.ff r0 = r0.f393011w     // Catch:{ ClassNotFoundException -> 0x05a5 }
            android.content.Context r0 = r0.f392931a     // Catch:{ ClassNotFoundException -> 0x05a5 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x05a5 }
            java.lang.String r2 = "com.google.firebase.remoteconfig.FirebaseRemoteConfig"
            r0.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x05a5 }
            goto L_0x05cb
        L_0x05a5:
            com.google.android.gms.measurement.internal.ek r0 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ej r0 = r0.f392866s
            r0.mo120919a()
            java.lang.String r0 = r0.f392844a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05cb
            com.google.android.gms.measurement.internal.dx r0 = r1.mo120965ar()
            com.google.android.gms.measurement.internal.dv r0 = r0.f392798f
            java.lang.String r2 = "Remote config removed with active feature rollouts"
            r0.mo120894a(r2)
            com.google.android.gms.measurement.internal.ek r0 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ej r0 = r0.f392866s
            r0.mo120920b(r4)
        L_0x05cb:
            com.google.android.gms.measurement.internal.dp r0 = r1.mo120969d()
            java.lang.String r0 = r0.mo120875f()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x05e8
            com.google.android.gms.measurement.internal.dp r0 = r1.mo120969d()
            r0.mo120949a()
            java.lang.String r0 = r0.f392771l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x063e
        L_0x05e8:
            boolean r0 = r1.mo120980r()
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            android.content.SharedPreferences r2 = r2.f392849b
            if (r2 != 0) goto L_0x05f5
            goto L_0x05fd
        L_0x05f5:
            java.lang.String r3 = "deferred_analytics_collection"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x060e
        L_0x05fd:
            com.google.android.gms.measurement.internal.ab r2 = r1.f392937g
            boolean r2 = r2.mo120779p()
            if (r2 != 0) goto L_0x060e
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            r3 = r0 ^ 1
            r2.mo120926h(r3)
        L_0x060e:
            if (r0 == 0) goto L_0x0617
            com.google.android.gms.measurement.internal.hg r0 = r1.mo120972j()
            r0.mo121097k()
        L_0x0617:
            com.google.android.gms.measurement.internal.jj r0 = r1.mo120976n()
            com.google.android.gms.measurement.internal.ji r0 = r0.f393319c
            r0.mo121187a()
            com.google.android.gms.measurement.internal.it r0 = r1.mo120975m()
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r0.mo121156l(r2)
            com.google.android.gms.measurement.internal.it r0 = r1.mo120975m()
            com.google.android.gms.measurement.internal.ek r2 = r1.mo120971g()
            com.google.android.gms.measurement.internal.eg r2 = r2.f392869v
            r2.mo120913a()
            android.os.Bundle r2 = r2.f392830a
            r0.mo121163s(r2)
        L_0x063e:
            com.google.android.gms.measurement.internal.ek r0 = r1.mo120971g()
            com.google.android.gms.measurement.internal.ef r0 = r0.f392860m
            r0.mo120912b(r11)
            return
        L_0x0648:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't initialize twice"
            r0.<init>(r1)
            goto L_0x0651
        L_0x0650:
            throw r0
        L_0x0651:
            goto L_0x0650
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C145360fe.run():void");
    }
}
