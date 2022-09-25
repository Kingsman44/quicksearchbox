package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class PlayLoggerContext extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143656x();

    /* renamed from: a */
    public final String f389431a;

    /* renamed from: b */
    public final int f389432b;

    /* renamed from: c */
    public final int f389433c;

    /* renamed from: d */
    public final String f389434d;

    /* renamed from: e */
    public final boolean f389435e;

    /* renamed from: f */
    public final String f389436f;

    /* renamed from: g */
    public final boolean f389437g;

    /* renamed from: h */
    public final int f389438h;

    /* renamed from: i */
    public final Integer f389439i;

    /* renamed from: j */
    public final boolean f389440j;

    /* renamed from: k */
    public final int f389441k;

    public PlayLoggerContext(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.f389431a = str;
        this.f389432b = i;
        this.f389433c = i2;
        this.f389434d = str2;
        this.f389435e = z;
        this.f389436f = str3;
        this.f389437g = z2;
        this.f389438h = i3;
        this.f389439i = num;
        this.f389440j = z3;
        this.f389441k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PlayLoggerContext) {
            PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
            return C143912ba.m233950b(this.f389431a, playLoggerContext.f389431a) && this.f389432b == playLoggerContext.f389432b && this.f389433c == playLoggerContext.f389433c && C143912ba.m233950b(this.f389436f, playLoggerContext.f389436f) && C143912ba.m233950b(this.f389434d, playLoggerContext.f389434d) && this.f389435e == playLoggerContext.f389435e && this.f389437g == playLoggerContext.f389437g && this.f389438h == playLoggerContext.f389438h && C143912ba.m233950b(this.f389439i, playLoggerContext.f389439i) && this.f389440j == playLoggerContext.f389440j && this.f389441k == playLoggerContext.f389441k;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f389431a, Integer.valueOf(this.f389432b), Integer.valueOf(this.f389433c), this.f389436f, this.f389434d, Boolean.valueOf(this.f389435e), Boolean.valueOf(this.f389437g), Integer.valueOf(this.f389438h), this.f389439i, Boolean.valueOf(this.f389440j), Integer.valueOf(this.f389441k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f389431a + ",packageVersionCode=" + this.f389432b + ",logSource=" + this.f389433c + ",logSourceName=" + this.f389436f + ",uploadAccount=" + this.f389434d + ",logAndroidId=" + this.f389435e + ",isAnonymous=" + this.f389437g + ",qosTier=" + this.f389438h + ",appMobilespecId=" + this.f389439i + ",scrubMccMnc=" + this.f389440j + "piiLevelset=" + this.f389441k + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f389431a);
        C143947c.m234089h(parcel, 3, this.f389432b);
        C143947c.m234089h(parcel, 4, this.f389433c);
        C143947c.m234106y(parcel, 5, this.f389434d);
        C143947c.m234084c(parcel, 7, this.f389435e);
        C143947c.m234106y(parcel, 8, this.f389436f);
        C143947c.m234084c(parcel, 9, this.f389437g);
        C143947c.m234089h(parcel, 10, this.f389438h);
        C143947c.m234101t(parcel, 11, this.f389439i);
        C143947c.m234084c(parcel, 12, this.f389440j);
        C143947c.m234089h(parcel, 13, this.f389441k);
        C143947c.m234083b(parcel, a);
    }
}
