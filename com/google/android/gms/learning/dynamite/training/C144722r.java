package com.google.android.gms.learning.dynamite.training;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4552o.p4554b.p4555a.C59644x;
import java.io.IOException;

/* renamed from: com.google.android.gms.learning.dynamite.training.r */
/* compiled from: PG */
public final /* synthetic */ class C144722r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C144588ad f391512a;

    /* renamed from: b */
    public final /* synthetic */ int f391513b;

    public /* synthetic */ C144722r(C144588ad adVar, int i) {
        this.f391512a = adVar;
        this.f391513b = i;
    }

    public final Object apply(Object obj) {
        IOException iOException = (IOException) obj;
        this.f391512a.mo120077u(this.f391513b, C58833ax.m90834k(C59644x.ERROR_REASON_IO_EXCEPTION), C58836b.f156633a);
        return new Status(1, 8, "IOException", (PendingIntent) null, (ConnectionResult) null);
    }
}
