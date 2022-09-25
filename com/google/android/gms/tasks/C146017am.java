package com.google.android.gms.tasks;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.tasks.am */
/* compiled from: PG */
final class C146017am implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146014aj f394712a;

    /* renamed from: b */
    final /* synthetic */ Callable f394713b;

    public C146017am(C146014aj ajVar, Callable callable) {
        this.f394712a = ajVar;
        this.f394713b = callable;
    }

    public final void run() {
        try {
            this.f394712a.mo122508v(this.f394713b.call());
        } catch (Exception e) {
            this.f394712a.mo122507u(e);
        } catch (Throwable th) {
            this.f394712a.mo122507u(new RuntimeException(th));
        }
    }
}
