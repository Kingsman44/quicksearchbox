package com.google.android.gms.car.p10750a.p10751a;

import android.os.Looper;
import com.google.android.gms.car.ActivityLaunchInfo;
import com.google.android.gms.car.C143135bs;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;

/* renamed from: com.google.android.gms.car.a.a.ct */
/* compiled from: PG */
public final class C143050ct extends C143135bs {
    public C143050ct() {
        new C144861c(Looper.getMainLooper());
    }

    /* renamed from: a */
    public final synchronized void mo117995a(ActivityLaunchInfo activityLaunchInfo) {
        if (C143316a.m232515e("GH.PrxyActLfecycleLstnr", 4)) {
            C143316a.m232514d(4, "GH.PrxyActLfecycleLstnr", (Throwable) null, "Trying to send activity destroyed but there is no registered CarActivityLifecycleEventListener. %s", activityLaunchInfo);
        }
    }

    /* renamed from: b */
    public final synchronized void mo117996b(ActivityLaunchInfo activityLaunchInfo) {
        if (C143316a.m232515e("GH.PrxyActLfecycleLstnr", 4)) {
            C143316a.m232514d(4, "GH.PrxyActLfecycleLstnr", (Throwable) null, "Trying to send activity started but there is no registered CarActivityLifecycleEventListener. %s", activityLaunchInfo);
        }
    }

    /* renamed from: c */
    public final synchronized void mo117997c(ActivityLaunchInfo activityLaunchInfo) {
        if (C143316a.m232515e("GH.PrxyActLfecycleLstnr", 4)) {
            C143316a.m232514d(4, "GH.PrxyActLfecycleLstnr", (Throwable) null, "Trying to send activity stopped but there is no registered CarActivityLifecycleEventListener. %s", activityLaunchInfo);
        }
    }

    /* renamed from: d */
    public final synchronized void mo117998d() {
        if (C143316a.m232515e("GH.PrxyActLfecycleLstnr", 3)) {
            C143316a.m232514d(3, "GH.PrxyActLfecycleLstnr", (Throwable) null, "Clearing local CarActivityLifecycleEventListener %s", null);
        }
    }
}
