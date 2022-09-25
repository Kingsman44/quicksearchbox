package com.google.android.libraries.places.api.p2426a.p2427a.p2430c;

import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C143842n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.gms.tasks.C146025e;

/* renamed from: com.google.android.libraries.places.api.a.a.c.i */
/* compiled from: PG */
public final /* synthetic */ class C31831i implements C146025e {

    /* renamed from: a */
    public static final /* synthetic */ C31831i f85444a = new C31831i();

    private /* synthetic */ C31831i() {
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        C143842n nVar;
        Exception f = abVar.mo122487f();
        if (f == null) {
            return abVar;
        }
        if (f instanceof C143842n) {
            nVar = (C143842n) f;
        } else {
            nVar = new C143842n(new Status(1, 13, f.toString(), (PendingIntent) null, (ConnectionResult) null));
        }
        return C146021aq.m237849c(nVar);
    }
}
