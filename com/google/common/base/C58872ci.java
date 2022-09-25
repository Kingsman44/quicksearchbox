package com.google.common.base;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.base.ci */
/* compiled from: PG */
public final class C58872ci {

    /* renamed from: a */
    public boolean f156708a;

    /* renamed from: b */
    private final C58889cz f156709b;

    /* renamed from: c */
    private long f156710c;

    /* renamed from: d */
    private long f156711d;

    public C58872ci() {
        this.f156709b = C58889cz.f156731b;
    }

    public C58872ci(C58889cz czVar) {
        C58838bb.m90866a(czVar, "ticker");
        this.f156709b = czVar;
    }

    /* renamed from: c */
    public static C58872ci m90946c() {
        C58872ci ciVar = new C58872ci();
        ciVar.mo56161f();
        return ciVar;
    }

    /* renamed from: d */
    public static C58872ci m90947d(C58889cz czVar) {
        C58872ci ciVar = new C58872ci(czVar);
        ciVar.mo56161f();
        return ciVar;
    }

    /* renamed from: a */
    public final long mo56158a(TimeUnit timeUnit) {
        return timeUnit.convert(mo56159b(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    public final long mo56159b() {
        return this.f156708a ? (this.f156709b.mo26884a() - this.f156711d) + this.f156710c : this.f156710c;
    }

    /* renamed from: e */
    public final void mo56160e() {
        this.f156710c = 0;
        this.f156708a = false;
    }

    /* renamed from: f */
    public final void mo56161f() {
        C58838bb.m90884s(!this.f156708a, "This stopwatch is already running.");
        this.f156708a = true;
        this.f156711d = this.f156709b.mo26884a();
    }

    /* renamed from: g */
    public final void mo56162g() {
        long a = this.f156709b.mo26884a();
        C58838bb.m90884s(this.f156708a, "This stopwatch is already stopped.");
        this.f156708a = false;
        this.f156710c += a - this.f156711d;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long b = mo56159b();
        if (TimeUnit.DAYS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (TimeUnit.HOURS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (TimeUnit.MINUTES.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (TimeUnit.SECONDS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (TimeUnit.MILLISECONDS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (TimeUnit.MICROSECONDS.convert(b, TimeUnit.NANOSECONDS) > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = TimeUnit.NANOSECONDS;
        }
        long convert = TimeUnit.NANOSECONDS.convert(1, timeUnit);
        StringBuilder sb = new StringBuilder();
        double d = (double) b;
        double d2 = (double) convert;
        Double.isNaN(d);
        Double.isNaN(d2);
        sb.append(C58837ba.m90857f(d / d2));
        sb.append(" ");
        switch (C58871ch.f156707a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = C59002s.f156871a;
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = C19618h.f54585a;
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        sb.append(str);
        return sb.toString();
    }
}
