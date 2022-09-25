package com.google.p3723ar.core;

import android.os.Bundle;
import android.util.Log;
import com.google.android.play.core.install.p3544b.C45201b;
import com.google.p3723ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.p */
/* compiled from: PG */
final class C47910p extends C45201b {

    /* renamed from: a */
    final /* synthetic */ C47911q f124050a;

    public C47910p(C47911q qVar) {
        this.f124050a = qVar;
    }

    /* renamed from: a */
    public final void mo49028a(Bundle bundle) {
        int i = bundle.getInt("error.code", -100);
        if (i == -5) {
            Log.e("ARCore-InstallService", "The device is not supported.");
            this.f124050a.f124052b.onResult(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
        } else if (i == -3) {
            Log.e("ARCore-InstallService", "The Google Play application must be updated.");
            this.f124050a.f124052b.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else if (i != 0) {
            Log.e("ARCore-InstallService", "requestInfo returned: " + i);
            this.f124050a.f124052b.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else {
            this.f124050a.f124052b.onResult(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
        }
    }
}
