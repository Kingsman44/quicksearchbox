package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90225a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90231g;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.ao */
/* compiled from: PG */
public class C87316ao extends C87321d {

    /* renamed from: a */
    public static final C59071e f235808a = C59071e.m91332i("com.google.android.apps.gsa.search.core.y.e.e.ao");

    /* renamed from: b */
    public C90225a f235809b;

    /* renamed from: c */
    private final C23052c f235810c;

    /* renamed from: d */
    private final String f235811d;

    /* renamed from: e */
    private final String f235812e;

    /* renamed from: f */
    private final C87320c f235813f;

    /* renamed from: g */
    private final C58833ax f235814g;

    /* renamed from: h */
    private final C58833ax f235815h;

    /* renamed from: i */
    private final C58833ax f235816i;

    public C87316ao(C23052c cVar, String str, String str2, C87320c cVar2, C58833ax axVar, C58833ax axVar2, C58833ax axVar3) {
        this.f235810c = cVar;
        this.f235811d = str;
        this.f235812e = str2;
        this.f235813f = cVar2;
        this.f235814g = axVar;
        this.f235815h = axVar2;
        this.f235816i = axVar3;
    }

    /* renamed from: b */
    public final C87320c mo80956b() {
        return this.f235813f;
    }

    /* renamed from: c */
    public final C87302aa mo80957c() {
        C87341x xVar = (C87341x) C87302aa.f235768c.createBuilder();
        C87343z zVar = C87343z.SNACKBAR;
        xVar.copyOnWrite();
        C87302aa aaVar = (C87302aa) xVar.instance;
        aaVar.f235771b = Integer.valueOf(zVar.f235913g);
        aaVar.f235770a = 2;
        return (C87302aa) xVar.build();
    }

    /* renamed from: d */
    public final C87305ad mo80958d() {
        return (C87305ad) this.f235814g.mo56109e(new C87314am());
    }

    /* renamed from: f */
    public final C23052c mo80960f() {
        return this.f235810c;
    }

    /* renamed from: g */
    public final boolean mo80965g() {
        return ((Boolean) this.f235815h.mo56109e(true)).booleanValue();
    }

    /* renamed from: k */
    public boolean mo80966k() {
        return true;
    }

    /* renamed from: e */
    public final C90231g mo80959e() {
        this.f235809b.getClass();
        return new C87315an(this.f235811d, this.f235812e, ((Boolean) this.f235816i.mo56109e(false)).booleanValue(), this.f235809b);
    }
}
