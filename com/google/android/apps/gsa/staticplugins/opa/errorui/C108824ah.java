package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.SharedPreferences;
import com.google.android.apps.gsa.opaonboarding.C83869ac;
import com.google.android.apps.gsa.opaonboarding.C83875ai;
import com.google.android.apps.gsa.opaonboarding.C83956t;
import com.google.android.apps.gsa.staticplugins.opa.util.C113787bc;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.ah */
/* compiled from: PG */
public final class C108824ah extends C83869ac implements C83956t {

    /* renamed from: a */
    private final SharedPreferences f302595a;

    /* renamed from: b */
    private final C113787bc f302596b;

    public C108824ah(SharedPreferences sharedPreferences, C113787bc bcVar) {
        this.f302595a = sharedPreferences;
        this.f302596b = bcVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C83956t mo77207a() {
        return C83875ai.m133537b(new C108823ag());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo77208b() {
        if (this.f302595a.getInt("opa_email_opt_in_status", 0) != 0 || this.f302596b.mo100629i(false)) {
            return false;
        }
        return true;
    }
}
