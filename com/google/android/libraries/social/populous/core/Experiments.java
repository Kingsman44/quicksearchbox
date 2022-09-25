package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import java.util.Arrays;

/* compiled from: PG */
public class Experiments implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42293bs();

    /* renamed from: a */
    public final C42265ar f110773a;

    /* renamed from: b */
    private final C58881cr f110774b = C58886cw.m90973a(new C42292br(this));

    public Experiments(C42294bt btVar) {
        this.f110773a = C42265ar.m74424a(btVar.f110919a);
    }

    /* renamed from: a */
    public final String[] mo45142a() {
        String[] strArr = (String[]) this.f110774b.mo6453a();
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Experiments) {
            return this.f110773a.equals(((Experiments) obj).f110773a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f110773a.f110851a.hashCode();
    }

    public final String toString() {
        return this.f110773a.f110851a.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(C42265ar.m74424a(this.f110773a));
    }
}
