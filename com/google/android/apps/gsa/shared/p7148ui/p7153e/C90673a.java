package com.google.android.apps.gsa.shared.p7148ui.p7153e;

import android.view.View;
import com.google.android.apps.gsa.search.shared.service.C87680ah;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.aas;
import com.google.android.apps.gsa.search.shared.service.p6935b.aat;
import com.google.android.apps.gsa.search.shared.service.p6935b.aau;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.p7148ui.C90700l;
import com.google.android.apps.gsa.shared.p7148ui.CoScrollContainer;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100062e;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7859d.C100077t;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.shared.ui.e.a */
/* compiled from: PG */
public final class C90673a {

    /* renamed from: a */
    public static final C59071e f253563a = C59071e.m91332i("com.google.android.apps.gsa.shared.ui.e.a");

    /* renamed from: b */
    public final CoScrollContainer f253564b;

    /* renamed from: c */
    public final C89911f f253565c;

    /* renamed from: d */
    public View f253566d;

    /* renamed from: e */
    public boolean f253567e;

    /* renamed from: f */
    public C100062e f253568f;

    /* renamed from: g */
    private final C87680ah f253569g;

    public C90673a(CoScrollContainer coScrollContainer, C89911f fVar, C87680ah ahVar) {
        this.f253564b = coScrollContainer;
        this.f253565c = fVar;
        this.f253569g = ahVar;
    }

    /* renamed from: a */
    public final int mo84968a() {
        C90700l lVar;
        CoScrollContainer coScrollContainer;
        View view = this.f253566d;
        if (view == null || (lVar = (C90700l) view.getLayoutParams()) == null || (coScrollContainer = lVar.f253712a) == null) {
            return 0;
        }
        return Math.max(0, lVar.f253716e - coScrollContainer.f253338a);
    }

    /* renamed from: b */
    public final void mo84969b() {
        CoScrollContainer coScrollContainer;
        mo84970c();
        View view = this.f253566d;
        if (view != null) {
            if (view.getParent() != null && this.f253566d.getParent() == (coScrollContainer = this.f253564b)) {
                coScrollContainer.removeView(this.f253566d);
            }
            this.f253566d = null;
        }
    }

    /* renamed from: c */
    public final void mo84970c() {
        View view = this.f253566d;
        if (view != null && this.f253567e) {
            this.f253567e = false;
            ((C90700l) view.getLayoutParams()).mo85031b(5);
            view.setFocusable(false);
            view.setFocusableInTouchMode(false);
            view.setVisibility(4);
            mo84971d(false);
        }
    }

    /* renamed from: d */
    public final void mo84971d(boolean z) {
        aat aat = (aat) aau.f237104c.createBuilder();
        aat.copyOnWrite();
        aau aau = (aau) aat.instance;
        aau.f237106a |= 1;
        aau.f237107b = z;
        C88489j jVar = new C88489j(C87739bu.WEBVIEW_VISIBLE);
        jVar.mo82014b(aas.f237103a, (aau) aat.build());
        this.f253569g.mo81961c(jVar.mo82013a());
        C100062e eVar = this.f253568f;
        if (eVar != null) {
            C100077t tVar = eVar.f279877a;
            if (z) {
                tVar.f279897c.mo91716e();
            }
        }
    }
}
