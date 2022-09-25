package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.core.bo */
/* compiled from: PG */
public abstract class C42289bo implements C42281bg {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Email mo45245a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C58833ax mo45246b();

    /* renamed from: c */
    public abstract void mo45247c(C58485gu guVar);

    /* renamed from: d */
    public abstract void mo45248d(PersonFieldMetadata personFieldMetadata);

    /* renamed from: e */
    public /* bridge */ /* synthetic */ void mo45235e(Name name) {
        throw null;
    }

    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo45236f(Photo photo) {
        throw null;
    }

    /* renamed from: g */
    public abstract void mo45249g(CharSequence charSequence);

    /* renamed from: h */
    public final Email mo45250h() {
        if (!mo45246b().mo56113h()) {
            mo45248d(new C42318cq().mo45296a());
        }
        return mo45245a();
    }
}
