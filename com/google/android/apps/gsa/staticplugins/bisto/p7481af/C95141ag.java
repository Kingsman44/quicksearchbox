package com.google.android.apps.gsa.staticplugins.bisto.p7481af;

import android.hardware.usb.UsbDevice;
import com.google.android.apps.gsa.shared.bisto.C89433a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.af.ag */
/* compiled from: PG */
final class C95141ag implements C89433a {

    /* renamed from: a */
    final /* synthetic */ C95144aj f266180a;

    public C95141ag(C95144aj ajVar) {
        this.f266180a = ajVar;
    }

    /* renamed from: a */
    public final void mo83342a(UsbDevice usbDevice) {
        C59104x d = C95144aj.f266188a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) d).mo56372aa(18167)).mo56386p("Usb device connected; ignoring");
    }

    /* renamed from: b */
    public final void mo83343b() {
        C59104x d = C95144aj.f266188a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) d).mo56372aa(18170)).mo56386p("No available bisto devices connected");
    }

    /* renamed from: c */
    public final void mo83344c(C124539a aVar) {
        String address = aVar.f343619a.getAddress();
        C59104x b = C95144aj.f266188a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) b).mo56372aa(18168)).mo56389s("Deeplink: open OOBE/settings: detectedDeviceId: %s", address);
        if (address != null) {
            this.f266180a.mo89068J(address, 1);
            return;
        }
        C59104x d = C95144aj.f266188a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "BistoWorker");
        ((C59052c) ((C59052c) d).mo56372aa(18169)).mo56386p("Null device ID, not proceeding");
    }
}
