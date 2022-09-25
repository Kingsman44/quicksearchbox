package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C143912ba;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C146411f();

    /* renamed from: a */
    public final String f395465a;

    /* renamed from: b */
    public final String f395466b;

    /* renamed from: c */
    public final int f395467c;

    /* renamed from: d */
    public final int f395468d;

    /* renamed from: e */
    public final boolean f395469e;

    /* renamed from: f */
    public volatile boolean f395470f;

    /* renamed from: g */
    public volatile String f395471g;

    /* renamed from: h */
    public boolean f395472h;

    /* renamed from: i */
    public String f395473i;

    /* renamed from: j */
    public String f395474j;

    /* renamed from: k */
    public int f395475k;

    /* renamed from: l */
    public List f395476l;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, int i3, List list) {
        this.f395465a = str;
        this.f395466b = str2;
        this.f395467c = i;
        this.f395468d = i2;
        this.f395469e = z;
        this.f395470f = z2;
        this.f395471g = str3;
        this.f395472h = z3;
        this.f395473i = str4;
        this.f395474j = str5;
        this.f395475k = i3;
        this.f395476l = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        if (!C143912ba.m233950b(this.f395465a, connectionConfiguration.f395465a) || !C143912ba.m233950b(this.f395466b, connectionConfiguration.f395466b) || !C143912ba.m233950b(Integer.valueOf(this.f395467c), Integer.valueOf(connectionConfiguration.f395467c)) || !C143912ba.m233950b(Integer.valueOf(this.f395468d), Integer.valueOf(connectionConfiguration.f395468d)) || !C143912ba.m233950b(Boolean.valueOf(this.f395469e), Boolean.valueOf(connectionConfiguration.f395469e)) || !C143912ba.m233950b(Boolean.valueOf(this.f395472h), Boolean.valueOf(connectionConfiguration.f395472h))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f395465a, this.f395466b, Integer.valueOf(this.f395467c), Integer.valueOf(this.f395468d), Boolean.valueOf(this.f395469e), Boolean.valueOf(this.f395472h)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.f395465a + ", Address=" + this.f395466b + ", Type=" + this.f395467c + ", Role=" + this.f395468d + ", Enabled=" + this.f395469e + ", IsConnected=" + this.f395470f + ", PeerNodeId=" + this.f395471g + ", BtlePriority=" + this.f395472h + ", NodeId=" + this.f395473i + ", PackageName=" + this.f395474j + ", ConnectionRetryStrategy=" + this.f395475k + ", allowedConfigPackages=" + this.f395476l + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234106y(parcel, 2, this.f395465a);
        C143947c.m234106y(parcel, 3, this.f395466b);
        C143947c.m234089h(parcel, 4, this.f395467c);
        C143947c.m234089h(parcel, 5, this.f395468d);
        C143947c.m234084c(parcel, 6, this.f395469e);
        C143947c.m234084c(parcel, 7, this.f395470f);
        C143947c.m234106y(parcel, 8, this.f395471g);
        C143947c.m234084c(parcel, 9, this.f395472h);
        C143947c.m234106y(parcel, 10, this.f395473i);
        C143947c.m234106y(parcel, 11, this.f395474j);
        C143947c.m234089h(parcel, 12, this.f395475k);
        C143947c.m234078A(parcel, 13, this.f395476l);
        C143947c.m234083b(parcel, a);
    }
}
