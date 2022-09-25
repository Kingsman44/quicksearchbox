package com.google.android.gms.car;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.gms.car.cs */
/* compiled from: PG */
public final /* synthetic */ class C143163cs implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143179df f388205a;

    public /* synthetic */ C143163cs(C143179df dfVar) {
        this.f388205a = dfVar;
    }

    public final void run() {
        C143179df dfVar = this.f388205a;
        if (dfVar.f388242Q) {
            C58838bb.m90884s(Looper.myLooper() != Looper.getMainLooper(), "checkConfiguration must happen on worker thread");
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        dfVar.f388235J.getRealMetrics(displayMetrics);
        Configuration configuration = dfVar.getResources().getConfiguration();
        int i = (int) (((float) displayMetrics.widthPixels) * (160.0f / displayMetrics.xdpi));
        int i2 = (int) (((float) displayMetrics.heightPixels) * (160.0f / displayMetrics.ydpi));
        if (configuration.densityDpi == displayMetrics.densityDpi && configuration.screenWidthDp == i && configuration.screenHeightDp == i2) {
            if (C143109au.m232164a("CAR.PROJECTION.PRES", 4)) {
                C143316a.m232514d(4, "CAR.PROJECTION.PRES", (Throwable) null, "Dimensions matching -- display: %s, config: %s. Completing presentation start", displayMetrics, dfVar.getResources().getConfiguration());
            }
            dfVar.mo118147e();
            return;
        }
        int i3 = dfVar.f388240O;
        if (i3 < ((C143171d) dfVar.f388236K).f388222e) {
            dfVar.f388240O = i3 + 1;
            if (C143109au.m232164a("CAR.PROJECTION.PRES", 5)) {
                C143316a.m232514d(5, "CAR.PROJECTION.PRES", (Throwable) null, "Dimensions not matching -- display: %s, config: %s. Waiting.", displayMetrics, dfVar.getResources().getConfiguration());
            }
            Handler handler = dfVar.f388239N;
            C58838bb.m90866a(handler, "presentationConfigurationCheckingHandler can't be null if we are checking config");
            handler.postDelayed(new C143163cs(dfVar), (long) ((C143171d) dfVar.f388236K).f388221d);
            return;
        }
        if (C143109au.m232164a("CAR.PROJECTION.PRES", 5)) {
            C143316a.m232514d(5, "CAR.PROJECTION.PRES", (Throwable) null, "Too many failed config checks -- display: %s, config: %s", displayMetrics, dfVar.getResources().getConfiguration());
        }
        if (!((C143171d) dfVar.f388236K).f388220c) {
            if (C143109au.m232164a("CAR.PROJECTION.PRES", 5)) {
                C143316a.m232514d(5, "CAR.PROJECTION.PRES", (Throwable) null, "Completing presentation construction with un-updated context", new Object[0]);
            }
            dfVar.mo118147e();
            return;
        }
        throw new IllegalStateException("Unable to configure presentation for ".concat(String.valueOf(dfVar.f388260h)));
    }
}
