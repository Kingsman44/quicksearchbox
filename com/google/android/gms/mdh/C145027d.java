package com.google.android.gms.mdh;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.p10844m.C144992a;

/* renamed from: com.google.android.gms.mdh.d */
/* compiled from: PG */
public final /* synthetic */ class C145027d implements C144992a {

    /* renamed from: a */
    public final /* synthetic */ int f392047a;

    public /* synthetic */ C145027d(int i) {
        this.f392047a = i;
    }

    /* renamed from: a */
    public final void mo120490a(SafeParcelable safeParcelable, Parcel parcel) {
        int i = this.f392047a;
        MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) safeParcelable;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, mdhFootprintsReadResult.f392023a);
        C143947c.m234105x(parcel, 2, mdhFootprintsReadResult.f392024b, i);
        C143947c.m234083b(parcel, a);
    }
}
