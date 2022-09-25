package com.google.android.libraries.privatetelemetry.tqcobalt.p2448a;

import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.common.api.Status;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.a.a */
/* compiled from: PG */
public final /* synthetic */ class C32002a implements C143712ae {

    /* renamed from: a */
    public final /* synthetic */ C32003b f86001a;

    public /* synthetic */ C32002a(C32003b bVar) {
        this.f86001a = bVar;
    }

    /* renamed from: a */
    public final void mo6030a(C143711ad adVar) {
        C32003b bVar = this.f86001a;
        Status status = (Status) adVar;
        if (status.mo119097c()) {
            ((C59052c) ((C59052c) C32003b.f86002a.mo56224b()).mo56372aa(50471)).mo56389s("Cobalt: successfully finished uploading logs to Clearcut log_source = %s", bVar.f86003b.f389487n);
        } else {
            ((C59052c) ((C59052c) C32003b.f86002a.mo56226d()).mo56372aa(50470)).mo56354G("Cobalt: finished uploading logs to Clearcut log_source = %s with status: %s", bVar.f86003b.f389487n, status);
        }
    }
}
