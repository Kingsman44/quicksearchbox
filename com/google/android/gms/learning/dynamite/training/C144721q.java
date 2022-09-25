package com.google.android.gms.learning.dynamite.training;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4554b.p4555a.C59644x;

/* renamed from: com.google.android.gms.learning.dynamite.training.q */
/* compiled from: PG */
public final /* synthetic */ class C144721q implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C144588ad f391510a;

    /* renamed from: b */
    public final /* synthetic */ int f391511b;

    public /* synthetic */ C144721q(C144588ad adVar, int i) {
        this.f391510a = adVar;
        this.f391511b = i;
    }

    public final Object apply(Object obj) {
        C144588ad adVar = this.f391510a;
        int i = this.f391511b;
        if (((Boolean) obj).booleanValue()) {
            C58836b bVar = C58836b.f156633a;
            adVar.mo120077u(i, bVar, bVar);
            return Status.f389615a;
        }
        adVar.mo120077u(i, C58833ax.m90834k(C59644x.ERROR_REASON_FILE_DELETION), C58836b.f156633a);
        return new Status(1, 25001, "Error occurs when deleting output directory!", (PendingIntent) null, (ConnectionResult) null);
    }
}
