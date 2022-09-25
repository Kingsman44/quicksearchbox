package com.google.android.gms.facs.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class UpdateActivityControlsSettingsResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144188p();

    /* renamed from: a */
    public final byte[] f390485a;

    public UpdateActivityControlsSettingsResult(byte[] bArr) {
        this.f390485a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f390485a);
        C143947c.m234083b(parcel, a);
    }
}
