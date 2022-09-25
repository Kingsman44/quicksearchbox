package com.google.android.apps.gsa.p8839t.p8846g;

import android.databinding.C0118a;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.assistant.p3897e.p3921j.C51715bm;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.t.g.b */
/* compiled from: PG */
public final /* synthetic */ class C118368b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C118378l f328557a;

    public /* synthetic */ C118368b(C118378l lVar) {
        this.f328557a = lVar;
    }

    public final Object apply(Object obj) {
        C118378l lVar = this.f328557a;
        C59104x c = C118378l.f328567a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.SyncRequestData");
        C0118a.m114v(c, obj, "Failed to create DeviceCapabilities. Error: %s", 6948);
        C89886e b = ((C89911f) lVar.f328574h.mo27525b()).mo83756b(new C90452a(211, C89885b.PCP_FAIL_TO_GET_DEVICE_CAPABILITIES_VALUE));
        b.f246282c = 151949611;
        b.mo83721a();
        return C51715bm.f135662t;
    }
}
