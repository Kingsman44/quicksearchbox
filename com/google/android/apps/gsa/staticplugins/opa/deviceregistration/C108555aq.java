package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import com.google.android.apps.gsa.shared.p7006ax.C89322a;
import com.google.android.gms.mdns.MdnsServiceInfo;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.aq */
/* compiled from: PG */
final class C108555aq implements C89322a {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo83246a(Object obj) {
        C59104x b = C108556ar.f301993a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DeviceDiscoveryCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(24124)).mo56389s("Device Added %s", ((MdnsServiceInfo) obj).f392168c);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo83247b(Object obj) {
        C59104x b = C108556ar.f301993a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DeviceDiscoveryCtrl");
        ((C59052c) ((C59052c) b).mo56372aa(24125)).mo56389s("Device Removed %s", ((MdnsServiceInfo) obj).f392168c);
    }
}
