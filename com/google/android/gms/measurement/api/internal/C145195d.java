package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.p10793f.C144165j;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.api.internal.d */
/* compiled from: PG */
public interface C145195d extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(C145198g gVar);

    void getAppInstanceId(C145198g gVar);

    void getCachedAppInstanceId(C145198g gVar);

    void getConditionalUserProperties(String str, String str2, C145198g gVar);

    void getCurrentScreenClass(C145198g gVar);

    void getCurrentScreenName(C145198g gVar);

    void getGmpAppId(C145198g gVar);

    void getMaxUserProperties(String str, C145198g gVar);

    void getTestFlag(C145198g gVar, int i);

    void getUserProperties(String str, String str2, boolean z, C145198g gVar);

    void initForTests(Map map);

    void initialize(C144165j jVar, InitializationParams initializationParams, long j);

    void isDataCollectionEnabled(C145198g gVar);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, C145198g gVar, long j);

    void logHealthData(int i, String str, C144165j jVar, C144165j jVar2, C144165j jVar3);

    void onActivityCreated(C144165j jVar, Bundle bundle, long j);

    void onActivityDestroyed(C144165j jVar, long j);

    void onActivityPaused(C144165j jVar, long j);

    void onActivityResumed(C144165j jVar, long j);

    void onActivitySaveInstanceState(C144165j jVar, C145198g gVar, long j);

    void onActivityStarted(C144165j jVar, long j);

    void onActivityStopped(C144165j jVar, long j);

    void performAction(Bundle bundle, C145198g gVar, long j);

    void registerOnMeasurementEventListener(C145200i iVar);

    void resetAnalyticsData(long j);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(C144165j jVar, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(C145200i iVar);

    void setInstanceIdProvider(C145202k kVar);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, C144165j jVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(C145200i iVar);
}
