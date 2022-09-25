package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import com.google.android.libraries.gsa.p1876k.C22870f;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gg */
/* compiled from: PG */
public final /* synthetic */ class C96238gg implements C22870f {

    /* renamed from: a */
    public final /* synthetic */ C96248gq f269368a;

    public /* synthetic */ C96238gg(C96248gq gqVar) {
        this.f269368a = gqVar;
    }

    public final void run() {
        C96248gq gqVar = this.f269368a;
        BluetoothDevice remoteDevice = BluetoothAdapter.getDefaultAdapter().getRemoteDevice(gqVar.f269400u.f269039a);
        Iterator it = C96248gq.f269392r.iterator();
        while (true) {
            if (!it.hasNext()) {
                gqVar.mo90021q(12);
                break;
            }
            int intValue = ((Integer) it.next()).intValue();
            BluetoothProfile bluetoothProfile = (BluetoothProfile) gqVar.f269403x.get(intValue);
            if (bluetoothProfile != null) {
                if (bluetoothProfile.getConnectionState(remoteDevice) != 2) {
                    break;
                }
            } else {
                C59104x c = C96248gq.f269387m.mo56225c();
                c.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                ((C59052c) ((C59052c) c).mo56372aa(17033)).mo56387q("missing proxy for profile %d", intValue);
                break;
            }
        }
        synchronized (gqVar) {
            if (gqVar.f269404y != null) {
                gqVar.mo90022r();
            }
        }
    }
}
