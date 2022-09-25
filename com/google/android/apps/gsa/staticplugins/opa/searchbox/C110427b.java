package com.google.android.apps.gsa.staticplugins.opa.searchbox;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88327xo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88328xp;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88329xq;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88649e;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88687j;
import com.google.android.apps.gsa.searchbox.p6960ui.C88701b;
import com.google.android.apps.gsa.searchbox.p6960ui.C88705f;
import com.google.android.apps.gsa.searchbox.p6960ui.C88706g;
import com.google.android.apps.gsa.searchbox.p6960ui.C88707h;
import com.google.android.apps.gsa.searchbox.p6960ui.C88715p;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88694c;
import com.google.android.apps.gsa.searchbox.p6960ui.p6961a.C88698g;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.C88760ae;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a.C88727aj;
import com.google.android.apps.gsa.searchbox.shared.C88688a;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89202g;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107647ag;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107656ap;
import com.google.android.apps.gsa.staticplugins.opa.p8313ay.C107662av;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.assistant.p3745ab.C48245bb;
import com.google.assistant.p3745ab.C48247bd;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60456qs;
import com.google.common.p4552o.aod;
import com.google.common.p4552o.p4553a.C59568x;
import com.google.common.p4552o.p4553a.C59569y;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.searchbox.b */
/* compiled from: PG */
public final class C110427b extends C88701b implements C110434i, C89200e {

    /* renamed from: a */
    public final Context f307810a;

    /* renamed from: b */
    public final C21370a f307811b;

    /* renamed from: c */
    public final C88705f f307812c;

    /* renamed from: d */
    public final C88649e f307813d;

    /* renamed from: e */
    public final C88688a f307814e;

    /* renamed from: f */
    public final C90476a f307815f;

    /* renamed from: g */
    public final C68214a f307816g;

    /* renamed from: h */
    public final C68214a f307817h;

    /* renamed from: i */
    public C88687j f307818i;

    /* renamed from: j */
    public ViewGroup f307819j;

    /* renamed from: k */
    public C89202g f307820k;

    /* renamed from: l */
    public C88760ae f307821l;

    /* renamed from: m */
    C88707h f307822m;

    /* renamed from: n */
    public final C86124t f307823n;

    /* renamed from: o */
    public boolean f307824o = false;

    /* renamed from: p */
    public C107647ag f307825p;

    /* renamed from: q */
    private C88727aj f307826q;

    /* renamed from: r */
    private int f307827r = 0;

    /* renamed from: s */
    private C88698g f307828s;

    /* renamed from: t */
    private C88706g f307829t;

    public C110427b(Activity activity, C21370a aVar, C68214a aVar2, C88649e eVar, C88688a aVar3, C90476a aVar4, C68214a aVar5, C68214a aVar6, C86124t tVar) {
        this.f307810a = activity;
        this.f307811b = aVar;
        this.f307812c = new C88705f(aVar2);
        this.f307813d = eVar;
        this.f307814e = aVar3;
        this.f307815f = aVar4;
        this.f307816g = aVar5;
        this.f307817h = aVar6;
        this.f307823n = tVar;
    }

    /* renamed from: f */
    private static C48247bd m183903f(Response response, Suggestion suggestion) {
        int indexOf = response.f108862b.indexOf(suggestion);
        C48245bb bbVar = (C48245bb) C48247bd.f124805e.createBuilder();
        int i = suggestion.f108910k == 169 ? 3 : 5;
        bbVar.copyOnWrite();
        C48247bd bdVar = (C48247bd) bbVar.instance;
        bdVar.f124808b = i - 1;
        bdVar.f124807a |= 1;
        bbVar.copyOnWrite();
        C48247bd bdVar2 = (C48247bd) bbVar.instance;
        bdVar2.f124807a |= 2;
        bdVar2.f124809c = false;
        bbVar.copyOnWrite();
        C48247bd bdVar3 = (C48247bd) bbVar.instance;
        bdVar3.f124807a |= 8;
        bdVar3.f124810d = indexOf;
        return (C48247bd) bbVar.build();
    }

