package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e;

import com.google.android.apps.gsa.search.core.p6491a.C84367m;
import com.google.android.apps.gsa.search.core.p6491a.C84373s;
import com.google.android.apps.gsa.search.core.p6519al.p6606bp.C85005h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.apps.gsa.staticplugins.opa.p8319bb.C107932g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52077ej;
import com.google.assistant.p3897e.p3921j.C52078ek;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.ad */
/* compiled from: PG */
public final class C107852ad implements C90991b {

    /* renamed from: a */
    public static final C59071e f300120a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.bb.e.ad");

    /* renamed from: b */
    public final C84373s f300121b;

    /* renamed from: c */
    public final C107932g f300122c;

    /* renamed from: d */
    public final C85005h f300123d;

    /* renamed from: e */
    public final C22871g f300124e;

    /* renamed from: f */
    private final C84373s f300125f;

    /* renamed from: g */
    private final C86124t f300126g;

    /* renamed from: h */
    private final C68214a f300127h;

    public C107852ad(C84373s sVar, C84373s sVar2, C86124t tVar, C107932g gVar, C85005h hVar, C22871g gVar2, C68214a aVar) {
        this.f300121b = sVar;
        this.f300125f = sVar2;
        this.f300126g = tVar;
        this.f300122c = gVar;
        this.f300123d = hVar;
        this.f300124e = gVar2;
        this.f300127h = aVar;
    }

    /* renamed from: a */
    public final void mo96317a(int i, C51805du duVar, C58833ax axVar) {
        C58976aa aaVar = C58975e.f156826a;
        C52077ej ejVar = (C52077ej) C52078ek.f136671f.createBuilder();
        ejVar.copyOnWrite();
        C52078ek ekVar = (C52078ek) ejVar.instance;
        duVar.getClass();
        ekVar.f136675c = duVar;
        ekVar.f136674b = 5;
        mo96318b(i, (C52078ek) ejVar.build(), axVar);
    }

    /* renamed from: b */
    public final void mo96318b(int i, C52078ek ekVar, C58833ax axVar) {
        if (i == 0) {
            if (this.f300126g.mo79746e(C90014bt.f247183cO) && ekVar.f136674b == 5 && !Boolean.valueOf(((C51805du) ekVar.f136675c).f135927b.equals("notification.notification_request")).booleanValue()) {
                C89856f fVar = new C89856f();
                fVar.f246201a = C89849ae.OPA_CLIENT_INPUT_SUBMIT;
                if (axVar.mo56113h() && (axVar.mo56107c() instanceof C84367m)) {
                    fVar.mo83701c("rId", Long.toString(((C84367m) axVar.mo56107c()).f229625a.f252749G));
                }
                ((C89859i) this.f300127h.mo27525b()).mo74236a(fVar.mo83699a());
            }
            this.f300121b.mo77931a().mo77920b(ekVar, axVar);
        } else if (i == 3) {
            this.f300125f.mo77931a().mo77920b(ekVar, axVar);
        } else {
            C59104x c = f300120a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClientInputSubCtrl");
            ((C59052c) ((C59052c) c).mo56372aa(26254)).mo56386p("OPA session only supports ConversationClientType.OPA_AGSA and OPA_AGSA_HISTORY.");
        }
    }

    /* renamed from: c */
    public final void mo96319c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f300121b.mo77931a().mo77926h();
    }

    /* renamed from: e */
    public final void mo96320e(C51805du duVar) {
        C58976aa aaVar = C58975e.f156826a;
        mo96317a(0, duVar, C58836b.f156633a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C91006f e = fVar.mo85281e((Object) null);
        e.mo85279c("opa_session_conversation_client").mo85276a(C90752i.m148229c(this.f300121b.mo77931a().mo77921c()));
        e.mo85279c("opa_history_conversation_client").mo85276a(C90752i.m148229c(this.f300125f.mo77931a().mo77921c()));
    }
}
