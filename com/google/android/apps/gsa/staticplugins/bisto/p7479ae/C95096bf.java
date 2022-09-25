package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import android.util.Base64;
import com.google.android.apps.gsa.search.core.p6816p.C86253h;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87706ao;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87707ap;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88058np;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88060nr;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88062nt;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96467ay;
import com.google.android.p10712d.C142523o;
import com.google.android.p10712d.C142524p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.bf */
/* compiled from: PG */
final class C95096bf extends C95095be {

    /* renamed from: a */
    final /* synthetic */ C95097bg f266014a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95096bf(C95097bg bgVar) {
        super(bgVar, "RUNNING_ACTION");
        this.f266014a = bgVar;
    }

    /* renamed from: a */
    public final void mo89003a() {
        super.mo89003a();
        this.f266014a.f266044p.mo89277r(7);
    }

    /* renamed from: it */
    public final void mo89005it(ServiceEventData serviceEventData) {
        C89885b bVar = C89885b.UNKNOWN;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        int ordinal = a.ordinal();
        if (ordinal == 151) {
            C59104x b = C95097bg.f266015a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) b).mo56372aa(18036)).mo56386p("Custom device action received");
            C63088z zVar = ((C87706ao) serviceEventData.mo81918e(C87707ap.f237171a)).f237170b;
            try {
                zVar = C63088z.m96139A(Base64.decode(zVar.mo59174N(), 0));
            } catch (IllegalArgumentException e) {
                C59104x d = C95097bg.f266015a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(18037)).mo56386p("Failed to Base64 decode device action payload");
            }
            C142523o oVar = (C142523o) C142524p.f386746c.createBuilder();
            oVar.copyOnWrite();
            C142524p pVar = (C142524p) oVar.instance;
            zVar.getClass();
            pVar.f386748a = 1 | pVar.f386748a;
            pVar.f386749b = zVar;
            this.f266014a.f266044p.mo89257D(15, 3, ((C142524p) oVar.build()).toByteArray());
        } else if (ordinal == 153) {
            C59104x b2 = C95097bg.f266015a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) b2).mo56372aa(18032)).mo56386p("handleGenericEvent: BISTO_NOTIFY_COMPLETED_CONVERSATION");
            this.f266014a.mo89018e("AUDIO_DELAY_COMPENSATION");
        } else if (ordinal == 155) {
            C59104x b3 = C95097bg.f266015a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "QueryHandler");
            ((C59052c) ((C59052c) b3).mo56372aa(18033)).mo56386p("handleGenericEvent: BISTO_NOTIFY_REQUEST_FOLLOW_ON");
            C62940bt btVar = C88058np.f238103a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (!uoVar.f169962ag.mo58857o(r0.f169971d)) {
                C59104x c = C95097bg.f266015a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) c).mo56372aa(18035)).mo56386p("NOTIFY_REQUEST_FOLLOW_ON - no extension. Ignoring");
                return;
            }
            this.f266014a.f266019C = true;
            int a2 = C88060nr.m142779a(((C88062nt) serviceEventData.mo81918e(C88058np.f238103a)).f238108b);
            if (a2 == 0) {
                a2 = 1;
            }
            int i = a2 - 1;
            if (i == 1) {
                this.f266014a.f266020D = C86253h.CONVERSATION_DELTA;
            } else if (i == 2) {
                this.f266014a.f266020D = C86253h.ACTION_V2;
            } else if (i != 3) {
                C59104x c2 = C95097bg.f266015a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) c2).mo56372aa(18034)).mo56386p("Unknown response type for follow on");
                this.f266014a.f266020D = null;
            } else {
                this.f266014a.f266020D = C86253h.LEGACY_ASSISTANT_RESPONSE;
            }
            this.f266014a.mo89018e("AUDIO_DELAY_COMPENSATION");
        } else if (ordinal != 161) {
            C59104x c3 = C95097bg.f266015a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "QueryHandler");
            C59052c cVar = (C59052c) ((C59052c) c3).mo56372aa(18031);
            String str = this.f266012d;
            C88244um a3 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a3 == null) {
                a3 = C88244um.ATTACH_WEBVIEW;
            }
            cVar.mo56354G("In state: %s unknown event: %s", str, a3);
        } else {
            C59071e eVar = C95097bg.f266015a;
            C58976aa aaVar = C58975e.f156826a;
            if (!this.f266014a.f266039k.mo83561p()) {
                C59104x b4 = C95097bg.f266015a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "QueryHandler");
                ((C59052c) ((C59052c) b4).mo56372aa(18039)).mo56386p("Cannot handle BISTO_PR_REQUEST_PERMISSION because Bisto PR is not supported.");
                return;
            }
            ((C96467ay) this.f266014a.f266048t.mo27525b()).mo83494a();
        }
    }
}
