package com.google.android.libraries.privatetelemetry.tqcobalt.worker;

import androidx.work.C4383ag;
import androidx.work.C4396at;
import java.util.Collections;

/* renamed from: com.google.android.libraries.privatetelemetry.tqcobalt.worker.e */
/* compiled from: PG */
public final class C32043e {
    /* renamed from: a */
    public static String m59707a(int i, long j) {
        return String.format("tq_cobalt_logger[%s,%s]", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
    }

    /* renamed from: b */
    public static String m59708b(int i, long j) {
        return String.format("%s-%s", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
    }

    /* renamed from: c */
    public static String m59709c(int i, long j) {
        return String.format("tq_cobalt_upload_timer[%s,%s]", new Object[]{Integer.valueOf(i), Long.valueOf(j)});
    }

    /* renamed from: d */
    public static void m59710d(C4396at atVar, C4383ag agVar, int i, long j) {
        atVar.mo9335i(m59707a(i, j), 3, Collections.singletonList(agVar));
    }
}
