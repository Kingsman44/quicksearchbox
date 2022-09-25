package com.google.android.gms.semanticlocation;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* compiled from: PG */
public class SemanticLocationEventRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145951ab();

    /* renamed from: a */
    public final float f394626a;

    public SemanticLocationEventRequest(float f) {
        this.f394626a = f;
    }

    public final boolean equals(Object obj) {
        return obj instanceof SemanticLocationEventRequest;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return C143910az.m233946a(new ArrayList(), this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234087f(parcel, 1, this.f394626a);
        C143947c.m234083b(parcel, a);
    }
}
