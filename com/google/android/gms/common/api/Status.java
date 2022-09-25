package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C143910az;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, C143711ad {
    public static final Parcelable.Creator CREATOR = new C143714ag();

    /* renamed from: a */
    public static final Status f389615a = new Status(1, 0, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: b */
    public static final Status f389616b = new Status(1, 14, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: c */
    public static final Status f389617c = new Status(1, 8, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: d */
    public static final Status f389618d = new Status(1, 15, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: e */
    public static final Status f389619e = new Status(1, 16, (String) null, (PendingIntent) null, (ConnectionResult) null);

    /* renamed from: f */
    final int f389620f;

    /* renamed from: g */
    public final int f389621g;

    /* renamed from: h */
    public final String f389622h;

    /* renamed from: i */
    public final PendingIntent f389623i;

    /* renamed from: j */
    public final ConnectionResult f389624j;

    public Status(int i, int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f389620f = i;
        this.f389621g = i2;
        this.f389622h = str;
        this.f389623i = pendingIntent;
        this.f389624j = connectionResult;
    }

    @Deprecated
    public Status(ConnectionResult connectionResult, String str) {
        this(1, 17, str, connectionResult.f389575d, connectionResult);
    }

    /* renamed from: a */
    public final Status mo117629a() {
        return this;
    }

    /* renamed from: b */
    public final boolean mo119096b() {
        return this.f389621g == 16;
    }

    /* renamed from: c */
    public final boolean mo119097c() {
        return this.f389621g <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f389620f != status.f389620f || this.f389621g != status.f389621g || !C143912ba.m233950b(this.f389622h, status.f389622h) || !C143912ba.m233950b(this.f389623i, status.f389623i) || !C143912ba.m233950b(this.f389624j, status.f389624j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f389620f), Integer.valueOf(this.f389621g), this.f389622h, this.f389623i, this.f389624j});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.f389622h;
        if (str == null) {
            str = C143843o.m233808a(this.f389621g);
        }
        C143910az.m233947b("statusCode", str, arrayList);
        C143910az.m233947b("resolution", this.f389623i, arrayList);
        return C143910az.m233946a(arrayList, this);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f389621g);
        C143947c.m234106y(parcel, 2, this.f389622h);
        C143947c.m234105x(parcel, 3, this.f389623i, i);
        C143947c.m234105x(parcel, 4, this.f389624j, i);
        C143947c.m234089h(parcel, 1000, this.f389620f);
        C143947c.m234083b(parcel, a);
    }
}
