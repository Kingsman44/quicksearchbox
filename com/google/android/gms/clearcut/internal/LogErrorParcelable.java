package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import p3186j$.util.Objects;

/* compiled from: PG */
public class LogErrorParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C143651s();

    /* renamed from: a */
    public final String f389427a;

    /* renamed from: b */
    public final int f389428b;

    /* renamed from: c */
    public int f389429c;

    public LogErrorParcelable(String str, int i, int i2) {
        this.f389427a = str;
        this.f389428b = i;
        this.f389429c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogErrorParcelable)) {
            return false;
        }
        LogErrorParcelable logErrorParcelable = (LogErrorParcelable) obj;
        return Objects.equals(this.f389427a, logErrorParcelable.f389427a) && this.f389428b == logErrorParcelable.f389428b && this.f389429c == logErrorParcelable.f389429c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f389427a, Integer.valueOf(this.f389428b), Integer.valueOf(this.f389429c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.f389427a + ", ClearcutStatusCode: " + this.f389428b + ", ErrorCount: " + this.f389429c + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 1, this.f389427a);
        C143947c.m234089h(parcel, 2, this.f389428b);
        C143947c.m234089h(parcel, 3, this.f389429c);
        C143947c.m234083b(parcel, a);
    }
}
