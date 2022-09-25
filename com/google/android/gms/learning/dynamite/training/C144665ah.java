package com.google.android.gms.learning.dynamite.training;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4554b.p4555a.C59644x;

/* renamed from: com.google.android.gms.learning.dynamite.training.ah */
/* compiled from: PG */
public final /* synthetic */ class C144665ah implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerImpl f391418a;

    /* renamed from: b */
    public final /* synthetic */ C144588ad f391419b;

    public /* synthetic */ C144665ah(InAppTrainerImpl inAppTrainerImpl, C144588ad adVar) {
        this.f391418a = inAppTrainerImpl;
        this.f391419b = adVar;
    }

    public final Object apply(Object obj) {
        InAppTrainerImpl inAppTrainerImpl = this.f391418a;
        C144588ad adVar = this.f391419b;
        if (((Boolean) obj).booleanValue()) {
            adVar.mo120077u(3, C58836b.f156633a, C58833ax.m90834k(inAppTrainerImpl.f391381d));
            return Status.f389615a;
        }
        adVar.mo120077u(3, C58833ax.m90834k(C59644x.ERROR_REASON_FILE_DELETION), C58833ax.m90834k(inAppTrainerImpl.f391381d));
        return new Status(1, 25001, "Error occurs when deleting output directory!", (PendingIntent) null, (ConnectionResult) null);
    }
}
