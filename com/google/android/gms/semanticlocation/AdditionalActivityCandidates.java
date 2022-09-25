package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class AdditionalActivityCandidates extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145959f();

    /* renamed from: a */
    public final List f394561a;

    static {
        new ArrayList();
    }

    public AdditionalActivityCandidates(List list) {
        this.f394561a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f394561a);
        C143947c.m234083b(parcel, a);
    }
}
