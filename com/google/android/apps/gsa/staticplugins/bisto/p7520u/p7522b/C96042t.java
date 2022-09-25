package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7466a.C94892p;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.libraries.assistant.accessory.p618b.C11001f;
import com.google.android.libraries.assistant.accessory.p618b.C11011p;
import com.google.android.libraries.assistant.accessory.p618b.C11017v;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.t */
/* compiled from: PG */
public final /* synthetic */ class C96042t implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268914a;

    /* renamed from: b */
    public final /* synthetic */ int f268915b;

    /* renamed from: c */
    public final /* synthetic */ BluetoothDevice f268916c;

    /* renamed from: d */
    public final /* synthetic */ C124548d f268917d;

    public /* synthetic */ C96042t(C96017bm bmVar, int i, BluetoothDevice bluetoothDevice, C124548d dVar) {
        this.f268914a = bmVar;
        this.f268915b = i;
        this.f268916c = bluetoothDevice;
        this.f268917d = dVar;
    }

    public final void run() {
        C96017bm bmVar = this.f268914a;
        int i = this.f268915b;
        BluetoothDevice bluetoothDevice = this.f268916c;
        C124548d dVar = this.f268917d;
        C59104x b = C96017bm.f268828a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
        ((C59052c) ((C59052c) b).mo56372aa(15682)).mo56389s("Receive remote peer action : %s", C11017v.m26075d(i));
        switch (i) {
            case 0:
            case 2:
            case 4:
            case 6:
                return;
            case 1:
                if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
                    C59104x b2 = C96017bm.f268828a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                    ((C59052c) ((C59052c) b2).mo56372aa(15702)).mo56386p("Bluetooth is not available, do not connect using connection sequencing.");
                    return;
                }
                bmVar.mo89881d();
                int incrementAndGet = bmVar.f268838h.f36177c.incrementAndGet();
                C94892p a = bmVar.mo89877a();
                if (a.f265422g.containsKey(bluetoothDevice.getAddress()) && incrementAndGet > 3) {
                    C59104x b3 = C96017bm.f268828a.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                    ((C59052c) ((C59052c) b3).mo56372aa(15701)).mo56386p("Try to connect multiple times but couldn't, disconnect first.");
                    bmVar.mo89884g(bluetoothDevice, 9);
                }
                bmVar.mo89883f(bluetoothDevice, dVar, true);
                return;
            case 3:
                C11011p pVar = bmVar.f268838h;
                String address = bluetoothDevice.getAddress();
                if (address != null) {
                    Iterator it = pVar.f36179e.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else {
                            C11001f fVar = (C11001f) it.next();
                            if (fVar.mo19372a().getAddress().equals(address)) {
                                if (fVar.mo19374c().intValue() == 4) {
                                    C59104x b4 = C96017bm.f268828a.mo56224b();
                                    b4.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                                    ((C59052c) ((C59052c) b4).mo56372aa(15703)).mo56386p("Receive DISCONNECT data item when the communicator state is already DISCONNECTED for this device. Ignore the data item.");
                                    return;
                                }
                            }
                        }
                    }
                }
                break;
            case 5:
                break;
            default:
                throw new AssertionError("unexpected RemotePeerAction : " + i);
        }
        bmVar.mo89884g(bluetoothDevice, 7);
        C90875ai.m148465b(C95952aa.f268671a, bmVar.f268836f.mo28207g("hold-BistoGacsManager-active", new C96048z(bmVar)), bmVar.f268837g, "update-active-status-scheduled").mo85223a(C95954ac.f268674a);
    }
}
