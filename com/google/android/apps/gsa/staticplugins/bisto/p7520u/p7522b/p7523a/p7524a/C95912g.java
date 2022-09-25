package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.C89681t;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89492cd;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95346ax;
import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95373bx;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95850a;
import com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.C96023bs;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.g */
/* compiled from: PG */
public final class C95912g extends C95909d {

    /* renamed from: c */
    private static final C59071e f268545c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.u.b.a.a.g");

    /* renamed from: d */
    private final C96023bs f268546d;

    /* renamed from: e */
    private final C89656k f268547e;

    /* renamed from: f */
    private final C89492cd f268548f;

    /* renamed from: g */
    private final C95346ax f268549g;

    /* renamed from: h */
    private final C95373bx f268550h;

    public C95912g(C96023bs bsVar, C95346ax axVar, C89656k kVar, C89492cd cdVar, C95373bx bxVar, C95850a aVar) {
        super(bsVar, "ClassicIdleState", axVar, cdVar, aVar);
        this.f268549g = axVar;
        this.f268546d = bsVar;
        this.f268547e = kVar;
        this.f268550h = bxVar;
        this.f268548f = cdVar;
    }

    /* renamed from: b */
    private final C124548d m159057b() {
        return this.f268548f.mo83401b(this.f268549g.mo89270k());
    }

