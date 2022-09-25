package com.google.p5261vr.p5266c9.logging;

import android.content.Context;
import android.util.Log;
import androidx.work.C4381ae;
import androidx.work.C4382af;
import androidx.work.C4383ag;
import androidx.work.C4396at;
import androidx.work.C4407c;
import androidx.work.C4409e;
import androidx.work.C4410f;
import androidx.work.C4412h;
import androidx.work.C4631l;
import androidx.work.C4632m;
import androidx.work.impl.C4452ag;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.vr.c9.logging.ClearcutFrameLogUploader */
/* compiled from: PG */
public class ClearcutFrameLogUploader {

    /* renamed from: a */
    private final C4396at f184154a;

    /* renamed from: b */
    private final String f184155b;

    public ClearcutFrameLogUploader(Context context, String str) {
        C4452ag agVar;
        try {
            agVar = C4452ag.m12686j(context);
        } catch (IllegalStateException e) {
            Log.i("C9ClearcutFrameLogUploader", "Cannot to get default workmanager. Try to build one. ".concat(e.toString()));
            try {
                C4407c cVar = new C4407c();
                cVar.f14059g = 4;
                C4452ag.m12687k(context, new C4409e(cVar));
            } catch (RuntimeException e2) {
                Log.w("C9ClearcutFrameLogUploader", "Failed to build WorkManager. ".concat(e2.toString()));
            }
            try {
                agVar = C4452ag.m12686j(context);
            } catch (IllegalStateException e3) {
                Log.w("C9ClearcutFrameLogUploader", "Failed to get work manager. Frame log will not be uploaded. ".concat(e3.toString()));
                agVar = null;
            }
        }
        this.f184154a = agVar;
        if (agVar != null) {
            Log.i("C9ClearcutFrameLogUploader", "WorkManager is ready.");
            agVar.mo9328b("C9ClearcutFrameLogUploader");
        }
        this.f184155b = str;
    }

    public void scheduleUpload(String str) {
        C4396at atVar = this.f184154a;
        if (atVar != null) {
            String str2 = this.f184155b;
            C4410f fVar = new C4410f();
            fVar.mo9351c(C4381ae.CONNECTED);
            C4412h a = fVar.mo9349a();
            HashMap hashMap = new HashMap();
            hashMap.put("log_directory", str);
            hashMap.put("upload_account_name", str2);
            C4632m a2 = C4631l.m13030a(hashMap);
            C4382af afVar = new C4382af(ClearcutFrameLogUploadWorker.class);
            afVar.mo9341f(a2);
            afVar.mo9340e(300, TimeUnit.SECONDS);
            afVar.mo9339d(a);
            atVar.mo9335i("C9ClearcutFrameLogUploader", 1, Collections.singletonList((C4383ag) afVar.mo9337b()));
            Log.i("C9ClearcutFrameLogUploader", "Clearcut frame log upload worker is enqueued.");
            return;
        }
        Log.w("C9ClearcutFrameLogUploader", "There is no workmanager and frame log will not be uploaded.");
    }
}
