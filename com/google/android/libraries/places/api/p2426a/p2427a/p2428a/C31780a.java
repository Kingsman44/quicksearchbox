package com.google.android.libraries.places.api.p2426a.p2427a.p2428a;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146010af;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146025e;

/* renamed from: com.google.android.libraries.places.api.a.a.a.a */
/* compiled from: PG */
public final class C31780a implements C146025e {
    /* renamed from: a */
    public final /* synthetic */ Object mo37294a(C146006ab abVar) {
        C146010af afVar = new C146010af();
        if (((C146014aj) abVar).f394703b) {
            afVar.f394698a.mo122509w(new C143842n(new Status(1, 16, "Location request was cancelled. Please try again.", (PendingIntent) null, (ConnectionResult) null)));
        } else if (abVar.mo122487f() == null && abVar.mo122488g() == null) {
            afVar.f394698a.mo122509w(new C143842n(new Status(1, 8, "Location unavailable.", (PendingIntent) null, (ConnectionResult) null)));
        }
        return afVar.f394698a.mo122487f() != null ? afVar.f394698a : abVar;
    }
}
