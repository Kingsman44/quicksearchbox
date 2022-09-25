package com.google.android.apps.gsa.staticplugins.fedass.ipc.service;

import android.text.TextUtils;
import com.google.android.gms.learning.InAppTrainerOptions;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146042v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.ipc.service.ah */
/* compiled from: PG */
public final /* synthetic */ class C100981ah implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerOptions f282051a;

    public /* synthetic */ C100981ah(InAppTrainerOptions inAppTrainerOptions) {
        this.f282051a = inAppTrainerOptions;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        InAppTrainerOptions inAppTrainerOptions = this.f282051a;
        C146006ab abVar = (C146006ab) obj;
        if (TextUtils.isEmpty(inAppTrainerOptions.f391073d)) {
            C59104x b = C100982ai.f282052a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "TrainRegHelper");
            ((C59052c) ((C59052c) b).mo56372aa(19637)).mo56389s("P13n training scheduled for session: %s", inAppTrainerOptions.f391070a);
            return;
        }
        C59104x b2 = C100982ai.f282052a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "TrainRegHelper");
        ((C59052c) ((C59052c) b2).mo56372aa(19636)).mo56389s("FL training scheduled for population: %s", inAppTrainerOptions.f391073d);
    }
}
