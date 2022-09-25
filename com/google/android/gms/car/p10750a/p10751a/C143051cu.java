package com.google.android.gms.car.p10750a.p10751a;

import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.car.ActivityLaunchInfo;
import com.google.android.gms.car.C143137bu;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.car.a.a.cu */
/* compiled from: PG */
public final class C143051cu extends C143137bu {
    public C143051cu() {
        new C144861c(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final synchronized void mo117999a(ActivityLaunchInfo activityLaunchInfo) {
        if (C143316a.m232515e("GH.PrxyActStartLstnr", 4)) {
            C143316a.m232514d(4, "GH.PrxyActStartLstnr", (Throwable) null, "Trying to send onActivityStartRequested but there is no registered CarActivityStartListener. %s", activityLaunchInfo);
        }
    }

    @Deprecated
    /* renamed from: b */
    public final synchronized void mo118000b(Intent intent) {
        if (C143316a.m232515e("GH.PrxyActStartLstnr", 4)) {
            C143316a.m232514d(4, "GH.PrxyActStartLstnr", (Throwable) null, "Trying to send onActivityStartedOnPrimaryDisplayAndRegion but there is no registered CarActivityStartListener. Intent: %s", intent);
        }
    }

    @Deprecated
    /* renamed from: c */
    public final synchronized void mo118001c(Intent intent) {
        if (C143316a.m232515e("GH.PrxyActStartLstnr", 4)) {
            C143316a.m232514d(4, "GH.PrxyActStartLstnr", (Throwable) null, "Trying to send onNewActivityRequestOnPrimaryDisplayAndRegion but there is no registered CarActivityStartListener. Intent: %s", intent);
        }
    }

    /* renamed from: d */
    public final synchronized void mo118002d() {
        if (C143316a.m232515e("GH.PrxyActStartLstnr", 3)) {
            C143316a.m232514d(3, "GH.PrxyActStartLstnr", (Throwable) null, "Clearing local CarActivityStartListener %s", null);
        }
    }
}
