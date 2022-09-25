package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class DebugData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145961h();

    /* renamed from: a */
    public final List f394563a;

    /* renamed from: b */
    public final int f394564b;

    /* renamed from: c */
    public final List f394565c;

    /* renamed from: d */
    public final boolean f394566d;

    public DebugData(List list, int i, List list2, boolean z) {
        this.f394563a = list;
        this.f394564b = i;
        this.f394565c = list2;
        this.f394566d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f394563a);
        C143947c.m234089h(parcel, 2, this.f394564b);
        C143947c.m234080C(parcel, 3, this.f394565c);
        C143947c.m234084c(parcel, 4, this.f394566d);
        C143947c.m234083b(parcel, a);
    }
}
