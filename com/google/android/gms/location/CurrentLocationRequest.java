package com.google.android.gms.location;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.common.util.C144018r;
import com.google.android.gms.libs.identity.ClientIdentity;
import com.google.android.gms.location.p10842a.C144869a;
import java.util.Arrays;

/* compiled from: PG */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144954o();

    /* renamed from: a */
    public final long f391741a;

    /* renamed from: b */
    public final int f391742b;

    /* renamed from: c */
    public final int f391743c;

    /* renamed from: d */
    public final long f391744d;

    /* renamed from: e */
    public final boolean f391745e;

    /* renamed from: f */
    public final int f391746f;

    /* renamed from: g */
    public final String f391747g;

    /* renamed from: h */
    public final WorkSource f391748h;

    /* renamed from: i */
    public final ClientIdentity f391749i;

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, String str, WorkSource workSource, ClientIdentity clientIdentity) {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z2 = false;
        }
        C143919bh.m233959b(z2);
        this.f391741a = j;
        this.f391742b = i;
        this.f391743c = i2;
        this.f391744d = j2;
        this.f391745e = z;
        this.f391746f = i3;
        this.f391747g = str;
        this.f391748h = workSource;
        this.f391749i = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        if (this.f391741a == currentLocationRequest.f391741a && this.f391742b == currentLocationRequest.f391742b && this.f391743c == currentLocationRequest.f391743c && this.f391744d == currentLocationRequest.f391744d && this.f391745e == currentLocationRequest.f391745e && this.f391746f == currentLocationRequest.f391746f && C143912ba.m233950b(this.f391747g, currentLocationRequest.f391747g) && C143912ba.m233950b(this.f391748h, currentLocationRequest.f391748h) && C143912ba.m233950b(this.f391749i, currentLocationRequest.f391749i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f391741a), Integer.valueOf(this.f391742b), Integer.valueOf(this.f391743c), Long.valueOf(this.f391744d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentLocationRequest[");
        sb.append(C144901be.m235499a(this.f391743c));
        if (this.f391741a != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            C144869a.m235460a(this.f391741a, sb);
        }
        if (this.f391744d != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(this.f391744d);
            sb.append("ms");
        }
        if (this.f391742b != 0) {
            sb.append(", ");
            sb.append(C144879aj.m235476a(this.f391742b));
        }
        if (this.f391745e) {
            sb.append(", bypass");
        }
        if (this.f391746f != 0) {
            sb.append(", ");
            sb.append(C144902bf.m235501a(this.f391746f));
        }
        if (this.f391747g != null) {
            sb.append(", moduleId=");
            sb.append(this.f391747g);
        }
        if (!C144018r.m234198a(this.f391748h)) {
            sb.append(", workSource=");
            sb.append(this.f391748h);
        }
        if (this.f391749i != null) {
            sb.append(", impersonation=");
            sb.append(this.f391749i);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234090i(parcel, 1, this.f391741a);
        C143947c.m234089h(parcel, 2, this.f391742b);
        C143947c.m234089h(parcel, 3, this.f391743c);
        C143947c.m234090i(parcel, 4, this.f391744d);
        C143947c.m234084c(parcel, 5, this.f391745e);
        C143947c.m234105x(parcel, 6, this.f391748h, i);
        C143947c.m234089h(parcel, 7, this.f391746f);
        C143947c.m234106y(parcel, 8, this.f391747g);
        C143947c.m234105x(parcel, 9, this.f391749i, i);
        C143947c.m234083b(parcel, a);
    }
}
