package com.google.android.apps.gsa.staticplugins.opa.zerostate;

import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114735e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114839ci;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.ao */
/* compiled from: PG */
public final /* synthetic */ class C114565ao implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114575ay f317698a;

    public /* synthetic */ C114565ao(C114575ay ayVar) {
        this.f317698a = ayVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114575ay ayVar = this.f317698a;
        C59104x c = C114575ay.f317711a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ZSMainController");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Exception) obj)).mo56372aa(29172)).mo56386p("Failed to load Zero State section data.");
        ((C89859i) ayVar.f317751k.mo27525b()).mo83702b(C89849ae.OPA_ZERO_STATE_FAIL_TO_LOAD_SECTION_DATA);
        ((C114735e) ayVar.f317754n.mo27525b()).mo101556d(C89849ae.OPA_ANDROID_ZERO_STATE_RENDER_TIMEOUT);
        C114711cl clVar = ayVar.f317713B;
        clVar.getClass();
        clVar.f318305a = C58485gu.m89845m();
        clVar.mObservable.mo2879a();
        ViewGroup viewGroup = ayVar.f317765y;
        viewGroup.getClass();
        viewGroup.clearAnimation();
        ViewGroup viewGroup2 = ayVar.f317764x;
        if (viewGroup2 != null && viewGroup2.getWindowVisibility() == 0 && ayVar.f317764x.getWindowToken() != null) {
            C114839ci ciVar = ayVar.f317750j;
            ViewGroup viewGroup3 = ayVar.f317765y;
            viewGroup3.getClass();
            RecyclerView recyclerView = ayVar.f317714C;
            recyclerView.getClass();
            ciVar.mo101651d(viewGroup3, recyclerView, C53306j.MAIN_APP).start();
            View view = ayVar.f317716E;
            view.getClass();
            view.setVisibility(8);
            ayVar.f317747g.mo101662a(new C114570at(ayVar));
            ayVar.mo101426p();
        }
    }
}
