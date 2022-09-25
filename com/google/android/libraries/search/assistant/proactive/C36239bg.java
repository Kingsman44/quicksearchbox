package com.google.android.libraries.search.assistant.proactive;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119650a;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119670b;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119748c;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.C119908e;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119785ag;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119793ao;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119816bk;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119837ce;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119840ch;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119841ci;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119844cl;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119867dh;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119885dz;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.android.libraries.search.assistant.p2705n.p2706a.p2707a.C34822b;
import com.google.android.libraries.search.assistant.proactive.p2771c.C36243b;
import com.google.android.libraries.search.assistant.proactive.p2771c.C36245d;
import com.google.android.libraries.search.p2871b.p2872a.p2881i.C37197a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.Set;

/* renamed from: com.google.android.libraries.search.assistant.proactive.bg */
/* compiled from: PG */
final class C36239bg implements C119670b {

    /* renamed from: a */
    final /* synthetic */ C36240bh f94650a;

    public C36239bg(C36240bh bhVar) {
        this.f94650a = bhVar;
    }

    /* renamed from: a */
    public final C119908e mo40056a(C51809dy dyVar, C119793ao aoVar) {
        C59104x b = C36240bh.f94651a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52246)).mo56389s("#Prefetch for ClientOp %s", dyVar);
        return this.f94650a.f94654d.mo104425a(dyVar, aoVar);
    }

    /* renamed from: b */
    public final C60870cx mo40057b(C119816bk bkVar) {
        C36245d dVar = this.f94650a.f94655e;
        C52091ex exVar = bkVar.f333732b;
        if (exVar == null) {
            exVar = C52091ex.f136710b;
        }
        C36243b bVar = new C36243b(dVar, exVar);
        return C60856cj.m92903l(C47810es.m84977q(bVar), dVar.f94678b);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo40058c(C119904w wVar) {
    }

    /* renamed from: d */
    public final /* synthetic */ void mo40059d(C119785ag agVar) {
    }

    /* renamed from: e */
    public final /* synthetic */ void mo40060e(C119748c cVar) {
    }

    /* renamed from: f */
    public final void mo40061f(Throwable th) {
        C59104x d = C36240bh.f94651a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
        ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(52247)).mo56386p("ApaConversationConnection disconnected");
    }

    /* renamed from: g */
    public final void mo40062g(C119844cl clVar) {
        C119840ch chVar;
        C119840ch chVar2;
        C58976aa aaVar = C58975e.f156826a;
        Set set = this.f94650a.f94657g;
        C119834cb cbVar = clVar.f333792c;
        if (cbVar == null) {
            cbVar = C119834cb.f333765b;
        }
        if (set.contains(cbVar)) {
            Set set2 = this.f94650a.f94657g;
            C119834cb cbVar2 = clVar.f333792c;
            if (cbVar2 == null) {
                cbVar2 = C119834cb.f333765b;
            }
            set2.remove(cbVar2);
            int b = C119841ci.m198738b(clVar.f333790a);
            int i = b - 1;
            if (b == 0) {
                throw null;
            } else if (i == 0) {
                C59104x b2 = C36240bh.f94651a.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
                ((C59052c) ((C59052c) b2).mo56372aa(52254)).mo56386p("First interaction received with SUCCESS status");
                this.f94650a.f94660j.incrementAndGet();
                this.f94650a.f94653c.mo19974a(C37197a.f98674j);
            } else if (i == 1) {
                C59104x c = C36240bh.f94651a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
                ((C59052c) ((C59052c) c).mo56372aa(52255)).mo56386p("First interaction received with CANCELLATION status");
                this.f94650a.f94653c.mo19974a(C37197a.f98676l.mo40805c(C62722b.CANCELLED));
                this.f94650a.mo40067b();
            } else if (i != 2) {
                C59104x c2 = C36240bh.f94651a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
                ((C59052c) ((C59052c) c2).mo56372aa(52253)).mo56386p("First interaction received non-success state, disconnect if there is an active connection");
                this.f94650a.f94653c.mo19974a(C37197a.f98676l.mo40805c(C62722b.UNKNOWN));
                this.f94650a.mo40067b();
            } else {
                C59104x c3 = C36240bh.f94651a.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
                C59052c cVar = (C59052c) c3;
                if (clVar.f333790a == 4) {
                    chVar2 = (C119840ch) clVar.f333791b;
                } else {
                    chVar2 = C119840ch.f333779b;
                }
                C34822b bVar = chVar2.f333781a;
                if (bVar == null) {
                    bVar = C34822b.f92358d;
                }
                ((C59052c) ((C59052c) cVar.mo56382g(C34830d.m63594a(bVar))).mo56372aa(52256)).mo56386p("First interaction received with FAILURE status");
                this.f94650a.f94653c.mo19974a(C37197a.f98676l.mo40805c(C62722b.INTERNAL));
                this.f94650a.mo40067b();
            }
        } else {
            int b3 = C119841ci.m198738b(clVar.f333790a);
            int i2 = b3 - 1;
            if (b3 != 0) {
                if (i2 == 0) {
                    C59104x b4 = C36240bh.f94651a.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
                    ((C59052c) ((C59052c) b4).mo56372aa(52250)).mo56386p("Second interaction received with SUCCESS status");
                    this.f94650a.f94653c.mo19974a(C37197a.f98675k.mo40805c(C62722b.OK));
                } else if (i2 == 1) {
                    C59104x c4 = C36240bh.f94651a.mo56225c();
                    c4.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
                    ((C59052c) ((C59052c) c4).mo56372aa(52251)).mo56386p("Second interaction received with CANCELLATION status");
                    this.f94650a.f94653c.mo19974a(C37197a.f98677m.mo40805c(C62722b.CANCELLED));
                } else if (i2 != 2) {
                    this.f94650a.f94653c.mo19974a(C37197a.f98677m.mo40805c(C62722b.UNKNOWN));
                    C59104x c5 = C36240bh.f94651a.mo56225c();
                    c5.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
                    ((C59052c) ((C59052c) c5).mo56372aa(52249)).mo56386p("Second interaction received non-success state");
                } else {
                    C59104x c6 = C36240bh.f94651a.mo56225c();
                    c6.mo56378ag(C58975e.f156826a, "NTF.TorusConvMgr");
                    C59052c cVar2 = (C59052c) c6;
                    if (clVar.f333790a == 4) {
                        chVar = (C119840ch) clVar.f333791b;
                    } else {
                        chVar = C119840ch.f333779b;
                    }
                    C34822b bVar2 = chVar.f333781a;
                    if (bVar2 == null) {
                        bVar2 = C34822b.f92358d;
                    }
                    ((C59052c) ((C59052c) cVar2.mo56382g(C34830d.m63594a(bVar2))).mo56372aa(52252)).mo56386p("Second interaction received with FAILURE status");
                    this.f94650a.f94653c.mo19974a(C37197a.f98677m.mo40805c(C62722b.INTERNAL));
                }
                this.f94650a.f94660j.decrementAndGet();
                this.f94650a.mo40067b();
                return;
            }
            throw null;
        }
    }

    /* renamed from: h */
    public final /* synthetic */ void mo40063h(C119837ce ceVar) {
    }

    /* renamed from: i */
    public final /* synthetic */ void mo40064i(C119867dh dhVar) {
    }

    /* renamed from: j */
    public final /* synthetic */ void mo40065j(C119885dz dzVar) {
    }

    /* renamed from: k */
    public final /* synthetic */ C60870cx mo40066k() {
        return C119650a.m198564a();
    }
}
