package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

/* compiled from: PG */
public class SettingDisplayInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146063e();

    /* renamed from: a */
    public SettingState f394764a;

    /* renamed from: b */
    public String f394765b;

    /* renamed from: c */
    public String f394766c;

    public SettingDisplayInfo() {
    }

    public SettingDisplayInfo(SettingState settingState, String str, String str2) {
        this.f394764a = settingState;
        this.f394765b = str;
        this.f394766c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SettingDisplayInfo)) {
            return false;
        }
        SettingDisplayInfo settingDisplayInfo = (SettingDisplayInfo) obj;
        return C143912ba.m233950b(this.f394765b, settingDisplayInfo.f394765b) && C143912ba.m233950b(this.f394766c, settingDisplayInfo.f394766c) && C143912ba.m233950b(this.f394764a, settingDisplayInfo.f394764a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f394764a, this.f394765b, this.f394766c});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234105x(parcel, 2, this.f394764a, i);
        C143947c.m234106y(parcel, 3, this.f394765b);
        C143947c.m234106y(parcel, 4, this.f394766c);
        C143947c.m234083b(parcel, a);
    }
}
