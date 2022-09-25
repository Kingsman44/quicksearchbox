package com.google.android.libraries.micore.learning.training.util;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.micore.learning.base.C29718j;
import com.google.common.base.C58838bb;

/* compiled from: PG */
public final class StatusOr {

    /* renamed from: a */
    private final Object f80618a;

    /* renamed from: b */
    private final C29718j f80619b;

    public StatusOr(Object obj, C29718j jVar) {
        boolean z = true;
        C58838bb.m90868c((jVar != null ? false : z) ^ (obj == null));
        this.f80618a = obj;
        this.f80619b = jVar;
    }

    public int getCode() {
        C29718j jVar = this.f80619b;
        if (jVar == null) {
            return 0;
        }
        return jVar.f80484a;
    }

    public String getDetails() {
        C29718j jVar = this.f80619b;
        return jVar == null ? BuildConfig.FLAVOR : jVar.f80485b;
    }

    public Object valueOrDie() {
        this.f80618a.getClass();
        C58838bb.m90883r(this.f80619b == null);
        return this.f80618a;
    }
}
