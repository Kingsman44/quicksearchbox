package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90225a;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90231g;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.f */
/* compiled from: PG */
public final class C87323f extends C87321d {

    /* renamed from: a */
    public C90225a f235835a;

    /* renamed from: b */
    public C90225a f235836b;

    /* renamed from: c */
    public C90225a f235837c;

    /* renamed from: d */
    private final C23052c f235838d;

    /* renamed from: e */
    private final C87305ad f235839e;

    /* renamed from: f */
    private final String f235840f;

    /* renamed from: g */
    private final String f235841g;

    /* renamed from: h */
    private final String f235842h;

    /* renamed from: i */
    private final int f235843i;

    /* renamed from: j */
    private final int f235844j;

    /* renamed from: k */
    private final String f235845k;

    /* renamed from: l */
    private final C58833ax f235846l;

    /* renamed from: m */
    private final C58833ax f235847m;

    /* renamed from: n */
    private final C58833ax f235848n;

    /* renamed from: o */
    private final C58833ax f235849o;

    /* renamed from: p */
    private final C58833ax f235850p;

    public C87323f(C23052c cVar, String str, String str2, String str3, String str4, int i, int i2, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4, C58833ax axVar5, C87305ad adVar) {
        this.f235838d = cVar;
        this.f235847m = axVar2;
        this.f235848n = axVar3;
        this.f235849o = axVar4;
        this.f235850p = axVar5;
        this.f235839e = adVar;
        this.f235846l = axVar;
        this.f235840f = str;
        this.f235841g = str2;
        this.f235842h = str3;
        this.f235844j = i2;
        this.f235843i = i;
        this.f235845k = str4;
    }

    /* renamed from: b */
    public final C87320c mo80956b() {
        return (C87320c) this.f235850p.mo56109e(C87320c.NORMAL);
    }

    /* renamed from: c */
    public final C87302aa mo80957c() {
        C87341x xVar = (C87341x) C87302aa.f235768c.createBuilder();
        C87343z zVar = C87343z.BOTTOM_DIALOG;
        xVar.copyOnWrite();
        C87302aa aaVar = (C87302aa) xVar.instance;
        aaVar.f235771b = Integer.valueOf(zVar.f235913g);
        aaVar.f235770a = 2;
        return (C87302aa) xVar.build();
    }

    /* renamed from: d */
    public final C87305ad mo80958d() {
        return this.f235839e;
    }

    /* renamed from: f */
    public final C23052c mo80960f() {
        return this.f235838d;
    }

    /* renamed from: g */
    public final boolean mo80965g() {
        return ((Boolean) this.f235847m.mo56109e(true)).booleanValue();
    }

    /* renamed from: k */
    public final boolean mo80966k() {
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

    /* renamed from: n */
    public final boolean mo80971n() {
        return ((Boolean) this.f235849o.mo56109e(false)).booleanValue();
    }

    /* renamed from: p */
    public final boolean mo80972p() {
        return ((Boolean) this.f235848n.mo56109e(false)).booleanValue();
    }

    /* renamed from: e */
    public final C90231g mo80959e() {
        C58833ax axVar;
        C58833ax axVar2 = this.f235846l;
        String str = this.f235840f;
        int i = this.f235844j;
        int i2 = this.f235843i;
        String str2 = this.f235845k;
        String str3 = this.f235841g;
        C90225a aVar = this.f235835a;
        aVar.getClass();
        String str4 = this.f235842h;
        C90225a aVar2 = this.f235836b;
        aVar2.getClass();
        C90225a aVar3 = this.f235837c;
        if (aVar3 == null) {
            axVar = C58836b.f156633a;
        } else {
            axVar = C58833ax.m90834k(aVar3);
        }
        return new C87322e(axVar2, str, i, i2, str2, str3, aVar, str4, aVar2, axVar);
    }
}
