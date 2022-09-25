package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.List;

/* compiled from: PG */
public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146484co();

    /* renamed from: a */
    public final int f395634a;

    /* renamed from: b */
    public final long f395635b;

    /* renamed from: c */
    public final List f395636c;

    public StorageInfoResponse(int i, long j, List list) {
        this.f395634a = i;
        this.f395635b = j;
        this.f395636c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395634a);
        C143947c.m234090i(parcel, 3, this.f395635b);
        C143947c.m234080C(parcel, 4, this.f395636c);
        C143947c.m234083b(parcel, a);
    }
}
