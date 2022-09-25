package com.google.android.apps.gsa.shared.util.p7159c;

import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60873d;
import java.util.concurrent.Future;

/* renamed from: com.google.android.apps.gsa.shared.util.c.bm */
/* compiled from: PG */
public final class C90916bm extends C60873d implements C60845bz {

    /* renamed from: a */
    private Future f254104a;

    /* renamed from: b */
    private final Object f254105b;

    public C90916bm(Future future, Object obj) {
        this.f254104a = future;
        this.f254105b = obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46268a() {
        this.f254104a = null;
    }

    public final boolean cancel(boolean z) {
        Future future = this.f254104a;
        boolean cancel = super.cancel(z);
        if (!cancel || future == null) {
            return cancel;
        }
        future.cancel(z);
        return true;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        mo57356n(this.f254105b);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C58833ax axVar = (C58833ax) obj;
        if (axVar == null || !axVar.mo56113h()) {
            mo57356n(this.f254105b);
        } else {
            mo57356n(axVar.mo56107c());
        }
    }
}
