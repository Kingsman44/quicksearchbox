package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.social.populous.core.cu */
/* compiled from: PG */
public abstract class C42322cu implements C42281bg {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Phone mo45300a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C58833ax mo45301b();

    /* renamed from: c */
    public abstract void mo45302c(PersonFieldMetadata personFieldMetadata);

    /* renamed from: d */
    public abstract void mo45303d(CharSequence charSequence);

    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo45235e(Name name) {
        throw null;
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo45236f(Photo photo) {
        throw null;
    }

    /* renamed from: g */
    public final Phone mo45304g() {
        if (!mo45301b().mo56113h()) {
            C42318cq cqVar = new C42318cq();
            cqVar.f110981h.add(C42331dc.DEVICE);
            mo45302c(cqVar.mo45296a());
        }
        return mo45300a();
    }
}
