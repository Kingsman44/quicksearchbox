package com.google.android.apps.p8928i.p8932c.p8933a;

import com.google.android.apps.p8928i.p8929a.p8930a.C119148d;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.i.c.a.e */
/* compiled from: PG */
public abstract class C119154e {
    /* renamed from: a */
    public abstract C119155f mo104208a();

    /* renamed from: b */
    public abstract void mo104209b(C119158i iVar);

    /* renamed from: c */
    public abstract void mo104210c(boolean z);

    /* renamed from: d */
    public final C119155f mo104224d() {
        C119155f a = mo104208a();
        if (a.mo104212b().mo56113h()) {
            C58838bb.m90869d(!((C119148d) a.mo104212b().mo56107c()).f332315a.isEmpty(), "Targeted call should specify registrations");
        }
        return a;
    }

    @Deprecated
    /* renamed from: e */
    public final void mo104225e(String str) {
        C119152c cVar = new C119152c();
        cVar.f332324a = 2;
        cVar.mo104218b(str);
        mo104209b(cVar.mo104226c());
    }
}
