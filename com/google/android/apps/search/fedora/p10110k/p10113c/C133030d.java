package com.google.android.apps.search.fedora.p10110k.p10113c;

import android.text.TextUtils;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.tasks.C146042v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.fedora.k.c.d */
/* compiled from: PG */
public final /* synthetic */ class C133030d implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerOptions f362753a;

    public /* synthetic */ C133030d(InAppTrainerOptions inAppTrainerOptions) {
        this.f362753a = inAppTrainerOptions;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        InAppTrainerOptions inAppTrainerOptions = this.f362753a;
        Void voidR = (Void) obj;
        if (TextUtils.isEmpty(inAppTrainerOptions.f391073d)) {
            C59104x b = C133046t.f362774a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) b).mo56372aa(39994)).mo56389s("P13n training scheduled for session: %s", inAppTrainerOptions.f391070a);
            return;
        }
        C59104x b2 = C133046t.f362774a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) b2).mo56372aa(39993)).mo56389s("FL training scheduled for population: %s", inAppTrainerOptions.f391073d);
    }
}
