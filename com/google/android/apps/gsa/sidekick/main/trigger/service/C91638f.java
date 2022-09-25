package com.google.android.apps.gsa.sidekick.main.trigger.service;

import android.location.Location;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.sidekick.main.trigger.service.f */
/* compiled from: PG */
public final /* synthetic */ class C91638f implements C118549h {

    /* renamed from: a */
    public final /* synthetic */ C91635c f255591a;

    public /* synthetic */ C91638f(C91635c cVar) {
        this.f255591a = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C91635c cVar = this.f255591a;
        C58976aa aaVar = C58975e.f156826a;
        C118522by byVar = C118522by.UNKNOWN;
        return cVar.f255583b.mo85589a((Location) null, TimeUnit.MILLISECONDS.toSeconds(cVar.f255582a.mo26870b()), new TriggerConditionEvaluator.APriori((List) C58485gu.m89845m()));
    }
}
