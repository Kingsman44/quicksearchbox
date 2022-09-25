package com.google.android.libraries.accountlinking.activity;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C2319a;
import androidx.lifecycle.C2344as;
import androidx.lifecycle.C2358bf;
import androidx.savedstate.C4091g;
import com.google.android.libraries.accountlinking.p10980c.C147417b;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.libraries.accountlinking.activity.o */
/* compiled from: PG */
public final class C147387o extends C2319a {

    /* renamed from: a */
    private final Application f397848a;

    /* renamed from: b */
    private final C147395w f397849b;

    /* renamed from: c */
    private final C147417b f397850c;

    public C147387o(C4091g gVar, Bundle bundle, Application application, C147395w wVar, C147417b bVar) {
        super(gVar, bundle);
        this.f397848a = application;
        this.f397849b = wVar;
        this.f397850c = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C2358bf mo5722d(Class cls, C2344as asVar) {
        C58838bb.m90869d(cls == C147388p.class, "AccountLinkingViewModel.SavedStateFactory should only be used for AccountLinkingViewModel");
        return new C147388p(this.f397848a, this.f397849b, this.f397850c);
    }
}
