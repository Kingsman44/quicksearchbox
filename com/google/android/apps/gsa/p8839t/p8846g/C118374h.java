package com.google.android.apps.gsa.p8839t.p8846g;

import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.common.base.C58817ah;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.t.g.h */
/* compiled from: PG */
public final /* synthetic */ class C118374h implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C118378l f328563a;

    public /* synthetic */ C118374h(C118378l lVar) {
        this.f328563a = lVar;
    }

    public final Object apply(Object obj) {
        C118378l lVar = this.f328563a;
        C59104x c = C118378l.f328567a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.SyncRequestData");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(6950)).mo56386p("Failed to get carrier params. Error");
        C89886e b = ((C89911f) lVar.f328574h.mo27525b()).mo83756b(new C90452a(211, C89885b.PCP_FAIL_TO_GET_CARRIER_PARAMS_VALUE));
        b.f246282c = 151948435;
        b.mo83721a();
        return C58836b.f156633a;
    }
}
