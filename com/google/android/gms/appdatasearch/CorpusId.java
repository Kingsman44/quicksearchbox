package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class CorpusId extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142808e();

    /* renamed from: a */
    public final String f387417a;

    /* renamed from: b */
    public final String f387418b;

    /* renamed from: c */
    final Bundle f387419c;

    public CorpusId(String str, String str2, Bundle bundle) {
        this.f387417a = str;
        this.f387418b = str2;
        this.f387419c = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CorpusId) {
            CorpusId corpusId = (CorpusId) obj;
            if (!C143912ba.m233950b(this.f387417a, corpusId.f387417a) || !C143912ba.m233950b(this.f387418b, corpusId.f387418b) || !C143912ba.m233950b(this.f387419c, corpusId.f387419c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387417a, this.f387418b, this.f387419c});
    }

    public final String toString() {
        String str = this.f387417a;
        String str2 = this.f387418b;
        Bundle bundle = this.f387419c;
        String bundle2 = bundle != null ? bundle.toString() : "null";
        return "CorpusId[package=" + str + ", corpus=" + str2 + ", userHandle=" + bundle2 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387417a);
        C143947c.m234106y(parcel, 2, this.f387418b);
        C143947c.m234093l(parcel, 3, this.f387419c);
        C143947c.m234083b(parcel, a);
    }
}
