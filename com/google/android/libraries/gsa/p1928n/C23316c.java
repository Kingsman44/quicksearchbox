package com.google.android.libraries.gsa.p1928n;

import com.google.android.libraries.gsa.monet.shared.C23123s;
import com.google.android.libraries.gsa.monet.tools.model.shared.C23250b;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.android.libraries.p576aq.C10485ab;
import com.google.android.libraries.p576aq.C10558u;
import com.google.android.libraries.p576aq.C10563z;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.gsa.n.c */
/* compiled from: PG */
public final class C23316c implements C23250b, C23249a {

    /* renamed from: a */
    public final C10558u f63810a;

    /* renamed from: b */
    private final C23249a f63811b;

    /* renamed from: c */
    private final C23314a f63812c;

    public C23316c(C23249a aVar, C10485ab abVar) {
        C23314a aVar2 = new C23314a();
        this.f63812c = aVar2;
        this.f63811b = aVar;
        aVar.mo28726b(aVar2);
        abVar.mo18522d();
        C10558u j = C10563z.m25518j(aVar.mo28725a());
        this.f63810a = j;
        abVar.mo18521c();
        Objects.requireNonNull(j);
        aVar2.mo28810b(new C23315b(j));
    }

    /* renamed from: a */
    public final Object mo28725a() {
        return this.f63811b.mo28725a();
    }

    /* renamed from: b */
    public final void mo28726b(C23123s sVar) {
        this.f63812c.mo28810b(sVar);
    }
}
