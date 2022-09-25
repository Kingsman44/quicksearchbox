package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.bluetooth.BluetoothDevice;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.gj */
/* compiled from: PG */
public final /* synthetic */ class C96241gj implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96248gq f269373a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f269374b;

    public /* synthetic */ C96241gj(C96248gq gqVar, BluetoothDevice bluetoothDevice) {
        this.f269373a = gqVar;
        this.f269374b = bluetoothDevice;
    }

    public final void run() {
        C96248gq gqVar = this.f269373a;
        BluetoothDevice bluetoothDevice = this.f269374b;
        C59104x b = C96248gq.f269387m.mo56224b();
        b.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
        ((C59052c) ((C59052c) b).mo56372aa(17020)).mo56386p("removeBond");
        try {
            if (Boolean.TRUE.equals(BluetoothDevice.class.getMethod("removeBond", new Class[0]).invoke(bluetoothDevice, new Object[0]))) {
                C59104x b2 = C96248gq.f269387m.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
                ((C59052c) ((C59052c) b2).mo56372aa(17038)).mo56386p("device unpaired");
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            C59104x d = C96248gq.f269387m.mo56226d();
            d.mo56378ag(C58975e.f156826a, "HerbieAuxLoadingFrag");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17039)).mo56386p("Can't check if connected");
        }
        gqVar.mo90021q(9);
    }
}
