package com.google.android.libraries.lens.view.p2113h.p2121d;

import com.google.common.util.concurrent.SettableFuture;
import java.util.Locale;

/* renamed from: com.google.android.libraries.lens.view.h.d.b */
/* compiled from: PG */
public abstract class C26750b {
    /* renamed from: b */
    public static C26750b m49463b(long j) {
        C26754f fVar = new C26754f();
        fVar.mo32043e(false);
        fVar.mo32044f(false);
        fVar.mo32042d(false);
        fVar.mo32041c(j);
        fVar.mo32040b(false);
        fVar.f72883a = null;
        return fVar.mo32039a();
    }

    /* renamed from: c */
    public static C26750b m49464c(long j) {
        C26754f fVar = new C26754f();
        fVar.mo32043e(false);
        fVar.mo32044f(false);
        fVar.mo32042d(false);
        fVar.mo32041c(j);
        fVar.mo32040b(true);
        fVar.f72883a = null;
        return fVar.mo32039a();
    }

    /* renamed from: a */
    public abstract long mo32082a();

    /* renamed from: d */
    public abstract SettableFuture mo32083d();

    /* renamed from: e */
    public abstract boolean mo32084e();

    /* renamed from: f */
    public abstract boolean mo32085f();

    /* renamed from: g */
    public abstract boolean mo32086g();

    /* renamed from: h */
    public abstract boolean mo32087h();

    public final String toString() {
        return String.format(Locale.US, "(%d/%d/%d/%d)", new Object[]{Integer.valueOf(mo32086g() ? 1 : 0), Integer.valueOf(mo32084e() ? 1 : 0), Integer.valueOf(mo32087h() ? 1 : 0), Integer.valueOf(mo32085f() ? 1 : 0)});
    }
}
