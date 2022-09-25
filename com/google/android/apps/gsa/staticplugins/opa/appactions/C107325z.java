package com.google.android.apps.gsa.staticplugins.opa.appactions;

import com.google.android.apps.gsa.assistant.shared.appactions.ChatBubbleDialogLayout;
import com.google.android.apps.gsa.assistant.shared.appactions.v;
import com.google.android.apps.gsa.assistant.shared.appactions.w;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.assistant.p3825an.p3830c.p3831a.C49255aa;
import com.google.assistant.p3861at.C49823ah;
import com.google.assistant.p3861at.C49826ak;
import com.google.assistant.p3861at.C49838aw;
import com.google.assistant.p3861at.C49865bw;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.z */
/* compiled from: PG */
public final /* synthetic */ class C107325z implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C107238ag f298671a;

    public /* synthetic */ C107325z(C107238ag agVar) {
        this.f298671a = agVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C107238ag agVar = this.f298671a;
        C49865bw bwVar = (C49865bw) obj;
        agVar.f298448h.mo65295b(C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_RESPONSE_RECEIVED);
        C107308i iVar = agVar.f298461u;
        iVar.getClass();
        C107307h b = iVar.mo95850b();
        C49838aw awVar = bwVar.f129582b;
        if (awVar == null) {
            awVar = C49838aw.f129504g;
        }
        b.mo95846b(awVar.f129507b);
        agVar.f298461u = b.mo95845a();
        C49826ak akVar = bwVar.f129581a;
        if (akVar == null) {
            akVar = C49826ak.f129462q;
        }
        C49823ah ahVar = (C49823ah) akVar.toBuilder();
        ahVar.copyOnWrite();
        C49826ak akVar2 = (C49826ak) ahVar.instance;
        akVar2.f129472i = C49255aa.m85392a(5);
        akVar2.f129464a |= 64;
        C49826ak akVar3 = (C49826ak) ahVar.build();
        C49838aw awVar2 = bwVar.f129582b;
        if (awVar2 == null) {
            awVar2 = C49838aw.f129504g;
        }
        agVar.f298462v = C58833ax.m90834k(awVar2);
        ChatBubbleDialogLayout chatBubbleDialogLayout = agVar.f298460t;
        chatBubbleDialogLayout.getClass();
        C107237af afVar = new C107237af(agVar);
        v e = w.e();
        e.d(akVar3);
        e.e(true);
        e.b(0);
        chatBubbleDialogLayout.b(afVar, e.a());
        agVar.f298448h.mo65294a(C89849ae.APP_ACTIONS_SHORTCUTS_CONTENT_PAGE_LOADED);
    }
}
