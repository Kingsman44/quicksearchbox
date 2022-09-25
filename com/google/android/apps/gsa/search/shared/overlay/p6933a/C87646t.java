package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.animation.LayoutTransition;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.overlay.C87662k;
import com.google.android.apps.gsa.search.shared.overlay.C87663l;
import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88240ui;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88241uj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88242uk;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88684g;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7023bg.p7024a.C89426b;
import com.google.android.apps.gsa.shared.search.C90498f;
import com.google.android.apps.gsa.shared.search.QueryTriggerType;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.search.soundsearch.p10653b.C141640b;
import com.google.android.apps.search.soundsearch.p10653b.C141643e;
import com.google.android.apps.search.soundsearch.p10653b.C141644f;
import com.google.android.libraries.searchbox.p3203ui.p3204a.C41703c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.aod;
import com.google.p4184bj.p4193c.p4195b.p4196a.C55914b;
import com.google.protobuf.C62940bt;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.t */
/* compiled from: PG */
final class C87646t implements C88893c {

    /* renamed from: a */
    final /* synthetic */ C87625ad f236905a;

    public C87646t(C87625ad adVar) {
        this.f236905a = adVar;
    }

    /* renamed from: a */
    public final void mo17631a() {
        this.f236905a.f236778H.mo82692s(5, false);
        C87625ad adVar = this.f236905a;
        if (adVar.f236831ah == 3) {
            adVar.mo81803aj();
        }
        this.f236905a.mo17500a();
    }

    /* renamed from: b */
    public final void mo17632b() {
        C87625ad adVar = this.f236905a;
        adVar.f236771A.mo81839e(adVar.f236844au.mo84268aE(BuildConfig.FLAVOR, false));
        C41703c cVar = this.f236905a.f236788R;
        if (cVar != null) {
            cVar.mo44285f();
        }
    }

    /* renamed from: c */
    public final void mo17633c(boolean z) {
        C87663l lVar = this.f236905a.f236837an;
        if (lVar != null) {
            lVar.mo81867b();
        }
        C88684g gVar = this.f236905a.f236784N;
        if (gVar != null) {
            gVar.mo82379k(z);
        }
    }

    /* renamed from: d */
    public final void mo17634d(boolean z) {
        C87662k kVar = this.f236905a.f236854bd;
        if (kVar != null) {
            kVar.mo76789c(z);
        }
    }

    /* renamed from: e */
    public final void mo17635e() {
        C87625ad adVar = this.f236905a;
        if (!adVar.f236846aw) {
            adVar.mo17500a();
            C91097g gVar = this.f236905a.f236840aq;
            C141640b bVar = (C141640b) C141643e.f384462c.createBuilder();
            bVar.copyOnWrite();
            C141643e eVar = (C141643e) bVar.instance;
            eVar.f384465b = 1;
            eVar.f384464a = 1 | eVar.f384464a;
            gVar.mo65089a(C141644f.m229859a((C141643e) bVar.build()));
        }
    }

