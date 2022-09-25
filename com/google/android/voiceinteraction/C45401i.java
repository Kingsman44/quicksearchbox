package com.google.android.voiceinteraction;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7010ba.C89340b;
import com.google.android.apps.gsa.shared.p7010ba.C89341c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4580v.C60948g;
import com.google.common.util.concurrent.C60826bg;
import java.util.List;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.voiceinteraction.i */
/* compiled from: PG */
public final /* synthetic */ class C45401i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ GsaVoiceInteractionService f118773a;

    public /* synthetic */ C45401i(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118773a = gsaVoiceInteractionService;
    }

    public final void run() {
        int i;
        ActivityManager activityManager;
        GsaVoiceInteractionService gsaVoiceInteractionService = this.f118773a;
        Context applicationContext = gsaVoiceInteractionService.getApplicationContext();
        C60948g gVar = C60948g.f165068a;
        Instant now = Instant.now();
        Duration ofMillis = Duration.ofMillis(SystemClock.elapsedRealtime());
        C89341c cVar = (C89341c) gsaVoiceInteractionService.f118685ag.mo27525b();
        int myPid = Process.myPid();
        C58833ax axVar = C58836b.f156633a;
        if (!(Build.VERSION.SDK_INT < 30 || (i = ((C89341c) gsaVoiceInteractionService.f118685ag.mo27525b()).mo83283a().f242211f) == 0 || (activityManager = (ActivityManager) applicationContext.getSystemService("activity")) == null)) {
            List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons((String) null, i, 1);
            if (!historicalProcessExitReasons.isEmpty()) {
                axVar = C58833ax.m90834k(Instant.ofEpochMilli(((ApplicationExitInfo) historicalProcessExitReasons.get(0)).getTimestamp()));
            }
        }
        C118826c.m197213c(cVar.f242218c.mo46039a(new C89340b(ofMillis, now, myPid, axVar), C60826bg.f164896a)).mo4106b(new C45395c(gsaVoiceInteractionService), C60826bg.f164896a);
    }
}
