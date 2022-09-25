package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe;

import android.support.p031v4.app.C0154a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.api.controller.C45985aw;
import com.google.apps.tiktok.account.api.controller.C45986ax;
import com.google.apps.tiktok.account.api.controller.C45987ay;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.oobe.bh */
/* compiled from: PG */
final class C124837bh implements C45987ay {

    /* renamed from: a */
    final /* synthetic */ C124838bi f344407a;

    public C124837bh(C124838bi biVar) {
        this.f344407a = biVar;
    }

    /* renamed from: a */
    public final void mo19982a(C45985aw awVar) {
        C58976aa aaVar = C58975e.f156826a;
        AccountId accountId = awVar.f120815a.f120816a;
        C124845bp bpVar = (C124845bp) C124846bq.f344431d.createBuilder();
        C124847br brVar = (C124847br) C124848bs.f344436c.createBuilder();
        C124844bo boVar = this.f344407a.f344410c;
        brVar.copyOnWrite();
        C124848bs bsVar = (C124848bs) brVar.instance;
        boVar.getClass();
        bsVar.f344439b = boVar;
        bsVar.f344438a |= 1;
        bpVar.copyOnWrite();
        C124846bq bqVar = (C124846bq) bpVar.instance;
        C124848bs bsVar2 = (C124848bs) brVar.build();
        bsVar2.getClass();
        bqVar.f344434b = bsVar2;
        bqVar.f344433a |= 1;
        bpVar.copyOnWrite();
        C124846bq bqVar2 = (C124846bq) bpVar.instance;
        bqVar2.f344433a |= 2;
        bqVar2.f344435c = R.navigation.assistant_bisto_oobe_nav_graph;
        C124817at atVar = new C124817at();
        C68324h.m98669f(atVar);
        C47247a.m84047b(atVar, accountId);
        C47243l.m84039a(atVar, (C124846bq) bpVar.build());
        C0154a aVar = new C0154a(this.f344407a.f344409b.f727a.f739a.f744e);
        aVar.mo689v(R.id.assistant_bisto_oobe_content_frame, atVar, (String) null);
        aVar.mo518o(atVar);
        aVar.mo509f();
    }

    /* renamed from: b */
    public final void mo19983b(Throwable th) {
        C59104x c = C124838bi.f344408a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "OobeActivity");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36335)).mo56386p("No Account");
        this.f344407a.f344409b.finish();
    }

    /* renamed from: c */
    public final /* synthetic */ void mo19984c() {
    }

    /* renamed from: d */
    public final void mo19985d(C45986ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        C124838bi biVar = this.f344407a;
        C28306ab abVar = biVar.f344412e;
        OobeActivity oobeActivity = biVar.f344409b;
        C28313c a = biVar.f344413f.mo33805a(C28427h.m53115a(155208));
        a.mo33861i(C28439i.f77216b);
        a.mo33859g(C28375ak.m53061c(57255));
        a.mo33859g(C45954d.m82060a(axVar.f120816a));
        int i = C28485y.f77298f;
        abVar.mo33801b(oobeActivity.mo1322k().mo1177e(16908290), a);
    }
}
