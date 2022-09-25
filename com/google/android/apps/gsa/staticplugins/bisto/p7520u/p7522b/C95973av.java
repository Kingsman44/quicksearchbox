package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.av */
/* compiled from: PG */
public final /* synthetic */ class C95973av implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268710a;

    /* renamed from: b */
    public final /* synthetic */ BluetoothDevice f268711b;

    /* renamed from: c */
    public final /* synthetic */ Intent f268712c;

    public /* synthetic */ C95973av(C96017bm bmVar, BluetoothDevice bluetoothDevice, Intent intent) {
        this.f268710a = bmVar;
        this.f268711b = bluetoothDevice;
        this.f268712c = intent;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268710a;
        BluetoothDevice bluetoothDevice = this.f268711b;
        Intent intent = this.f268712c;
        C124548d dVar = (C124548d) obj;
        if ((dVar.mo106526x().f386148a & 8) != 0 && dVar.mo106526x().f386152e) {
            try {
                boolean z = false;
                Boolean bool = (Boolean) bluetoothDevice.getClass().getMethod("isConnected", new Class[0]).invoke(bluetoothDevice, new Object[0]);
                if (bool != null && bool.booleanValue()) {
                    z = true;
                }
                C58976aa aaVar = C58975e.f156826a;
                if (z) {
                    return;
                }
            } catch (NoSuchMethodException e) {
                C59104x c = C96017bm.f268828a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15715)).mo56386p("Couldn't find isConnected method");
            } catch (IllegalAccessException e2) {
                C59104x c2 = C96017bm.f268828a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(15716)).mo56386p("Illegal access");
            } catch (InvocationTargetException e3) {
                C59104x c3 = C96017bm.f268828a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(15717)).mo56386p("Invocation target exception");
            } catch (SecurityException e4) {
                C59104x c4 = C96017bm.f268828a.mo56225c();
                c4.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) ((C59052c) c4).mo56382g(e4)).mo56372aa(15718)).mo56386p("Security exception");
            }
        }
        new C90873ag(bmVar.mo89879c(bluetoothDevice, dVar), bmVar.f268837g, "getIsUsingConnectionSequencing", new C95966ao(bmVar, intent, bluetoothDevice)).mo85223a(new C95967ap(bmVar, bluetoothDevice));
    }
}
