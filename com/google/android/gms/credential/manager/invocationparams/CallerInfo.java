package com.google.android.gms.credential.manager.invocationparams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class CallerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144095a();

    /* renamed from: a */
    public final String f390368a;

    /* renamed from: b */
    public final String f390369b;

    /* renamed from: c */
    public final String f390370c;

    /* renamed from: d */
    public final String f390371d;

    public CallerInfo(String str, String str2, String str3, String str4) {
        this.f390368a = str;
        this.f390369b = str2;
        this.f390370c = str3;
        this.f390371d = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CallerInfo)) {
            return false;
        }
        CallerInfo callerInfo = (CallerInfo) obj;
        if (!callerInfo.f390368a.equals(this.f390368a) || !callerInfo.f390369b.equals(this.f390369b) || !callerInfo.f390370c.equals(this.f390370c) || !callerInfo.f390371d.equals(this.f390371d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f390368a, this.f390369b, this.f390370c, this.f390371d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f390368a);
        C143947c.m234106y(parcel, 2, this.f390369b);
        C143947c.m234106y(parcel, 3, this.f390370c);
        C143947c.m234106y(parcel, 4, this.f390371d);
        C143947c.m234083b(parcel, a);
    }
}
