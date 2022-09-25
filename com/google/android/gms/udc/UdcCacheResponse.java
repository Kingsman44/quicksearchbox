package com.google.android.gms.udc;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class UdcCacheResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146069k();

    /* renamed from: a */
    public final List f394770a;

    /* renamed from: b */
    public final int[] f394771b;

    /* renamed from: c */
    public final boolean f394772c;

    /* compiled from: PG */
    public class SettingAvailability extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C146061c();

        /* renamed from: a */
        public final boolean f394773a;

        public SettingAvailability(boolean z) {
            this.f394773a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && (obj instanceof SettingAvailability) && this.f394773a == ((SettingAvailability) obj).f394773a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f394773a)});
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            C143910az.m233947b("CanShowValue", Boolean.valueOf(this.f394773a), arrayList);
            return C143910az.m233946a(arrayList, this);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234084c(parcel, 2, this.f394773a);
            C143947c.m234083b(parcel, a);
        }
    }

    /* compiled from: PG */
    public class UdcSetting extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = new C146072n();

        /* renamed from: a */
        public final int f394774a;

        /* renamed from: b */
        public final int f394775b;

        /* renamed from: c */
        public final SettingAvailability f394776c;

        public UdcSetting(int i, int i2, SettingAvailability settingAvailability) {
            this.f394774a = i;
            this.f394775b = i2;
            this.f394776c = settingAvailability;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof UdcSetting)) {
                return false;
            }
            UdcSetting udcSetting = (UdcSetting) obj;
            return this.f394774a == udcSetting.f394774a && this.f394775b == udcSetting.f394775b && C143912ba.m233950b(this.f394776c, udcSetting.f394776c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f394774a), Integer.valueOf(this.f394775b), this.f394776c});
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            C143910az.m233947b("SettingId", Integer.valueOf(this.f394774a), arrayList);
            C143910az.m233947b("SettingValue", Integer.valueOf(this.f394775b), arrayList);
            C143910az.m233947b("SettingAvailability", this.f394776c, arrayList);
            return C143910az.m233946a(arrayList, this);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C143947c.m234082a(parcel, 20293);
            C143947c.m234089h(parcel, 2, this.f394774a);
            C143947c.m234089h(parcel, 3, this.f394775b);
            C143947c.m234105x(parcel, 4, this.f394776c, i);
            C143947c.m234083b(parcel, a);
        }
    }

    public UdcCacheResponse(List list, int[] iArr, boolean z) {
        this.f394770a = list;
        this.f394771b = iArr;
        this.f394772c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UdcCacheResponse)) {
            return false;
        }
        UdcCacheResponse udcCacheResponse = (UdcCacheResponse) obj;
        return this.f394770a.equals(udcCacheResponse.f394770a) && Arrays.equals(this.f394771b, udcCacheResponse.f394771b) && this.f394772c == udcCacheResponse.f394772c;
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f394770a, this.f394771b, Boolean.valueOf(this.f394772c)});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        C143910az.m233947b("Settings", this.f394770a, arrayList);
        C143910az.m233947b("ConsentableSettings", Arrays.toString(this.f394771b), arrayList);
        C143910az.m233947b("CanMostLikelyStartConsentFlow", Boolean.valueOf(this.f394772c), arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234080C(parcel, 2, this.f394770a);
        C143947c.m234099r(parcel, 3, this.f394771b);
        C143947c.m234084c(parcel, 4, this.f394772c);
        C143947c.m234083b(parcel, a);
    }
}
