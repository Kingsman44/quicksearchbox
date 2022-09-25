package com.google.android.apps.gsa.staticplugins.opa;

import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.search.core.p6507ag.p6508a.C84469a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.apps.gsa.staticplugins.opa.audio.C107619d;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8331bc.C107955f;
import com.google.android.apps.gsa.staticplugins.opa.translator.offline.OfflineSubController;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113587a;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113588aa;
import com.google.android.apps.gsa.staticplugins.opa.translator.p8590a.C113613z;
import com.google.android.apps.gsa.staticplugins.opa.util.C113812ca;
import com.google.android.apps.gsa.staticplugins.opa.util.C113892w;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.gn */
/* compiled from: PG */
public final /* synthetic */ class C109077gn implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C109258hw f303688a;

    /* renamed from: b */
    public final /* synthetic */ C51809dy f303689b;

    public /* synthetic */ C109077gn(C109258hw hwVar, C51809dy dyVar) {
        this.f303688a = hwVar;
        this.f303689b = dyVar;
    }

    public final void run() {
        C109258hw hwVar = this.f303688a;
        C51809dy dyVar = this.f303689b;
        C113588aa aaVar = (C113588aa) hwVar.f304291n.mo27525b();
        C113892w wVar = hwVar.f304281d;
        C104149a aVar = hwVar.f304303z;
        wVar.getClass();
        C107698i iVar = (C107698i) aaVar.f314509a.mo17428b();
        iVar.getClass();
        Query query = (Query) aaVar.f314510b.mo17428b();
        query.getClass();
        C113812ca caVar = (C113812ca) aaVar.f314511c.mo17428b();
        caVar.getClass();
        C107619d dVar = (C107619d) aaVar.f314512d.mo17428b();
        dVar.getClass();
        C109738nl nlVar = (C109738nl) aaVar.f314513e.mo17428b();
        nlVar.getClass();
        C107955f fVar = (C107955f) aaVar.f314514f.mo17428b();
        fVar.getClass();
        C86124t tVar = (C86124t) aaVar.f314515g.mo17428b();
        tVar.getClass();
        aVar.getClass();
        SharedPreferences sharedPreferences = (SharedPreferences) aaVar.f314516h.mo17428b();
        sharedPreferences.getClass();
        C21370a aVar2 = (C21370a) aaVar.f314517i.mo17428b();
        aVar2.getClass();
        C113587a aVar3 = (C113587a) aaVar.f314518j.mo17428b();
        aVar3.getClass();
        OfflineSubController offlineSubController = (OfflineSubController) aaVar.f314519k.mo17428b();
        offlineSubController.getClass();
        C84469a aVar4 = (C84469a) aaVar.f314520l.mo17428b();
        aVar4.getClass();
        C113613z zVar = r4;
        C113613z zVar2 = new C113613z(wVar, iVar, query, caVar, dVar, nlVar, fVar, tVar, aVar, sharedPreferences, aVar2, aVar3, offlineSubController, aVar4);
        hwVar.f304293p = zVar;
        View b = hwVar.f304293p.mo19708b(hwVar.f304284g, new C109209hp(hwVar, C58836b.f156633a), hwVar.f304299v);
        hwVar.f304293p.mo19703G(dyVar);
        FrameLayout frameLayout = (FrameLayout) hwVar.f304280c.mo95419h().findViewById(R.id.immersive_freeform_action_container);
        frameLayout.removeAllViews();
        frameLayout.addView(b, 0, new ViewGroup.LayoutParams(-1, -1));
        hwVar.f304281d.mo98093y(hwVar.f304293p, true);
    }
}
