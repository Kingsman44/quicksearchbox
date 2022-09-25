package com.google.android.apps.gsa.p8885y;

import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.y.c */
/* compiled from: PG */
public final class C118836c implements Closeable {

    /* renamed from: a */
    private final TimeUnit f331450a;

    /* renamed from: b */
    private final long f331451b;

    /* renamed from: c */
    private final C118831d f331452c;

    public C118836c(C118831d dVar, TimeUnit timeUnit) {
        this.f331452c = dVar;
        this.f331450a = timeUnit;
        this.f331451b = dVar.mo104019a();
    }

    public final void close() {
        long a = this.f331452c.mo104019a() - this.f331451b;
        if (C118837d.m197247a(a)) {
            C118831d dVar = this.f331452c;
            switch (C118832b.f331445a[this.f331450a.ordinal()]) {
                case 1:
                    a = TimeUnit.NANOSECONDS.toDays(a);
                    break;
                case 2:
                    a = TimeUnit.NANOSECONDS.toHours(a);
                    break;
                case 3:
                    a = TimeUnit.NANOSECONDS.toMicros(a);
                    break;
                case 4:
                    a = TimeUnit.NANOSECONDS.toMillis(a);
                    break;
                case 5:
                    a = TimeUnit.NANOSECONDS.toMinutes(a);
                    break;
                case 6:
                    break;
                case 7:
                    a = TimeUnit.NANOSECONDS.toSeconds(a);
                    break;
                default:
                    throw new IllegalArgumentException("timeUnit out of range");
            }
            dVar.mo104025g(a);
        }
    }
}
