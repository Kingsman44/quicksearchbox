package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.social.populous.core.cw */
/* compiled from: PG */
public abstract class C42324cw implements C42281bg {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract ProfileId mo45309a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C58833ax mo45310b();

    /* renamed from: c */
    public abstract void mo45311c(PersonFieldMetadata personFieldMetadata);

    /* renamed from: d */
    public final ProfileId mo45312d() {
        if (!mo45310b().mo56113h()) {
            C42318cq cqVar = new C42318cq();
            cqVar.f110981h.add(C42331dc.PAPI_TOPN);
            mo45311c(cqVar.mo45296a());
        }
        return mo45309a();
    }

    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo45235e(Name name) {
        throw null;
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo45236f(Photo photo) {
        throw null;
    }
}
