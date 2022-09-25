package com.google.android.gms.semanticlocation.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class SemanticLocationParameters extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145971i();

    /* renamed from: a */
    public final Account f394645a;

    /* renamed from: b */
    public final String f394646b;

    /* renamed from: c */
    public final String f394647c;

    public SemanticLocationParameters(Account account, String str, String str2) {
        this.f394645a = account;
        this.f394646b = str;
        this.f394647c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SemanticLocationParameters)) {
            return false;
        }
        SemanticLocationParameters semanticLocationParameters = (SemanticLocationParameters) obj;
        return C143912ba.m233950b(this.f394645a, semanticLocationParameters.f394645a) && C143912ba.m233950b(this.f394646b, semanticLocationParameters.f394646b) && C143912ba.m233950b(this.f394647c, semanticLocationParameters.f394647c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394645a, this.f394646b, this.f394647c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 1, this.f394645a, i);
        C143947c.m234106y(parcel, 2, this.f394646b);
        C143947c.m234106y(parcel, 3, this.f394647c);
        C143947c.m234083b(parcel, a);
    }
}
