package com.google.android.apps.gsa.shared.bisto;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9391a.C124539a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.shared.bisto.r */
/* compiled from: PG */
final class C89679r extends C90888av {

    /* renamed from: a */
    final /* synthetic */ SharedPreferences f242805a;

    /* renamed from: b */
    final /* synthetic */ int f242806b;

    /* renamed from: c */
    final /* synthetic */ C124539a f242807c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89679r(String str, C124539a aVar, SharedPreferences sharedPreferences, int i) {
        super(str, 2, 0);
        this.f242807c = aVar;
        this.f242805a = sharedPreferences;
        this.f242806b = i;
    }

    public final void run() {
        if (C89681t.m146044j(this.f242807c.f343619a.getAddress(), this.f242805a)) {
            C59104x b = C89681t.f242809a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "DeviceDetector");
            ((C59052c) ((C59052c) b).mo56372aa(10217)).mo56386p("Device is now cached as bisto device");
            return;
        }
        C59104x b2 = C89681t.f242809a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "DeviceDetector");
        ((C59052c) ((C59052c) b2).mo56372aa(10216)).mo56389s("Refreshing UUIDs: %s", this.f242807c.f343619a.getAddress());
        this.f242807c.f343619a.fetchUuidsWithSdp();
        this.f242805a.edit().putInt("prefs.uuid_a2dp_refreshed".concat(String.valueOf(this.f242807c.f343619a.getAddress())), this.f242806b + 1).apply();
    }
}
