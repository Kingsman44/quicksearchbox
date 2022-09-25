package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l;

import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.engine.b.a;
import com.google.android.apps.gsa.nga.engine.p5978b.C75190c;
import com.google.android.apps.gsa.nga.engine.p5978b.C75214d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.C78256f;
import com.google.android.apps.gsa.nga.engine.p6243v.C79358h;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.s */
/* compiled from: PG */
public final class C78713s implements C75214d, C79358h {

    /* renamed from: a */
    private final C58528ij f216675a;

    public C78713s(C58528ij ijVar) {
        this.f216675a = ijVar;
    }

    /* renamed from: a */
    public final void mo73590a(boolean z) {
        C58800sl lA = this.f216675a.iterator();
        while (lA.hasNext()) {
            ((C78256f) lA.next()).mo73232f();
        }
    }

    /* renamed from: g */
    public final void mo73591g() {
        C58800sl lA = this.f216675a.iterator();
        while (lA.hasNext()) {
            ((C78256f) lA.next()).mo73233g();
        }
    }

    /* renamed from: e */
    public final void mo71496e(C75190c cVar) {
        a aVar = (a) cVar;
        NgaState ngaState = aVar.a;
        NgaState ngaState2 = aVar.b;
        if ((ngaState == null || !ngaState.a()) && ngaState2.a()) {
            C58800sl lA = this.f216675a.iterator();
            while (lA.hasNext()) {
                ((C78256f) lA.next()).mo73231c();
            }
        } else if ((ngaState == null || ngaState.a()) && !ngaState2.a()) {
            C58800sl lA2 = this.f216675a.iterator();
            while (lA2.hasNext()) {
                ((C78256f) lA2.next()).mo73230b();
            }
        }
    }
}
