package com.google.android.apps.gsa.staticplugins.p7920en;

import android.content.Intent;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.en.i */
/* compiled from: PG */
public final /* synthetic */ class C100567i implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100570l f281162a;

    /* renamed from: b */
    public final /* synthetic */ Intent f281163b;

    public /* synthetic */ C100567i(C100570l lVar, Intent intent) {
        this.f281162a = lVar;
        this.f281163b = intent;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x02a4  */
    public final void run() {
        /*
            r19 = this;
            r1 = r19
            com.google.android.apps.gsa.staticplugins.en.l r0 = r1.f281162a
            android.content.Intent r2 = r1.f281163b
            java.lang.String r3 = r2.getAction()
            int r4 = r3.hashCode()
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            switch(r4) {
                case -1720549495: goto L_0x0034;
                case -873219875: goto L_0x002a;
                case 1426248051: goto L_0x0020;
                case 1772843706: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            goto L_0x003e
        L_0x0016:
            java.lang.String r4 = "android.bluetooth.headset.action.VENDOR_SPECIFIC_HEADSET_EVENT"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            goto L_0x003f
        L_0x0020:
            java.lang.String r4 = "com.google.android.apps.gsa.handsfree.ACTION_SWITCH_TO_A2DP"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x003e
            r3 = 2
            goto L_0x003f
        L_0x002a:
            java.lang.String r4 = "com.google.android.apps.gsa.handsfree.ACTION_DEVICE_CONNECTED"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x003e
            r3 = 0
            goto L_0x003f
        L_0x0034:
            java.lang.String r4 = "com.google.android.apps.gsa.handsfree.ACTION_SCO_STATE_CHANGED"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x003e
            r3 = 3
            goto L_0x003f
        L_0x003e:
            r3 = -1
        L_0x003f:
            if (r3 == 0) goto L_0x0347
            if (r3 == r7) goto L_0x0089
            if (r3 == r6) goto L_0x005c
            if (r3 == r5) goto L_0x004a
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x004a:
            com.google.android.apps.gsa.staticplugins.en.b r3 = r0.f281175k
            if (r3 == 0) goto L_0x03cf
            java.lang.String r3 = "com.google.android.apps.gsa.handsfree.EXTRA_SCO_ESTABLISHED"
            boolean r2 = r2.getBooleanExtra(r3, r8)
            r0.f281180p = r2
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo91972f()
            return
        L_0x005c:
            com.google.android.apps.gsa.staticplugins.en.b r3 = r0.f281175k
            if (r3 == 0) goto L_0x03cf
            java.lang.String r4 = "com.google.android.apps.gsa.handsfree.EXTRA_A2DP_TRIGGER"
            int r2 = r2.getIntExtra(r4, r8)
            boolean r4 = r0.f281179o
            if (r2 != r7) goto L_0x0073
            int r2 = r3.f281152g
            r2 = r2 & r6
            if (r2 == 0) goto L_0x0072
            r2 = 1
            r5 = 1
            goto L_0x0074
        L_0x0072:
            r2 = 1
        L_0x0073:
            r5 = 0
        L_0x0074:
            r4 = r4 | r5
            if (r2 != r6) goto L_0x007e
            int r2 = r3.f281152g
            r2 = r2 & 32
            if (r2 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r7 = 0
        L_0x007f:
            r2 = r4 | r7
            r0.f281179o = r2
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo91972f()
            return
        L_0x0089:
            java.lang.String r3 = "android.bluetooth.device.extra.DEVICE"
            boolean r3 = r2.hasExtra(r3)
            if (r3 == 0) goto L_0x0344
            java.lang.String r3 = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_ARGS"
            boolean r3 = r2.hasExtra(r3)
            if (r3 != 0) goto L_0x009b
            goto L_0x0344
        L_0x009b:
            java.lang.String r3 = "android.bluetooth.device.extra.DEVICE"
            android.os.Parcelable r3 = r2.getParcelableExtra(r3)
            android.bluetooth.BluetoothDevice r3 = (android.bluetooth.BluetoothDevice) r3
            java.lang.String r4 = "android.bluetooth.headset.extra.VENDOR_SPECIFIC_HEADSET_EVENT_ARGS"
            java.io.Serializable r2 = r2.getSerializableExtra(r4)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            if (r2 != 0) goto L_0x00b0
            java.lang.String[] r2 = new java.lang.String[r8]
            goto L_0x00c3
        L_0x00b0:
            int r4 = r2.length
            java.lang.String[] r4 = new java.lang.String[r4]
            r9 = 0
        L_0x00b4:
            int r10 = r2.length
            if (r9 >= r10) goto L_0x00c2
            r10 = r2[r9]
            java.lang.String r10 = r10.toString()
            r4[r9] = r10
            int r9 = r9 + 1
            goto L_0x00b4
        L_0x00c2:
            r2 = r4
        L_0x00c3:
            r4 = r2[r8]
            java.util.Locale r9 = java.util.Locale.US
            java.lang.String r4 = r4.toLowerCase(r9)
            java.lang.String r9 = "probe"
            boolean r9 = r4.equals(r9)
            r10 = 4
            if (r9 == 0) goto L_0x01d7
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r4 = r2.length
            if (r4 == r10) goto L_0x00fe
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7920en.C100570l.f281167a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "VehicleIntegrationWork"
            r0.mo56378ag(r3, r4)
            com.google.common.base.ar r3 = new com.google.common.base.ar
            java.lang.String r4 = ","
            r3.<init>((java.lang.String) r4)
            java.lang.String r4 = "Invalid probe request: AT+ANDROID=%s"
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.String r2 = r3.mo56097d(r2)
            r3 = 33537(0x8301, float:4.6995E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r4, r2)
            return
        L_0x00fe:
            boolean r4 = r0.mo91976j()
            if (r4 != 0) goto L_0x0106
            goto L_0x03cf
        L_0x0106:
            r4 = r2[r7]     // Catch:{ NumberFormatException -> 0x01c1 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x01c1 }
            r6 = r2[r6]     // Catch:{ NumberFormatException -> 0x01c1 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x01c1 }
            if (r4 > r7) goto L_0x0197
            if (r6 > 0) goto L_0x0118
            goto L_0x0197
        L_0x0118:
            r2 = r2[r5]
            java.lang.String r4 = "\"0\""
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L_0x0168
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166670c(r2)
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166668a(r2)
            r4 = 0
        L_0x012b:
            int r5 = r2.length()
            if (r8 >= r5) goto L_0x015c
            char r5 = r2.charAt(r8)
            boolean r6 = java.lang.Character.isDigit(r5)
            if (r6 == 0) goto L_0x013f
            int r5 = r5 + -48
        L_0x013d:
            int r4 = r4 + r5
            goto L_0x0159
        L_0x013f:
            boolean r6 = java.lang.Character.isLowerCase(r5)
            if (r6 == 0) goto L_0x014c
            int[] r6 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.f281158b
            int r5 = r5 + -97
            r5 = r6[r5]
            goto L_0x013d
        L_0x014c:
            boolean r6 = java.lang.Character.isUpperCase(r5)
            if (r6 == 0) goto L_0x0159
            int[] r6 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.f281158b
            int r5 = r5 + -65
            r5 = r6[r5]
            goto L_0x013d
        L_0x0159:
            int r8 = r8 + 1
            goto L_0x012b
        L_0x015c:
            java.lang.String r2 = java.lang.Integer.toString(r4)
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166668a(r2)
            java.lang.String r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166669b(r2)
        L_0x0168:
            java.lang.Object r5 = r0.f281171g
            monitor-enter(r5)
            r0.f281174j = r3     // Catch:{ all -> 0x0194 }
            r0.mo91974h()     // Catch:{ all -> 0x0194 }
            monitor-exit(r5)     // Catch:{ all -> 0x0194 }
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p7920en.C100570l.f281167a
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r6 = "VehicleIntegrationWork"
            r4.mo56378ag(r5, r6)
            java.lang.String r5 = "[%s] connected"
            r6 = 33535(0x82ff, float:4.6993E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56389s(r5, r3)
            java.lang.String r3 = "probe,1,"
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = r3.concat(r2)
            r0.mo91975i(r2)
            return
        L_0x0194:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0194 }
            throw r0
        L_0x0197:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7920en.C100570l.f281167a     // Catch:{ NumberFormatException -> 0x01c1 }
            com.google.common.f.x r0 = r0.mo56225c()     // Catch:{ NumberFormatException -> 0x01c1 }
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NumberFormatException -> 0x01c1 }
            java.lang.String r3 = "VehicleIntegrationWork"
            r0.mo56378ag(r2, r3)     // Catch:{ NumberFormatException -> 0x01c1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ NumberFormatException -> 0x01c1 }
            r2 = 33533(0x82fd, float:4.699E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ NumberFormatException -> 0x01c1 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ NumberFormatException -> 0x01c1 }
            java.lang.String r2 = "Protocol not supported. Current version: %d, requested: [%d, %d]."
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x01c1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x01c1 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ NumberFormatException -> 0x01c1 }
            r0.mo56359L(r2, r3, r4, r5)     // Catch:{ NumberFormatException -> 0x01c1 }
            return
        L_0x01c1:
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.p7920en.C100570l.f281167a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "VehicleIntegrationWork"
            r0.mo56378ag(r2, r3)
            java.lang.String r2 = "Invalid probe request: protocol number is not integer."
            r3 = 33534(0x82fe, float:4.6991E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            return
        L_0x01d7:
            java.lang.Object r9 = r0.f281171g
            monitor-enter(r9)
            android.bluetooth.BluetoothDevice r11 = r0.f281174j     // Catch:{ all -> 0x0341 }
            if (r11 == 0) goto L_0x033d
            java.lang.String r3 = r3.getAddress()     // Catch:{ all -> 0x0341 }
            android.bluetooth.BluetoothDevice r11 = r0.f281174j     // Catch:{ all -> 0x0341 }
            r11.getClass()
            java.lang.String r11 = r11.getAddress()     // Catch:{ all -> 0x0341 }
            boolean r3 = r3.equals(r11)     // Catch:{ all -> 0x0341 }
            if (r3 != 0) goto L_0x01f3
            goto L_0x033d
        L_0x01f3:
            monitor-exit(r9)     // Catch:{ all -> 0x0341 }
            java.lang.String r3 = "handshake"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x033a
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            int r3 = r2.length
            r4 = 8
            if (r3 == r4) goto L_0x020a
            com.google.android.apps.gsa.staticplugins.en.b r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100560b.m166663a()
            r0.f281175k = r2
            goto L_0x0259
        L_0x020a:
            r3 = 5
            r3 = r2[r3]     // Catch:{ NumberFormatException -> 0x0253 }
            r4 = 2000(0x7d0, float:2.803E-42)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0216 }
            r16 = r3
            goto L_0x0218
        L_0x0216:
            r16 = 2000(0x7d0, float:2.803E-42)
        L_0x0218:
            r3 = 6
            r3 = r2[r3]     // Catch:{ NumberFormatException -> 0x0253 }
            int r4 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0222 }
            r17 = r4
            goto L_0x0224
        L_0x0222:
            r17 = 2000(0x7d0, float:2.803E-42)
        L_0x0224:
            r3 = 7
            r3 = r2[r3]     // Catch:{ NumberFormatException -> 0x0253 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x022e }
            r18 = r3
            goto L_0x0232
        L_0x022e:
            r3 = 9
            r18 = 9
        L_0x0232:
            com.google.android.apps.gsa.staticplugins.en.b r3 = new com.google.android.apps.gsa.staticplugins.en.b     // Catch:{ NumberFormatException -> 0x0253 }
            r4 = r2[r7]     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r12 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166670c(r4)     // Catch:{ NumberFormatException -> 0x0253 }
            r4 = r2[r6]     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r13 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166670c(r4)     // Catch:{ NumberFormatException -> 0x0253 }
            r4 = r2[r5]     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r14 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166670c(r4)     // Catch:{ NumberFormatException -> 0x0253 }
            r2 = r2[r10]     // Catch:{ NumberFormatException -> 0x0253 }
            java.lang.String r15 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166670c(r2)     // Catch:{ NumberFormatException -> 0x0253 }
            r11 = r3
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ NumberFormatException -> 0x0253 }
            r0.f281175k = r3     // Catch:{ NumberFormatException -> 0x0253 }
            goto L_0x0259
        L_0x0253:
            com.google.android.apps.gsa.staticplugins.en.b r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100560b.m166663a()
            r0.f281175k = r2
        L_0x0259:
            com.google.android.apps.gsa.z.a.f r2 = r0.f281169c
            com.google.android.apps.gsa.staticplugins.en.b r3 = r0.f281175k
            int r3 = r3.f281150e
            r2.mo71754o(r3)
            com.google.android.apps.gsa.staticplugins.en.b r2 = r0.f281175k
            if (r2 != 0) goto L_0x0268
            r2 = 0
            goto L_0x02a2
        L_0x0268:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "handshake,"
            r2.<init>(r3)
            java.lang.String r3 = android.os.Build.VERSION.RELEASE
            java.lang.String r3 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166669b(r3)
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
            java.lang.String r3 = android.os.Build.MANUFACTURER
            java.lang.String r3 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166669b(r3)
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r3 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166669b(r3)
            r2.append(r3)
            java.lang.String r3 = ","
            r2.append(r3)
            int r3 = r0.f281178n
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L_0x02a2:
            if (r2 == 0) goto L_0x02a7
            r0.mo91975i(r2)
        L_0x02a7:
            java.lang.Object r2 = r0.f281171g
            monitor-enter(r2)
            android.bluetooth.BluetoothDevice r3 = r0.f281174j     // Catch:{ all -> 0x0337 }
            r3.getClass()
            java.lang.String r3 = r3.getAddress()     // Catch:{ all -> 0x0337 }
            monitor-exit(r2)     // Catch:{ all -> 0x0337 }
            com.google.android.apps.gsa.search.core.preferences.r r2 = r0.f281170f
            com.google.android.apps.gsa.staticplugins.en.b r4 = r0.f281175k
            r4.getClass()
            com.google.common.f.e r5 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.f281157a
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x02e6 }
            r5.<init>()     // Catch:{ IOException -> 0x02e6 }
            java.io.ObjectOutputStream r6 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x02e6 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x02e6 }
            r6.writeObject(r4)     // Catch:{ IOException -> 0x02e6 }
            r6.close()     // Catch:{ IOException -> 0x02e6 }
            r5.close()     // Catch:{ IOException -> 0x02e6 }
            byte[] r4 = r5.toByteArray()     // Catch:{ IOException -> 0x02e6 }
            com.google.android.apps.gsa.search.core.preferences.q r2 = r2.mo80076b()
            java.lang.String r5 = "vic_last_vehicle_mac_address"
            r2.mo80073h(r5, r3)
            java.lang.String r3 = "vic_last_vehicle_info"
            r2.mo80068c(r3, r4)
            r2.commit()
            goto L_0x02f7
        L_0x02e6:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.f281157a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r4 = "Cannot save vehicle info"
            r5 = 33517(0x82ed, float:4.6967E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166671d(r2)
        L_0x02f7:
            com.google.android.apps.gsa.staticplugins.en.b r2 = r0.f281175k
            r2.getClass()
            r2.mo91965b()
            com.google.android.apps.gsa.search.core.preferences.r r2 = r0.f281170f
            java.lang.String r3 = "bluetoothHeadset"
            boolean r2 = r2.getBoolean(r3, r8)
            if (r2 != 0) goto L_0x03cf
            com.google.android.apps.gsa.search.core.preferences.r r2 = r0.f281170f
            boolean r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166672e(r2)
            if (r2 != 0) goto L_0x0327
            com.google.android.apps.gsa.shared.az.a r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100557a.f281142a
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Intent r2 = r2.mo83277a(r3)
            r3 = 813694976(0x30800000, float:9.313226E-10)
            r2.setFlags(r3)
            android.content.Context r0 = r0.f281168b
            r0.startActivity(r2)
            return
        L_0x0327:
            com.google.android.apps.gsa.search.core.preferences.r r2 = r0.f281170f
            java.lang.String r3 = "vic_integration_allowed"
            boolean r2 = r2.getBoolean(r3, r8)
            if (r2 == 0) goto L_0x03cf
            com.google.android.apps.gsa.search.core.preferences.r r0 = r0.f281170f
            com.google.android.apps.gsa.staticplugins.p7920en.C100564f.m166673f(r0)
            return
        L_0x0337:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0337 }
            throw r0
        L_0x033a:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x033d:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0341 }
            monitor-exit(r9)     // Catch:{ all -> 0x0341 }
            return
        L_0x0341:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0341 }
            throw r0
        L_0x0344:
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            return
        L_0x0347:
            java.lang.String r3 = "com.google.android.apps.gsa.handsfree.EXTRA_DEVICE_ADDRESS"
            java.lang.String r2 = r2.getStringExtra(r3)
            boolean r3 = r0.f281182r
            if (r3 == 0) goto L_0x03cf
            com.google.android.apps.gsa.search.core.preferences.r r3 = r0.f281170f
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.f281157a
            java.lang.String r4 = "vic_last_vehicle_mac_address"
            java.lang.String r5 = ""
            java.lang.String r3 = r3.getString(r4, r5)
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x03cf
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.f281176l = r2
            com.google.android.apps.gsa.search.core.preferences.r r2 = r0.f281170f
            java.lang.String r3 = "vic_last_vehicle_info"
            byte[] r4 = new byte[r8]
            byte[] r2 = r2.mo80079e(r3, r4)
            if (r2 == 0) goto L_0x03a1
            int r3 = r2.length
            if (r3 != 0) goto L_0x0377
            goto L_0x03a1
        L_0x0377:
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x038e }
            r3.<init>(r2)     // Catch:{ IOException | ClassNotFoundException -> 0x038e }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x038e }
            r2.<init>(r3)     // Catch:{ IOException | ClassNotFoundException -> 0x038e }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x038e }
            com.google.android.apps.gsa.staticplugins.en.b r4 = (com.google.android.apps.gsa.staticplugins.p7920en.C100560b) r4     // Catch:{ IOException | ClassNotFoundException -> 0x038e }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x038e }
            r3.close()     // Catch:{ IOException | ClassNotFoundException -> 0x038e }
            goto L_0x03b3
        L_0x038e:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.f281157a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Unable to read vehicle info, byte stream probably corrupted, using default."
            r4 = 33516(0x82ec, float:4.6966E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.staticplugins.en.b r4 = com.google.android.apps.gsa.staticplugins.p7920en.C100560b.m166663a()
            goto L_0x03b3
        L_0x03a1:
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.p7920en.C100564f.f281157a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Last vehicle's information doesn't exist, using default."
            r4 = 33515(0x82eb, float:4.6965E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            com.google.android.apps.gsa.staticplugins.en.b r4 = com.google.android.apps.gsa.staticplugins.p7920en.C100560b.m166663a()
        L_0x03b3:
            r0.f281177m = r4
            java.lang.Object r2 = r0.f281171g
            monitor-enter(r2)
            r0.mo91974h()     // Catch:{ all -> 0x03cc }
            com.google.android.apps.gsa.z.a.f r3 = r0.f281169c     // Catch:{ all -> 0x03cc }
            com.google.android.apps.gsa.staticplugins.en.b r4 = r0.f281177m     // Catch:{ all -> 0x03cc }
            r4.getClass()
            int r4 = r4.f281150e     // Catch:{ all -> 0x03cc }
            r3.mo71754o(r4)     // Catch:{ all -> 0x03cc }
            monitor-exit(r2)     // Catch:{ all -> 0x03cc }
            r0.mo91971e()
            return
        L_0x03cc:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03cc }
            throw r0
        L_0x03cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7920en.C100567i.run():void");
    }
}
