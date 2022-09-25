package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class ReportingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144970h();

    /* renamed from: a */
    public final int f391922a;

    /* renamed from: b */
    public final int f391923b;

    /* renamed from: c */
    public final boolean f391924c;

    /* renamed from: d */
    public final boolean f391925d;

    /* renamed from: e */
    public final int f391926e;

    /* renamed from: f */
    public final int f391927f;

    /* renamed from: g */
    public final Integer f391928g;

    /* renamed from: h */
    public final boolean f391929h;

    public ReportingState(int i, int i2, boolean z, boolean z2, int i3, int i4, Integer num, boolean z3) {
        this.f391922a = i;
        this.f391923b = i2;
        this.f391924c = z;
        this.f391925d = z2;
        this.f391926e = i3;
        this.f391927f = i4;
        this.f391928g = num;
        this.f391929h = z3;
    }

    /* renamed from: a */
    public final boolean mo120463a() {
        return C144964b.m235616b(this.f391922a) && C144964b.m235616b(this.f391923b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReportingState)) {
            return false;
        }
        ReportingState reportingState = (ReportingState) obj;
        if (this.f391922a == reportingState.f391922a && this.f391923b == reportingState.f391923b && this.f391924c == reportingState.f391924c && this.f391925d == reportingState.f391925d && this.f391926e == reportingState.f391926e && this.f391927f == reportingState.f391927f && C143912ba.m233950b(this.f391928g, reportingState.f391928g) && this.f391929h == reportingState.f391929h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f391922a), Integer.valueOf(this.f391923b), Boolean.valueOf(this.f391924c), Boolean.valueOf(this.f391925d), Integer.valueOf(this.f391926e), Integer.valueOf(this.f391927f), this.f391928g, Boolean.valueOf(this.f391929h)});
    }

    public final String toString() {
        String str;
        Integer num = this.f391928g;
        if (num == null) {
            str = "(hidden-from-unauthorized-caller)";
        } else if (Log.isLoggable("GCoreUlr", 2)) {
            str = num.toString();
        } else {
            int intValue = num.intValue();
            str = "tag#" + (intValue % 20);
        }
        return "ReportingState{mReportingEnabled=" + this.f391922a + ", mHistoryEnabled=" + this.f391923b + ", mAllowed=" + this.f391924c + ", mActive=" + this.f391925d + ", mExpectedOptInResult=" + this.f391926e + ", mExpectedOptInResultAssumingLocationEnabled=" + this.f391927f + ", mDeviceTag=" + str + ", mCanAccessSettings=" + this.f391929h + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, C144964b.m235615a(this.f391922a));
        C143947c.m234089h(parcel, 3, C144964b.m235615a(this.f391923b));
        C143947c.m234084c(parcel, 4, this.f391924c);
        C143947c.m234084c(parcel, 5, this.f391925d);
        C143947c.m234089h(parcel, 7, C144958a.m235600a(this.f391926e));
        C143947c.m234101t(parcel, 8, this.f391928g);
        C143947c.m234089h(parcel, 9, C144958a.m235600a(this.f391927f));
        C143947c.m234084c(parcel, 10, this.f391929h);
        C143947c.m234083b(parcel, a);
    }
}
