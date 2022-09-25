package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import android.text.TextUtils;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.tasks.C146039s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.aa */
/* compiled from: PG */
public final /* synthetic */ class C100974aa implements C146039s {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerOptions f282044a;

    public /* synthetic */ C100974aa(InAppTrainerOptions inAppTrainerOptions) {
        this.f282044a = inAppTrainerOptions;
    }

    /* renamed from: d */
    public final void mo18633d(Exception exc) {
        InAppTrainerOptions inAppTrainerOptions = this.f282044a;
        if (TextUtils.isEmpty(inAppTrainerOptions.f391073d)) {
            C59104x c = C100982ai.f282052a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TrainRegHelper");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(exc)).mo56372aa(19639)).mo56389s("Failed to scheduled P13n training for session: %s", inAppTrainerOptions.f391070a);
            return;
        }
        C59104x c2 = C100982ai.f282052a.mo56225c();
        c2.mo56378ag(C58975e.f156826a, "TrainRegHelper");
        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(exc)).mo56372aa(19638)).mo56389s("Failed to schedule FL training for population: %s", inAppTrainerOptions.f391073d);
    }
}
