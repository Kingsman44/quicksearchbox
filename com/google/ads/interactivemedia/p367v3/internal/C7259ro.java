package com.google.ads.interactivemedia.p367v3.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ro */
/* compiled from: PG */
public final class C7259ro extends C7273sb {
    public static final Parcelable.Creator CREATOR = new C7258rn();

    /* renamed from: a */
    public final byte[] f23710a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7259ro(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = com.google.ads.interactivemedia.p367v3.internal.aeu.f20466a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            java.lang.Object r3 = com.google.ads.interactivemedia.p367v3.internal.aeu.m18536f(r3)
            byte[] r3 = (byte[]) r3
            r2.f23710a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.C7259ro.<init>(android.os.Parcel):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C7259ro roVar = (C7259ro) obj;
            return this.f23739f.equals(roVar.f23739f) && Arrays.equals(this.f23710a, roVar.f23710a);
        }
    }

    public final int hashCode() {
        return ((this.f23739f.hashCode() + 527) * 31) + Arrays.hashCode(this.f23710a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f23739f);
        parcel.writeByteArray(this.f23710a);
    }

    public C7259ro(String str, byte[] bArr) {
        super(str);
        this.f23710a = bArr;
    }
}
