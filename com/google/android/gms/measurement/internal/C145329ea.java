package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.C143919bh;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.ea */
/* compiled from: PG */
final class C145329ea implements Runnable {

    /* renamed from: a */
    private final C145327dz f392809a;

    /* renamed from: b */
    private final int f392810b;

    /* renamed from: c */
    private final Throwable f392811c;

    /* renamed from: d */
    private final byte[] f392812d;

    /* renamed from: e */
    private final String f392813e;

    /* renamed from: f */
    private final Map f392814f;

    public C145329ea(String str, C145327dz dzVar, int i, Throwable th, byte[] bArr, Map map) {
        C143919bh.m233958a(dzVar);
        this.f392809a = dzVar;
        this.f392810b = i;
        this.f392811c = th;
        this.f392812d = bArr;
        this.f392813e = str;
        this.f392814f = map;
    }

    public final void run() {
        this.f392809a.mo120903a(this.f392813e, this.f392810b, this.f392811c, this.f392812d, this.f392814f);
    }
}
