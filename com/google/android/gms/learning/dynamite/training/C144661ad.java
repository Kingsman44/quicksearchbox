package com.google.android.gms.learning.dynamite.training;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.p10823d.C144586ab;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4554b.p4555a.C59644x;

/* renamed from: com.google.android.gms.learning.dynamite.training.ad */
/* compiled from: PG */
public final /* synthetic */ class C144661ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerImpl f391409a;

    /* renamed from: b */
    public final /* synthetic */ C144588ad f391410b;

    public /* synthetic */ C144661ad(InAppTrainerImpl inAppTrainerImpl, C144588ad adVar) {
        this.f391409a = inAppTrainerImpl;
        this.f391410b = adVar;
    }

    public final Object apply(Object obj) {
        C144586ab abVar = (C144586ab) obj;
        this.f391410b.mo120077u(2, C58833ax.m90834k(C59644x.ERROR_REASON_JOB_SCHEDULER), C58833ax.m90834k(this.f391409a.f391381d));
        return new Status(1, 8, "JobScheduler returned failure", (PendingIntent) null, (ConnectionResult) null);
    }
}
