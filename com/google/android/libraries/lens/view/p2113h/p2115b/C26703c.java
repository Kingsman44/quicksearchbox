package com.google.android.libraries.lens.view.p2113h.p2115b;

import android.os.Handler;
import com.google.android.libraries.lens.view.p2161r.C27654a;
import com.google.android.libraries.lens.view.p2161r.C27658e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.h.b.c */
/* compiled from: PG */
public final class C26703c implements C27654a {

    /* renamed from: d */
    private static final C58974d f72814d = C58974d.m91135i("CameraReopenHelper");

    /* renamed from: a */
    public final C26681b f72815a;

    /* renamed from: b */
    public int f72816b;

    /* renamed from: c */
    public Runnable f72817c;

    /* renamed from: e */
    private final Handler f72818e;

    public C26703c(C26681b bVar, Handler handler) {
        this.f72815a = bVar;
        this.f72818e = handler;
    }

    /* renamed from: a */
    public final void mo32014a() {
        mo32015b();
        this.f72816b = 1;
        this.f72815a.mo31969a();
    }

    /* renamed from: b */
    public final void mo32015b() {
        Runnable runnable = this.f72817c;
        if (runnable != null) {
            this.f72818e.removeCallbacks(runnable);
            this.f72817c = null;
        }
        this.f72816b = 0;
    }

    /* renamed from: c */
    public final void mo30427c(C27658e eVar) {
        eVar.mo33150g("CameraReopenHelper");
        eVar.mo33148e("cameraOpenAttempts", Integer.toString(this.f72816b));
        eVar.mo33148e("hasCurrentOpenAttempt", Boolean.toString(this.f72817c != null));
    }

    /* renamed from: d */
    public final void mo32016d(Throwable th) {
        if (!mo32017e()) {
            throw new IllegalStateException("Camera reopened without opening");
        } else if (this.f72817c != null) {
            ((C58970a) ((C58970a) f72814d.mo56226d()).mo56372aa(49035)).mo56386p("Camera reopened during reopen delay");
        } else {
            int i = this.f72816b;
            if (i < 20) {
                this.f72816b = i + 1;
                C26662a aVar = new C26662a(this);
                this.f72817c = aVar;
                this.f72818e.postDelayed(aVar, 400);
                return;
            }
            throw new C26722i(th);
        }
    }

    /* renamed from: e */
    public final boolean mo32017e() {
        return this.f72816b != 0;
    }
}
