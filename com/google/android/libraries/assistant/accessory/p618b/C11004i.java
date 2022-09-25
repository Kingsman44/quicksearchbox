package com.google.android.libraries.assistant.accessory.p618b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.accessory.b.i */
/* compiled from: PG */
public final class C11004i implements Callable {

    /* renamed from: a */
    private static final C59071e f36165a = C59071e.m91332i("com.google.android.libraries.assistant.accessory.b.i");

    /* renamed from: b */
    private final C11003h f36166b;

    /* renamed from: c */
    private final C11011p f36167c;

    public C11004i(C11003h hVar, C11011p pVar) {
        this.f36166b = hVar;
        this.f36167c = pVar;
    }

    /* renamed from: a */
    private final Optional m26040a(String str, int i) {
        C11011p pVar = this.f36167c;
        C59104x b = C11011p.f36175a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "RemotePeerStateCommunicator");
        ((C59052c) ((C59052c) b).mo56372aa(42542)).mo56354G("Notify new action %s for deviceId %s", C11017v.m26075d(i), str);
        for (C11008m l : pVar.f36178d) {
            l.mo19406l(str, i);
        }
        return Optional.empty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r10 = this;
            com.google.android.libraries.assistant.accessory.b.h r0 = r10.f36166b
            com.google.android.libraries.assistant.accessory.b.p r1 = r10.f36167c
            java.lang.String r2 = r0.mo19391h()
            java.lang.Integer r3 = r0.mo19386d()
            int r3 = r3.intValue()
            r4 = 7
            r5 = 1
            r6 = 4
            r7 = 5
            if (r3 == r5) goto L_0x006f
            r8 = 2
            if (r3 == r8) goto L_0x006d
            if (r3 == r6) goto L_0x007c
            r9 = 6
            if (r3 == r7) goto L_0x0023
            if (r3 == r9) goto L_0x0021
            goto L_0x007b
        L_0x0021:
            r5 = 2
            goto L_0x007c
        L_0x0023:
            j$.util.Optional r3 = r1.mo19412e(r2)
            boolean r3 = r3.isPresent()
            if (r3 == 0) goto L_0x005f
            java.lang.Integer r0 = r0.mo19387e()
            int r0 = r0.intValue()
            int r2 = r1.mo19409c(r2)
            int r1 = r1.mo19408b()
            if (r0 != r2) goto L_0x0041
            r5 = 7
            goto L_0x007c
        L_0x0041:
            if (r0 != r5) goto L_0x0046
            r5 = 8
            goto L_0x007c
        L_0x0046:
            if (r0 == r6) goto L_0x004b
            if (r0 != r7) goto L_0x0050
            r0 = 5
        L_0x004b:
            if (r1 != r5) goto L_0x0050
            r5 = 9
            goto L_0x007c
        L_0x0050:
            r5 = 11
            if (r2 == r6) goto L_0x007c
            if (r2 == r7) goto L_0x007c
            r1 = 10
            if (r0 == r6) goto L_0x005c
            if (r0 != r7) goto L_0x007c
        L_0x005c:
            r5 = 10
            goto L_0x007c
        L_0x005f:
            java.lang.String r0 = r1.mo19414g()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006b
            r5 = 5
            goto L_0x007c
        L_0x006b:
            r5 = 6
            goto L_0x007c
        L_0x006d:
            r5 = 3
            goto L_0x007c
        L_0x006f:
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            boolean r0 = r0.isEnabled()
            if (r0 != 0) goto L_0x007b
            r5 = 4
            goto L_0x007c
        L_0x007b:
            r5 = 0
        L_0x007c:
            com.google.android.libraries.assistant.accessory.b.h r0 = r10.f36166b
            java.lang.String r0 = r0.mo19391h()
            com.google.android.libraries.assistant.accessory.b.h r1 = r10.f36166b
            java.lang.Integer r1 = r1.mo19386d()
            int r1 = r1.intValue()
            com.google.android.libraries.assistant.accessory.b.h r2 = r10.f36166b
            java.lang.Integer r2 = r2.mo19387e()
            int r2 = r2.intValue()
            com.google.android.libraries.assistant.accessory.b.p r3 = r10.f36167c
            j$.util.Optional r3 = r3.mo19412e(r0)
            switch(r5) {
                case 1: goto L_0x014a;
                case 2: goto L_0x0145;
                case 3: goto L_0x0140;
                case 4: goto L_0x0103;
                case 5: goto L_0x00fe;
                case 6: goto L_0x00f9;
                case 7: goto L_0x00f3;
                case 8: goto L_0x00e2;
                case 9: goto L_0x00d1;
                case 10: goto L_0x00bb;
                case 11: goto L_0x00a5;
                default: goto L_0x009f;
            }
        L_0x009f:
            j$.util.Optional r0 = r10.m26040a(r0, r1)
            goto L_0x016d
        L_0x00a5:
            com.google.android.libraries.assistant.accessory.b.p r0 = r10.f36167c
            java.lang.Object r1 = r3.get()
            android.bluetooth.BluetoothDevice r1 = (android.bluetooth.BluetoothDevice) r1
            r0.mo19422o(r1, r2)
            com.google.android.libraries.assistant.accessory.b.p r0 = r10.f36167c
            r0.mo19418k()
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x016d
        L_0x00bb:
            com.google.android.libraries.assistant.accessory.b.p r4 = r10.f36167c
            java.lang.Object r3 = r3.get()
            android.bluetooth.BluetoothDevice r3 = (android.bluetooth.BluetoothDevice) r3
            r4.mo19422o(r3, r2)
            com.google.android.libraries.assistant.accessory.b.p r2 = r10.f36167c
            r2.mo19418k()
            j$.util.Optional r0 = r10.m26040a(r0, r1)
            goto L_0x016d
        L_0x00d1:
            com.google.android.libraries.assistant.accessory.b.p r4 = r10.f36167c
            java.lang.Object r3 = r3.get()
            android.bluetooth.BluetoothDevice r3 = (android.bluetooth.BluetoothDevice) r3
            r4.mo19422o(r3, r2)
            j$.util.Optional r0 = r10.m26040a(r0, r1)
            goto L_0x016d
        L_0x00e2:
            com.google.android.libraries.assistant.accessory.b.p r0 = r10.f36167c
            java.lang.Object r1 = r3.get()
            android.bluetooth.BluetoothDevice r1 = (android.bluetooth.BluetoothDevice) r1
            r0.mo19422o(r1, r2)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x016d
        L_0x00f3:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x016d
        L_0x00f9:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x016d
        L_0x00fe:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x016d
        L_0x0103:
            com.google.common.f.e r0 = f36165a
            com.google.common.f.x r0 = r0.mo56224b()
            java.lang.String r1 = "Receiving CONNECT action while Bluetooth is not ready for use, do not try to connect."
            r2 = 42533(0xa625, float:5.9601E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            com.google.android.libraries.assistant.accessory.b.c r0 = new com.google.android.libraries.assistant.accessory.b.c
            r0.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.f36149a = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.f36154f = r1
            com.google.android.libraries.assistant.accessory.b.p r1 = r10.f36167c
            java.lang.String r1 = r1.mo19414g()
            r0.mo19379b(r1)
            com.google.android.libraries.assistant.accessory.b.p r1 = r10.f36167c
            int r1 = r1.mo19407a()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.f36155g = r1
            com.google.android.libraries.assistant.accessory.b.h r0 = r0.mo19378a()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x016d
        L_0x0140:
            j$.util.Optional r0 = r10.m26040a(r0, r1)
            goto L_0x016d
        L_0x0145:
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x016d
        L_0x014a:
            com.google.android.libraries.assistant.accessory.b.p r1 = r10.f36167c
            int r0 = r1.mo19409c(r0)
            com.google.android.libraries.assistant.accessory.b.h r1 = r10.f36166b
            com.google.android.libraries.assistant.accessory.b.g r1 = r1.mo19383a()
            r1.mo19382e()
            r1.mo19381d(r0)
            com.google.android.libraries.assistant.accessory.b.p r0 = r10.f36167c
            int r0 = r0.mo19407a()
            r1.mo19380c(r0)
            com.google.android.libraries.assistant.accessory.b.h r0 = r1.mo19378a()
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
        L_0x016d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.accessory.p618b.C11004i.call():java.lang.Object");
    }
}
