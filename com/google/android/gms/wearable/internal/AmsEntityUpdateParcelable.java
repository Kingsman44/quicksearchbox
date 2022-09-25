package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class AmsEntityUpdateParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146496d();

    /* renamed from: a */
    public byte f395523a;

    /* renamed from: b */
    public final byte f395524b;

    /* renamed from: c */
    public final String f395525c;

    public AmsEntityUpdateParcelable(byte b, byte b2, String str) {
        this.f395523a = b;
        this.f395524b = b2;
        this.f395525c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AmsEntityUpdateParcelable amsEntityUpdateParcelable = (AmsEntityUpdateParcelable) obj;
        return this.f395523a == amsEntityUpdateParcelable.f395523a && this.f395524b == amsEntityUpdateParcelable.f395524b && this.f395525c.equals(amsEntityUpdateParcelable.f395525c);
    }

    public final int hashCode() {
        return ((((this.f395523a + 31) * 31) + this.f395524b) * 31) + this.f395525c.hashCode();
    }

    public final String toString() {
        byte b = this.f395523a;
        byte b2 = this.f395524b;
        String str = this.f395525c;
        return "AmsEntityUpdateParcelable{, mEntityId=" + b + ", mAttributeId=" + b2 + ", mValue='" + str + "'}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234085d(parcel, 2, this.f395523a);
        C143947c.m234085d(parcel, 3, this.f395524b);
        C143947c.m234106y(parcel, 4, this.f395525c);
        C143947c.m234083b(parcel, a);
    }
}
