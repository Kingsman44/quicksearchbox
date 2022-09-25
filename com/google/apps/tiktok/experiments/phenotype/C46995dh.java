package com.google.apps.tiktok.experiments.phenotype;

import android.app.ActivityManager;
import android.os.Process;
import android.util.Log;
import com.google.common.base.C58833ax;
import dagger.p5294a.C68221g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.dh */
/* compiled from: PG */
final class C46995dh implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C46996di f122524a;

    public C46995dh(C46996di diVar) {
        this.f122524a = diVar;
    }

    public final void run() {
        C46996di diVar = this.f122524a;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i = runningAppProcessInfo.importance;
        Log.w("TimedProcessReaper", "Memory state is: " + i);
        Object e = ((C58833ax) ((C68221g) diVar.f122525a).f184583a).mo56109e(400);
        C69664n.m101060f(e, "importantThreshold.get()…ULT_IMPORTANCE_THRESHOLD)");
        if (runningAppProcessInfo.importance >= ((Number) e).intValue()) {
            Log.w("TimedProcessReaper", "Killing process to refresh configuration");
            Process.killProcess(Process.myPid());
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
    }
}
