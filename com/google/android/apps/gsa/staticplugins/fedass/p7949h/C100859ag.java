package com.google.android.apps.gsa.staticplugins.fedass.p7949h;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.h.ag */
/* compiled from: PG */
public final /* synthetic */ class C100859ag implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ boolean f281829a;

    public /* synthetic */ C100859ag(boolean z) {
        this.f281829a = z;
    }

    public final C60870cx apply(Object obj) {
        boolean z = this.f281829a;
        C59104x c = C100862aj.f281832a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "FedAssSettingsCallback");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) obj)).mo56372aa(19670)).mo56389s("Failed to record the consent: %b", Boolean.valueOf(z));
        return C60866ct.f164955a;
    }
}
