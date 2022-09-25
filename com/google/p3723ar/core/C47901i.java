package com.google.p3723ar.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.p3723ar.core.ArCoreApk;
import com.google.p3723ar.core.exceptions.FatalException;
import p3186j$.util.Objects;

/* renamed from: com.google.ar.core.i */
/* compiled from: PG */
final class C47901i extends ArCoreApk {

    /* renamed from: a */
    public static final C47901i f124033a = new C47901i();

    /* renamed from: b */
    public ArCoreApk.Availability f124034b;

    /* renamed from: c */
    public boolean f124035c;

    /* renamed from: d */
    private C47908n f124036d;

    /* renamed from: e */
    private boolean f124037e;

    /* renamed from: f */
    private boolean f124038f;

    /* renamed from: g */
    private int f124039g;

    /* renamed from: e */
    private static int m85106e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i = packageInfo.versionCode;
            if (i != 0) {
                return i;
            }
            if (packageInfo.services == null || packageInfo.services.length == 0) {
                return -1;
            }
            return 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    /* renamed from: f */
    private final synchronized void m85107f(Context context) {
        if (!this.f124037e) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("com.google.ar.core")) {
                    this.f124038f = ((String) Objects.requireNonNull(bundle.getString("com.google.ar.core"))).equals("required");
                    if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                        this.f124039g = bundle.getInt("com.google.ar.core.min_apk_version");
                        this.f124037e = true;
                        return;
                    }
                    throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
                }
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
            } catch (PackageManager.NameNotFoundException e) {
                throw new FatalException("Could not load application package metadata", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C47908n mo52136a(Context context) {
        if (this.f124036d == null) {
            C47913s sVar = new C47913s();
            sVar.mo52254a(context.getApplicationContext());
            this.f124036d = sVar;
        }
        return this.f124036d;
    }

    /* renamed from: b */
    public final void mo52137b(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        if (mo52139d(context)) {
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_INSTALLED);
        } else if (m85106e(context) == -1) {
            m85107f(context);
            if (this.f124038f) {
                iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
            } else {
                mo52136a(context).mo52255b(context, iCheckAvailabilityCallback);
            }
        } else {
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo52138c() {
        C47908n nVar = this.f124036d;
        if (nVar != null) {
            nVar.mo52256c();
            this.f124036d = null;
        }
    }

    public final ArCoreApk.Availability checkAvailability(Context context) {
        try {
            if (mo52139d(context)) {
                mo52138c();
                return C47916v.m85125b(context);
            }
            synchronized (this) {
                ArCoreApk.Availability availability = this.f124034b;
                if ((availability == null || availability.isUnknown()) && !this.f124035c) {
                    this.f124035c = true;
                    mo52137b(context, new C47900h(this));
                }
                ArCoreApk.Availability availability2 = this.f124034b;
                if (availability2 != null) {
                    return availability2;
                }
                if (this.f124035c) {
                    ArCoreApk.Availability availability3 = ArCoreApk.Availability.UNKNOWN_CHECKING;
                    return availability3;
                }
                Log.e("ARCore-ArCoreApk", "request not running but result is null?");
                ArCoreApk.Availability availability4 = ArCoreApk.Availability.UNKNOWN_ERROR;
                return availability4;
            }
        } catch (FatalException e) {
            Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e);
            return ArCoreApk.Availability.UNKNOWN_ERROR;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo52139d(Context context) {
        m85107f(context);
        return m85106e(context) == 0 || m85106e(context) >= this.f124039g;
    }

    public final void checkAvailability(Context context, ArCoreApk.ICheckAvailabilityCallback iCheckAvailabilityCallback) {
        try {
            if (mo52139d(context)) {
                mo52138c();
                iCheckAvailabilityCallback.onResult(C47916v.m85125b(context));
                return;
            }
            mo52137b(context, iCheckAvailabilityCallback);
        } catch (FatalException e) {
            Log.e("ARCore-ArCoreApk", "Error while checking app details and ARCore status", e);
            iCheckAvailabilityCallback.onResult(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}
