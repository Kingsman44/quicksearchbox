package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
public final class AutoValue_GroupOrigin extends C$AutoValue_GroupOrigin implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C42250ac();

    /* renamed from: d */
    private static final ClassLoader f110688d = AutoValue_GroupOrigin.class.getClassLoader();

    /* JADX WARNING: type inference failed for: r6v1, types: [android.os.Parcelable] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AutoValue_GroupOrigin(android.os.Parcel r6) {
        /*
            r5 = this;
            byte r0 = r6.readByte()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x000d
            java.lang.String r0 = r6.readString()
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            byte r3 = r6.readByte()
            if (r3 != r2) goto L_0x001d
            java.lang.ClassLoader r3 = f110688d
            android.os.Parcelable r3 = r6.readParcelable(r3)
            com.google.android.libraries.social.populous.core.Name r3 = (com.google.android.libraries.social.populous.core.Name) r3
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            byte r4 = r6.readByte()
            if (r4 != r2) goto L_0x002d
            java.lang.ClassLoader r1 = f110688d
            android.os.Parcelable r6 = r6.readParcelable(r1)
            r1 = r6
            com.google.android.libraries.social.populous.core.Photo r1 = (com.google.android.libraries.social.populous.core.Photo) r1
        L_0x002d:
            r5.<init>(r0, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.core.AutoValue_GroupOrigin.<init>(android.os.Parcel):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte b = 1;
        parcel.writeByte(this.f110642a == null ? (byte) 0 : 1);
        String str = this.f110642a;
        if (str != null) {
            parcel.writeString(str);
        }
        parcel.writeByte(this.f110643b == null ? (byte) 0 : 1);
        Name name = this.f110643b;
        if (name != null) {
            parcel.writeParcelable(name, 0);
        }
        if (this.f110644c == null) {
            b = 0;
        }
        parcel.writeByte(b);
        Photo photo = this.f110644c;
        if (photo != null) {
            parcel.writeParcelable(photo, 0);
        }
    }

    public AutoValue_GroupOrigin(String str, Name name, Photo photo) {
        super(str, name, photo);
    }
}
