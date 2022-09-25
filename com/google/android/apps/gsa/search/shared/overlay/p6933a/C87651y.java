package com.google.android.apps.gsa.search.shared.overlay.p6933a;

import android.view.View;
import android.widget.ScrollView;
import com.google.android.apps.gsa.searchbox.client.gsa.p6953ui.C88686i;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.shared.monet.C90163ad;
import com.google.android.apps.gsa.shared.monet.p7070b.p7075ac.C90183b;
import com.google.android.apps.gsa.shared.p7148ui.SuggestionGridLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.tools.childstub.p1916ui.ChildStub;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.a.y */
/* compiled from: PG */
final class C87651y extends C90163ad {

    /* renamed from: a */
    final /* synthetic */ C87625ad f236911a;

    public C87651y(C87625ad adVar) {
        this.f236911a = adVar;
    }

    /* renamed from: a */
    public final void mo76767a(C22939d dVar) {
        SuggestionGridLayout suggestionGridLayout = (SuggestionGridLayout) dVar.mo28297il();
        suggestionGridLayout.mo84845g();
        C87625ad adVar = this.f236911a;
        adVar.f236881w = suggestionGridLayout;
        if (adVar.f236772B == null) {
            adVar.f236772B = (ChildStub) adVar.f236835al.findViewById(R.id.search_suggestions_container_stub);
        }
        ChildStub childStub = this.f236911a.f236772B;
        if (childStub != null) {
            childStub.mo28718c(suggestionGridLayout);
        }
        C87625ad adVar2 = this.f236911a;
        adVar2.f236847ax = (C90183b) dVar;
        adVar2.f236787Q = adVar2.f236847ax.mo83927a();
        this.f236911a.f236847ax.mo83930d();
        C87625ad adVar3 = this.f236911a;
        C90183b bVar = adVar3.f236847ax;
        C88709j b = adVar3.mo76806b();
        C87625ad adVar4 = this.f236911a;
        bVar.mo83931e(b, adVar4.f236771A, adVar4.f236774D, adVar4.f236784N, adVar4.f236785O, adVar4.f236786P);
        C87625ad adVar5 = this.f236911a;
        adVar5.f236787Q.mo82310j(adVar5.f236773C);
        C87625ad adVar6 = this.f236911a;
        adVar6.mo81800ag(C87625ad.m142450aq(adVar6.f236831ah));
        C87625ad adVar7 = this.f236911a;
        if (adVar7.f236826ac != 0) {
            C88686i iVar = adVar7.f236787Q;
            C58976aa aaVar = C58975e.f156826a;
            iVar.mo82307I(adVar7.f236881w);
        }
        C87625ad adVar8 = this.f236911a;
        if (adVar8.f236808aK) {
            adVar8.f236787Q.mo82317z();
            this.f236911a.f236808aK = false;
        }
        C87625ad adVar9 = this.f236911a;
        Response response = adVar9.f236807aJ;
        if (response != null) {
            adVar9.mo81776I(response);
            this.f236911a.f236807aJ = null;
        }
        this.f236911a.f236847ax.mo83928b();
        View view = this.f236911a.f236882x;
        if (view instanceof ScrollView) {
            ScrollView scrollView = (ScrollView) view;
            view.addOnLayoutChangeListener(new C87649w(this));
            scrollView.getViewTreeObserver().addOnScrollChangedListener(new C87650x(this, scrollView));
        }
    }

    /* renamed from: b */
    public final void mo76768b(C22939d dVar) {
        C87625ad adVar = this.f236911a;
        adVar.f236787Q = null;
        ChildStub childStub = adVar.f236772B;
        if (childStub != null) {
            childStub.mo28717b();
        }
    }
}
