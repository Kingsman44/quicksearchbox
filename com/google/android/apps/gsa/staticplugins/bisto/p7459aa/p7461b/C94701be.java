package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.search.shared.actions.C87473p;
import com.google.android.apps.gsa.search.shared.actions.PuntAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.be */
/* compiled from: PG */
public final class C94701be extends C68247h {

    /* renamed from: a */
    private final C68283d f264836a;

    public C94701be(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C94701be.class), aVar);
        this.f264836a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            C59104x c = C94692aw.f264811a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
            ((C59052c) ((C59052c) c).mo56372aa(16840)).mo56386p("processedActionData is absent");
            obj2 = C58836b.f156633a;
        } else {
            C87473p pVar = (C87473p) axVar.mo56107c();
            List b = pVar.mo81190a().mo81178b();
            if (b == null || b.isEmpty()) {
                C59104x d = C94692aw.f264811a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
                ((C59052c) ((C59052c) d).mo56372aa(16836)).mo56386p("voiceActionList is null or empty");
                obj2 = C58836b.f156633a;
            } else {
                if (b.size() > 1) {
                    C59104x b2 = C94692aw.f264811a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
                    ((C59052c) ((C59052c) b2).mo56372aa(16839)).mo56387q("Number of voice actions: %d; only handling first", b.size());
                }
                VoiceAction voiceAction = (VoiceAction) b.get(0);
                MatchingProviderInfo b3 = pVar.mo81191b();
                if (b3 != null) {
                    voiceAction.mo81076o(b3);
                } else {
                    C59104x b4 = C94692aw.f264811a.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
                    ((C59052c) ((C59052c) b4).mo56372aa(16837)).mo56386p("matchingProviderInfo is null");
                }
                if (voiceAction instanceof PuntAction) {
                    C59104x d2 = C94692aw.f264811a.mo56226d();
                    d2.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
                    ((C59052c) ((C59052c) d2).mo56372aa(16838)).mo56386p("Punt action received");
                }
                obj2 = C58833ax.m90834k(voiceAction);
            }
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f264836a.mo60297gq();
    }
}
