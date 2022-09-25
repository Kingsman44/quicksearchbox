package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.p10842a.C144869a;
import java.util.Arrays;

/* compiled from: PG */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144886aq();

    /* renamed from: a */
    public final long f391756a;

    /* renamed from: b */
    public final int f391757b;

    /* renamed from: c */
    public final boolean f391758c;

    /* renamed from: d */
    public final String f391759d;

    /* renamed from: e */
    public final ClientIdentity f391760e;

    public LastLocationRequest(long j, int i, boolean z, String str, ClientIdentity clientIdentity) {
        this.f391756a = j;
        this.f391757b = i;
        this.f391758c = z;
        this.f391759d = str;
        this.f391760e = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        if (this.f391756a == lastLocationRequest.f391756a && this.f391757b == lastLocationRequest.f391757b && this.f391758c == lastLocationRequest.f391758c && C143912ba.m233950b(this.f391759d, lastLocationRequest.f391759d) && C143912ba.m233950b(this.f391760e, lastLocationRequest.f391760e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f391756a), Integer.valueOf(this.f391757b), Boolean.valueOf(this.f391758c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.f391756a != Long.MAX_VALUE) {
            sb.append("maxAge=");
            C144869a.m235460a(this.f391756a, sb);
        }
        if (this.f391757b != 0) {
            sb.append(", ");
            sb.append(C144879aj.m235476a(this.f391757b));
        }
        if (this.f391758c) {
            sb.append(", bypass");
        }
        if (this.f391759d != null) {
            sb.append(", moduleId=");
            sb.append(this.f391759d);
        }
        if (this.f391760e != null) {
            sb.append(", impersonation=");
            sb.append(this.f391760e);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f391756a);
        C143947c.m234089h(parcel, 2, this.f391757b);
        C143947c.m234084c(parcel, 3, this.f391758c);
        C143947c.m234106y(parcel, 4, this.f391759d);
        C143947c.m234105x(parcel, 5, this.f391760e, i);
        C143947c.m234083b(parcel, a);
    }
}
