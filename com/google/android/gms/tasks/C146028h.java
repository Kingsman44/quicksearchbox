package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.h */
/* compiled from: PG */
final class C146028h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146006ab f394731a;

    /* renamed from: b */
    final /* synthetic */ C146029i f394732b;

    public C146028h(C146029i iVar, C146006ab abVar) {
        this.f394732b = iVar;
        this.f394731a = abVar;
    }

    public final void run() {
        try {
            C146006ab abVar = (C146006ab) this.f394732b.f394733a.mo37294a(this.f394731a);
            if (abVar == null) {
                C146029i iVar = this.f394732b;
                iVar.f394734b.mo122507u(new NullPointerException("Continuation returned null"));
                return;
            }
            abVar.mo122495n(C146013ai.f394701b, this.f394732b);
            abVar.mo122494m(C146013ai.f394701b, this.f394732b);
            abVar.mo122492k(C146013ai.f394701b, this.f394732b);
        } catch (C146046z e) {
            if (e.getCause() instanceof Exception) {
                this.f394732b.f394734b.mo122507u((Exception) e.getCause());
            } else {
                this.f394732b.f394734b.mo122507u(e);
            }
        } catch (Exception e2) {
            this.f394732b.f394734b.mo122507u(e2);
        }
    }
}
