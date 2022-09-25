package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class SettingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146064f();

    /* renamed from: a */
    public int f394767a;

    /* renamed from: b */
    public int f394768b;

    public SettingState() {
    }

    public SettingState(int i, int i2) {
        this.f394767a = i;
        this.f394768b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingState)) {
            return false;
        }
        SettingState settingState = (SettingState) obj;
        return C143912ba.m233950b(Integer.valueOf(this.f394767a), Integer.valueOf(settingState.f394767a)) && C143912ba.m233950b(Integer.valueOf(this.f394768b), Integer.valueOf(settingState.f394768b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f394767a), Integer.valueOf(this.f394768b)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f394767a);
        C143947c.m234089h(parcel, 3, this.f394768b);
        C143947c.m234083b(parcel, a);
    }
}
