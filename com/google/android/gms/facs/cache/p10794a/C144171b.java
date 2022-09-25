package com.google.android.gms.facs.cache.p10794a;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.facs.cache.ForceSettingsCacheRefreshResult;
import com.google.android.gms.facs.cache.GetActivityControlsSettingsResult;
import com.google.android.gms.facs.cache.ReadDeviceLevelSettingsResult;
import com.google.android.gms.facs.cache.UpdateActivityControlsSettingsResult;
import com.google.android.p445a.C8849b;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.facs.cache.a.b */
/* compiled from: PG */
public abstract class C144171b extends C8849b implements C144172c {
    public C144171b() {
        super("com.google.android.gms.facs.cache.internal.IFacsCacheCallbacks");
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            enforceNoDataAvail(parcel);
            mo119709a((Status) C8850c.m23492a(parcel, Status.CREATOR), (ForceSettingsCacheRefreshResult) C8850c.m23492a(parcel, ForceSettingsCacheRefreshResult.CREATOR));
        } else if (i == 2) {
            enforceNoDataAvail(parcel);
            mo119710b((Status) C8850c.m23492a(parcel, Status.CREATOR), (UpdateActivityControlsSettingsResult) C8850c.m23492a(parcel, UpdateActivityControlsSettingsResult.CREATOR));
        } else if (i == 3) {
            enforceNoDataAvail(parcel);
            mo119711c((Status) C8850c.m23492a(parcel, Status.CREATOR), (GetActivityControlsSettingsResult) C8850c.m23492a(parcel, GetActivityControlsSettingsResult.CREATOR));
        } else if (i == 4) {
            Status status = (Status) C8850c.m23492a(parcel, Status.CREATOR);
            enforceNoDataAvail(parcel);
            mo119713e();
        } else if (i != 5) {
            return false;
        } else {
            Status status2 = (Status) C8850c.m23492a(parcel, Status.CREATOR);
            ReadDeviceLevelSettingsResult readDeviceLevelSettingsResult = (ReadDeviceLevelSettingsResult) C8850c.m23492a(parcel, ReadDeviceLevelSettingsResult.CREATOR);
            enforceNoDataAvail(parcel);
            mo119712d();
        }
        return true;
    }
}
