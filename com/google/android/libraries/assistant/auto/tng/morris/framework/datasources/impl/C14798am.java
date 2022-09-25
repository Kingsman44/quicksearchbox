package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.app.NotificationManager;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14079g;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14082j;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14096x;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14097y;
import com.google.android.libraries.assistant.auto.tng.morris.p1067b.C14098z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.am */
/* compiled from: PG */
public final /* synthetic */ class C14798am implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14800ao f44583a;

    /* renamed from: b */
    public final /* synthetic */ Optional f44584b;

    public /* synthetic */ C14798am(C14800ao aoVar, Optional optional) {
        this.f44583a = aoVar;
        this.f44584b = optional;
    }

    public final void run() {
        C14800ao aoVar = this.f44583a;
        Optional optional = this.f44584b;
        if (optional.isPresent()) {
            C14096x xVar = aoVar.f44589c;
            C14097y yVar = (C14097y) C14098z.f42765e.createBuilder();
            int i = ((NotificationManager.Policy) optional.get()).priorityCategories;
            yVar.copyOnWrite();
            ((C14098z) yVar.instance).f42767a = i;
            int i2 = ((NotificationManager.Policy) optional.get()).priorityCallSenders;
            yVar.copyOnWrite();
            ((C14098z) yVar.instance).f42768b = i2;
            int i3 = ((NotificationManager.Policy) optional.get()).priorityMessageSenders;
            yVar.copyOnWrite();
            ((C14098z) yVar.instance).f42769c = i3;
            int i4 = ((NotificationManager.Policy) optional.get()).suppressedVisualEffects;
            yVar.copyOnWrite();
            ((C14098z) yVar.instance).f42770d = i4;
            C58976aa aaVar = C58975e.f156826a;
            xVar.f42764b.mo46040b(new C14082j((C14098z) yVar.build()), C60826bg.f164896a);
            return;
        }
        C14096x xVar2 = aoVar.f44589c;
        C58976aa aaVar2 = C58975e.f156826a;
        xVar2.f42764b.mo46040b(C14079g.f42746a, C60826bg.f164896a);
    }
}
