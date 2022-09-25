package com.google.p5261vr.p5262a.p5263a.p5264a;

import android.util.Log;
import com.google.android.gms.common.api.C143711ad;
import com.google.android.gms.common.api.C143712ae;
import com.google.android.gms.usagereporting.p10876a.C146080f;

/* renamed from: com.google.vr.a.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C67926o implements C143712ae {

    /* renamed from: a */
    public final /* synthetic */ C67927p f184103a;

    public /* synthetic */ C67926o(C67927p pVar) {
        this.f184103a = pVar;
    }

    /* renamed from: a */
    public final void mo6030a(C143711ad adVar) {
        C67927p pVar = this.f184103a;
        C146080f fVar = (C146080f) adVar;
        if (!fVar.f394803a.mo119097c()) {
            Log.d("GmsCoreDeviceStateRetriever", "Failed to query usage reporting opt-in status, pretending Checkbox is off.");
            pVar.mo60047a(new C67913b(false));
        } else if (fVar.mo122604b()) {
            pVar.mo60047a(new C67913b(true));
        } else {
            pVar.mo60047a(new C67913b(false));
        }
    }
}
