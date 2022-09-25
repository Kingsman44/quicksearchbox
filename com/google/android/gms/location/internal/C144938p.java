package com.google.android.gms.location.internal;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.location.C144888as;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.location.internal.p */
/* compiled from: PG */
public final class C144938p extends C144888as {

    /* renamed from: a */
    final /* synthetic */ C146010af f391891a;

    /* renamed from: b */
    final /* synthetic */ C144918ag f391892b;

    public C144938p(C144918ag agVar, C146010af afVar) {
        this.f391892b = agVar;
        this.f391891a = afVar;
    }

    /* renamed from: a */
    public final void mo120382a(LocationResult locationResult) {
        Location location;
        C146010af afVar = this.f391891a;
        int size = locationResult.f391782b.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) locationResult.f391782b.get(size - 1);
        }
        afVar.f394698a.mo122510x(location);
        try {
            this.f391892b.mo120419m(C143785cf.m233679a(this, "GetCurrentLocation"), false, new C146010af());
        } catch (RemoteException unused) {
        }
    }
}
