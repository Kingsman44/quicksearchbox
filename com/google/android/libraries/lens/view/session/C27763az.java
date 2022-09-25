package com.google.android.libraries.lens.view.session;

import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.session.az */
/* compiled from: PG */
public final class C27763az {

    /* renamed from: a */
    public final Object f75768a = new Object();

    /* renamed from: b */
    public boolean f75769b = false;

    /* renamed from: c */
    public boolean f75770c = false;

    /* renamed from: d */
    private boolean f75771d = false;

    static {
        C58974d.m91135i("PrefetchValidator");
    }

    /* renamed from: b */
    public final void mo33233b(boolean z) {
        synchronized (this.f75768a) {
            this.f75771d = z;
            if (!z && this.f75769b && this.f75770c) {
                mo33232a();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo33234c() {
        boolean z;
        synchronized (this.f75768a) {
            z = this.f75770c;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo33232a() {
        synchronized (this.f75768a) {
            if (!this.f75770c || !this.f75771d) {
                this.f75770c = false;
                this.f75769b = false;
                return;
            }
            this.f75769b = true;
        }
    }
}
