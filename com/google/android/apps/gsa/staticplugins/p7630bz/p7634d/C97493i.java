package com.google.android.apps.gsa.staticplugins.p7630bz.p7634d;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.gsa.staticplugins.p7630bz.p7632b.C97479a;
import com.google.android.apps.gsa.staticplugins.p7630bz.p7632b.C97482d;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.clearcut.C143673z;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.elements.interfaces.C21255ay;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.p2186a.C28297a;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40066f;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40058w;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40060y;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40363p;
import com.google.android.libraries.search.silk.p3184c.C40656a;
import com.google.common.base.C58833ax;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bz.d.i */
/* compiled from: PG */
public final class C97493i extends C22939d {

    /* renamed from: a */
    public final C97482d f272265a;

    /* renamed from: b */
    public final C68214a f272266b;

    /* renamed from: c */
    private final C58833ax f272267c;

    /* renamed from: d */
    private final Context f272268d;

    /* renamed from: e */
    private final C86054o f272269e;

    /* renamed from: f */
    private final C40060y f272270f;

    /* renamed from: g */
    private final C28310af f272271g;

    /* renamed from: h */
    private final C97492h f272272h;

    /* renamed from: i */
    private C21196h f272273i;

    /* renamed from: j */
    private C40058w f272274j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97493i(C22945j jVar, C97482d dVar, C97479a aVar, Context context, Context context2, C58833ax axVar, C68214a aVar2, C86054o oVar, C40060y yVar, C28310af afVar, C90851k kVar, C40656a aVar3, C87680ah ahVar, C143658k kVar2, C143673z zVar, C40066f fVar, C40363p pVar, C21370a aVar4) {
        super(jVar);
        this.f272265a = dVar;
        this.f272268d = context2;
        this.f272267c = axVar;
        this.f272266b = aVar2;
        this.f272269e = oVar;
        this.f272270f = yVar;
        this.f272271g = afVar;
        ((C89859i) aVar2.mo27525b()).mo83702b(C89849ae.MONET_ELEMENTS_CREATED);
        context.getClass();
        kVar.getClass();
        aVar3.getClass();
        ahVar.getClass();
        kVar2.getClass();
        zVar.getClass();
        fVar.getClass();
        pVar.getClass();
        aVar4.getClass();
        this.f272272h = new C97489e(aVar, context, kVar, aVar3, zVar, fVar, pVar, aVar4);
    }

    /* renamed from: im */
    public final void mo28298im() {
        C40058w wVar = this.f272274j;
        if (wVar != null) {
            wVar.mo42158f();
        }
        this.f272272h.mo90732a().mo32553l();
        C21196h hVar = this.f272273i;
        hVar.getClass();
        hVar.mo26215b((byte[]) null);
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        this.f272272h.mo90732a().mo32553l();
        C21196h hVar = new C21196h(this.f272268d, this.f272272h.mo90732a().mo32548g().mo26713a());
        this.f272273i = hVar;
        mo28295iC(hVar);
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        C40058w wVar;
        if (((C60214n) ((C97495k) this.f272265a).f272291b.f63720e).f162918c == 0) {
            wVar = null;
        } else {
            Account a = this.f272269e.mo79668a();
            C28423g c = a == null ? C28297a.m52923c() : C28297a.m52922b(a.name);
            C40060y yVar = this.f272270f;
            C28313c a2 = this.f272271g.f76997b.mo33800a(C28375ak.m53062d((C60214n) ((C97495k) this.f272265a).f272291b.f63720e));
            a2.mo33860h(1);
            a2.mo33859g(c);
            wVar = yVar.mo42163a(a2.mo33810c((Activity) this.f272267c.mo56107c()), c);
        }
        this.f272274j = wVar;
        C21196h hVar = this.f272273i;
        if (hVar != null) {
            C21255ay b = hVar.f59458a.mo26721b();
            b.mo26714b(this.f272274j);
            C21256az a3 = b.mo26713a();
            a3.getClass();
            hVar.f59458a = a3;
            C21196h hVar2 = this.f272273i;
            hVar2.mo26213a(new C97490f(this, hVar2));
            this.f272272h.mo90732a().mo32553l().mo42108a(this.f272273i, (C57784p) ((C97495k) this.f272265a).f272290a.f63720e);
        }
    }
}
