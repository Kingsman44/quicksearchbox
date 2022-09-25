package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C143947c;
import com.google.android.gms.location.C144880ak;
import com.google.android.gms.location.C144882am;
import com.google.android.gms.location.C144883an;
import com.google.android.gms.location.C144885ap;

@Deprecated
/* compiled from: PG */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C144921aj();

    /* renamed from: a */
    public final int f391860a;

    /* renamed from: b */
    public final LocationRequestInternal f391861b;

    /* renamed from: c */
    public final PendingIntent f391862c;

    /* renamed from: d */
    public final String f391863d;

    /* renamed from: e */
    private final C144885ap f391864e;

    /* renamed from: f */
    private final C144882am f391865f;

    /* renamed from: g */
    private final C144926d f391866g;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        C144885ap apVar;
        C144882am amVar;
        this.f391860a = i;
        this.f391861b = locationRequestInternal;
        C144926d dVar = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            apVar = queryLocalInterface instanceof C144885ap ? (C144885ap) queryLocalInterface : new C144883an(iBinder);
        } else {
            apVar = null;
        }
        this.f391864e = apVar;
        this.f391862c = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            amVar = queryLocalInterface2 instanceof C144882am ? (C144882am) queryLocalInterface2 : new C144880ak(iBinder2);
        } else {
            amVar = null;
        }
        this.f391865f = amVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            dVar = queryLocalInterface3 instanceof C144926d ? (C144926d) queryLocalInterface3 : new C144924b(iBinder3);
        }
        this.f391866g = dVar;
        this.f391863d = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        IBinder iBinder2;
        int a = C143947c.m234082a(parcel, 20293);
        C143947c.m234089h(parcel, 1, this.f391860a);
        C143947c.m234105x(parcel, 2, this.f391861b, i);
        C144885ap apVar = this.f391864e;
        IBinder iBinder3 = null;
        if (apVar == null) {
            iBinder = null;
        } else {
            iBinder = apVar.asBinder();
        }
        C143947c.m234098q(parcel, 3, iBinder);
        C143947c.m234105x(parcel, 4, this.f391862c, i);
        C144882am amVar = this.f391865f;
        if (amVar == null) {
            iBinder2 = null;
        } else {
            iBinder2 = amVar.asBinder();
        }
        C143947c.m234098q(parcel, 5, iBinder2);
        C144926d dVar = this.f391866g;
        if (dVar != null) {
            iBinder3 = dVar.asBinder();
        }
        C143947c.m234098q(parcel, 6, iBinder3);
        C143947c.m234106y(parcel, 8, this.f391863d);
        C143947c.m234083b(parcel, a);
    }
}
