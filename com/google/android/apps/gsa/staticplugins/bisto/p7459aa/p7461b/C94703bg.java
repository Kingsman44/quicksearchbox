package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.ModularAction;
import com.google.android.apps.gsa.search.shared.actions.util.CardDecision;
import com.google.android.apps.gsa.search.shared.p6926d.C87541c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.bg */
/* compiled from: PG */
public final class C94703bg extends C68247h {

    /* renamed from: a */
    private final C68283d f264843a;

    /* renamed from: c */
    private final C68283d f264844c;

    /* renamed from: d */
    private final C68283d f264845d;

    /* renamed from: e */
    private final C68283d f264846e;

    /* renamed from: f */
    private final C68283d f264847f;

    /* renamed from: g */
    private final C68283d f264848g;

    /* renamed from: h */
    private final C68283d f264849h;

    public C94703bg(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5, C68283d dVar6, C68283d dVar7) {
        super(aVar2, new C68277d(C94703bg.class), aVar);
        this.f264843a = C68236af.m98549d(dVar);
        this.f264844c = C68236af.m98549d(dVar2);
        this.f264845d = C68236af.m98549d(dVar3);
        this.f264846e = C68236af.m98549d(dVar4);
        this.f264847f = C68236af.m98549d(dVar5);
        this.f264848g = C68236af.m98549d(dVar6);
        this.f264849h = C68236af.m98549d(dVar7);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        CardDecision cardDecision;
        List list = (List) obj;
        C58833ax axVar = (C58833ax) list.get(0);
        C87421i iVar = (C87421i) list.get(1);
        C84809b bVar = (C84809b) list.get(2);
        C58833ax axVar2 = (C58833ax) list.get(3);
        C58833ax axVar3 = (C58833ax) list.get(4);
        C87541c cVar = (C87541c) list.get(5);
        Query query = (Query) list.get(6);
        if (!axVar.mo56113h()) {
            C59104x c = C94692aw.f264811a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
            ((C59052c) ((C59052c) c).mo56372aa(16852)).mo56386p("voiceAction is absent");
            return C60856cj.m92900i(iVar);
        }
        VoiceAction voiceAction = (VoiceAction) axVar.mo56107c();
        voiceAction.mo81072hy();
        if (iVar.mo81197b()) {
            voiceAction.mo81059I();
        } else if (iVar.mo81199d() || voiceAction.mo81065f().mo81438h()) {
            voiceAction.mo81061K();
        } else {
            voiceAction.mo81057G();
            if (axVar3.mo56113h()) {
                ActionData actionData = (ActionData) axVar3.mo56107c();
                if (axVar2.mo56113h()) {
                    cardDecision = (CardDecision) axVar2.mo56107c();
                } else {
                    cardDecision = CardDecision.f236248b;
                }
                bVar.mo78503w(query, actionData, voiceAction, cardDecision, cVar, C94673ad.f264785a);
            } else {
                C59104x c2 = C94692aw.f264811a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
                ((C59052c) ((C59052c) c2).mo56372aa(16851)).mo56386p("Unable to logNonVisualAndOpaModularAction");
            }
        }
        if (iVar.mo81198c() && voiceAction.mo81082u()) {
            bVar.mo78504x((ModularAction) voiceAction, C94673ad.f264785a);
        }
        return C60856cj.m92900i(iVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264843a.mo60297gq(), this.f264844c.mo60297gq(), this.f264845d.mo60297gq(), this.f264846e.mo60297gq(), this.f264847f.mo60297gq(), this.f264848g.mo60297gq(), this.f264849h.mo60297gq());
    }
}
