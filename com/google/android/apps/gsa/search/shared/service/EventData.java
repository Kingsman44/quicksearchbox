package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public abstract class EventData implements Parcelable {

    /* renamed from: a */
    private final Parcelable f236956a;

    protected EventData(Parcelable parcelable) {
        m142676c(parcelable);
        this.f236956a = parcelable;
    }

    /* renamed from: c */
    protected static void m142676c(Parcelable parcelable) {
        Class<?> cls;
        if (parcelable != null) {
            String name = parcelable.getClass().getName();
            boolean z = false;
            try {
                cls = Class.forName(name, false, EventData.class.getClassLoader());
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls == parcelable.getClass()) {
                z = true;
            }
            C58838bb.m90873h(z, "%s is not available in the main apk classloader", name);
        }
    }

    /* renamed from: a */
    public abstract byte[] mo81911a();

    /* renamed from: d */
    public final boolean mo81913d(Class cls) {
        Parcelable parcelable = this.f236956a;
        return parcelable != null && cls.isInstance(parcelable);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(mo81911a());
        parcel.writeParcelable(this.f236956a, 0);
    }

    /* renamed from: b */
    public final Parcelable mo81912b(Class cls) {
        Parcelable parcelable = this.f236956a;
        parcelable.getClass();
        return (Parcelable) cls.cast(parcelable);
    }
}
