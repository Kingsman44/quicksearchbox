package com.google.android.apps.gsa.opaonboarding;

import android.os.Bundle;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ag */
/* compiled from: PG */
public abstract class C83873ag implements C83956t {

    /* renamed from: a */
    private boolean f228523a = false;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bundle mo77213a() {
        return Bundle.EMPTY;
    }

    /* renamed from: c */
    public C58833ax mo77209c() {
        if (this.f228523a) {
            return C58836b.f156633a;
        }
        this.f228523a = true;
        C83907bm j = mo77214j();
        j.setArguments(mo77213a());
        return C58833ax.m90834k(j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract C83907bm mo77214j();
}
