package com.google.android.gms.mdns;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C143721f;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class MdnsOptions extends AbstractSafeParcelable implements C143721f {
    public static final Parcelable.Creator CREATOR = new C145098a();

    /* renamed from: a */
    public final String f392159a;

    /* renamed from: b */
    public final String f392160b;

    public MdnsOptions(String str, String str2) {
        this.f392159a = str;
        this.f392160b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MdnsOptions)) {
            return false;
        }
        MdnsOptions mdnsOptions = (MdnsOptions) obj;
        return C143912ba.m233950b(this.f392159a, mdnsOptions.f392159a) && C143912ba.m233950b(this.f392160b, mdnsOptions.f392160b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f392159a, this.f392160b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f392159a);
        C143947c.m234106y(parcel, 3, this.f392160b);
        C143947c.m234083b(parcel, a);
    }
}
