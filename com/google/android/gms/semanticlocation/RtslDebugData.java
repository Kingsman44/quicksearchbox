package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class RtslDebugData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145985w();

    /* renamed from: a */
    public final List f394615a;

    /* renamed from: b */
    public final List f394616b;

    public RtslDebugData(List list, List list2) {
        this.f394615a = list;
        this.f394616b = list2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f394615a);
        C143947c.m234103v(parcel, 2, this.f394616b);
        C143947c.m234083b(parcel, a);
    }
}
