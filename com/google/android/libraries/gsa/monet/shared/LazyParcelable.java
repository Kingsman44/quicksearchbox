package com.google.android.libraries.gsa.monet.shared;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class LazyParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C23122r();

    /* renamed from: a */
    private Bundle f63421a;

    /* renamed from: b */
    private Parcelable f63422b;

    public LazyParcelable(Parcel parcel) {
        this.f63421a = parcel.readBundle(getClass().getClassLoader());
    }

    public LazyParcelable(Parcelable parcelable) {
        this.f63422b = parcelable;
    }

    /* renamed from: a */
    public final Parcelable mo28508a(ClassLoader classLoader) {
        if (this.f63422b == null) {
            Bundle bundle = this.f63421a;
            bundle.getClass();
            bundle.setClassLoader(classLoader);
            Parcelable parcelable = this.f63421a.getParcelable("data");
            parcelable.getClass();
            this.f63422b = parcelable;
        }
        return this.f63422b;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        Object[] objArr = new Object[1];
        Object obj = this.f63422b;
        if (obj == null) {
            obj = "(parceled)";
        }
        objArr[0] = obj;
        return String.format("LazyParcelable[%s]", objArr);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f63421a == null) {
            Bundle bundle = new Bundle();
            this.f63421a = bundle;
            bundle.putParcelable("data", this.f63422b);
        }
        parcel.writeBundle(this.f63421a);
    }
}
