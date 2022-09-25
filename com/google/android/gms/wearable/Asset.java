package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C146394a();

    /* renamed from: a */
    public byte[] f395461a;

    /* renamed from: b */
    public String f395462b;

    /* renamed from: c */
    public ParcelFileDescriptor f395463c;

    /* renamed from: d */
    public Uri f395464d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.f395461a = bArr;
        this.f395462b = str;
        this.f395463c = parcelFileDescriptor;
        this.f395464d = uri;
    }

    /* renamed from: a */
    public static Asset m238325a(ParcelFileDescriptor parcelFileDescriptor) {
        C143919bh.m233958a(parcelFileDescriptor);
        return new Asset((byte[]) null, (String) null, parcelFileDescriptor, (Uri) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f395461a, asset.f395461a) && C143912ba.m233950b(this.f395462b, asset.f395462b) && C143912ba.m233950b(this.f395463c, asset.f395463c) && C143912ba.m233950b(this.f395464d, asset.f395464d);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f395461a, this.f395462b, this.f395463c, this.f395464d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f395462b == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(this.f395462b);
        }
        if (this.f395461a != null) {
            sb.append(", size=");
            sb.append(((byte[]) C143919bh.m233958a(this.f395461a)).length);
        }
        if (this.f395463c != null) {
            sb.append(", fd=");
            sb.append(this.f395463c);
        }
        if (this.f395464d != null) {
            sb.append(", uri=");
            sb.append(this.f395464d);
        }
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C143919bh.m233958a(parcel);
        int i2 = i | 1;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234094m(parcel, 2, this.f395461a);
        C143947c.m234106y(parcel, 3, this.f395462b);
        C143947c.m234105x(parcel, 4, this.f395463c, i2);
        C143947c.m234105x(parcel, 5, this.f395464d, i2);
        C143947c.m234083b(parcel, a);
    }
}
