package com.google.android.apps.gsa.staticplugins.accl.p7331c;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.libraries.gsa.conversation.p1852f.C22585l;
import com.google.android.libraries.gsa.conversation.p1852f.C22592s;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.c.ae */
/* compiled from: PG */
final class C92767ae implements C22592s {

    /* renamed from: a */
    public final C92810s f258882a;

    /* renamed from: b */
    private final C89356b f258883b;

    /* renamed from: c */
    private final C60870cx f258884c;

    /* renamed from: d */
    private final C60870cx f258885d;

    /* renamed from: e */
    private final C60870cx f258886e;

    /* renamed from: f */
    private final C58833ax f258887f;

    /* renamed from: g */
    private final boolean f258888g;

    public C92767ae(C58833ax axVar, C89356b bVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3, C60870cx cxVar4, boolean z, C92811t tVar) {
        this.f258887f = axVar;
        this.f258883b = bVar;
        this.f258884c = cxVar;
        this.f258885d = cxVar2;
        this.f258886e = cxVar4;
        this.f258882a = tVar.mo87464a(cxVar3);
        this.f258888g = z;
    }

    /* renamed from: a */
    public final C60870cx mo27686a() {
        return C60922j.m93044g(this.f258885d, C92766ad.f258881a, C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo27687b() {
        return this.f258882a.mo87461a();
    }

    /* renamed from: c */
    public final C60870cx mo27688c() {
        return this.f258882a.mo87462b();
    }

    /* renamed from: d */
    public final C22585l mo27689d() {
        return new C92798g(this.f258887f, C58836b.f156633a, C60922j.m93044g(this.f258886e, C92765ac.f258880a, C60826bg.f164896a), this.f258882a.f258981a);
    }

    /* renamed from: e */
    public final C60870cx mo27695e() {
        this.f258884c.cancel(true);
        this.f258885d.cancel(!this.f258888g);
        this.f258883b.mo83286e().mo54566a();
        this.f258886e.cancel(true);
        this.f258882a.f258981a.cancel(true);
        return C118826c.f331423b;
    }
}
