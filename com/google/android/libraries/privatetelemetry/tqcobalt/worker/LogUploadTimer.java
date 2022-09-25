package com.google.android.libraries.privatetelemetry.tqcobalt.worker;

import android.content.Context;
import androidx.work.C4377aa;
import androidx.work.C4390an;
import androidx.work.C4391ao;
import androidx.work.C4631l;
import androidx.work.C4632m;
import androidx.work.C4645z;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C4452ag;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;

/* compiled from: PG */
public final class LogUploadTimer extends Worker {

    /* renamed from: b */
    private static final C59071e f86054b = C59071e.m91332i("com.google.android.libraries.privatetelemetry.tqcobalt.worker.LogUploadTimer");

    /* renamed from: g */
    private static final C4377aa f86055g = new C4645z(C4632m.f14549a);

    public LogUploadTimer(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: f */
    public static C4391ao m59682f(int i, long j, Duration duration) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.privatetelemetry.tqcobalt.worker.upload.timer.LOGGING_TASK_UNIQUE_WORK_NAME", C32043e.m59707a(i, j));
        hashMap.put("com.google.android.libraries.privatetelemetry.tqcobalt.worker.upload.timer.TAG", C32043e.m59708b(i, j));
        C4632m a = C4631l.m13030a(hashMap);
        C4390an anVar = new C4390an(LogUploadTimer.class, duration.toMinutes(), TimeUnit.MINUTES);
        anVar.mo9340e(duration.toMinutes(), TimeUnit.MINUTES);
        anVar.mo9341f(a);
        return (C4391ao) anVar.mo9337b();
    }

    /* renamed from: c */
    public final C4377aa mo9300c() {
        C59071e eVar = f86054b;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(50484)).mo56386p("Cobalt: start enqueuing upload task");
        String b = this.f14000d.f13989b.mo9567b("com.google.android.libraries.privatetelemetry.tqcobalt.worker.upload.timer.LOGGING_TASK_UNIQUE_WORK_NAME");
        if (!C58837ba.m90859h(b)) {
            String b2 = this.f14000d.f13989b.mo9567b("com.google.android.libraries.privatetelemetry.tqcobalt.worker.upload.timer.TAG");
            if (C58837ba.m90859h(b2)) {
                ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(50486)).mo56389s("Cobalt: tag value for the key = '%s' can't be empty", "com.google.android.libraries.privatetelemetry.tqcobalt.worker.upload.timer.TAG");
                return f86055g;
            }
            C4452ag.m12686j(this.f13999c).mo9335i(b, 3, Collections.singletonList(LogUploader.m59684f(b2)));
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(50485)).mo56386p("Cobalt: finish enqueuing upload task");
            return new C4645z(C4632m.f14549a);
        }
        ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(50487)).mo56389s("Cobalt: logging task unique work name value for the key = '%s' can't be empty", "com.google.android.libraries.privatetelemetry.tqcobalt.worker.upload.timer.LOGGING_TASK_UNIQUE_WORK_NAME");
        return f86055g;
    }
}
