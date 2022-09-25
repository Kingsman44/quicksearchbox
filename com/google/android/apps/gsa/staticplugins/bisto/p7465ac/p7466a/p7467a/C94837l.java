package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60888db;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.l */
/* compiled from: PG */
public final class C94837l extends BluetoothGattCallback {

    /* renamed from: a */
    public static final /* synthetic */ int f265198a = 0;

    /* renamed from: b */
    private static final C59071e f265199b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.l");

    /* renamed from: c */
    private final Set f265200c = new HashSet();

    /* renamed from: d */
    private final C60888db f265201d;

    public C94837l(C60888db dbVar) {
        this.f265201d = dbVar;
    }

    /* renamed from: c */
    private static String m156456c(int i) {
        return i != 0 ? i != 13 ? i != 15 ? i != 257 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? i != 7 ? "Unknown error code" : "GATT_INVALID_OFFSET" : "GATT_REQUEST_NOT_SUPPORTED" : "GATT_INSUFFICIENT_AUTHENTICATION" : "GATT_WRITE_NOT_PERMITTED" : "GATT_READ_NOT_PERMITTED" : "GATT_FAILURE" : "GATT_INSUFFICIENT_ENCRYPTION" : "GATT_INVALID_ATTRIBUTE_LENGTH" : "GATT_SUCCESS";
    }

