package com.google.android.apps.gsa.shared.util.debug.p7163a;

import android.os.Process;
import android.os.SystemClock;
import android.text.format.DateUtils;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.shared.util.p7180q.C91081a;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.k */
/* compiled from: PG */
public final class C91011k implements C90991b {

    /* renamed from: a */
    private final C91013m f254249a;

    public C91011k(C91013m mVar) {
        this.f254249a = mVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("Process Info");
        fVar.mo85279c("pid").mo85276a(C90752i.m148230d(Integer.valueOf(Process.myPid())));
        fVar.mo85279c("uid").mo85276a(C90752i.m148230d(Integer.valueOf(Process.myUid())));
        fVar.mo85279c("tid").mo85276a(C90752i.m148230d(Integer.valueOf(Process.myTid())));
        fVar.mo85280d("name", 0).mo85276a(C90752i.m148231e(C91081a.m148802a()));
        fVar.mo85279c("threads").mo85276a(C90752i.m148230d(Integer.valueOf(Thread.activeCount())));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long startElapsedRealtime = Process.getStartElapsedRealtime();
        fVar.mo85279c("process uptime (s)").mo85276a(C90752i.m148229c(DateUtils.formatElapsedTime((elapsedRealtime - startElapsedRealtime) / 1000)));
        fVar.mo85279c("started (s)").mo85276a(C90752i.m148229c(String.format("%s after system boot", new Object[]{DateUtils.formatElapsedTime(startElapsedRealtime / 1000)})));
        fVar.mo85289p("Threads", this.f254249a);
    }
}
