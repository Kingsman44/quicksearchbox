package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.p445a.C8848a;
import com.google.android.p445a.C8850c;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.api.internal.b */
/* compiled from: PG */
public final class C145193b extends C8848a implements C145195d {
    public C145193b(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeLong(j);
        mo17262he(23, gA);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23497f(gA, bundle);
        mo17262he(9, gA);
    }

    public final void clearMeasurementEnabled(long j) {
        throw null;
    }

    public final void endAdUnitExposure(String str, long j) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeLong(j);
        mo17262he(24, gA);
    }

    public final void generateEventId(C145198g gVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, gVar);
        mo17262he(22, gA);
    }

    public final void getAppInstanceId(C145198g gVar) {
        throw null;
    }

    public final void getCachedAppInstanceId(C145198g gVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, gVar);
        mo17262he(19, gA);
    }

    public final void getConditionalUserProperties(String str, String str2, C145198g gVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23499h(gA, gVar);
        mo17262he(10, gA);
    }

    public final void getCurrentScreenClass(C145198g gVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, gVar);
        mo17262he(17, gA);
    }

    public final void getCurrentScreenName(C145198g gVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, gVar);
        mo17262he(16, gA);
    }

    public final void getGmpAppId(C145198g gVar) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, gVar);
        mo17262he(21, gA);
    }

    public final void getMaxUserProperties(String str, C145198g gVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        C8850c.m23499h(gA, gVar);
        mo17262he(6, gA);
    }

    public final void getTestFlag(C145198g gVar, int i) {
        throw null;
    }

    public final void getUserProperties(String str, String str2, boolean z, C145198g gVar) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23495d(gA, z);
        C8850c.m23499h(gA, gVar);
        mo17262he(5, gA);
    }

    public final void initForTests(Map map) {
        throw null;
    }

    public final void initialize(C144165j jVar, InitializationParams initializationParams, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23497f(gA, initializationParams);
        gA.writeLong(j);
        mo17262he(1, gA);
    }

    public final void isDataCollectionEnabled(C145198g gVar) {
        throw null;
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel gA = mo17260gA();
        gA.writeString(str);
        gA.writeString(str2);
        C8850c.m23497f(gA, bundle);
        C8850c.m23495d(gA, z);
        C8850c.m23495d(gA, true);
        gA.writeLong(j);
        mo17262he(2, gA);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, C145198g gVar, long j) {
        throw null;
    }

    public final void logHealthData(int i, String str, C144165j jVar, C144165j jVar2, C144165j jVar3) {
        Parcel gA = mo17260gA();
        gA.writeInt(5);
        gA.writeString("Error with data collection. Data lost.");
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, jVar2);
        C8850c.m23499h(gA, jVar3);
        mo17262he(33, gA);
    }

    public final void onActivityCreated(C144165j jVar, Bundle bundle, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23497f(gA, bundle);
        gA.writeLong(j);
        mo17262he(27, gA);
    }

    public final void onActivityDestroyed(C144165j jVar, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        gA.writeLong(j);
        mo17262he(28, gA);
    }

    public final void onActivityPaused(C144165j jVar, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        gA.writeLong(j);
        mo17262he(29, gA);
    }

    public final void onActivityResumed(C144165j jVar, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        gA.writeLong(j);
        mo17262he(30, gA);
    }

    public final void onActivitySaveInstanceState(C144165j jVar, C145198g gVar, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        C8850c.m23499h(gA, gVar);
        gA.writeLong(j);
        mo17262he(31, gA);
    }

    public final void onActivityStarted(C144165j jVar, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        gA.writeLong(j);
        mo17262he(25, gA);
    }

    public final void onActivityStopped(C144165j jVar, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        gA.writeLong(j);
        mo17262he(26, gA);
    }

    public final void performAction(Bundle bundle, C145198g gVar, long j) {
        throw null;
    }

    public final void registerOnMeasurementEventListener(C145200i iVar) {
        throw null;
    }

    public final void resetAnalyticsData(long j) {
        throw null;
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23497f(gA, bundle);
        gA.writeLong(j);
        mo17262he(8, gA);
    }

    public final void setConsent(Bundle bundle, long j) {
        throw null;
    }

    public final void setConsentThirdParty(Bundle bundle, long j) {
        throw null;
    }

    public final void setCurrentScreen(C144165j jVar, String str, String str2, long j) {
        Parcel gA = mo17260gA();
        C8850c.m23499h(gA, jVar);
        gA.writeString(str);
        gA.writeString(str2);
        gA.writeLong(j);
        mo17262he(15, gA);
    }

    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    public final void setDefaultEventParameters(Bundle bundle) {
        throw null;
    }

    public final void setEventInterceptor(C145200i iVar) {
        throw null;
    }

    public final void setInstanceIdProvider(C145202k kVar) {
        throw null;
    }

    public final void setMeasurementEnabled(boolean z, long j) {
        throw null;
    }

    public final void setMinimumSessionDuration(long j) {
        throw null;
    }

    public final void setSessionTimeoutDuration(long j) {
        throw null;
    }

    public final void setUserId(String str, long j) {
        throw null;
    }

    public final void setUserProperty(String str, String str2, C144165j jVar, boolean z, long j) {
        throw null;
    }

    public final void unregisterOnMeasurementEventListener(C145200i iVar) {
        throw null;
    }
}
