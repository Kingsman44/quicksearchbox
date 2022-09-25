package com.google.p3723ar.core;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.evernote.android.state.BuildConfig;
import com.google.p3723ar.core.ArCoreApk;
import com.google.p3723ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.p3723ar.core.exceptions.UnavailableUserDeclinedInstallationException;

/* renamed from: com.google.ar.core.v */
/* compiled from: PG */
final class C47916v {
    /* renamed from: a */
    static PendingIntent m85124a(Context context) {
        RuntimeException runtimeException;
        try {
            Bundle call = context.getContentResolver().call(new Uri.Builder().scheme("content").authority("com.google.ar.core.services.arcorecontentprovider").path(BuildConfig.FLAVOR).build(), "getSetupIntent", context.getPackageName(), (Bundle) null);
            if (call == null) {
                return null;
            }
            PendingIntent pendingIntent = (PendingIntent) call.getParcelable("intent");
            if (pendingIntent != null) {
                return pendingIntent;
            }
            String string = call.getString("exceptionType", BuildConfig.FLAVOR);
            if (string.isEmpty()) {
                return null;
            }
            if (string.equals(UnavailableDeviceNotCompatibleException.class.getName())) {
                throw new UnavailableDeviceNotCompatibleException();
            } else if (!string.equals(UnavailableUserDeclinedInstallationException.class.getName())) {
                Class<? extends U> asSubclass = Class.forName(string).asSubclass(RuntimeException.class);
                String string2 = call.getString("exceptionText", (String) null);
                if (string2 != null) {
                    runtimeException = (RuntimeException) asSubclass.getConstructor(new Class[]{String.class}).newInstance(new Object[]{string2});
                } else {
                    runtimeException = (RuntimeException) asSubclass.getConstructor(new Class[0]).newInstance(new Object[0]);
                }
                throw runtimeException;
            } else {
                throw new UnavailableUserDeclinedInstallationException();
            }
        } catch (ReflectiveOperationException | RuntimeException e) {
            Log.i("ARCore-SetupContentResolver", "Post-install failed", e);
            return null;
        }
    }

    /* renamed from: b */
    static ArCoreApk.Availability m85125b(Context context) {
        try {
            if (m85124a(context) != null) {
                return ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD;
            }
            return ArCoreApk.Availability.SUPPORTED_INSTALLED;
        } catch (UnavailableDeviceNotCompatibleException unused) {
            return ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE;
        } catch (UnavailableUserDeclinedInstallationException | RuntimeException unused2) {
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }
}
