package com.google.android.gms.search.global.p10872a;

import android.os.Parcel;
import com.google.android.gms.search.global.GetCurrentExperimentIdsCall$Response;
import com.google.android.gms.search.global.GetGlobalSearchSourcesCall$Response;
import com.google.android.gms.search.global.GetPendingExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetExperimentIdsCall$Response;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.search.global.a.c */
/* compiled from: PG */
public abstract class C145895c extends C8849b implements C145896d {
    public C145895c() {
        super("com.google.android.gms.search.global.internal.IGlobalSearchAdminCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            enforceNoDataAvail(parcel);
            mo122287b((GetGlobalSearchSourcesCall$Response) C8850c.m23492a(parcel, GetGlobalSearchSourcesCall$Response.CREATOR));
            return true;
        } else if (i == 3) {
            enforceNoDataAvail(parcel);
            mo122289d((SetExperimentIdsCall$Response) C8850c.m23492a(parcel, SetExperimentIdsCall$Response.CREATOR));
            return true;
        } else if (i == 4) {
            enforceNoDataAvail(parcel);
            mo122286a((GetCurrentExperimentIdsCall$Response) C8850c.m23492a(parcel, GetCurrentExperimentIdsCall$Response.CREATOR));
            return true;
        } else if (i == 5) {
            enforceNoDataAvail(parcel);
            mo122288c((GetPendingExperimentIdsCall$Response) C8850c.m23492a(parcel, GetPendingExperimentIdsCall$Response.CREATOR));
            return true;
        } else if (i != 8) {
            return false;
        } else {
            enforceNoDataAvail(parcel);
            mo122290e((SetIncludeInGlobalSearchCall$Response) C8850c.m23492a(parcel, SetIncludeInGlobalSearchCall$Response.CREATOR));
            return true;
        }
    }
}
