package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7983g;

import androidx.p104d.p105a.C2164c;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.assistant.p3861at.act;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.g.ax */
/* compiled from: PG */
final class C101831ax extends k {

    /* renamed from: a */
    final /* synthetic */ C2164c f284022a;

    public C101831ax(C2164c cVar) {
        this.f284022a = cVar;
    }

    /* renamed from: gn */
    public final void mo92600gn(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C101832ay.f284023c.mo56225c()).mo56382g(th)).mo56372aa(20686)).mo56386p("fetchUiVoiceSettings.onFailure");
        this.f284022a.mo5439d(new Exception("Unable to fetch settings."));
    }

    /* renamed from: go */
    public final /* bridge */ /* synthetic */ void mo92601go(Object obj) {
        ((C59052c) ((C59052c) C101832ay.f284023c.mo56224b()).mo56372aa(20687)).mo56386p("fetchUiVoiceSettings.onSuccess");
        this.f284022a.mo5437b((act) obj);
    }
}
