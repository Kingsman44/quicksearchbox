package com.google.android.gms.learning.dynamite.training;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4554b.p4555a.C59644x;
import java.io.IOException;

/* renamed from: com.google.android.gms.learning.dynamite.training.ae */
/* compiled from: PG */
public final /* synthetic */ class C144662ae implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerImpl f391411a;

    /* renamed from: b */
    public final /* synthetic */ C144588ad f391412b;

    public /* synthetic */ C144662ae(InAppTrainerImpl inAppTrainerImpl, C144588ad adVar) {
        this.f391411a = inAppTrainerImpl;
        this.f391412b = adVar;
    }

    public final Object apply(Object obj) {
        IOException iOException = (IOException) obj;
        this.f391412b.mo120077u(2, C58833ax.m90834k(C59644x.ERROR_REASON_IO_EXCEPTION), C58833ax.m90834k(this.f391411a.f391381d));
        return new Status(1, 8, "IOException", (PendingIntent) null, (ConnectionResult) null);
    }
}
