package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.d */
/* compiled from: PG */
public abstract class C143970d extends C8849b implements C143971e {
    public C143970d() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo119506b((Status) C8850c.m23492a(parcel, Status.CREATOR), (ModuleAvailabilityResponse) C8850c.m23492a(parcel, ModuleAvailabilityResponse.CREATOR));
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo119505a((Status) C8850c.m23492a(parcel, Status.CREATOR), (ModuleInstallResponse) C8850c.m23492a(parcel, ModuleInstallResponse.CREATOR));
        } else if (i == 3) {
            Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) C8850c.m23492a(parcel, ModuleInstallIntentResponse.CREATOR);
            enforceNoDataAvail(parcel);
            mo119508d();
        } else if (i != 4) {
            return false;
        } else {
            Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
            enforceNoDataAvail(parcel);
            mo119507c();
        }
        return true;
    }
}
