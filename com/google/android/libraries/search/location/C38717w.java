package com.google.android.libraries.search.location;

import android.location.Location;
import android.os.SystemClock;
import com.google.common.p4522b.C58390dg;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.location.w */
/* compiled from: PG */
public final class C38717w {

    /* renamed from: d */
    private static final C59071e f102237d = C59071e.m91332i("com.google.android.libraries.search.location.w");

    /* renamed from: a */
    public boolean f102238a = true;

    /* renamed from: b */
    public final Object f102239b = new Object();

    /* renamed from: c */
    public Location f102240c;

    /* renamed from: d */
    public static final Duration m67995d(Location location) {
        return Duration.ofMillis(SystemClock.elapsedRealtime()).minus(Duration.ofNanos(location.getElapsedRealtimeNanos()));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.location.Location mo41570b(int r4, p3186j$.time.Duration r5) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f102239b
            monitor-enter(r0)
            android.location.Location r1 = r3.f102240c     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x001f
            j$.time.Duration r2 = m67995d(r1)     // Catch:{ all -> 0x0022 }
            j$.time.Duration r4 = m67994c(r4, r5)     // Catch:{ all -> 0x0022 }
            int r4 = r2.compareTo((p3186j$.time.Duration) r4)     // Catch:{ all -> 0x0022 }
            if (r4 > 0) goto L_0x001f
            m67995d(r1)     // Catch:{ all -> 0x0022 }
            android.location.Location r4 = new android.location.Location     // Catch:{ all -> 0x0022 }
            r4.<init>(r1)     // Catch:{ all -> 0x0022 }
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            return r4
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            r4 = 0
            return r4
        L_0x0022:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0022 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.location.C38717w.mo41570b(int, j$.time.Duration):android.location.Location");
    }

    /* renamed from: c */
    public static Duration m67994c(int i, Duration duration) {
        Duration duration2;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 1) {
                duration2 = Duration.ofMinutes(20);
            } else if (i2 != 2) {
                duration2 = Duration.ofHours(3);
            } else {
                duration2 = Duration.ofSeconds(10);
            }
            return (Duration) C58390dg.m89476a(duration2, duration);
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo41569a(Location location) {
        location.getClass();
        synchronized (this.f102239b) {
            if (location.hasAccuracy()) {
                ((C59052c) ((C59052c) f102237d.mo56224b()).mo56372aa(53139)).mo56386p("Updating cached location");
                this.f102240c = location;
            }
        }
    }
}
