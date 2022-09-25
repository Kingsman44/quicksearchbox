package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

@Deprecated
/* compiled from: PG */
public class FenceTriggerInfoImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144044l();

    /* renamed from: a */
    public final boolean f390283a;

    /* renamed from: b */
    public final String f390284b;

    public FenceTriggerInfoImpl(boolean z, String str) {
        this.f390283a = z;
        C143919bh.m233969l(str);
        this.f390284b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 2, this.f390283a);
        C143947c.m234106y(parcel, 3, this.f390284b);
        C143947c.m234083b(parcel, a);
    }
}
