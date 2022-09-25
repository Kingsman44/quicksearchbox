package com.google.android.apps.gsa.staticplugins.nga.p8068k;

import com.google.android.apps.gsa.nga.api.C74718bv;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.p6363s.C81457f;
import com.google.android.apps.gsa.nga.shared.p6363s.C81465n;
import com.google.android.apps.gsa.search.core.p6802h.p6804b.C86091a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.k.d */
/* compiled from: PG */
public final class C103380d implements C86091a, C74718bv {

    /* renamed from: a */
    private NgaState f288202a = null;

    /* renamed from: b */
    private final C81457f f288203b;

    /* renamed from: c */
    private final C81457f f288204c;

    /* renamed from: d */
    private final C81457f f288205d;

    /* renamed from: e */
    private final AtomicBoolean f288206e = new AtomicBoolean(false);

    public C103380d(C22871g gVar, C81465n nVar, C81465n nVar2) {
        this.f288203b = nVar2.mo75094a(gVar, C103377a.f288199a);
        this.f288204c = nVar.mo75094a(gVar, C103378b.f288200a);
        this.f288205d = nVar.mo75094a(gVar, C103379c.f288201a);
    }

    /* renamed from: b */
    private final synchronized void m171311b(NgaState ngaState) {
        NgaState ngaState2 = this.f288202a;
        NgaState ngaState3 = NgaState.c;
        if (ngaState != ngaState3) {
            if (ngaState2 != null) {
                if (ngaState2 == ngaState3) {
                }
            }
            C81457f fVar = this.f288204c;
            fVar.mo75091b(fVar.f222871a);
            this.f288202a = ngaState;
        }
        if (ngaState2 != ngaState) {
            if (ngaState2 != null && ngaState == ngaState3) {
                C81457f fVar2 = this.f288205d;
                fVar2.mo75091b(fVar2.f222871a);
            }
        }
        this.f288202a = ngaState;
    }

    /* renamed from: d */
    private final void m171312d() {
        if (this.f288206e.compareAndSet(false, true)) {
            C81457f fVar = this.f288203b;
            fVar.mo75091b(fVar.f222871a);
        }
    }

    /* renamed from: a */
    public final void mo17497a(NgaState ngaState) {
        m171312d();
        m171311b(ngaState);
    }

    /* renamed from: c */
    public final void mo17494c(boolean z, boolean z2) {
        m171312d();
    }
}
