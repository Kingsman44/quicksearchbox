package com.google.android.apps.gsa.p6484r;

import com.google.android.apps.gsa.shared.p7042i.C89784a;

/* renamed from: com.google.android.apps.gsa.r.d */
/* compiled from: PG */
public final class C84249d implements C89784a {

    /* renamed from: a */
    public final Object f229269a = new Object();

    /* renamed from: b */
    public boolean f229270b = false;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49086a(Object obj) {
        Void voidR = (Void) obj;
        mo77729b();
    }

    /* renamed from: b */
    public final void mo77729b() {
        synchronized (this.f229269a) {
            this.f229270b = true;
            this.f229269a.notifyAll();
        }
    }
}
