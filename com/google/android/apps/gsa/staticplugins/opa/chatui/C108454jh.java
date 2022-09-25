package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gsa.search.shared.p6928f.C87545a;
import com.google.android.apps.gsa.search.shared.p6928f.C87546b;
import com.google.android.apps.gsa.search.shared.p6928f.C87552h;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88136qm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88138qo;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107710u;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3910e.p3911a.C51205t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.jh */
/* compiled from: PG */
public final class C108454jh implements C87682aj {

    /* renamed from: d */
    private static final C59071e f301671d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.chatui.jh");

    /* renamed from: a */
    public final C107710u f301672a;

    /* renamed from: b */
    public C88138qo f301673b;

    /* renamed from: c */
    public C87546b f301674c;

    /* renamed from: e */
    private final C68214a f301675e;

    /* renamed from: f */
    private final C91097g f301676f;

    /* renamed from: g */
    private final Context f301677g;

    public C108454jh(C91097g gVar, C68214a aVar, C107710u uVar, Context context) {
        this.f301675e = aVar;
        this.f301672a = uVar;
        this.f301676f = gVar;
        this.f301677g = context;
    }

    /* renamed from: b */
    private final C108204ab m180292b() {
        String string = this.f301677g.getResources().getString(R.string.history_carousel_background_text);
        C91097g gVar = this.f301676f;
        gVar.getClass();
        C108204ab abVar = new C108204ab(string, gVar);
        abVar.f301034p = 2;
        return abVar;
    }

    /* renamed from: a */
    public final void mo96896a(C88138qo qoVar) {
        if (this.f301674c == null) {
            this.f301673b = qoVar;
            return;
        }
        C108303dt dtVar = (C108303dt) this.f301675e.mo27525b();
        C108212aj ajVar = null;
        if ((qoVar.f238259a & 1) != 0) {
            try {
                byte[] N = qoVar.f238260b.mo59174N();
                if (N != null) {
                    C54201r rVar = (C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, N, C62921ba.m95368a());
                    if (!(rVar == null || (rVar.f142245a & 1) == 0)) {
                        C87546b bVar = this.f301674c;
                        if (bVar != null) {
                            C87545a a = bVar.mo77519a(N);
                            if (a != null) {
                                if (a.mo25098kH() != null) {
                                    if (rVar.f142247c.size() != 0) {
                                        C87546b bVar2 = this.f301674c;
                                        bVar2.getClass();
                                        bVar2.mo77520b(N);
                                    }
                                    View kH = a.mo25098kH();
                                    kH.getClass();
                                    C108212aj ajVar2 = new C108212aj(kH, 4);
                                    ajVar2.f301034p = 2;
                                    ajVar2.mo96596c(rVar, a, (C51205t) null);
                                    ajVar = ajVar2;
                                }
                            }
                        }
                    }
                }
                dtVar.mo96748k(ajVar, m180292b());
            } catch (C87552h | C62974ct e) {
                C59104x d = f301671d.mo56226d();
                d.mo56378ag(C58975e.f156826a, "WebAnswerHC");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(24058)).mo56386p("Failed to build card item.");
            }
        } else {
            dtVar.mo96748k((C108212aj) null, m180292b());
        }
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a == C88244um.WEB_ANSWER_HISTORY_RESPONSE) {
            C62940bt btVar = C88136qm.f238256a;
            C88246uo uoVar = serviceEventData.f236959a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            uoVar.mo58887l(r0);
            if (uoVar.f169962ag.mo58857o(r0.f169971d)) {
                mo96896a((C88138qo) serviceEventData.mo81918e(C88136qm.f238256a));
            }
        }
    }
}
