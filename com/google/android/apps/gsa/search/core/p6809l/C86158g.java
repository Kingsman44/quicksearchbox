package com.google.android.apps.gsa.search.core.p6809l;

import com.google.android.apps.gsa.assist.p501a.C9318f;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82433f;
import com.google.common.base.C58872ci;
import com.google.common.util.concurrent.C60845bz;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.l.g */
/* compiled from: PG */
public final class C86158g implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C9318f f232828a;

    /* renamed from: b */
    final /* synthetic */ C58872ci f232829b;

    /* renamed from: c */
    final /* synthetic */ C86159h f232830c;

    public C86158g(C86159h hVar, C9318f fVar, C58872ci ciVar) {
        this.f232830c = hVar;
        this.f232828a = fVar;
        this.f232829b = ciVar;
    }

    /* renamed from: c */
    private final void m138576c(boolean z) {
        C83305i iVar = (C83305i) this.f232830c.f232836e.get();
        String name = this.f232828a.name();
        if (name != null) {
            iVar.mo75579d(new C82433f("ASSIST_DATA_C_D_C_LATENCY", Double.valueOf((double) this.f232829b.mo56158a(TimeUnit.MILLISECONDS)), name, z));
            return;
        }
        throw new NullPointerException("Null assistDataType");
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        m138576c(false);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        m138576c(true);
    }
}
