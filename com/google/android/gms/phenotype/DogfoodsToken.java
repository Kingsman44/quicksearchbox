package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class DogfoodsToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145725c();

    /* renamed from: a */
    public final byte[] f393987a;

    public DogfoodsToken(byte[] bArr) {
        this.f393987a = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 2, this.f393987a);
        C143947c.m234083b(parcel, a);
    }
}
