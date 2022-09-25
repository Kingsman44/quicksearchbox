package com.google.android.apps.gsa.sidekick.shared.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7752iq;

/* compiled from: PG */
public class WrappedExecutedUserAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C91983bg();

    /* renamed from: a */
    public final C7752iq f256437a;

    /* renamed from: b */
    public final C7709ha f256438b;

    /* renamed from: c */
    public final boolean f256439c;

    public WrappedExecutedUserAction(C7752iq iqVar, C7709ha haVar, boolean z) {
        this.f256437a = iqVar;
        this.f256438b = haVar;
        this.f256439c = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ProtoLiteParcelable.m147140k(this.f256437a, parcel);
        ProtoLiteParcelable.m147140k(this.f256438b, parcel);
    }
}
