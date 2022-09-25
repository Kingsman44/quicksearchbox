package com.google.android.enterprise.connectedapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Objects;

/* compiled from: PG */
public final class BundlerType implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C142578c();

    /* renamed from: a */
    public final String f386875a;

    /* renamed from: b */
    public final List f386876b;

    public BundlerType(Parcel parcel) {
        this.f386875a = parcel.readString();
        this.f386876b = parcel.createTypedArrayList(CREATOR);
    }

    private BundlerType(String str, List list) {
        this.f386875a = str;
        this.f386876b = list;
    }

    /* renamed from: a */
    public static BundlerType m231188a(String str) {
        return new BundlerType(str, Collections.emptyList());
    }

    /* renamed from: b */
    public static BundlerType m231189b(String str, BundlerType... bundlerTypeArr) {
        return new BundlerType(str, Arrays.asList(bundlerTypeArr));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BundlerType bundlerType = (BundlerType) obj;
            return this.f386875a.equals(bundlerType.f386875a) && this.f386876b.equals(bundlerType.f386876b);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f386875a, this.f386876b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f386875a);
        parcel.writeTypedList(this.f386876b);
    }
}
