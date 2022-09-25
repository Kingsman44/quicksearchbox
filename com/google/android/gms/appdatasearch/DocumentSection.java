package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;

/* compiled from: PG */
public class DocumentSection extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142815l();

    /* renamed from: a */
    public static final int f387441a = Integer.parseInt("-1");

    /* renamed from: b */
    public final String f387442b;

    /* renamed from: c */
    public final RegisterSectionInfo f387443c;

    /* renamed from: d */
    public final int f387444d;

    /* renamed from: e */
    public final byte[] f387445e;

    static {
        C142791ag.m231730a("SsbContext", "blob", true, false, new ArrayList());
    }

    public DocumentSection(String str, RegisterSectionInfo registerSectionInfo, int i, byte[] bArr) {
        String str2;
        int i2 = f387441a;
        boolean z = true;
        if (i != i2 && C142828y.m231759b(i) == null) {
            z = false;
        }
        C143919bh.m233960c(z, "Invalid section type " + i);
        this.f387442b = str;
        this.f387443c = registerSectionInfo;
        this.f387444d = i;
        this.f387445e = bArr;
        if (i == i2 || C142828y.m231759b(i) != null) {
            str2 = (str == null || bArr == null) ? null : "Both content and blobContent set";
        } else {
            str2 = "Invalid section type " + i;
        }
        if (str2 != null) {
            throw new IllegalArgumentException(str2);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387442b);
        C143947c.m234105x(parcel, 3, this.f387443c, i);
        C143947c.m234089h(parcel, 4, this.f387444d);
        C143947c.m234094m(parcel, 5, this.f387445e);
        C143947c.m234083b(parcel, a);
    }
}
