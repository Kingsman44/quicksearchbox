package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.search.core.p6491a.C84349ah;
import com.google.android.libraries.gsa.conversation.p1852f.C22579f;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.e */
/* compiled from: PG */
final class C92796e implements C22579f {

    /* renamed from: a */
    public final C92810s f258946a;

    /* renamed from: b */
    public final C58833ax f258947b;

    /* renamed from: c */
    private final C58833ax f258948c;

    /* renamed from: d */
    private final C60870cx f258949d;

    /* renamed from: e */
    private final C60870cx f258950e;

    /* renamed from: f */
    private final C84349ah f258951f;

    public C92796e(C84349ah ahVar, C58833ax axVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C92811t tVar, C58833ax axVar2) {
        this.f258951f = ahVar;
        this.f258948c = axVar;
        this.f258949d = cxVar;
        this.f258950e = C60922j.m93044g(cxVar3, C92748a.f258823a, C60826bg.f164896a);
        this.f258946a = tVar.mo87464a(cxVar2);
        this.f258947b = axVar2;
    }

    /* renamed from: a */
    public final C60870cx mo27686a() {
        return this.f258949d;
    }

    /* renamed from: b */
    public final C60870cx mo27687b() {
        if (!this.f258947b.mo56113h()) {
            return this.f258946a.mo87461a();
        }
        return C60922j.m93044g(this.f258946a.mo87461a(), new C92789b(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo27688c() {
        return this.f258946a.mo87462b();
    }

    /* renamed from: d */
    public final C22585l mo27689d() {
        return new C92798g(C58833ax.m90834k(this.f258951f), this.f258948c, this.f258950e, this.f258946a.f258981a);
    }
}
