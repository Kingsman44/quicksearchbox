package com.google.android.gms.libs.p10830b.p10832b.p10833a;

import com.google.protobuf.C63042fg;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.libs.b.b.a.e */
/* compiled from: PG */
public final class C144840e {
    /* renamed from: a */
    public static boolean m235402a(C63042fg fgVar, long j, long j2, long j3) {
        long millis = (TimeUnit.SECONDS.toMillis(fgVar.f170154a) + TimeUnit.NANOSECONDS.toMillis((long) fgVar.f170155b)) - j;
        return j2 <= millis && millis < j3;
    }
}
