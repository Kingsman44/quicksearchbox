package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;

@Deprecated
/* compiled from: PG */
public class GlobalSearchApplicationInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C142824u();

    /* renamed from: a */
    public final String f387461a;

    /* renamed from: b */
    public final String f387462b;

    /* renamed from: c */
    public final int f387463c;

    /* renamed from: d */
    public final int f387464d;

    /* renamed from: e */
    public final int f387465e;

    /* renamed from: f */
    public final String f387466f;

    /* renamed from: g */
    public final String f387467g;

    /* renamed from: h */
    public final String f387468h;

    public GlobalSearchApplicationInfo(String str, String str2, int i, int i2, int i3, String str3, String str4, String str5) {
        this.f387461a = str;
        this.f387462b = str2;
        this.f387463c = i;
        this.f387464d = i2;
        this.f387465e = i3;
        this.f387466f = str3;
        this.f387467g = str4;
        this.f387468h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GlobalSearchApplicationInfo) {
            GlobalSearchApplicationInfo globalSearchApplicationInfo = (GlobalSearchApplicationInfo) obj;
            return TextUtils.equals(this.f387461a, globalSearchApplicationInfo.f387461a) && TextUtils.equals(this.f387462b, globalSearchApplicationInfo.f387462b) && this.f387463c == globalSearchApplicationInfo.f387463c && this.f387464d == globalSearchApplicationInfo.f387464d && this.f387465e == globalSearchApplicationInfo.f387465e && TextUtils.equals(this.f387466f, globalSearchApplicationInfo.f387466f) && TextUtils.equals(this.f387467g, globalSearchApplicationInfo.f387467g) && TextUtils.equals(this.f387468h, globalSearchApplicationInfo.f387468h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f387461a, this.f387462b, Integer.valueOf(this.f387463c), Integer.valueOf(this.f387464d), Integer.valueOf(this.f387465e), this.f387466f, this.f387467g, this.f387468h});
    }

    public final String toString() {
        return getClass().getSimpleName() + "{" + this.f387461a + ";sourceName=" + this.f387462b + ";labelId=" + Integer.toHexString(this.f387463c) + ";settingsDescriptionId=" + Integer.toHexString(this.f387464d) + ";iconId=" + Integer.toHexString(this.f387465e) + ";defaultIntentAction=" + this.f387466f + ";defaultIntentData=" + this.f387467g + ";defaultIntentActivity=" + this.f387468h + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f387461a);
        C143947c.m234089h(parcel, 2, this.f387463c);
        C143947c.m234089h(parcel, 3, this.f387464d);
        C143947c.m234089h(parcel, 4, this.f387465e);
        C143947c.m234106y(parcel, 5, this.f387466f);
        C143947c.m234106y(parcel, 6, this.f387467g);
        C143947c.m234106y(parcel, 7, this.f387468h);
        C143947c.m234106y(parcel, 8, this.f387462b);
        C143947c.m234083b(parcel, a);
    }
}
