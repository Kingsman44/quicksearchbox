package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C4380ad;
import androidx.work.impl.C4452ag;

/* compiled from: PG */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f14293a = C4380ad.m12561i("RescheduleReceiver");

    public final void onReceive(Context context, Intent intent) {
        C4380ad h = C4380ad.m12560h();
        String str = f14293a;
        new StringBuilder("Received intent ").append(intent);
        h.mo9309a(str, "Received intent ".concat(String.valueOf(intent)));
        try {
            C4452ag j = C4452ag.m12686j(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (C4452ag.f14138b) {
                j.f14148j = goAsync;
                if (j.f14147i) {
                    j.f14148j.finish();
                    j.f14148j = null;
                }
            }
        } catch (IllegalStateException e) {
            C4380ad.m12560h().mo9312d(f14293a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
