package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IInterface;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.common.internal.C143900ap;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;

/* renamed from: com.google.android.gms.location.internal.h */
/* compiled from: PG */
public interface C144930h extends IInterface {
    @Deprecated
    /* renamed from: e */
    Location mo120434e();

    @Deprecated
    /* renamed from: f */
    LocationAvailability mo120435f(String str);

    /* renamed from: g */
    void mo120436g(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, C144928f fVar);

    @Deprecated
    /* renamed from: h */
    void mo120437h(LastLocationRequest lastLocationRequest, C144932j jVar);

    /* renamed from: i */
    void mo120438i(LocationReceiver locationReceiver, LocationRequest locationRequest, C143773bu buVar);

    /* renamed from: j */
    void mo120439j(PendingIntent pendingIntent, C143773bu buVar);

    /* renamed from: k */
    void mo120440k(PendingIntent pendingIntent, C144928f fVar, String str);

    /* renamed from: l */
    void mo120441l(String[] strArr, C144928f fVar, String str);

    /* renamed from: m */
    void mo120442m(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, C143773bu buVar);

    /* renamed from: n */
    void mo120443n(LocationReceiver locationReceiver, C143773bu buVar);

    @Deprecated
    /* renamed from: o */
    void mo120444o(LocationRequestUpdateData locationRequestUpdateData);

    /* renamed from: p */
    void mo120445p(LocationSettingsRequest locationSettingsRequest, C144934l lVar);

    @Deprecated
    /* renamed from: q */
    C143900ap mo120446q(CurrentLocationRequest currentLocationRequest, C144932j jVar);
}
