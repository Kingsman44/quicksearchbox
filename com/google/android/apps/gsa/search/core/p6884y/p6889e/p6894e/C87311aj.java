package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90225a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90231g;
import com.google.android.libraries.gsa.monet.service.C23052c;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.aj */
/* compiled from: PG */
public final class C87311aj extends C87321d {

    /* renamed from: a */
    public final C90225a f235797a;

    /* renamed from: b */
    private final C23052c f235798b;

    /* renamed from: c */
    private final String f235799c;

    /* renamed from: d */
    private final boolean f235800d;

    public C87311aj(C23052c cVar, String str, C90225a aVar, boolean z) {
        this.f235798b = cVar;
        this.f235799c = str;
        this.f235797a = aVar;
        this.f235800d = z;
    }

    /* renamed from: b */
    public final C87320c mo80956b() {
        return C87320c.PERSISTENT;
    }

    /* renamed from: c */
    public final C87302aa mo80957c() {
        C87341x xVar = (C87341x) C87302aa.f235768c.createBuilder();
        C87343z zVar = C87343z.NEW_CONTENT_BUTTON;
        xVar.copyOnWrite();
        C87302aa aaVar = (C87302aa) xVar.instance;
        aaVar.f235771b = Integer.valueOf(zVar.f235913g);
        aaVar.f235770a = 2;
        return (C87302aa) xVar.build();
    }

    /* renamed from: d */
    public final C87305ad mo80958d() {
        return new C87309ah(this);
    }

    /* renamed from: e */
    public final C90231g mo80959e() {
        return new C87310ai(this.f235799c, this.f235800d);
    }

    /* renamed from: f */
    public final C23052c mo80960f() {
        return this.f235798b;
    }

    /* renamed from: h */
    public final boolean mo80961h() {
        return true;
    }

    /* renamed from: l */
    public final int mo80962l() {
        return 4;
    }

    /* renamed from: m */
    public final int mo80963m() {
        return 5;
    }

    /* renamed from: o */
    public final boolean mo80964o() {
        return true;
    }
}
