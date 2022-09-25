package com.google.android.libraries.phenotype.client.stable;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public final class PhenotypeUpdateBackgroundBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhenotypeBackgroundRecv", "Got an invalid config package for P/H that includes '..': " + stringExtra + ". Exiting.");
            return;
        }
        C31760t b = C31760t.m59099b(context);
        if (b == null) {
            C31760t.m59103j();
            C58838bb.m90883r(false);
            return;
        }
        Map a = C31691aj.m59034a(context);
        if (!a.isEmpty()) {
            C31691aj ajVar = (C31691aj) a.get(stringExtra);
            if (ajVar == null || ajVar.f85218e != 7) {
                Log.i("PhenotypeBackgroundRecv", "Skipping " + stringExtra + " which doesn't use ProcessStable flags.");
                return;
            }
            BroadcastReceiver.PendingResult goAsync = goAsync();
            C60838bs bsVar = (C60838bs) C60856cj.m92908q(C60922j.m93045h(C60838bs.m92859i(C60922j.m93044g(C60838bs.m92859i(C31700as.m59035a(b).mo46042d()), new C31695an(stringExtra), b.mo37368h())), new C31709ba(ajVar, stringExtra, b), b.mo37368h()), 25, TimeUnit.SECONDS, b.mo37368h());
            bsVar.mo4106b(new C31710bb(bsVar, stringExtra, goAsync), b.mo37368h());
        }
    }
}
