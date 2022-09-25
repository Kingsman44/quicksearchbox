package com.google.android.gms.contextmanager.fence.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* compiled from: PG */
public class FenceUpdateRequestImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144045m();

    /* renamed from: a */
    public final ArrayList f390285a;

    @Deprecated
    public FenceUpdateRequestImpl() {
        this.f390285a = new ArrayList();
    }

    public FenceUpdateRequestImpl(ArrayList arrayList) {
        this.f390285a = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 2, this.f390285a);
        C143947c.m234083b(parcel, a);
    }
}