    /* renamed from: d */
    private final void m156457d(C94841p pVar, C58833ax axVar) {
        C94812a aVar = new C94812a();
        aVar.mo88623b(pVar);
        aVar.f265117a = axVar;
        C94823ak a = aVar.mo88622a();
        for (C94819ag kVar : this.f265200c) {
            this.f265201d.mo19398a(new C94836k(kVar, a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo88667a(C94819ag agVar) {
        this.f265200c.add(agVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo88668b(C94819ag agVar) {
        this.f265200c.remove(agVar);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCharacteristicChanged(android.bluetooth.BluetoothGatt r5, android.bluetooth.BluetoothGattCharacteristic r6) {
        /*
            r4 = this;
            java.util.UUID r5 = r6.getUuid()
            java.lang.String r5 = r5.toString()
            byte[] r6 = r6.getValue()
            com.google.protobuf.z r6 = com.google.protobuf.C63088z.m96139A(r6)
            int r0 = r5.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1071761955: goto L_0x0039;
                case -635340517: goto L_0x002f;
                case -376363505: goto L_0x0025;
                case 969562543: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0043
        L_0x001b:
            java.lang.String r0 = "e991b170-ec9c-4574-83a4-fb929955b05e"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0043
            r5 = 3
            goto L_0x0044
        L_0x0025:
            java.lang.String r0 = "389e8365-158f-4308-9204-756f29b6a87c"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0043
            r5 = 0
            goto L_0x0044
        L_0x002f:
            java.lang.String r0 = "dd1d1206-568f-4b2d-a48c-969d8ad1f457"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0043
            r5 = 2
            goto L_0x0044
        L_0x0039:
            java.lang.String r0 = "e90c4308-3984-41f3-be3c-7118093c3300"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0043
            r5 = 1
            goto L_0x0044
        L_0x0043:
            r5 = -1
        L_0x0044:
            if (r5 == 0) goto L_0x007f
            if (r5 == r3) goto L_0x0075
            if (r5 == r2) goto L_0x006b
            if (r5 == r1) goto L_0x0061
            com.google.common.f.e r5 = f265199b
            com.google.common.f.x r5 = r5.mo56225c()
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "GacsBleGattCallback"
            r5.mo56378ag(r6, r0)
            java.lang.String r6 = "Received unexpected notification"
            r0 = 17482(0x444a, float:2.4497E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r0)).mo56386p(r6)
            return
        L_0x0061:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.ON_PROXY_NOTIFICATION
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            r4.m156457d(r5, r6)
            return
        L_0x006b:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.ON_CRYPTO_NOTIFICATION
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            r4.m156457d(r5, r6)
            return
        L_0x0075:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.ON_AUDIO_NOTIFICATION
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            r4.m156457d(r5, r6)
            return
        L_0x007f:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r5 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.ON_CONTROL_NOTIFICATION
            com.google.common.base.ax r6 = com.google.common.base.C58833ax.m90834k(r6)
            r4.m156457d(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94837l.onCharacteristicChanged(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattCharacteristic):void");
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
    }

    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        C59104x b = f265199b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleGattCallback");
        ((C59052c) ((C59052c) b).mo56372aa(17483)).mo56389s("onCharacteristicWrite, status: %s", m156456c(i));
        if (i != 0) {
            m156457d(C94841p.GATT_ERROR, C58836b.f156633a);
        } else {
            m156457d(C94841p.ON_CHARACTERISTIC_WRITE, C58836b.f156633a);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0053, code lost:
        if (r14.equals("389e8365-158f-4308-9204-756f29b6a87c") != false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e2, code lost:
        if (r14.equals("389e8365-158f-4308-9204-756f29b6a87c") != false) goto L_0x00f6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDescriptorWrite(android.bluetooth.BluetoothGatt r13, android.bluetooth.BluetoothGattDescriptor r14, int r15) {
        /*
            r12 = this;
            if (r15 == 0) goto L_0x000a
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r13 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.GATT_ERROR
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r12.m156457d(r13, r14)
            return
        L_0x000a:
            byte[] r13 = r14.getValue()
            android.bluetooth.BluetoothGattCharacteristic r14 = r14.getCharacteristic()
            java.util.UUID r14 = r14.getUuid()
            java.lang.String r14 = r14.toString()
            byte[] r15 = android.bluetooth.BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE
            r0 = 0
            java.lang.String r1 = "e991b170-ec9c-4574-83a4-fb929955b05e"
            java.lang.String r2 = "389e8365-158f-4308-9204-756f29b6a87c"
            java.lang.String r3 = "dd1d1206-568f-4b2d-a48c-969d8ad1f457"
            java.lang.String r4 = "e90c4308-3984-41f3-be3c-7118093c3300"
            r5 = -1
            r6 = 3
            r7 = 2
            r8 = 1
            java.lang.String r9 = "GacsBleGattCallback"
            if (r13 != r15) goto L_0x00a0
            com.google.common.f.e r13 = f265199b
            com.google.common.f.x r15 = r13.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r10, r9)
            java.lang.String r10 = "Unsubscribed"
            r11 = 17490(0x4452, float:2.4509E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r11)).mo56386p(r10)
            int r15 = r14.hashCode()
            switch(r15) {
                case -1071761955: goto L_0x005e;
                case -635340517: goto L_0x0056;
                case -376363505: goto L_0x004f;
                case 969562543: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x0066
        L_0x0047:
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x0066
            r0 = 3
            goto L_0x0067
        L_0x004f:
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x0066
            goto L_0x0067
        L_0x0056:
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L_0x0066
            r0 = 2
            goto L_0x0067
        L_0x005e:
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x0066
            r0 = 1
            goto L_0x0067
        L_0x0066:
            r0 = -1
        L_0x0067:
            if (r0 == 0) goto L_0x0098
            if (r0 == r8) goto L_0x0090
            if (r0 == r7) goto L_0x0088
            if (r0 == r6) goto L_0x0080
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r14, r9)
            java.lang.String r14 = "Received unexpected unsubscription"
            r15 = 17491(0x4453, float:2.451E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r15)).mo56386p(r14)
            return
        L_0x0080:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r13 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.PROXY_UNSUBSCRIBED
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r12.m156457d(r13, r14)
            return
        L_0x0088:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r13 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.CRYPTO_UNSUBSCRIBED
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r12.m156457d(r13, r14)
            return
        L_0x0090:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r13 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.AUDIO_UNSUBSCRIBED
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r12.m156457d(r13, r14)
            return
        L_0x0098:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r13 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.CONTROL_UNSUBSCRIBED
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r12.m156457d(r13, r14)
            return
        L_0x00a0:
            byte[] r15 = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
            if (r13 == r15) goto L_0x00bc
            byte[] r15 = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
            if (r13 != r15) goto L_0x00a9
            goto L_0x00bc
        L_0x00a9:
            com.google.common.f.e r13 = f265199b
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r14, r9)
            java.lang.String r14 = "Received unknown descriptor write"
            r15 = 17489(0x4451, float:2.4507E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r15)).mo56386p(r14)
            return
        L_0x00bc:
            com.google.common.f.e r13 = f265199b
            com.google.common.f.x r15 = r13.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r15.mo56378ag(r10, r9)
            java.lang.String r10 = "Subscribed"
            r11 = 17487(0x444f, float:2.4505E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r15).mo56372aa(r11)).mo56386p(r10)
            int r15 = r14.hashCode()
            switch(r15) {
                case -1071761955: goto L_0x00ed;
                case -635340517: goto L_0x00e5;
                case -376363505: goto L_0x00de;
                case 969562543: goto L_0x00d6;
                default: goto L_0x00d5;
            }
        L_0x00d5:
            goto L_0x00f5
        L_0x00d6:
            boolean r14 = r14.equals(r1)
            if (r14 == 0) goto L_0x00f5
            r0 = 3
            goto L_0x00f6
        L_0x00de:
            boolean r14 = r14.equals(r2)
            if (r14 == 0) goto L_0x00f5
            goto L_0x00f6
        L_0x00e5:
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L_0x00f5
            r0 = 2
            goto L_0x00f6
        L_0x00ed:
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x00f5
            r0 = 1
            goto L_0x00f6
        L_0x00f5:
            r0 = -1
        L_0x00f6:
            if (r0 == 0) goto L_0x0127
            if (r0 == r8) goto L_0x011f
            if (r0 == r7) goto L_0x0117
            if (r0 == r6) goto L_0x010f
            com.google.common.f.x r13 = r13.mo56225c()
            com.google.common.f.aa r14 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r13.mo56378ag(r14, r9)
            java.lang.String r14 = "Received unexpected subscription"
            r15 = 17488(0x4450, float:2.4506E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r13).mo56372aa(r15)).mo56386p(r14)
            return
        L_0x010f:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r13 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.PROXY_SUBSCRIBED
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r12.m156457d(r13, r14)
            return
        L_0x0117:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r13 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.CRYPTO_SUBSCRIBED
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r12.m156457d(r13, r14)
            return
        L_0x011f:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r13 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.AUDIO_SUBSCRIBED
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r12.m156457d(r13, r14)
            return
        L_0x0127:
            com.google.android.apps.gsa.staticplugins.bisto.ac.a.a.p r13 = com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94841p.CONTROL_SUBSCRIBED
            com.google.common.base.b r14 = com.google.common.base.C58836b.f156633a
            r12.m156457d(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.p7467a.C94837l.onDescriptorWrite(android.bluetooth.BluetoothGatt, android.bluetooth.BluetoothGattDescriptor, int):void");
    }

    public final void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        m156457d(C94841p.ON_MTU_CHANGED, C58836b.f156633a);
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        C59104x b = f265199b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsBleGattCallback");
        ((C59052c) ((C59052c) b).mo56372aa(17492)).mo56389s("onServicesDiscovered, status: %s", m156456c(i));
        if (i != 0) {
            m156457d(C94841p.GATT_ERROR, C58836b.f156633a);
        } else {
            m156457d(C94841p.SERVICE_DISCOVERED, C58836b.f156633a);
        }
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        if (i2 == 0) {
            C59104x b = f265199b.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GacsBleGattCallback");
            ((C59052c) ((C59052c) b).mo56372aa(17485)).mo56386p("Gatt disconnected");
            m156457d(C94841p.GATT_DISCONNECTED, C58836b.f156633a);
        } else if (i2 != 2) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            C59104x b2 = f265199b.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "GacsBleGattCallback");
            ((C59052c) ((C59052c) b2).mo56372aa(17486)).mo56386p("Gatt connected");
            m156457d(C94841p.GATT_CONNECTED, C58836b.f156633a);
        }
    }
}
