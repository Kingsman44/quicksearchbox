package com.google.android.libraries.p10923ac.p10925b.p10945l;

import com.google.protobuf.C63088z;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.ac.b.l.g */
/* compiled from: PG */
public final class C147173g {
    /* renamed from: a */
    public static long m239996a(C63088z zVar, long j) {
        return zVar != null ? zVar.mo59043o().getLong() : j;
    }

    /* renamed from: b */
    public static C63088z m239997b(long j) {
        ByteBuffer putLong = ByteBuffer.allocate(8).putLong(j);
        putLong.flip();
        return C63088z.m96153z(putLong);
    }

    /* renamed from: c */
    public static Long m239998c(C63088z zVar) {
        if (zVar != null) {
            return Long.valueOf(zVar.mo59043o().getLong());
        }
        return null;
    }
}
