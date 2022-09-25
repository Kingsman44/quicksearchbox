package com.google.android.gms.presencemanager;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class PresentUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145760d();

    /* renamed from: a */
    public final String f394085a;

    /* renamed from: b */
    public final long f394086b;

    /* renamed from: c */
    public final int f394087c;

    /* renamed from: d */
    public final int f394088d;

    /* renamed from: e */
    public final String f394089e;

    /* renamed from: f */
    public final String f394090f;

    public PresentUser(String str, long j, int i, int i2, String str2, String str3) {
        this.f394085a = str;
        this.f394086b = j;
        this.f394087c = i;
        this.f394088d = i2;
        this.f394089e = str2;
        this.f394090f = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PresentUser)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        PresentUser presentUser = (PresentUser) obj;
        return C143912ba.m233950b(this.f394085a, presentUser.f394085a) && this.f394086b == presentUser.f394086b && this.f394087c == presentUser.f394087c && this.f394088d == presentUser.f394088d && C143912ba.m233950b(this.f394089e, presentUser.f394089e) && C143912ba.m233950b(this.f394090f, presentUser.f394090f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394085a, Long.valueOf(this.f394086b), Integer.valueOf(this.f394087c), Integer.valueOf(this.f394088d), this.f394089e, this.f394090f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f394085a);
        C143947c.m234090i(parcel, 2, this.f394086b);
        C143947c.m234089h(parcel, 3, this.f394087c);
        C143947c.m234089h(parcel, 4, this.f394088d);
        C143947c.m234106y(parcel, 5, this.f394089e);
        C143947c.m234106y(parcel, 6, this.f394090f);
        C143947c.m234083b(parcel, a);
    }
}
