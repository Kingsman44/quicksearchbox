package com.google.android.apps.gsa.staticplugins.bisto.notifications.p7502d;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.notifications.d.j */
/* compiled from: PG */
public final /* synthetic */ class C95614j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C95615k f267585a;

    /* renamed from: b */
    public final /* synthetic */ boolean f267586b;

    public /* synthetic */ C95614j(C95615k kVar, boolean z) {
        this.f267585a = kVar;
        this.f267586b = z;
    }

    public final void run() {
        C95615k kVar = this.f267585a;
        boolean z = this.f267586b;
        if (!kVar.f267596i.get()) {
            C58976aa aaVar = C58975e.f156826a;
            kVar.f267593f.mo83489d();
            if (!z) {
                synchronized (kVar.f267588a) {
                    kVar.f267592e = kVar.f267595h.mo26870b();
                }
            }
        }
    }
}
