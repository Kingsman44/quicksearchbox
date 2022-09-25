package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8631e;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.search.shared.service.p6935b.aae;
import com.google.android.apps.gsa.search.shared.service.p6935b.aag;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f.C114741k;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.e.e */
/* compiled from: PG */
public final class C114725e implements C87682aj {

    /* renamed from: c */
    private static final C59071e f318345c = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.e.e");

    /* renamed from: a */
    public final C107698i f318346a;

    /* renamed from: b */
    public final C107710u f318347b;

    /* renamed from: d */
    private final Context f318348d;

    /* renamed from: e */
    private final C86124t f318349e;

    /* renamed from: f */
    private final C22871g f318350f;

    /* renamed from: g */
    private final C68214a f318351g;

    /* renamed from: h */
    private SettableFuture f318352h = new SettableFuture();

    /* renamed from: i */
    private boolean f318353i = false;

    public C114725e(Context context, C86124t tVar, C22871g gVar, C107698i iVar, C107710u uVar, C68214a aVar) {
        this.f318348d = context;
        this.f318349e = tVar;
        this.f318350f = gVar;
        this.f318346a = iVar;
        this.f318347b = uVar;
        this.f318351g = aVar;
        if (C36619a.m65148d(context)) {
            uVar.mo96220c(this, C88244um.VALID_UNREAD_MESSAGES);
            return;
        }
        C59104x d = f318345c.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ZSMessageManager");
        ((C59052c) ((C59052c) d).mo56372aa(29370)).mo56386p("User has not granted notification access permission, return empty list.");
        this.f318352h.mo57356n(new ArrayList());
    }

    /* renamed from: d */
    private final void m190170d() {
        if (C36619a.m65148d(this.f318348d)) {
            this.f318346a.mo96219b(new C88489j(C87739bu.FETCH_VALID_UNREAD_MESSAGES).mo82013a());
        }
    }

    /* renamed from: a */
    public final C60870cx mo101543a() {
        C89849ae aeVar = C89849ae.OPA_ZERO_STATE_MESSAGE_MANAGER_START_INIT;
        C58976aa aaVar = C58975e.f156826a;
        ((C89859i) this.f318351g.mo27525b()).mo83702b(aeVar);
        if (!this.f318353i) {
            m190170d();
            this.f318353i = true;
        }
        C60870cx e = C90877ak.m148471e(this.f318352h, this.f318349e.mo79743a(C90014bt.f247829op), TimeUnit.SECONDS, this.f318350f);
        C114741k.m190203a(e, (C89859i) this.f318351g.mo27525b(), this.f318350f, C89849ae.OPA_ZERO_STATE_MESSAGE_MANAGER_FINISH_INIT, C89849ae.OPA_ZERO_STATE_MESSAGE_MANAGER_INIT_TIMEOUT);
        return e;
    }

    /* renamed from: b */
    public final void mo101544b() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f318352h.isDone()) {
            this.f318352h = new SettableFuture();
        }
        m190170d();
        this.f318353i = true;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a != C88244um.VALID_UNREAD_MESSAGES) {
            C59104x d = f318345c.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ZSMessageManager");
            C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(29375);
            C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a2 == null) {
                a2 = C88244um.ATTACH_WEBVIEW;
            }
            cVar.mo56389s("Wrong service event passed: %s", a2);
            return;
        }
        C62940bt btVar = aae.f237070a;
        C88246uo uoVar = serviceEventData.f236959a;
        C62940bt r0 = C62942bv.checkIsLite(btVar);
        uoVar.mo58887l(r0);
        if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
            aag aag = (aag) serviceEventData.mo81918e(aae.f237070a);
            if (this.f318352h.isDone()) {
                this.f318352h = new SettableFuture();
            }
            this.f318352h.mo57356n(aag.f237073a);
        }
    }
}
