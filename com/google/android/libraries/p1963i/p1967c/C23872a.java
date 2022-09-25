package com.google.android.libraries.p1963i.p1967c;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.i.c.a */
/* compiled from: PG */
public final class C23872a implements Serializable, C23886o {

    /* renamed from: a */
    private static final TimeUnit f65327a = TimeUnit.MINUTES;
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    public final int mo29253a() {
        return 1;
    }

    public final Class annotationType() {
        return C23886o.class;
    }

    /* renamed from: b */
    public final int mo29255b() {
        return 1000;
    }

    /* renamed from: c */
    public final int mo29256c() {
        return 1;
    }

    /* renamed from: d */
    public final int mo29257d() {
        return 1;
    }

    /* renamed from: e */
    public final int mo29258e() {
        return 1000;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C23886o) {
            C23886o oVar = (C23886o) obj;
            return oVar.mo29257d() == 1 && oVar.mo29258e() == 1000 && oVar.mo29253a() == 1 && oVar.mo29255b() == 1000 && oVar.mo29256c() == 1 && oVar.mo29260f() == 1 && f65327a.equals(oVar.mo29261g());
        }
    }

    /* renamed from: f */
    public final long mo29260f() {
        return 1;
    }

    /* renamed from: g */
    public final TimeUnit mo29261g() {
        return f65327a;
    }

    public final int hashCode() {
        return (f65327a.hashCode() ^ -810573619) - 1944263094;
    }

    public final String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}
