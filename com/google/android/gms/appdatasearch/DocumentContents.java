package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.BitSet;

/* compiled from: PG */
public class DocumentContents extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C142812i();

    /* renamed from: a */
    public final DocumentSection[] f387430a;

    /* renamed from: b */
    public final String f387431b;

    /* renamed from: c */
    public final boolean f387432c;

    /* renamed from: d */
    public final Account f387433d;

    public DocumentContents(String str, DocumentSection... documentSectionArr) {
        this(documentSectionArr, str, true, (Account) null);
        if (documentSectionArr != null) {
            int i = C142828y.f387619b;
            BitSet bitSet = new BitSet(10);
            for (DocumentSection documentSection : documentSectionArr) {
                int i2 = documentSection.f387444d;
                if (i2 != -1) {
                    if (!bitSet.get(i2)) {
                        bitSet.set(i2);
                    } else {
                        throw new IllegalArgumentException("Duplicate global search section type ".concat(String.valueOf(C142828y.m231759b(i2))));
                    }
                }
            }
        }
    }

    public DocumentContents(DocumentSection[] documentSectionArr, String str, boolean z, Account account) {
        this.f387430a = documentSectionArr;
        this.f387431b = str;
        this.f387432c = z;
        this.f387433d = account;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DocumentContents) {
            DocumentContents documentContents = (DocumentContents) obj;
            if (!C143912ba.m233950b(this.f387431b, documentContents.f387431b) || !C143912ba.m233950b(Boolean.valueOf(this.f387432c), Boolean.valueOf(documentContents.f387432c)) || !C143912ba.m233950b(this.f387433d, documentContents.f387433d) || !Arrays.equals(this.f387430a, documentContents.f387430a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387431b, Boolean.valueOf(this.f387432c), this.f387433d, Integer.valueOf(Arrays.hashCode(this.f387430a))});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234079B(parcel, 1, this.f387430a, i);
        C143947c.m234106y(parcel, 2, this.f387431b);
        C143947c.m234084c(parcel, 3, this.f387432c);
        C143947c.m234105x(parcel, 4, this.f387433d, i);
        C143947c.m234083b(parcel, a);
    }
}
