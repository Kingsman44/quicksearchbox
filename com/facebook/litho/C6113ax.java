package com.facebook.litho;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.facebook.litho.ax */
/* compiled from: PG */
public final class C6113ax {

    /* renamed from: a */
    public final long f18044a;

    static {
        new SimpleDateFormat("hh:mm:ss.SSS", Locale.getDefault());
    }

    public C6113ax(long j, long j2) {
        this.f18044a = j2;
        String.format("%d%d", new Object[]{Long.valueOf(j2), Long.valueOf(j)});
    }
}
