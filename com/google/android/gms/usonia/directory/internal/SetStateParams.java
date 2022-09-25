package com.google.android.gms.usonia.directory.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public final class SetStateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146261bx();

    /* renamed from: a */
    public String f395051a;

    /* renamed from: b */
    public byte[] f395052b;

    /* renamed from: c */
    public int f395053c;

    /* renamed from: d */
    public C146215ae f395054d;

    public SetStateParams() {
    }

    public SetStateParams(String str, byte[] bArr, int i, C146215ae aeVar) {
        this.f395051a = str;
        this.f395052b = bArr;
        this.f395053c = i;
        this.f395054d = aeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetStateParams) {
            SetStateParams setStateParams = (SetStateParams) obj;
            return C143912ba.m233950b(this.f395051a, setStateParams.f395051a) && Arrays.equals(this.f395052b, setStateParams.f395052b) && C143912ba.m233950b(Integer.valueOf(this.f395053c), Integer.valueOf(setStateParams.f395053c)) && C143912ba.m233950b(this.f395054d, setStateParams.f395054d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395051a, Integer.valueOf(Arrays.hashCode(this.f395052b)), Integer.valueOf(this.f395053c), this.f395054d});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395051a);
        C143947c.m234094m(parcel, 2, this.f395052b);
        C143947c.m234089h(parcel, 3, this.f395053c);
        C143947c.m234098q(parcel, 4, this.f395054d.asBinder());
        C143947c.m234083b(parcel, a);
    }
}
