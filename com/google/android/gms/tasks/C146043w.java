package com.google.android.gms.tasks;

import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.gms.tasks.w */
/* compiled from: PG */
final class C146043w implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146006ab f394755a;

    /* renamed from: b */
    final /* synthetic */ C146044x f394756b;

    public C146043w(C146044x xVar, C146006ab abVar) {
        this.f394756b = xVar;
        this.f394755a = abVar;
    }

    public final void run() {
        try {
            C146006ab a = this.f394756b.f394757a.mo37394a(this.f394755a.mo122488g());
            if (a == null) {
                C146044x xVar = this.f394756b;
                xVar.f394758b.mo122507u(new NullPointerException("Continuation returned null"));
                return;
            }
            a.mo122495n(C146013ai.f394701b, this.f394756b);
            a.mo122494m(C146013ai.f394701b, this.f394756b);
            a.mo122492k(C146013ai.f394701b, this.f394756b);
        } catch (C146046z e) {
            if (e.getCause() instanceof Exception) {
                this.f394756b.f394758b.mo122507u((Exception) e.getCause());
                return;
            }
            this.f394756b.f394758b.mo122507u(e);
        } catch (CancellationException unused) {
            this.f394756b.f394758b.mo122511y();
        } catch (Exception e2) {
            this.f394756b.f394758b.mo122507u(e2);
        }
    }
}
