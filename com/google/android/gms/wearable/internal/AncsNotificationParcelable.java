package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class AncsNotificationParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146505e();

    /* renamed from: a */
    public int f395526a;

    /* renamed from: b */
    public final String f395527b;

    /* renamed from: c */
    public final String f395528c;

    /* renamed from: d */
    public final String f395529d;

    /* renamed from: e */
    public final String f395530e;

    /* renamed from: f */
    public final String f395531f;

    /* renamed from: g */
    public final byte f395532g;

    /* renamed from: h */
    public final byte f395533h;

    /* renamed from: i */
    public final byte f395534i;

    /* renamed from: j */
    public final byte f395535j;

    /* renamed from: k */
    public final String f395536k;

    /* renamed from: l */
    private final String f395537l;

    public AncsNotificationParcelable(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.f395526a = i;
        this.f395527b = str;
        this.f395528c = str2;
        this.f395529d = str3;
        this.f395530e = str4;
        this.f395531f = str5;
        this.f395537l = str6;
        this.f395532g = b;
        this.f395533h = b2;
        this.f395534i = b3;
        this.f395535j = b4;
        this.f395536k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AncsNotificationParcelable ancsNotificationParcelable = (AncsNotificationParcelable) obj;
        if (this.f395526a != ancsNotificationParcelable.f395526a || this.f395532g != ancsNotificationParcelable.f395532g || this.f395533h != ancsNotificationParcelable.f395533h || this.f395534i != ancsNotificationParcelable.f395534i || this.f395535j != ancsNotificationParcelable.f395535j || !this.f395527b.equals(ancsNotificationParcelable.f395527b)) {
            return false;
        }
        String str = this.f395528c;
        if (str == null ? ancsNotificationParcelable.f395528c != null : !str.equals(ancsNotificationParcelable.f395528c)) {
            return false;
        }
        if (!this.f395529d.equals(ancsNotificationParcelable.f395529d) || !this.f395530e.equals(ancsNotificationParcelable.f395530e) || !this.f395531f.equals(ancsNotificationParcelable.f395531f)) {
            return false;
        }
        String str2 = this.f395537l;
        if (str2 == null ? ancsNotificationParcelable.f395537l != null : !str2.equals(ancsNotificationParcelable.f395537l)) {
            return false;
        }
        String str3 = this.f395536k;
        if (str3 != null) {
            return str3.equals(ancsNotificationParcelable.f395536k);
        }
        return ancsNotificationParcelable.f395536k == null;
    }

    public final int hashCode() {
        int hashCode = (((this.f395526a + 31) * 31) + this.f395527b.hashCode()) * 31;
        String str = this.f395528c;
        int i = 0;
        int hashCode2 = (((((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f395529d.hashCode()) * 31) + this.f395530e.hashCode()) * 31) + this.f395531f.hashCode()) * 31;
        String str2 = this.f395537l;
        int hashCode3 = (((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f395532g) * 31) + this.f395533h) * 31) + this.f395534i) * 31) + this.f395535j) * 31;
        String str3 = this.f395536k;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        int i = this.f395526a;
        String str = this.f395527b;
        String str2 = this.f395528c;
        byte b = this.f395532g;
        byte b2 = this.f395533h;
        byte b3 = this.f395534i;
        byte b4 = this.f395535j;
        String str3 = this.f395536k;
        return "AncsNotificationParcelable{, id=" + i + ", appId='" + str + "', dateTime='" + str2 + "', eventId=" + b + ", eventFlags=" + b2 + ", categoryId=" + b3 + ", categoryCount=" + b4 + ", packageName='" + str3 + "'}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 2, this.f395526a);
        C143947c.m234106y(parcel, 3, this.f395527b);
        C143947c.m234106y(parcel, 4, this.f395528c);
        C143947c.m234106y(parcel, 5, this.f395529d);
        C143947c.m234106y(parcel, 6, this.f395530e);
        C143947c.m234106y(parcel, 7, this.f395531f);
        String str = this.f395537l;
        if (str == null) {
            str = this.f395527b;
        }
        C143947c.m234106y(parcel, 8, str);
        C143947c.m234085d(parcel, 9, this.f395532g);
        C143947c.m234085d(parcel, 10, this.f395533h);
        C143947c.m234085d(parcel, 11, this.f395534i);
        C143947c.m234085d(parcel, 12, this.f395535j);
        C143947c.m234106y(parcel, 13, this.f395536k);
        C143947c.m234083b(parcel, a);
    }
}
