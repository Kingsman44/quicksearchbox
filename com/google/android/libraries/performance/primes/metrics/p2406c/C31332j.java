package com.google.android.libraries.performance.primes.metrics.p2406c;

import android.content.Context;
import android.os.Process;
import android.provider.Settings;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.performance.primes.p2399d.C31230a;
import dagger.C68214a;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.performance.primes.metrics.c.j */
/* compiled from: PG */
public final class C31332j {

    /* renamed from: a */
    static final long f84365a = (TimeUnit.DAYS.toMillis(365) + TimeUnit.HOURS.toMillis(6));

    /* renamed from: b */
    public final C21370a f84366b;

    /* renamed from: c */
    private final String f84367c = C31230a.m58230b(Process.myPid());

    /* renamed from: d */
    private final String f84368d;

    /* renamed from: e */
    private final C68214a f84369e;

    public C31332j(C21370a aVar, C68214a aVar2, Context context) {
        this.f84366b = aVar;
        this.f84368d = Settings.Secure.getString(context.getContentResolver(), "android_id");
        this.f84369e = aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Long mo37042a(long j) {
        int i = 0;
        Random random = new Random((long) Objects.hash(Long.valueOf(j), this.f84368d, this.f84367c));
        double nextDouble = random.nextDouble();
        if (((C31324b) this.f84369e.mo27525b()).mo37028c() >= 1.0d) {
            double c = ((C31324b) this.f84369e.mo27525b()).mo37028c();
            i = (int) Math.min(Math.round((c + c) * nextDouble), 2147483646);
        } else if (nextDouble < ((C31324b) this.f84369e.mo27525b()).mo37028c()) {
            i = 1;
        }
        long j2 = f84365a + j;
        int e = ((C31324b) this.f84369e.mo27525b()).mo37030e();
        long j3 = (j2 - j) - ((long) (e + e));
        TreeSet treeSet = new TreeSet();
        while (treeSet.size() < i) {
            long abs = (Math.abs(Math.max(random.nextLong(), -9223372036854775807L)) % j3) + j;
            long e2 = (long) ((C31324b) this.f84369e.mo27525b()).mo37030e();
            long j4 = e2 + e2;
            if (treeSet.subSet(Long.valueOf(abs - j4), Long.valueOf(j4 + abs)).isEmpty()) {
                treeSet.add(Long.valueOf(abs));
            }
        }
        Long l = (Long) treeSet.ceiling(Long.valueOf(this.f84366b.mo26870b() + 100));
        if (l != null) {
            return l;
        }
        if (j < this.f84366b.mo26870b()) {
            return mo37042a(j2);
        }
        return null;
    }
}
