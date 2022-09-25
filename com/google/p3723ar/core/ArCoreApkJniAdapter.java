package com.google.p3723ar.core;

import android.content.Context;
import android.util.Log;
import com.google.p3723ar.core.ArCoreApk;
import com.google.p3723ar.core.exceptions.FatalException;
import com.google.p3723ar.core.exceptions.ResourceExhaustedException;
import com.google.p3723ar.core.exceptions.UnavailableApkTooOldException;
import com.google.p3723ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.p3723ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p3723ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.p3723ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ar.core.ArCoreApkJniAdapter */
/* compiled from: PG */
final class ArCoreApkJniAdapter {

    /* renamed from: a */
    private static final Map f124019a;

    static {
        HashMap hashMap = new HashMap();
        f124019a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(C47914t.ERROR_INVALID_ARGUMENT.f124092G));
        hashMap.put(ResourceExhaustedException.class, Integer.valueOf(C47914t.ERROR_RESOURCE_EXHAUSTED.f124092G));
        hashMap.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(C47914t.UNAVAILABLE_ARCORE_NOT_INSTALLED.f124092G));
        hashMap.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(C47914t.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.f124092G));
        hashMap.put(UnavailableApkTooOldException.class, Integer.valueOf(C47914t.UNAVAILABLE_APK_TOO_OLD.f124092G));
        hashMap.put(UnavailableSdkTooOldException.class, Integer.valueOf(C47914t.UNAVAILABLE_SDK_TOO_OLD.f124092G));
        hashMap.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(C47914t.UNAVAILABLE_USER_DECLINED_INSTALLATION.f124092G));
    }

    private ArCoreApkJniAdapter() {
    }

    static int checkAvailability(Context context) {
        ArCoreApk.Availability availability;
        try {
            ArCoreApk instance = ArCoreApk.getInstance();
            try {
                if (((C47901i) instance).mo52139d(context)) {
                    ((C47901i) instance).mo52138c();
                    availability = C47916v.m85125b(context);
                } else {
                    synchronized (instance) {
                        ArCoreApk.Availability availability2 = ((C47901i) instance).f124034b;
                        if ((availability2 == null || availability2.isUnknown()) && !((C47901i) instance).f124035c) {
                            ((C47901i) instance).f124035c = true;
                            ((C47901i) instance).mo52137b(context, new C47900h((C47901i) instance));
                        }
                        availability = ((C47901i) instance).f124034b;
                        if (availability == null) {
                            if (((C47901i) instance).f124035c) {
                                availability = ArCoreApk.Availability.UNKNOWN_CHECKING;
                            } else {
                                Log.e("ARCore-ArCoreApk", "request not running but result is null?");
                                availability = ArCoreApk.Availability.UNKNOWN_ERROR;
                            }
                        }
                    }
                }
            } catch (FatalException e) {
                Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e);
                availability = ArCoreApk.Availability.UNKNOWN_ERROR;
            }
            return availability.nativeCode;
        } catch (Throwable th) {
            Log.e("ARCore-ArCoreApkJniAdapter", "Exception details:", th);
            Class<?> cls = th.getClass();
            Map map = f124019a;
            if (map.containsKey(cls)) {
                ((Integer) map.get(cls)).intValue();
            } else {
                int i = C47914t.ERROR_FATAL.f124092G;
            }
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }
}
