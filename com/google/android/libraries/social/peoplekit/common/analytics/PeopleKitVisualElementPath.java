package com.google.android.libraries.social.peoplekit.common.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.p3260a.p3265d.C41908a;
import com.google.android.libraries.social.p3260a.p3265d.C41909b;

/* compiled from: PG */
public final class PeopleKitVisualElementPath implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42079i();

    /* renamed from: a */
    public final C41909b f109973a;

    public PeopleKitVisualElementPath() {
        this.f109973a = new C41909b();
    }

    /* renamed from: a */
    public final void mo44564a(C41909b bVar) {
        for (C41908a a : bVar.f109314a) {
            this.f109973a.mo44369a(a);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PeopleKitVisualElementPath)) {
            return false;
        }
        return this.f109973a.equals(((PeopleKitVisualElementPath) obj).f109973a);
    }

    public final int hashCode() {
        return this.f109973a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f109973a);
    }

    public PeopleKitVisualElementPath(Parcel parcel) {
        this.f109973a = (C41909b) parcel.readSerializable();
    }
}
