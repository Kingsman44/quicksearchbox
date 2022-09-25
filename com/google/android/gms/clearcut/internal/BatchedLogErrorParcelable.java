package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public class BatchedLogErrorParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143633a();

    /* renamed from: a */
    public final List f389426a;

    public BatchedLogErrorParcelable(List list) {
        this.f389426a = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchedLogErrorParcelable)) {
            return false;
        }
        return this.f389426a.equals(((BatchedLogErrorParcelable) obj).f389426a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f389426a});
    }

    public final String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.f389426a + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 1, this.f389426a);
        C143947c.m234083b(parcel, a);
    }
}
