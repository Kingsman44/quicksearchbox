package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142792ah();

    /* renamed from: a */
    public final String f387526a;

    /* renamed from: b */
    public final String f387527b;

    /* renamed from: c */
    public final boolean f387528c;

    /* renamed from: d */
    public final int f387529d;

    /* renamed from: e */
    public final boolean f387530e;

    /* renamed from: f */
    public final String f387531f;

    /* renamed from: g */
    public final Feature[] f387532g;

    /* renamed from: h */
    public final String f387533h;

    /* renamed from: i */
    public final ScoringConfig f387534i;

    public RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, String str4, ScoringConfig scoringConfig) {
        this.f387526a = str;
        this.f387527b = str2;
        this.f387528c = z;
        this.f387529d = i;
        this.f387530e = z2;
        this.f387531f = str3;
        this.f387532g = featureArr;
        this.f387533h = str4;
        this.f387534i = scoringConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterSectionInfo)) {
            return false;
        }
        RegisterSectionInfo registerSectionInfo = (RegisterSectionInfo) obj;
        return this.f387528c == registerSectionInfo.f387528c && this.f387529d == registerSectionInfo.f387529d && this.f387530e == registerSectionInfo.f387530e && C143912ba.m233950b(this.f387526a, registerSectionInfo.f387526a) && C143912ba.m233950b(this.f387527b, registerSectionInfo.f387527b) && C143912ba.m233950b(this.f387531f, registerSectionInfo.f387531f) && C143912ba.m233950b(this.f387533h, registerSectionInfo.f387533h) && C143912ba.m233950b(this.f387534i, registerSectionInfo.f387534i) && Arrays.equals(this.f387532g, registerSectionInfo.f387532g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387526a, this.f387527b, Boolean.valueOf(this.f387528c), Integer.valueOf(this.f387529d), Boolean.valueOf(this.f387530e), this.f387531f, Integer.valueOf(Arrays.hashCode(this.f387532g)), this.f387533h, this.f387534i});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387526a);
        C143947c.m234106y(parcel, 2, this.f387527b);
        C143947c.m234084c(parcel, 3, this.f387528c);
        C143947c.m234089h(parcel, 4, this.f387529d);
        C143947c.m234084c(parcel, 5, this.f387530e);
        C143947c.m234106y(parcel, 6, this.f387531f);
        C143947c.m234079B(parcel, 7, this.f387532g, i);
        C143947c.m234106y(parcel, 11, this.f387533h);
        C143947c.m234105x(parcel, 12, this.f387534i, i);
        C143947c.m234083b(parcel, a);
    }
}