    /* renamed from: f */
    public final void mo17636f() {
        C87663l lVar = this.f236905a.f236837an;
        if (lVar != null) {
            lVar.mo81867b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = (com.google.android.apps.gsa.searchbox.p6960ui.C88706g) r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17637g() {
        /*
            r2 = this;
            com.google.android.apps.gsa.search.shared.overlay.a.ad r0 = r2.f236905a
            com.google.android.apps.gsa.search.shared.overlay.k r0 = r0.f236854bd
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.mo81863n()
            if (r0 != 0) goto L_0x0011
        L_0x000c:
            com.google.android.apps.gsa.search.shared.overlay.a.ad r0 = r2.f236905a
            r0.mo81780M()
        L_0x0011:
            com.google.android.apps.gsa.search.shared.overlay.a.ad r0 = r2.f236905a
            com.google.android.libraries.searchbox.ui.a.c r0 = r0.f236788R
            if (r0 == 0) goto L_0x0033
            com.google.android.apps.gsa.searchbox.ui.g r0 = (com.google.android.apps.gsa.searchbox.p6960ui.C88706g) r0
            com.google.android.apps.gsa.searchbox.ui.d r1 = r0.f239831a
            if (r1 == 0) goto L_0x0033
            boolean r1 = r1.mo82326m()
            if (r1 == 0) goto L_0x002e
            com.google.android.apps.gsa.searchbox.ui.d r0 = r0.f239831a
            com.google.android.apps.gsa.searchbox.client.gsa.ui.features.b.b r0 = (com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.features.p6955b.C88653b) r0
            r0.mo82323j()
            r0.mo82324k()
            return
        L_0x002e:
            com.google.android.apps.gsa.searchbox.ui.d r0 = r0.f239831a
            r0.mo82323j()
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.overlay.p6933a.C87646t.mo17637g():void");
    }

    /* renamed from: h */
    public final void mo17638h() {
        C87625ad adVar = this.f236905a;
        adVar.f236844au = adVar.f236844au.mo84285aV(SystemClock.elapsedRealtime());
        C87625ad adVar2 = this.f236905a;
        adVar2.mo81774G(adVar2.mo81773F(aod.SEARCH_BUTTON));
    }

    /* renamed from: i */
    public final void mo17639i() {
        ((C89859i) this.f236905a.f236781K.mo27525b()).mo83702b(C89849ae.SEARCH_WIDGET_MIC_TAP);
        if (this.f236905a.mo81768A()) {
            if ("and.gsa.so".equals(this.f236905a.f236804aG)) {
                this.f236905a.mo81818n("and.gsa.widget.mic", false);
            }
            this.f236905a.mo81770C((QueryTriggerType) null);
            return;
        }
        C87662k kVar = this.f236905a.f236854bd;
        if (kVar == null || !kVar.mo81862m(true)) {
            if ("and.gsa.so".equals(this.f236905a.f236804aG)) {
                this.f236905a.mo81818n("and.gsa.widget.mic", false);
            }
            this.f236905a.mo81770C((QueryTriggerType) null);
        }
    }

    /* renamed from: j */
    public final void mo17640j() {
        C87625ad adVar = this.f236905a;
        if (!adVar.f236877s.f236730aa) {
            adVar.f236778H.mo82692s(5, false);
        }
        this.f236905a.mo81803aj();
    }

    /* renamed from: k */
    public final void mo17641k() {
        LayoutTransition layoutTransition = this.f236905a.f236778H.getLayoutTransition();
        if (layoutTransition == null || !layoutTransition.isRunning()) {
            C87662k kVar = this.f236905a.f236854bd;
            if (kVar == null || !kVar.mo81862m(false)) {
                this.f236905a.mo81818n("and.gsa.widget.text", false);
                C58976aa aaVar = C58975e.f156826a;
                this.f236905a.mo81780M();
            }
        }
    }

    /* renamed from: l */
    public final void mo17642l(CharSequence charSequence, int i, int i2) {
        C87673aa aaVar = this.f236905a.f236773C;
        C88489j jVar = new C88489j(C87739bu.SEARCH_PLATE_TEXT_SELECTED);
        C62940bt btVar = C88240ui.f238495a;
        C88241uj ujVar = (C88241uj) C88242uk.f238496e.createBuilder();
        String obj = charSequence.toString();
        ujVar.copyOnWrite();
        C88242uk ukVar = (C88242uk) ujVar.instance;
        obj.getClass();
        ukVar.f238498a |= 1;
        ukVar.f238499b = obj;
        ujVar.copyOnWrite();
        C88242uk ukVar2 = (C88242uk) ujVar.instance;
        ukVar2.f238498a |= 2;
        ukVar2.f238500c = i;
        ujVar.copyOnWrite();
        C88242uk ukVar3 = (C88242uk) ujVar.instance;
        ukVar3.f238498a |= 4;
        ukVar3.f238501d = i2;
        jVar.mo82014b(btVar, (C88242uk) ujVar.build());
        aaVar.mo81937i(jVar.mo82013a());
    }

    /* renamed from: m */
    public final void mo17643m() {
        C89426b h;
        ((C89859i) this.f236905a.f236781K.mo27525b()).mo83702b(C89849ae.START_VAA_OPTIN);
        C87625ad adVar = this.f236905a;
        if (adVar.f236854bd != null && adVar.f236873o == C87623ab.NOT_SHOWN) {
            C87625ad adVar2 = this.f236905a;
            if (!adVar2.f236877s.f236731ab && (h = adVar2.f236854bd.mo81857h()) != null && h.f242413b) {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.staticplugins.hotwordenrollment.VAAConsentActivity"));
                Bundle bundle = new Bundle();
                bundle.putSerializable("entry_point", C55914b.VOICE_SEARCH_MIC_TAP);
                bundle.putString("account", h.f242414c);
                bundle.putString("url_locale", h.f242415d);
                bundle.putString("utm_source", h.f242416e);
                intent.putExtras(bundle);
                if (this.f236905a.f236840aq.mo65090b(intent, new C87645s(this))) {
                    this.f236905a.f236854bd.mo81861l(false);
                    this.f236905a.f236873o = C87623ab.BEING_SHOWN;
                    return;
                }
                return;
            }
        }
        mo17639i();
    }

    /* renamed from: n */
    public final boolean mo17644n(int i) {
        if (i != 3) {
            return false;
        }
        C87625ad adVar = this.f236905a;
        adVar.f236844au = adVar.f236844au.mo84285aV(SystemClock.elapsedRealtime());
        C87625ad adVar2 = this.f236905a;
        C90498f i2 = adVar2.mo81773F(aod.ENTER_KEY).mo84480i();
        i2.f252992j = 0;
        i2.f252965C = true;
        adVar2.mo81774G(i2.mo84568a());
        return true;
    }

    /* renamed from: o */
    public final void mo17645o() {
        C88684g gVar = this.f236905a.f236784N;
        if (gVar != null) {
            gVar.mo82374c();
        }
    }

    /* renamed from: p */
    public final void mo17646p() {
        C88684g gVar = this.f236905a.f236784N;
        if (gVar != null) {
            gVar.mo82375g();
        }
    }

    /* renamed from: q */
    public final void mo17647q() {
        C88684g gVar = this.f236905a.f236784N;
        if (gVar != null) {
            gVar.mo82376h();
        }
    }

    /* renamed from: r */
    public final void mo17648r(boolean z) {
        C88684g gVar = this.f236905a.f236784N;
        if (gVar != null) {
            gVar.mo82377i(z);
        }
    }

    /* renamed from: s */
    public final void mo17649s(CharSequence charSequence, int i) {
        if (this.f236905a.f236833aj) {
            C58976aa aaVar = C58975e.f156826a;
            if (!TextUtils.equals(this.f236905a.f236844au.f252768g, charSequence) || this.f236905a.f236844au.mo84367c() != i) {
                C87625ad adVar = this.f236905a;
                adVar.f236771A.mo81839e(adVar.f236844au.mo84269aF(charSequence, i, i));
                C41703c cVar = this.f236905a.f236788R;
                if (cVar != null) {
                    cVar.mo44286h(i);
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo17650t() {
        C87662k kVar = this.f236905a.f236854bd;
        if (kVar != null) {
            kVar.mo76790d();
        }
    }
}