    /* renamed from: c */
    private final boolean m159058c(Intent intent) {
        C124548d b;
        int i;
        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("extra_device");
        if (bluetoothDevice == null) {
            C59104x c = f268545c.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClassicIdleState");
            ((C59052c) ((C59052c) c).mo56372aa(15827)).mo56389s("Null bluetooth device. Action: %s", intent.getAction());
            return false;
        } else if (!C89681t.m146046l(bluetoothDevice) || ((b = m159057b()) != null && C124636bb.OPA_ENABLED.equals(b.mo106521s()))) {
            return false;
        } else {
            if (b == null) {
                i = 0;
            } else {
                i = b.mo106504d();
            }
            if (b == null || i == 0) {
                C59104x b2 = f268545c.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "ClassicIdleState");
                ((C59052c) ((C59052c) b2).mo56372aa(15826)).mo56386p("New FP device. Suppress OOBE Notification");
                this.f268548f.mo83419y(bluetoothDevice.getAddress());
                return true;
            }
            return false;
        }
    }

    /* renamed from: g */
    public final void mo89845g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f268869b = true;
        this.f268546d.mo89831a();
        this.f268546d.mo89840j(false);
        this.f268550h.f266875e = 2;
    }

    /* renamed from: j */
    public final void mo89847j(String str, Intent intent) {
        if ("ConnectingLCState".equals(str)) {
            this.f268547e.mo83550e();
        }
        super.mo89847j(str, (Intent) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo89848l(android.content.Intent r11) {
        /*
            r10 = this;
            boolean r0 = super.mo89848l(r11)
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.String r0 = r11.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0010
            return r2
        L_0x0010:
            int r3 = r0.hashCode()
            r4 = 3
            r5 = 2
            r6 = -1
            switch(r3) {
                case -1712754119: goto L_0x0057;
                case -377527494: goto L_0x004d;
                case -301431627: goto L_0x0043;
                case 1244161670: goto L_0x0039;
                case 1854535521: goto L_0x002f;
                case 1931599820: goto L_0x0025;
                case 2116862345: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0061
        L_0x001b:
            java.lang.String r3 = "android.bluetooth.device.action.BOND_STATE_CHANGED"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0061
            r0 = 5
            goto L_0x0062
        L_0x0025:
            java.lang.String r3 = "com.google.android.apps.gsa.shared.bisto.ACTION_DEVICE_BOOT_OR_APP_INSTALL"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0061
            r0 = 4
            goto L_0x0062
        L_0x002f:
            java.lang.String r3 = "ACTION_OOBE_STATUS_UPDATED"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0061
            r0 = 6
            goto L_0x0062
        L_0x0039:
            java.lang.String r3 = "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0061
            r0 = 1
            goto L_0x0062
        L_0x0043:
            java.lang.String r3 = "android.bluetooth.device.action.ACL_CONNECTED"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0061
            r0 = 3
            goto L_0x0062
        L_0x004d:
            java.lang.String r3 = "android.bluetooth.device.action.UUID"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0061
            r0 = 2
            goto L_0x0062
        L_0x0057:
            java.lang.String r3 = "bisto.QUERY_DEVICE_INFO"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0061
            r0 = 0
            goto L_0x0062
        L_0x0061:
            r0 = -1
        L_0x0062:
            java.lang.String r3 = "FastPairFirstConnectionState"
            java.lang.String r7 = "ConnectingLCState"
            java.lang.String r8 = "ClassicIdleState"
            r9 = 0
            switch(r0) {
                case 0: goto L_0x017f;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00cd;
                case 3: goto L_0x00cd;
                case 4: goto L_0x00c0;
                case 5: goto L_0x0093;
                case 6: goto L_0x006d;
                default: goto L_0x006c;
            }
        L_0x006c:
            return r2
        L_0x006d:
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r11 = com.google.android.apps.gsa.shared.bisto.p7029b.C89636g.m145896b(r11)
            if (r11 != 0) goto L_0x0086
            com.google.common.f.e r11 = f268545c
            com.google.common.f.x r11 = r11.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r0, r8)
            java.lang.String r0 = "oobeState is null"
            r1 = 15821(0x3dcd, float:2.217E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r1)).mo56386p(r0)
            return r2
        L_0x0086:
            int r11 = r11.ordinal()
            if (r11 == r1) goto L_0x008f
            if (r11 == r4) goto L_0x008f
            return r2
        L_0x008f:
            r10.mo89847j(r7, r9)
            return r1
        L_0x0093:
            java.lang.String r0 = "android.bluetooth.device.extra.BOND_STATE"
            int r0 = r11.getIntExtra(r0, r6)
            com.google.common.f.e r2 = f268545c
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r8)
            java.lang.String r4 = "bondState: %d"
            r5 = 15820(0x3dcc, float:2.2169E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r5)).mo56387q(r4, r0)
            r2 = 12
            if (r0 != r2) goto L_0x00bf
            r10.mo89852m()
            boolean r11 = r10.m159058c(r11)
            if (r11 != 0) goto L_0x00bc
            r10.mo89847j(r7, r9)
            goto L_0x00bf
        L_0x00bc:
            r10.mo89847j(r3, r9)
        L_0x00bf:
            return r1
        L_0x00c0:
            r10.mo89847j(r7, r9)
            return r1
        L_0x00c4:
            java.lang.String r0 = "android.bluetooth.profile.extra.STATE"
            int r0 = r11.getIntExtra(r0, r6)
            if (r0 == r5) goto L_0x00cd
            return r1
        L_0x00cd:
            com.google.android.apps.gsa.staticplugins.bisto.g.ax r0 = r10.f268549g
            boolean r0 = r0.mo89272m()
            if (r0 != 0) goto L_0x00e9
            com.google.common.f.e r0 = f268545c
            com.google.common.f.x r0 = r0.mo56224b()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r8)
            java.lang.String r2 = "No check for ACL state - input-only"
            r4 = 15825(0x3dd1, float:2.2176E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56386p(r2)
            goto L_0x0171
        L_0x00e9:
            java.lang.String r0 = "extra_device"
            android.os.Parcelable r0 = r11.getParcelableExtra(r0)
            android.bluetooth.BluetoothDevice r0 = (android.bluetooth.BluetoothDevice) r0
            if (r0 != 0) goto L_0x010a
            com.google.common.f.e r0 = f268545c
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r0.mo56378ag(r2, r8)
            java.lang.String r2 = r11.getAction()
            r4 = 15824(0x3dd0, float:2.2174E-41)
            java.lang.String r5 = "Null bluetooth device. Action: %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r5, r2)
            goto L_0x0171
        L_0x010a:
            java.lang.Class<android.bluetooth.BluetoothDevice> r4 = android.bluetooth.BluetoothDevice.class
            java.lang.String r5 = "isConnected"
            java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r5, r6)     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            r4.setAccessible(r1)     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            java.lang.Object r0 = r4.invoke(r0, r2)     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            if (r0 == 0) goto L_0x0126
            boolean r0 = r0.booleanValue()     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            goto L_0x0127
        L_0x0126:
            r0 = 1
        L_0x0127:
            com.google.common.f.e r2 = f268545c     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            com.google.common.f.x r4 = r2.mo56224b()     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            r4.mo56378ag(r5, r8)     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            r5 = 15822(0x3dce, float:2.2171E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            java.lang.String r5 = "ACL state check result. Connected: %b"
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            r4.mo56389s(r5, r6)     // Catch:{ NoSuchMethodException -> 0x015e, SecurityException -> 0x015c, IllegalAccessException -> 0x015a, InvocationTargetException -> 0x0158 }
            if (r0 != 0) goto L_0x0171
            com.google.common.f.x r11 = r2.mo56225c()
            com.google.common.f.aa r0 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r0, r8)
            java.lang.String r0 = "Not proceeding to connecting even though ACL_CONNECTED received."
            r2 = 15819(0x3dcb, float:2.2167E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r11).mo56372aa(r2)).mo56386p(r0)
            goto L_0x017e
        L_0x0158:
            r0 = move-exception
            goto L_0x015f
        L_0x015a:
            r0 = move-exception
            goto L_0x015f
        L_0x015c:
            r0 = move-exception
            goto L_0x015f
        L_0x015e:
            r0 = move-exception
        L_0x015f:
            com.google.common.f.e r2 = f268545c
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.mo56378ag(r4, r8)
            java.lang.String r4 = "Error calling BluetoothDevice#isConnected"
            r5 = 15823(0x3dcf, float:2.2173E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r5)).mo56386p(r4)
        L_0x0171:
            boolean r11 = r10.m159058c(r11)
            if (r11 != 0) goto L_0x017b
            r10.mo89847j(r7, r9)
            goto L_0x017e
        L_0x017b:
            r10.mo89847j(r3, r9)
        L_0x017e:
            return r1
        L_0x017f:
            com.google.android.apps.search.assistant.surfaces.bisto.c.b.d r11 = r10.m159057b()
            if (r11 == 0) goto L_0x0194
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r11 = r11.mo106520r()
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r0 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az.OOBE_FINISHED
            boolean r11 = r11.equals(r0)
            if (r11 == 0) goto L_0x0194
            com.google.common.f.aa r11 = com.google.common.p4526f.p4527a.C58975e.f156826a
            goto L_0x01a1
        L_0x0194:
            com.google.android.apps.gsa.shared.bisto.a.cd r11 = r10.f268548f
            com.google.android.apps.gsa.staticplugins.bisto.g.ax r0 = r10.f268549g
            java.lang.String r0 = r0.mo89270k()
            com.google.android.apps.search.assistant.surfaces.bisto.d.az r2 = com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124633az.OOBE_IN_PROGRESS
            r11.mo83394aj(r0, r9, r2)
        L_0x01a1:
            r10.mo89847j(r7, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b.p7523a.p7524a.C95912g.mo89848l(android.content.Intent):boolean");
    }
}
