package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: PG */
public class SecondaryIdMatcher extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145029f();

    /* renamed from: c */
    private static final Charset f392025c = Charset.forName("UTF-8");

    /* renamed from: a */
    public final byte[] f392026a;

    /* renamed from: b */
    public final int f392027b;

    public SecondaryIdMatcher(byte[] bArr, int i) {
        C143919bh.m233958a(bArr);
        this.f392026a = bArr;
        this.f392027b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SecondaryIdMatcher secondaryIdMatcher = (SecondaryIdMatcher) obj;
            return this.f392027b == secondaryIdMatcher.f392027b && Arrays.equals(this.f392026a, secondaryIdMatcher.f392026a);
        }
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f392026a) * 31) + this.f392027b;
    }

    public final String toString() {
        int i = this.f392027b;
        String str = i != 1 ? i != 2 ? "__unknown__" : "MATCHING_TYPE_PREFIX" : "MATCHING_TYPE_EXACT";
        String str2 = new String(this.f392026a, f392025c);
        return str + ": " + str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f392026a);
        C143947c.m234089h(parcel, 2, this.f392027b);
        C143947c.m234083b(parcel, a);
    }
}
