package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
public class MdhFootprint extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C145026c();

    /* renamed from: a */
    public final byte[] f392020a;

    /* renamed from: b */
    public final byte[] f392021b;

    /* renamed from: c */
    public final long f392022c;

    public MdhFootprint(byte[] bArr, byte[] bArr2, long j) {
        this.f392020a = bArr;
        this.f392022c = j;
        this.f392021b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdhFootprint)) {
            return false;
        }
        MdhFootprint mdhFootprint = (MdhFootprint) obj;
        return this.f392022c == mdhFootprint.f392022c && Arrays.equals(this.f392020a, mdhFootprint.f392020a) && Arrays.equals(this.f392021b, mdhFootprint.f392021b);
    }

    public final int hashCode() {
        Object[] objArr = new Object[3];
        byte[] bArr = this.f392020a;
        if (bArr.length >= 64) {
            bArr = Arrays.copyOf(bArr, 64);
        }
        objArr[0] = Arrays.toString(bArr);
        objArr[1] = Arrays.toString(this.f392021b);
        objArr[2] = Long.valueOf(this.f392022c);
        return Arrays.hashCode(objArr);
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "MdhFootprint{sizeOf(data)=%d, secondaryId=%s, serverEventIdTimestamp=%d}", new Object[]{Integer.valueOf(this.f392020a.length), Arrays.toString(this.f392021b), Long.valueOf(this.f392022c)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 1, this.f392020a);
        C143947c.m234094m(parcel, 2, this.f392021b);
        C143947c.m234090i(parcel, 3, this.f392022c);
        C143947c.m234083b(parcel, a);
    }
}
