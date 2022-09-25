package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public class ChannelImpl extends AbstractSafeParcelable implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C146523w();

    /* renamed from: a */
    public final String f395558a;

    /* renamed from: b */
    public final String f395559b;

    /* renamed from: c */
    public final String f395560c;

    public ChannelImpl(String str, String str2, String str3) {
        C143919bh.m233958a(str);
        this.f395558a = str;
        C143919bh.m233958a(str2);
        this.f395559b = str2;
        C143919bh.m233958a(str3);
        this.f395560c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ChannelImpl)) {
            return false;
        }
        ChannelImpl channelImpl = (ChannelImpl) obj;
        return this.f395558a.equals(channelImpl.f395558a) && C143912ba.m233950b(channelImpl.f395559b, this.f395559b) && C143912ba.m233950b(channelImpl.f395560c, this.f395560c);
    }

    public final int hashCode() {
        return this.f395558a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c : this.f395558a.toCharArray()) {
            i += c;
        }
        String trim = this.f395558a.trim();
        int length = trim.length();
        if (length > 25) {
            trim = trim.substring(0, 10) + "..." + trim.substring(length - 10, length) + "::" + i;
        }
        return "Channel{token=" + trim + ", nodeId=" + this.f395559b + ", path=" + this.f395560c + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395558a);
        C143947c.m234106y(parcel, 3, this.f395559b);
        C143947c.m234106y(parcel, 4, this.f395560c);
        C143947c.m234083b(parcel, a);
    }
}
