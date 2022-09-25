package com.google.android.gms.contextmanager.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* compiled from: PG */
public class WriteBatchImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144059ae();

    /* renamed from: a */
    public ArrayList f390332a;

    public WriteBatchImpl() {
    }

    public WriteBatchImpl(ArrayList arrayList) {
        this.f390332a = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 3, this.f390332a);
        C143947c.m234083b(parcel, a);
    }
}
