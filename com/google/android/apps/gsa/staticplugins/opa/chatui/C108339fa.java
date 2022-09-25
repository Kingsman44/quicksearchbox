package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0653fo;
import android.support.p033v7.widget.RecyclerView;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8306at.C107571n;
import com.google.android.apps.gsa.staticplugins.opa.p8306at.C107572o;
import com.google.android.apps.gsa.staticplugins.opa.p8306at.C107577t;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58431eu;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aqp;
import com.google.common.p4552o.aqs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.fa */
/* compiled from: PG */
public final class C108339fa extends C108232bc {

    /* renamed from: a */
    public static final C59071e f301360a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.fa");

    /* renamed from: b */
    public final C107571n f301361b;

    /* renamed from: c */
    public final Context f301362c;

    /* renamed from: d */
    private final C21370a f301363d;

    /* renamed from: e */
    private final C91097g f301364e;

    /* renamed from: f */
    private boolean f301365f = false;

    public C108339fa(Context context, C107571n nVar, C21370a aVar, C91097g gVar) {
        super((byte[]) null);
        this.f301361b = nVar;
        this.f301362c = context;
        this.f301363d = aVar;
        this.f301364e = gVar;
    }

    /* renamed from: e */
    private final boolean m180093e() {
        return Collections.unmodifiableList(this.f301361b.f299271b).size() == 1;
    }

    /* renamed from: b */
    public final void mo96799b(int i) {
        C108241bl m;
        RecyclerView recyclerView;
        int a = this.f301361b.mo96025a(i);
        if (a != -1 && (m = mo96603m()) != null && (recyclerView = m.f301085l) != null) {
            recyclerView.smoothScrollToPosition(a);
        }
    }

    /* renamed from: c */
    public final void mo96800c(C108232bc bcVar) {
        C28292j jVar = new C28292j(bcVar.mo95829g());
        jVar.mo33794h(1);
        bcVar.mo96608r(jVar);
        bcVar.f301035q = this.f301363d.mo26870b();
    }

    /* renamed from: g */
    public final int mo95829g() {
        return 51674;
    }

    /* renamed from: h */
    public final int mo95830h() {
        return 12;
    }

    /* renamed from: i */
    public final C28293k mo95831i() {
        C107571n nVar = this.f301361b;
        if (nVar.f299275f == null) {
            return C28293k.f76979c;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < nVar.f299271b.size(); i++) {
            C28292j jVar = ((C107572o) nVar.f299271b.get(i)).f299284b;
            aqp aqp = jVar.f76974b;
            aqp.copyOnWrite();
            aqs aqs = (aqs) aqp.instance;
            aqs aqs2 = aqs.f159780k;
            aqs.f159782a |= 2;
            aqs.f159784c = i;
            arrayList.add(C28293k.m52908e(jVar, new C28293k[0]));
        }
        return C28293k.m52907d(nVar.f299275f, arrayList);
    }

    /* renamed from: j */
    public final void mo95832j(C108241bl blVar, C108237bh bhVar) {
        RecyclerView recyclerView = blVar.f301085l;
        if (recyclerView != null) {
            if (recyclerView.mAdapter == null) {
                recyclerView.setAdapter(this.f301361b);
            }
            C0640fb fbVar = recyclerView.mAdapter;
            fbVar.getClass();
            C107571n nVar = (C107571n) fbVar;
            if (recyclerView.mLayout == null) {
                recyclerView.setLayoutManager(new MessageNotificationCarousel$MessageCarouselLayoutManager(this.f301362c, nVar));
            }
            C0653fo foVar = recyclerView.mLayout;
            foVar.getClass();
            MessageNotificationCarousel$MessageCarouselLayoutManager messageNotificationCarousel$MessageCarouselLayoutManager = (MessageNotificationCarousel$MessageCarouselLayoutManager) foVar;
            nVar.f299279j = messageNotificationCarousel$MessageCarouselLayoutManager;
            recyclerView.setItemAnimator(new C107577t());
            recyclerView.addOnScrollListener(new C108336ey(messageNotificationCarousel$MessageCarouselLayoutManager));
            C28295m.m52919e(recyclerView, this.f301030l);
        }
    }

    /* renamed from: k */
    public final void mo95833k(C108241bl blVar) {
        RecyclerView recyclerView = blVar.f301085l;
        if (recyclerView != null) {
            recyclerView.removeAllViews();
        }
    }

    /* renamed from: n */
    public final List mo96604n() {
        C58480gp gpVar = new C58480gp(4);
        if (!this.f301365f && !Collections.unmodifiableList(this.f301361b.f299271b).isEmpty()) {
            C108343fe feVar = new C108343fe(this.f301364e, this.f301362c, m180093e());
            mo96800c(feVar);
            gpVar.mo55395g(feVar);
            this.f301365f = true;
        }
        gpVar.mo55396h(C58485gu.m89841i(C58431eu.m89654f(Collections.unmodifiableList(this.f301361b.f299271b)).mo55246e(C108332eu.f301354a).mo55247g(new C108333ev(this)).mo55248h()));
        return gpVar.mo55394f();
    }

    /* renamed from: o */
    public final List mo96605o() {
        C58480gp gpVar = new C58480gp(4);
        if (!Collections.unmodifiableList(this.f301361b.f299271b).isEmpty()) {
            C108343fe feVar = new C108343fe(this.f301364e, this.f301362c, m180093e());
            mo96800c(feVar);
            gpVar.mo55395g(feVar);
        }
        gpVar.mo55396h(C58485gu.m89841i(C58431eu.m89654f(Collections.unmodifiableList(this.f301361b.f299271b)).mo55246e(C108334ew.f301356a).mo55247g(new C108335ex(this)).mo55248h()));
        return gpVar.mo55394f();
    }

    /* renamed from: r */
    public final void mo96608r(C28292j jVar) {
        this.f301030l = jVar;
        this.f301361b.f299275f = jVar;
    }
}
