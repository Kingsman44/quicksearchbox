package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.internal.C143596v;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
public class LaunchOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143355am();

    /* renamed from: a */
    public boolean f388624a;

    /* renamed from: b */
    public String f388625b;

    /* renamed from: c */
    public boolean f388626c;

    /* renamed from: d */
    public CredentialsData f388627d;

    public LaunchOptions() {
        this(false, C143596v.m233272e(Locale.getDefault()), false, (CredentialsData) null);
    }

    public LaunchOptions(boolean z, String str, boolean z2, CredentialsData credentialsData) {
        this.f388624a = z;
        this.f388625b = str;
        this.f388626c = z2;
        this.f388627d = credentialsData;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LaunchOptions)) {
            return false;
        }
        LaunchOptions launchOptions = (LaunchOptions) obj;
        return this.f388624a == launchOptions.f388624a && C143596v.m233278k(this.f388625b, launchOptions.f388625b) && this.f388626c == launchOptions.f388626c && C143596v.m233278k(this.f388627d, launchOptions.f388627d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f388624a), this.f388625b, Boolean.valueOf(this.f388626c), this.f388627d});
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s, androidReceiverCompatible: %b)", new Object[]{Boolean.valueOf(this.f388624a), this.f388625b, Boolean.valueOf(this.f388626c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234084c(parcel, 2, this.f388624a);
        C143947c.m234106y(parcel, 3, this.f388625b);
        C143947c.m234084c(parcel, 4, this.f388626c);
        C143947c.m234105x(parcel, 5, this.f388627d, i);
        C143947c.m234083b(parcel, a);
    }
}
