package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;

/* renamed from: com.google.android.gms.location.internal.g */
/* compiled from: PG */
public final class C144929g extends C8848a implements C144930h {
    public C144929g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    /* renamed from: e */
    public final Location mo120434e() {
        Parcel gT = mo17261gT(7, mo17260gA());
        Location location = (Location) C8850c.m23492a(gT, Location.CREATOR);
        gT.recycle();
        return location;
    }

    /* renamed from: f */
    public final LocationAvailability mo120435f(String str) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        Parcel gT = mo17261gT(34, gA);
        LocationAvailability locationAvailability = (LocationAvailability) C8850c.m23492a(gT, LocationAvailability.CREATOR);
        gT.recycle();
        return locationAvailability;
    }

    /* renamed from: g */
    public final void mo120436g(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C144928f fVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, geofencingRequest);
        C8850c.m23497f(gA, pendingIntent);
        C8850c.m23499h(gA, fVar);
        mo17262he(57, gA);
    }

    /* renamed from: h */
    public final void mo120437h(LastLocationRequest lastLocationRequest, C144932j jVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, lastLocationRequest);
        C8850c.m23499h(gA, jVar);
        mo17262he(82, gA);
    }

    /* renamed from: i */
    public final void mo120438i(LocationReceiver locationReceiver, LocationRequest locationRequest, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, locationReceiver);
        C8850c.m23497f(gA, locationRequest);
        C8850c.m23499h(gA, buVar);
        mo17262he(88, gA);
    }

    /* renamed from: j */
    public final void mo120439j(PendingIntent pendingIntent, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, pendingIntent);
        C8850c.m23499h(gA, buVar);
        mo17262he(73, gA);
    }

    /* renamed from: k */
    public final void mo120440k(PendingIntent pendingIntent, C144928f fVar, String str) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, pendingIntent);
        C8850c.m23499h(gA, fVar);
        gA.writeString(str);
        mo17262he(2, gA);
    }

    /* renamed from: l */
    public final void mo120441l(String[] strArr, C144928f fVar, String str) {
        Parcel gA = mo17260gA();
        gA.writeStringArray(strArr);
        C8850c.m23499h(gA, fVar);
        gA.writeString(str);
        mo17262he(3, gA);
    }

    /* renamed from: m */
    public final void mo120442m(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, activityTransitionRequest);
        C8850c.m23497f(gA, pendingIntent);
        C8850c.m23499h(gA, buVar);
        mo17262he(72, gA);
    }

    /* renamed from: n */
    public final void mo120443n(LocationReceiver locationReceiver, C143773bu buVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, locationReceiver);
        C8850c.m23499h(gA, buVar);
        mo17262he(89, gA);
    }

    /* renamed from: o */
    public final void mo120444o(LocationRequestUpdateData locationRequestUpdateData) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, locationRequestUpdateData);
        mo17262he(59, gA);
    }

    /* renamed from: p */
    public final void mo120445p(LocationSettingsRequest locationSettingsRequest, C144934l lVar) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, locationSettingsRequest);
        C8850c.m23499h(gA, lVar);
        gA.writeString((String) null);
        mo17262he(63, gA);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.common.internal.C143900ap mo120446q(com.google.android.gms.location.CurrentLocationRequest r3, com.google.android.gms.location.internal.C144932j r4) {
        /*
            r2 = this;
            android.os.Parcel r0 = r2.mo17260gA()
            com.google.android.p445a.C8850c.m23497f(r0, r3)
            com.google.android.p445a.C8850c.m23499h(r0, r4)
            r3 = 87
            android.os.Parcel r3 = r2.mo17261gT(r3, r0)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x0018
            r4 = 0
            goto L_0x002c
        L_0x0018:
            java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.C143900ap
            if (r1 == 0) goto L_0x0026
            r4 = r0
            com.google.android.gms.common.internal.ap r4 = (com.google.android.gms.common.internal.C143900ap) r4
            goto L_0x002c
        L_0x0026:
            com.google.android.gms.common.internal.ap r0 = new com.google.android.gms.common.internal.ap
            r0.<init>(r4)
            r4 = r0
        L_0x002c:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.internal.C144929g.mo120446q(com.google.android.gms.location.CurrentLocationRequest, com.google.android.gms.location.internal.j):com.google.android.gms.common.internal.ap");
    }
}
