package com.google.android.libraries.privatetelemetry.tqcobalt.p2452e.p2453a.p2455b;

import android.content.Context;
import androidx.work.C4378ab;
import androidx.work.C4405bb;
import androidx.work.WorkerParameters;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.android.libraries.privatetelemetry.tqcobalt.jni.JniCobaltCoreLogger;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2448a.C32003b;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2449b.C32004a;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2449b.C32005b;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2452e.C32021d;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2452e.C32022e;
import com.google.android.libraries.privatetelemetry.tqcobalt.p2456f.p2457a.C32025c;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.LogUploadTimer;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.LogUploader;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.LogWriter;
import com.google.android.libraries.privatetelemetry.tqcobalt.worker.p2458a.C32031d;
import com.google.common.p4526f.C59052c;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.e.a.b.a */
/* compiled from: PG */
public final class C32016a extends C4405bb {

    /* renamed from: a */
    final /* synthetic */ Set f86033a;

    /* renamed from: b */
    final /* synthetic */ String f86034b;

    /* renamed from: c */
    final /* synthetic */ ExecutorService f86035c;

    /* renamed from: d */
    final /* synthetic */ C31639g f86036d;

    /* renamed from: e */
    final /* synthetic */ C21370a f86037e;

    public C32016a(Set set, String str, ExecutorService executorService, C31639g gVar, C21370a aVar) {
        this.f86033a = set;
        this.f86034b = str;
        this.f86035c = executorService;
        this.f86036d = gVar;
        this.f86037e = aVar;
    }

    /* renamed from: a */
    public final C4378ab mo9346a(Context context, String str, WorkerParameters workerParameters) {
        C32004a aVar;
        C32003b bVar;
        C32021d a = C32022e.m59659a(this.f86033a, workerParameters.f13990c);
        if (a == null) {
            return null;
        }
        if (str.equals(LogWriter.class.getCanonicalName())) {
            return new LogWriter(context, workerParameters, a, this.f86034b, new JniCobaltCoreLogger(), this.f86035c, this.f86036d, new C32031d(), this.f86037e);
        } else if (str.equals(LogUploader.class.getCanonicalName())) {
            try {
                int e = a.mo37791e();
                int i = e - 1;
                if (e != 0) {
                    if (i == 0) {
                        aVar = C32004a.m59615a(C32005b.f86009b, 1, C32005b.f86012e, 2);
                    } else if (i == 1) {
                        aVar = C32004a.m59615a(C32005b.f86008a, 3, C32005b.f86011d, 4);
                    } else {
                        throw new IllegalArgumentException("Unknown Cobalt environment");
                    }
                    if (a.mo37791e() == 2) {
                        bVar = new C32003b(C143658k.m233374c(context, "TURQUOISE_COBALT_SHUFFLER_INPUT_PROD").mo118952a());
                    } else {
                        bVar = new C32003b(C143658k.m233374c(context, "TURQUOISE_COBALT_SHUFFLER_INPUT_DEVEL").mo118952a());
                    }
                    return new LogUploader(context, workerParameters, a, bVar, new JniCobaltCoreLogger(), new C32025c(aVar, a.mo37789c(), a.mo37787a().mo37779c()), this.f86037e);
                }
                throw null;
            } catch (Throwable th) {
                ((C59052c) ((C59052c) ((C59052c) C32017b.f86038a.mo56226d()).mo56382g(th)).mo56372aa(50480)).mo56386p("Cobalt: couldn't create TinkEncryptor");
                return null;
            }
        } else if (str.equals(LogUploadTimer.class.getCanonicalName())) {
            return new LogUploadTimer(context, workerParameters);
        } else {
            return null;
        }
    }
}
