package com.google.android.libraries.search.assistant.invocation.android.parcelables;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class IBinderContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C33488b();

    /* renamed from: a */
    public final IBinder f89615a;

    public IBinderContainer(IBinder iBinder) {
        C69664n.m101061g(iBinder, "binder");
        this.f89615a = iBinder;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IBinderContainer) && C69664n.m101066l(this.f89615a, ((IBinderContainer) obj).f89615a);
    }

    public final int hashCode() {
        return this.f89615a.hashCode();
    }

    public final String toString() {
        IBinder iBinder = this.f89615a;
        return "IBinderContainer(binder=" + iBinder + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C69664n.m101061g(parcel, "out");
        parcel.writeStrongBinder(this.f89615a);
    }
}
