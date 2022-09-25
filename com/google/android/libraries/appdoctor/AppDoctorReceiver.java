package com.google.android.libraries.appdoctor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.appdoctor.p573a.C10446c;
import com.google.android.libraries.appdoctor.p573a.C10461r;
import com.google.common.p4552o.p4566l.C60223w;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
public class AppDoctorReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static /* synthetic */ void m25412a(C60870cx cxVar, BroadcastReceiver.PendingResult pendingResult) {
        try {
            cxVar.get(8, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            Log.w("AppDoctorReceiver", "Failed to complete fix in time for broadcast.");
        } catch (Throwable th) {
            Log.i("AppDoctorReceiver", "App doctor is complete.");
            pendingResult.setResultCode(-1);
            pendingResult.finish();
            throw th;
        }
        Log.i("AppDoctorReceiver", "App doctor is complete.");
        pendingResult.setResultCode(-1);
        pendingResult.finish();
    }

    public final void onReceive(Context context, Intent intent) {
        C60870cx cxVar;
        if (!"com.google.android.libraries.appdoctor.ACTION_TELE_DOCTOR_FIX".equals(intent.getAction())) {
            Log.e("AppDoctorReceiver", "Wrong action.");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("com.google.android.libraries.appdoctor.EXTRA_TELE_FIX")) {
            Log.w("AppDoctorReceiver", "No fix found in broadcast.");
            return;
        }
        C10476d a = new C10468c(new C10461r()).mo18507a();
        C60223w wVar = C60223w.TELEDOCTOR;
        if (!C10477e.m25456b(context)) {
            cxVar = C60856cj.m92900i(false);
        } else {
            cxVar = C10446c.m25414a(new C10443a(a, context, wVar));
        }
        setResultCode(-1);
        if (cxVar.isDone()) {
            Log.i("AppDoctorReceiver", "Fix has already been completed.");
        } else {
            C10446c.m25414a(new C10478f(cxVar, goAsync()));
        }
    }
}
