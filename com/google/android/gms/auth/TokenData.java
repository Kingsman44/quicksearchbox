package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C142918r();

    /* renamed from: a */
    final int f387645a;

    /* renamed from: b */
    public final String f387646b;

    /* renamed from: c */
    public final Long f387647c;

    /* renamed from: d */
    public final boolean f387648d;

    /* renamed from: e */
    public final boolean f387649e;

    /* renamed from: f */
    public final List f387650f;

    /* renamed from: g */
    public final String f387651g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.f387645a = i;
        C143919bh.m233969l(str);
        this.f387646b = str;
        this.f387647c = l;
        this.f387648d = z;
        this.f387649e = z2;
        this.f387650f = list;
        this.f387651g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        if (!TextUtils.equals(this.f387646b, tokenData.f387646b) || !C143912ba.m233950b(this.f387647c, tokenData.f387647c) || this.f387648d != tokenData.f387648d || this.f387649e != tokenData.f387649e || !C143912ba.m233950b(this.f387650f, tokenData.f387650f) || !C143912ba.m233950b(this.f387651g, tokenData.f387651g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387646b, this.f387647c, Boolean.valueOf(this.f387648d), Boolean.valueOf(this.f387649e), this.f387650f, this.f387651g});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f387645a);
        C143947c.m234106y(parcel, 2, this.f387646b);
        C143947c.m234104w(parcel, 3, this.f387647c);
        C143947c.m234084c(parcel, 4, this.f387648d);
        C143947c.m234084c(parcel, 5, this.f387649e);
        C143947c.m234078A(parcel, 6, this.f387650f);
        C143947c.m234106y(parcel, 7, this.f387651g);
        C143947c.m234083b(parcel, a);
    }
}
