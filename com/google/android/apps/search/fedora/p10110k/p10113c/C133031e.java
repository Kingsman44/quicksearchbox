package com.google.android.apps.search.fedora.p10110k.p10113c;

import android.text.TextUtils;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.tasks.C146039s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.search.fedora.k.c.e */
/* compiled from: PG */
public final /* synthetic */ class C133031e implements C146039s {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerOptions f362754a;

    public /* synthetic */ C133031e(InAppTrainerOptions inAppTrainerOptions) {
        this.f362754a = inAppTrainerOptions;
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        InAppTrainerOptions inAppTrainerOptions = this.f362754a;
        if (TextUtils.isEmpty(inAppTrainerOptions.f391073d)) {
            C59104x c = C133046t.f362774a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(39996)).mo56389s("Failed to scheduled P13n training for session: %s", inAppTrainerOptions.f391070a);
            return;
        }
        C59104x c2 = C133046t.f362774a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "FedoraTrngRegServ");
        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(exc)).mo56372aa(39995)).mo56389s("Failed to schedule FL training for population: %s", inAppTrainerOptions.f391073d);
    }
}
