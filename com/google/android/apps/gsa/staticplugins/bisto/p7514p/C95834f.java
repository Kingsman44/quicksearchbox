package com.google.android.apps.gsa.staticplugins.bisto.p7514p;

import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95307m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.C60070js;
import com.google.common.p4552o.C60072ju;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.p.f */
/* compiled from: PG */
public final class C95834f implements C95838j {

    /* renamed from: a */
    public long f268375a = 0;

    /* renamed from: b */
    public final Optional f268376b;

    /* renamed from: c */
    private final C95307m f268377c;

    /* renamed from: d */
    private final String f268378d;

    /* renamed from: e */
    private final C21370a f268379e;

    public C95834f(C21370a aVar, Optional optional, C95307m mVar) {
        this.f268379e = aVar;
        this.f268377c = mVar;
        this.f268376b = optional;
        this.f268378d = String.valueOf(C90719ac.f253778a.f253779b.nextLong());
    }

    /* renamed from: a */
    public final void mo89815a(int i, C60070js jsVar) {
        this.f268375a = this.f268379e.mo26871c();
        jsVar.copyOnWrite();
        C60072ju juVar = (C60072ju) jsVar.instance;
        C60072ju juVar2 = C60072ju.f162395f;
        juVar.f162399c = i - 1;
        juVar.f162397a |= 2;
        long b = this.f268379e.mo26870b();
        jsVar.copyOnWrite();
        C60072ju juVar3 = (C60072ju) jsVar.instance;
        juVar3.f162397a |= 4;
        juVar3.f162400d = b;
        String str = this.f268378d;
        if (str != null) {
            jsVar.copyOnWrite();
            C60072ju juVar4 = (C60072ju) jsVar.instance;
            juVar4.f162397a |= 1;
            juVar4.f162398b = str;
        }
        C95307m mVar = this.f268377c;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60072ju juVar5 = (C60072ju) jsVar.build();
        juVar5.getClass();
        nmVar.f163140A = juVar5;
        nmVar.f163148b |= 512;
        mVar.mo83545c(nkVar);
    }

    /* renamed from: d */
    public final void mo89803d() {
        mo89815a(6, (C60070js) C60072ju.f162395f.createBuilder());
    }

    /* renamed from: g */
    public final void mo89806g() {
        mo89815a(10, (C60070js) C60072ju.f162395f.createBuilder());
    }

    /* renamed from: h */
    public final void mo89807h() {
        mo89815a(4, (C60070js) C60072ju.f162395f.createBuilder());
    }

    /* renamed from: i */
    public final void mo89808i() {
        mo89815a(7, (C60070js) C60072ju.f162395f.createBuilder());
    }

    /* renamed from: k */
    public final void mo89810k() {
        mo89815a(9, (C60070js) C60072ju.f162395f.createBuilder());
    }

    /* renamed from: m */
    public final void mo89812m() {
        mo89815a(5, (C60070js) C60072ju.f162395f.createBuilder());
    }

    /* renamed from: n */
    public final void mo89813n() {
        mo89815a(11, (C60070js) C60072ju.f162395f.createBuilder());
    }
}
