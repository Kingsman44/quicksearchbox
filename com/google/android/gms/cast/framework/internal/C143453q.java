package com.google.android.gms.cast.framework.internal;

import android.content.Context;
import androidx.mediarouter.p175a.C3665aa;
import androidx.mediarouter.p175a.C3687aw;

/* renamed from: com.google.android.gms.cast.framework.internal.q */
/* compiled from: PG */
public final class C143453q {

    /* renamed from: a */
    public C3687aw f388986a;

    /* renamed from: b */
    private final Context f388987b;

    public C143453q(Context context) {
        this.f388987b = context;
    }

    /* renamed from: a */
    public final C3687aw mo118693a() {
        if (this.f388986a == null) {
            this.f388986a = C3687aw.m10683e(this.f388987b);
        }
        return this.f388986a;
    }

    /* renamed from: b */
    public final void mo118694b(C3665aa aaVar) {
        C3687aw a = mo118693a();
        if (a != null) {
            a.mo7774j(aaVar);
        }
    }
}
