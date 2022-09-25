package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Locale;
import p3186j$.util.Objects;

/* compiled from: PG */
public class WebIconParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C146453bk();

    /* renamed from: a */
    public final String f395637a;

    /* renamed from: b */
    public final int f395638b;

    /* renamed from: c */
    public final int f395639c;

    public WebIconParcelable(String str, int i, int i2) {
        this.f395637a = str;
        this.f395638b = i;
        this.f395639c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            WebIconParcelable webIconParcelable = (WebIconParcelable) obj;
            return this.f395638b == webIconParcelable.f395638b && this.f395639c == webIconParcelable.f395639c && Objects.equals(this.f395637a, webIconParcelable.f395637a);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f395637a, Integer.valueOf(this.f395638b), Integer.valueOf(this.f395639c));
    }

    public final String toString() {
        return String.format(Locale.US, "WebIconParcelable{%dx%d - %s}", new Object[]{Integer.valueOf(this.f395638b), Integer.valueOf(this.f395639c), this.f395637a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f395637a);
        C143947c.m234089h(parcel, 2, this.f395638b);
        C143947c.m234089h(parcel, 3, this.f395639c);
        C143947c.m234083b(parcel, a);
    }
}
