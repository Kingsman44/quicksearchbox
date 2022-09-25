package com.google.android.libraries.performance.primes.metrics.p2416j;

import android.os.SystemClock;
import com.evernote.android.state.BuildConfig;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.libraries.performance.primes.metrics.j.k */
/* compiled from: PG */
public final class C31543k implements Closeable {

    /* renamed from: a */
    static final C31543k f84947a = new C31543k(BuildConfig.FLAVOR, SystemClock.elapsedRealtime(), -1, Thread.currentThread().getId(), 3);

    /* renamed from: b */
    String f84948b;

    /* renamed from: c */
    final long f84949c;

    /* renamed from: d */
    long f84950d;

    /* renamed from: e */
    final long f84951e;

    /* renamed from: f */
    public volatile List f84952f;

    /* renamed from: g */
    final int f84953g;

    /* renamed from: h */
    final int f84954h;

    public C31543k(String str, long j, long j2, long j3, int i) {
        this.f84948b = str;
        this.f84953g = 1;
        this.f84949c = j;
        this.f84950d = j2;
        this.f84951e = j3;
        this.f84954h = i;
        if (i == 1) {
            this.f84952f = Collections.synchronizedList(new ArrayList());
        } else {
            this.f84952f = Collections.emptyList();
        }
    }

    /* renamed from: a */
    public final long mo37237a() {
        long j = this.f84950d;
        if (j == -1) {
            return -1;
        }
        return j - this.f84949c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo37238b(List list) {
        if (this.f84952f == Collections.EMPTY_LIST) {
            this.f84952f = new ArrayList();
        }
        if (this.f84952f != null) {
            this.f84952f.addAll(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo37239c() {
        return this.f84954h == 1;
    }

    public final void close() {
        C31533ad.m58790a(this);
    }

    public C31543k(String str, long j, int i) {
        this(str, SystemClock.elapsedRealtime(), -1, j, i);
    }
}
