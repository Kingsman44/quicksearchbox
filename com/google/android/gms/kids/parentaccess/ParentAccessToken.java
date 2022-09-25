package com.google.android.gms.kids.parentaccess;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class ParentAccessToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144433a();

    /* renamed from: a */
    public String f391038a;

    /* renamed from: b */
    public long f391039b;

    private ParentAccessToken() {
    }

    public ParentAccessToken(String str, long j) {
        this.f391038a = str;
        this.f391039b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParentAccessToken) {
            ParentAccessToken parentAccessToken = (ParentAccessToken) obj;
            return C143912ba.m233950b(this.f391038a, parentAccessToken.f391038a) && C143912ba.m233950b(Long.valueOf(this.f391039b), Long.valueOf(parentAccessToken.f391039b));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f391038a, Long.valueOf(this.f391039b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f391038a);
        C143947c.m234090i(parcel, 2, this.f391039b);
        C143947c.m234083b(parcel, a);
    }
}
