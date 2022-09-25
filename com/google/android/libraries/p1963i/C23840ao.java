package com.google.android.libraries.p1963i;

import com.google.common.util.concurrent.C60844by;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.ao */
/* compiled from: PG */
public abstract class C23840ao extends C60844by implements C60888db {
    protected C23840ao() {
    }

    /* renamed from: d */
    public final C60872cz schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return mo29175j().mo29164d(runnable, j, timeUnit);
    }

    /* renamed from: e */
    public final C60872cz schedule(Callable callable, long j, TimeUnit timeUnit) {
        return mo29175j().mo29165e(callable, j, timeUnit);
    }

    /* renamed from: f */
    public final C60872cz scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return mo29175j().mo29166f(runnable, j, j2, timeUnit);
    }

    /* renamed from: g */
    public final C60872cz scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return mo29175j().mo29167g(runnable, j, j2, timeUnit);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public /* bridge */ /* synthetic */ C60887da mo29168h() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C60888db mo29175j();
}