    /* renamed from: g */
    private final void m183904g(aod aod) {
        C88698g gVar;
        if (mo98667c() && (gVar = this.f307828s) != null) {
            gVar.mo82415v(aod);
        }
    }

    /* renamed from: C */
    public final void mo44274C() {
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: D */
    public final boolean mo82302D(Suggestion suggestion, View view) {
        return false;
    }

    /* renamed from: a */
    public final C60456qs mo98665a(aod aod) {
        C88698g gVar;
        Response response = null;
        if (!mo98667c() || (gVar = this.f307828s) == null) {
            return null;
        }
        gVar.mo82415v(aod);
        C88706g gVar2 = this.f307829t;
        CharSequence a = gVar2 != null ? gVar2.mo82429a() : null;
        C88760ae aeVar = this.f307821l;
        if (aeVar != null) {
            response = aeVar.mo82489k();
        }
        return C88694c.m143537a(a, response, this.f307828s.mo82399f());
    }

    /* renamed from: b */
    public final void mo98666b() {
        C58976aa aaVar = C58975e.f156826a;
        C89202g gVar = this.f307820k;
        if (gVar != null) {
            gVar.mo83157c();
        }
    }

    /* renamed from: c */
    public final boolean mo98667c() {
        return this.f307820k != null;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88715p pVar = (C88715p) obj;
        this.f307829t = pVar.f239940l;
        this.f307828s = pVar.f239937i;
        this.f307821l = pVar.f239943o;
        this.f307826q = pVar.f239945q;
        this.f307822m = pVar.f239942n;
    }

    /* renamed from: e */
    public final void mo98668e(int i) {
        C88727aj ajVar;
        int i2 = this.f307827r;
        C88649e eVar = this.f307813d;
        eVar.f239680d = i;
        eVar.mo82320b();
        this.f307827r = i;
        if (i != i2 && (ajVar = this.f307826q) != null) {
            ajVar.mo82463s();
        }
    }

    /* renamed from: o */
    public final void mo44277o(Response response) {
        if (response.f108861a.isEmpty()) {
            this.f307818i.mo82385i(response.f108866f);
        }
        response.f108861a.isEmpty();
        C88760ae aeVar = this.f307821l;
        if (aeVar != null) {
            aeVar.mo82487b(130);
            this.f307821l.mo82487b(2);
        }
        C88328xp xpVar = (C88328xp) C88329xq.f238867j.createBuilder();
        boolean isEmpty = response.f108861a.isEmpty();
        xpVar.copyOnWrite();
        C88329xq xqVar = (C88329xq) xpVar.instance;
        xqVar.f238869a |= 4;
        xqVar.f238872d = isEmpty;
        boolean z = response.f108863c.getBoolean("gsa::aa");
        xpVar.copyOnWrite();
        C88329xq xqVar2 = (C88329xq) xpVar.instance;
        xqVar2.f238869a |= 8;
        xqVar2.f238873e = z;
        int i = response.f108864d;
        xpVar.copyOnWrite();
        C88329xq xqVar3 = (C88329xq) xpVar.instance;
        xqVar3.f238869a |= 16;
        xqVar3.f238874f = i;
        boolean z2 = response.f108863c.getBoolean("gsa:ah");
        xpVar.copyOnWrite();
        C88329xq xqVar4 = (C88329xq) xpVar.instance;
        xqVar4.f238869a |= 32;
        xqVar4.f238875g = z2;
        boolean z3 = response.f108863c.getBoolean("gsa::ai");
        xpVar.copyOnWrite();
        C88329xq xqVar5 = (C88329xq) xpVar.instance;
        xqVar5.f238869a |= 64;
        xqVar5.f238876h = z3;
        C88698g gVar = this.f307828s;
        if (gVar != null) {
            long c = gVar.mo82398c();
            xpVar.copyOnWrite();
            C88329xq xqVar6 = (C88329xq) xpVar.instance;
            xqVar6.f238869a |= 1;
            xqVar6.f238870b = c;
        }
        C60456qs a = mo98665a(aod.ABANDONMENT);
        if (a != null) {
            xpVar.copyOnWrite();
            C88329xq xqVar7 = (C88329xq) xpVar.instance;
            xqVar7.f238871c = a;
            xqVar7.f238869a = 2 | xqVar7.f238869a;
        }
        C88489j jVar = new C88489j(C87739bu.SUGGEST_RESPONSE_RENDERED);
        jVar.mo82014b(C88327xo.f238866a, (C88329xq) xpVar.build());
        jVar.mo82015c(response);
        this.f307813d.mo82321f(jVar.mo82013a());
    }

    /* renamed from: q */
    public final void mo44278q(Suggestion suggestion) {
        C58976aa aaVar = C58975e.f156826a;
        int i = suggestion.f108912m;
        C88489j jVar = new C88489j(C87739bu.SUGGEST_FEEDBACK_CLICK);
        jVar.mo82015c(suggestion);
        this.f307813d.mo82321f(jVar.mo82013a());
    }

    /* renamed from: s */
    public final void mo44279s(Suggestion suggestion, View view, String str) {
        C88760ae aeVar;
        Response k;
        boolean equals = "gsa::set_input_action".equals(str);
        C48247bd bdVar = null;
        if (!(!equals || (aeVar = this.f307821l) == null || (k = aeVar.mo82489k()) == null)) {
            bdVar = m183903f(k, suggestion);
        }
        m183904g(aod.CLICKED_SUGGESTION);
        this.f307825p.f299479a.f299509R = bdVar;
    }

    /* renamed from: t */
    public final void mo44280t(Suggestion suggestion, View view, CharSequence charSequence) {
        Response k;
        C88760ae aeVar = this.f307821l;
        C48247bd bdVar = null;
        if (!(aeVar == null || (k = aeVar.mo82489k()) == null)) {
            bdVar = m183903f(k, suggestion);
        }
        m183904g(aod.CLICKED_SUGGESTION);
        C107647ag agVar = this.f307825p;
        C107656ap apVar = agVar.f299479a;
        apVar.f299509R = bdVar;
        if (apVar.mo96140aM() && charSequence != null) {
            C59568x xVar = (C59568x) C59569y.f158066g.createBuilder();
            int length = agVar.f299479a.mo96184m().getText().length();
            xVar.copyOnWrite();
            C59569y yVar = (C59569y) xVar.instance;
            yVar.f158068a |= 1;
            yVar.f158069b = length;
            xVar.copyOnWrite();
            C59569y yVar2 = (C59569y) xVar.instance;
            yVar2.f158068a |= 2;
            yVar2.f158070c = "LEGACY_OPA";
            ((C107662av) agVar.f299479a.f299593p.mo27525b()).mo96206b(C89849ae.AGSA_TEXT_OPA_SUGGESTION_SUBMIT, Optional.empty(), Optional.m71637of((C59569y) xVar.build()));
            agVar.f299479a.mo96110I(charSequence, C58836b.f156633a, e.i, C58833ax.m90834k((C59569y) xVar.build()), C58836b.f156633a);
        }
    }

    /* renamed from: x */
    public final void mo44283x(Suggestion suggestion) {
        C88707h hVar = this.f307822m;
        if (hVar != null) {
            hVar.f239839a = true;
        }
        C58976aa aaVar = C58975e.f156826a;
        C88489j jVar = new C88489j(C87739bu.REMOVE_SUGGESTION);
        jVar.mo82015c(suggestion);
        this.f307813d.mo82321f(jVar.mo82013a());
    }
}
