package com.google.android.libraries.accountlinking.p10980c;

import android.app.Application;
import androidx.lifecycle.C2358bf;
import androidx.lifecycle.C2362bj;
import androidx.lifecycle.C2363bk;
import androidx.lifecycle.p127a.C2322c;
import com.google.android.libraries.accountlinking.activity.C147395w;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.accountlinking.c.c */
/* compiled from: PG */
public final class C147418c implements C2363bk {

    /* renamed from: a */
    private final Application f397942a;

    /* renamed from: b */
    private final C147395w f397943b;

    public C147418c(Application application, C147395w wVar) {
        this.f397942a = application;
        this.f397943b = wVar;
    }

    /* renamed from: a */
    public final C2358bf mo634a(Class cls) {
        C58838bb.m90869d(cls == C147419d.class, "LinkingStateViewMode.Factory should only be used for AccountLinkingViewModel");
        return new C147419d(this.f397942a, this.f397943b);
    }

    /* renamed from: b */
    public final /* synthetic */ C2358bf mo635b(Class cls, C2322c cVar) {
        return C2362bj.m6360a(this, cls);
    }
}
