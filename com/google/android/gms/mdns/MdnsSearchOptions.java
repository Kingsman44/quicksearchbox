package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class MdnsSearchOptions extends AbstractSafeParcelable implements C143721f {
    public static final Parcelable.Creator CREATOR = new C145116b();

    /* renamed from: a */
    public final List f392161a;

    /* renamed from: b */
    public final boolean f392162b;

    /* renamed from: c */
    public final boolean f392163c;

    /* renamed from: d */
    public final boolean f392164d;

    /* renamed from: e */
    public final int f392165e;

    public MdnsSearchOptions(List list, boolean z, boolean z2, boolean z3, int i) {
        ArrayList arrayList = new ArrayList();
        this.f392161a = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        this.f392162b = z;
        this.f392163c = z2;
        this.f392164d = z3;
        this.f392165e = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234078A(parcel, 2, this.f392161a);
        C143947c.m234084c(parcel, 3, this.f392162b);
        C143947c.m234084c(parcel, 4, this.f392163c);
        C143947c.m234084c(parcel, 5, this.f392164d);
        C143947c.m234089h(parcel, 6, this.f392165e);
        C143947c.m234083b(parcel, a);
    }
}
