package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class AdditionalPlaceCandidates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145960g();

    /* renamed from: a */
    public final List f394562a;

    static {
        new ArrayList();
    }

    public AdditionalPlaceCandidates(List list) {
        this.f394562a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f394562a);
        C143947c.m234083b(parcel, a);
    }
}
