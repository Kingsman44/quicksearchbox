package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.bl */
/* compiled from: PG */
public final /* synthetic */ class C9593bl implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33201a;

    /* renamed from: b */
    public final /* synthetic */ String f33202b;

    public /* synthetic */ C9593bl(C9619ck ckVar, String str) {
        this.f33201a = ckVar;
        this.f33202b = str;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C9619ck ckVar = this.f33201a;
        String str = this.f33202b;
        C59104x c = C9619ck.f33236i.mo56225c();
        c.mo56378ag(C58975e.f156826a, "DevIdBistoSCntrl");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(382)).mo56389s("Error reading device info for %s", str);
        ckVar.mo17898G();
    }
}
