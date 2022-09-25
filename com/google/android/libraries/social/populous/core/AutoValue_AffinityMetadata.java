package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.p4535g.C59203do;

/* compiled from: PG */
public final class AutoValue_AffinityMetadata extends C$AutoValue_AffinityMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42356q();

    /* renamed from: g */
    private static final ClassLoader f110680g = AutoValue_AffinityMetadata.class.getClassLoader();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_AffinityMetadata(android.os.Parcel r11) {
        /*
            r10 = this;
            java.lang.ClassLoader r0 = f110680g
            java.lang.Object r1 = r11.readValue(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r3 = r1.booleanValue()
            java.lang.Object r1 = r11.readValue(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r4 = r1.booleanValue()
            java.lang.Object r0 = r11.readValue(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            double r6 = r11.readDouble()
            double r8 = r11.readDouble()
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_AffinityMetadata.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(Boolean.valueOf(this.f110603a));
        parcel.writeValue(Boolean.valueOf(this.f110604b));
        parcel.writeValue(Boolean.valueOf(this.f110605c));
        parcel.writeDouble(this.f110606d);
        parcel.writeDouble(this.f110607e);
    }

    public AutoValue_AffinityMetadata(boolean z) {
        super(z, false, false, C59203do.f157270a, C59203do.f157270a);
    }
}
