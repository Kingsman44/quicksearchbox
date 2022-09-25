package com.google.android.libraries.geller.p1818f;

import com.google.common.base.C58817ah;
import com.google.protos.p5129p.p5131b.C65753ak;

/* renamed from: com.google.android.libraries.geller.f.l */
/* compiled from: PG */
public final /* synthetic */ class C21862l implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C21875y f60333a;

    /* renamed from: b */
    public final /* synthetic */ C65753ak f60334b;

    public /* synthetic */ C21862l(C21875y yVar, C65753ak akVar) {
        this.f60333a = yVar;
        this.f60334b = akVar;
    }

    public final Object apply(Object obj) {
        C21849ce a = this.f60333a.mo27167a(this.f60334b);
        a.mo27148b().mo55395g(new C21827bj("Failed to commit downloads to the database: ".concat(String.valueOf(((Exception) obj).getMessage()))));
        return false;
    }
}
