package com.google.android.apps.gsa.staticplugins.opa.util;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cm */
/* compiled from: PG */
public abstract class C113858cm {
    /* renamed from: k */
    public static C113855cj m188476k() {
        C113890u uVar = new C113890u();
        Bundle bundle = Bundle.EMPTY;
        if (bundle != null) {
            uVar.f315323b = bundle;
            uVar.mo100706d(QueryTriggerType.USER);
            uVar.mo100707e(false);
            uVar.mo100704b(false);
            return uVar;
        }
        throw new NullPointerException("Null queryExtras");
    }

    /* renamed from: a */
    public abstract Bundle mo100711a();

    /* renamed from: b */
    public abstract QueryTriggerType mo100712b();

    /* renamed from: c */
    public abstract C58833ax mo100713c();

    /* renamed from: d */
    public abstract C58833ax mo100714d();

    /* renamed from: e */
    public abstract C58833ax mo100715e();

    /* renamed from: f */
    public abstract C58833ax mo100716f();

    /* renamed from: g */
    public abstract C58833ax mo100717g();

    /* renamed from: h */
    public abstract CharSequence mo100718h();

    /* renamed from: i */
    public abstract boolean mo100719i();

    /* renamed from: j */
    public abstract boolean mo100720j();
}
