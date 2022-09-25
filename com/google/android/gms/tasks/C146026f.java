package com.google.android.gms.tasks;

/* renamed from: com.google.android.gms.tasks.f */
/* compiled from: PG */
final class C146026f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C146006ab f394726a;

    /* renamed from: b */
    final /* synthetic */ C146027g f394727b;

    public C146026f(C146027g gVar, C146006ab abVar) {
        this.f394727b = gVar;
        this.f394726a = abVar;
    }

    public final void run() {
        if (((C146014aj) this.f394726a).f394703b) {
            this.f394727b.f394729b.mo122511y();
            return;
        }
        try {
            this.f394727b.f394729b.mo122508v(this.f394727b.f394728a.mo37294a(this.f394726a));
        } catch (C146046z e) {
            if (e.getCause() instanceof Exception) {
                this.f394727b.f394729b.mo122507u((Exception) e.getCause());
            } else {
                this.f394727b.f394729b.mo122507u(e);
            }
        } catch (Exception e2) {
            this.f394727b.f394729b.mo122507u(e2);
        }
    }
}
