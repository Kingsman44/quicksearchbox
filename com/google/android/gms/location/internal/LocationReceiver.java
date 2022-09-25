package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;

/* compiled from: PG */
public final class LocationReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144919ah();

    /* renamed from: a */
    public final int f391853a;

    /* renamed from: b */
    public final IBinder f391854b;

    /* renamed from: c */
    public final IBinder f391855c;

    /* renamed from: d */
    public final PendingIntent f391856d;

    /* renamed from: e */
    public final String f391857e;

    /* renamed from: f */
    public final String f391858f;

    public LocationReceiver(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f391853a = i;
        this.f391854b = iBinder;
        this.f391855c = iBinder2;
        this.f391856d = pendingIntent;
        this.f391857e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f391858f = str2;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.internal.LocationReceiver m235510a(android.os.IInterface r8, com.google.android.gms.location.C144882am r9, java.lang.String r10) {
        /*
            com.google.android.gms.location.internal.LocationReceiver r7 = new com.google.android.gms.location.internal.LocationReceiver
            if (r8 != 0) goto L_0x0005
            r8 = 0
        L_0x0005:
            r2 = r8
            r1 = 2
            r4 = 0
            r5 = 0
            r0 = r7
            r3 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.LocationReceiver.m235510a(android.os.IInterface, com.google.android.gms.location.am, java.lang.String):com.google.android.gms.location.internal.LocationReceiver");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.os.IBinder] */
    /* JADX WARNING: type inference failed for: r3v0, types: [android.os.IBinder] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.internal.LocationReceiver m235511b(android.os.IInterface r8, com.google.android.gms.location.C144885ap r9, java.lang.String r10) {
        /*
            com.google.android.gms.location.internal.LocationReceiver r7 = new com.google.android.gms.location.internal.LocationReceiver
            if (r8 != 0) goto L_0x0005
            r8 = 0
        L_0x0005:
            r2 = r8
            r1 = 1
            r4 = 0
            r5 = 0
            r0 = r7
            r3 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.LocationReceiver.m235511b(android.os.IInterface, com.google.android.gms.location.ap, java.lang.String):com.google.android.gms.location.internal.LocationReceiver");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391853a);
        C143947c.m234098q(parcel, 2, this.f391854b);
        C143947c.m234098q(parcel, 3, this.f391855c);
        C143947c.m234105x(parcel, 4, this.f391856d, i);
        C143947c.m234106y(parcel, 5, this.f391857e);
        C143947c.m234106y(parcel, 6, this.f391858f);
        C143947c.m234083b(parcel, a);
    }
}
