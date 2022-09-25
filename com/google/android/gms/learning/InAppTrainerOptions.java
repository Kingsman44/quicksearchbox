package com.google.android.gms.learning;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.util.Arrays;

/* compiled from: PG */
public final class InAppTrainerOptions extends BaseOptions {
    public static final Parcelable.Creator CREATOR = new C144824k();

    /* renamed from: a */
    public final String f391070a;

    /* renamed from: b */
    public final int f391071b;

    /* renamed from: c */
    public final boolean f391072c;

    /* renamed from: d */
    public final String f391073d;

    /* renamed from: e */
    public final int f391074e;

    /* renamed from: g */
    public final Uri f391075g;

    /* renamed from: h */
    public final InAppTrainingConstraints f391076h;

    /* renamed from: i */
    public final long f391077i;

    /* renamed from: j */
    public final Uri f391078j;

    /* renamed from: k */
    public final TrainingInterval f391079k;

    /* renamed from: l */
    public final byte[] f391080l;

    /* renamed from: m */
    public final Uri f391081m;

    public InAppTrainerOptions(String str, int i, boolean z, String str2, int i2, Uri uri, InAppTrainingConstraints inAppTrainingConstraints, long j, Uri uri2, TrainingInterval trainingInterval, byte[] bArr, Uri uri3) {
        int i3 = i;
        String str3 = str2;
        int i4 = i2;
        Uri uri4 = uri;
        boolean z2 = true;
        C58838bb.m90868c(!str.isEmpty());
        C58838bb.m90868c(i3 != 0);
        if (uri4 != null && str3 == null) {
            C58838bb.m90868c(i4 != 3 ? false : z2);
            uri2.getClass();
            trainingInterval.getClass();
            uri3.getClass();
        } else if (uri4 == null && str3 != null) {
            C58838bb.m90868c(!str2.isEmpty());
            if (!(i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3)) {
                z2 = false;
            }
            C58838bb.m90868c(z2);
        } else if (uri4 == null) {
            throw new IllegalArgumentException("must call exactly one of #setFederatedOptions or #setPersonalizedOptions");
        } else {
            throw new IllegalArgumentException("cannot call both #setFederatedOptions and #setPersonalizedOptions");
        }
        this.f391070a = str;
        this.f391071b = i3;
        this.f391072c = z;
        this.f391073d = str3;
        this.f391074e = i4;
        this.f391075g = uri4;
        this.f391078j = uri2;
        this.f391076h = inAppTrainingConstraints;
        this.f391077i = j;
        this.f391079k = trainingInterval;
        this.f391080l = bArr != null ? bArr : new byte[0];
        this.f391081m = uri3;
    }

    /* renamed from: a */
    public static void m234715a(Uri uri) {
        C58838bb.m90873h(uri.isAbsolute(), "%s is not absolute.", uri);
        C58838bb.m90873h(uri.isHierarchical(), "%s is not hierarchical.", uri);
        boolean z = false;
        C58838bb.m90869d(uri.getAuthority() == null, "Uri cannot have authority.");
        C58838bb.m90869d(uri.getFragment() == null, "Uri cannot have fragment part.");
        C58838bb.m90869d(uri.getQuery() == null, "Uri cannot have query part.");
        if ("appfiles".equals(uri.getScheme()) || "appcache".equals(uri.getScheme()) || "appdir".equals(uri.getScheme())) {
            z = true;
        }
        C58838bb.m90873h(z, "Unsupported scheme: %s", uri.getScheme());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppTrainerOptions)) {
            return false;
        }
        InAppTrainerOptions inAppTrainerOptions = (InAppTrainerOptions) obj;
        return C58832aw.m90831a(this.f391070a, inAppTrainerOptions.f391070a) && this.f391071b == inAppTrainerOptions.f391071b && this.f391072c == inAppTrainerOptions.f391072c && C58832aw.m90831a(this.f391073d, inAppTrainerOptions.f391073d) && this.f391074e == inAppTrainerOptions.f391074e && C58832aw.m90831a(this.f391075g, inAppTrainerOptions.f391075g) && C58832aw.m90831a(this.f391078j, inAppTrainerOptions.f391078j) && C58832aw.m90831a(this.f391076h, inAppTrainerOptions.f391076h) && this.f391077i == inAppTrainerOptions.f391077i && C58832aw.m90831a(this.f391079k, inAppTrainerOptions.f391079k) && Arrays.equals(this.f391080l, inAppTrainerOptions.f391080l) && C58832aw.m90831a(this.f391081m, inAppTrainerOptions.f391081m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f391070a, Integer.valueOf(this.f391071b), Boolean.valueOf(this.f391072c), this.f391073d, Integer.valueOf(this.f391074e), this.f391075g, this.f391078j, this.f391076h, Long.valueOf(this.f391077i), this.f391079k, Integer.valueOf(Arrays.hashCode(this.f391080l)), this.f391081m});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f391070a);
        C143947c.m234089h(parcel, 2, this.f391071b);
        C143947c.m234084c(parcel, 3, this.f391072c);
        C143947c.m234106y(parcel, 4, this.f391073d);
        C143947c.m234089h(parcel, 5, this.f391074e);
        C143947c.m234105x(parcel, 6, this.f391075g, i);
        C143947c.m234105x(parcel, 9, this.f391076h, i);
        C143947c.m234090i(parcel, 10, this.f391077i);
        C143947c.m234105x(parcel, 11, this.f391078j, i);
        C143947c.m234105x(parcel, 12, this.f391079k, i);
        byte[] bArr = this.f391080l;
        C143947c.m234094m(parcel, 13, Arrays.copyOf(bArr, bArr.length));
        C143947c.m234105x(parcel, 14, this.f391081m, i);
        C143947c.m234083b(parcel, a);
    }
}
