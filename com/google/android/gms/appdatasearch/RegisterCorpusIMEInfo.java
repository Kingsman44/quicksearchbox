package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class RegisterCorpusIMEInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142789ae();

    /* renamed from: a */
    public final int f387509a;

    /* renamed from: b */
    public final String[] f387510b;

    /* renamed from: c */
    public final String f387511c;

    /* renamed from: d */
    public final String f387512d;

    /* renamed from: e */
    public final String[] f387513e;

    /* renamed from: f */
    public final String f387514f;

    public RegisterCorpusIMEInfo(int i, String[] strArr, String str, String str2, String[] strArr2, String str3) {
        this.f387509a = i;
        this.f387510b = strArr;
        this.f387511c = str;
        this.f387512d = str2;
        this.f387513e = strArr2;
        this.f387514f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterCorpusIMEInfo)) {
            return false;
        }
        RegisterCorpusIMEInfo registerCorpusIMEInfo = (RegisterCorpusIMEInfo) obj;
        return this.f387509a == registerCorpusIMEInfo.f387509a && Arrays.equals(this.f387510b, registerCorpusIMEInfo.f387510b) && C143912ba.m233950b(this.f387511c, registerCorpusIMEInfo.f387511c) && C143912ba.m233950b(this.f387512d, registerCorpusIMEInfo.f387512d) && Arrays.equals(this.f387513e, registerCorpusIMEInfo.f387513e) && C143912ba.m233950b(this.f387514f, registerCorpusIMEInfo.f387514f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f387509a), Integer.valueOf(Arrays.hashCode(this.f387510b)), this.f387511c, this.f387512d, Integer.valueOf(Arrays.hashCode(this.f387513e)), this.f387514f});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f387509a);
        C143947c.m234107z(parcel, 2, this.f387510b);
        C143947c.m234106y(parcel, 3, this.f387511c);
        C143947c.m234106y(parcel, 4, this.f387512d);
        C143947c.m234106y(parcel, 6, this.f387514f);
        C143947c.m234107z(parcel, 7, this.f387513e);
        C143947c.m234083b(parcel, a);
    }
}
