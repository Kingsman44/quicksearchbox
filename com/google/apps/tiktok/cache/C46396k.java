package com.google.apps.tiktok.cache;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.apps.tiktok.cache.k */
/* compiled from: PG */
public abstract class C46396k {
    /* renamed from: c */
    public static C46395j m82720c() {
        C46387b bVar = new C46387b();
        bVar.mo50351b(C89885b.NOW_VALUE);
        bVar.f121418a = TimeUnit.MILLISECONDS.toMillis(-1);
        bVar.f121419b = (byte) (bVar.f121419b | 2);
        return bVar;
    }

    /* renamed from: a */
    public abstract int mo50352a();

    /* renamed from: b */
    public abstract long mo50353b();
}
