package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.C4380ad;
import androidx.work.C4382af;
import androidx.work.C4383ag;
import androidx.work.impl.C4452ag;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;

/* compiled from: PG */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f14350a = C4380ad.m12561i("DiagnosticsRcvr");

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            C4380ad.m12560h().mo9309a(f14350a, "Requesting diagnostics");
            try {
                C4452ag.m12686j(context).mo9330d(Collections.singletonList((C4383ag) new C4382af(DiagnosticsWorker.class).mo9337b()));
            } catch (IllegalStateException e) {
                C4380ad.m12560h().mo9312d(f14350a, "WorkManager is not initialized", e);
            }
        }
    }
}
