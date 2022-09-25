package com.google.android.apps.gsa.search.shared.multiuser;

import com.google.android.apps.gsa.shared.util.C91037g;

/* renamed from: com.google.android.apps.gsa.search.shared.multiuser.s */
/* compiled from: PG */
public final class C87616s {

    /* renamed from: a */
    final /* synthetic */ C87618u f236683a;

    public C87616s(C87618u uVar) {
        this.f236683a = uVar;
    }

    /* renamed from: a */
    public final void mo81748a() {
        synchronized (this.f236683a.f236686a) {
            this.f236683a.f236687b.remove(this);
            if (this.f236683a.f236687b.isEmpty()) {
                C87618u uVar = this.f236683a;
                synchronized (uVar.f236686a) {
                    C91037g gVar = uVar.f236689d;
                    if (gVar != null) {
                        uVar.f236688c.unbindService(gVar);
                        uVar.mo81755c();
                        uVar.mo81754b();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo81749b() {
        synchronized (this.f236683a.f236686a) {
            if (!this.f236683a.mo81756d()) {
                return false;
            }
            this.f236683a.f236687b.add(this);
            return true;
        }
    }
}
