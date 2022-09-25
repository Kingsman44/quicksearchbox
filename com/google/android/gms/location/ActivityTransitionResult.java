package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class ActivityTransitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144952m();

    /* renamed from: a */
    public final List f391739a;

    /* renamed from: b */
    public Bundle f391740b = null;

    public ActivityTransitionResult(List list, Bundle bundle) {
        C143919bh.m233971n(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C143919bh.m233959b(((ActivityTransitionEvent) list.get(i)).f391733c >= ((ActivityTransitionEvent) list.get(i + -1)).f391733c);
            }
        }
        this.f391739a = Collections.unmodifiableList(list);
        this.f391740b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f391739a.equals(((ActivityTransitionResult) obj).f391739a);
    }

    public final int hashCode() {
        return this.f391739a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C143919bh.m233958a(parcel);
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f391739a);
        C143947c.m234093l(parcel, 2, this.f391740b);
        C143947c.m234083b(parcel, a);
    }
}
