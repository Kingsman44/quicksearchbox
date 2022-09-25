package com.google.android.apps.gsa.staticplugins.bisto.p7459aa.p7461b;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6574b.C84809b;
import com.google.android.apps.gsa.search.shared.actions.C87421i;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
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

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.aa.b.ax */
/* compiled from: PG */
public final class C94693ax extends C68247h {

    /* renamed from: a */
    private final C68283d f264814a;

    /* renamed from: c */
    private final C68283d f264815c;

    /* renamed from: d */
    private final C68283d f264816d;

    /* renamed from: e */
    private final C68283d f264817e;

    /* renamed from: f */
    private final C68283d f264818f;

    public C94693ax(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2, C68283d dVar3, C68283d dVar4, C68283d dVar5) {
        super(aVar2, new C68277d(C94693ax.class), aVar);
        this.f264814a = C68236af.m98549d(dVar);
        this.f264815c = C68236af.m98549d(dVar2);
        this.f264816d = C68236af.m98549d(dVar3);
        this.f264817e = C68236af.m98549d(dVar4);
        this.f264818f = C68236af.m98549d(dVar5);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C118826c cVar = (C118826c) list.get(0);
        C58833ax axVar = (C58833ax) list.get(1);
        C84809b bVar = (C84809b) list.get(2);
        boolean booleanValue = ((Boolean) list.get(3)).booleanValue();
        Query query = (Query) list.get(4);
        if (booleanValue) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92900i(C87421i.m141588a(2));
        } else if (!axVar.mo56113h()) {
            C59104x c = C94692aw.f264811a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
            ((C59052c) ((C59052c) c).mo56372aa(16845)).mo56386p("voiceAction is absent");
            return C60856cj.m92900i(C87421i.m141588a(2));
        } else if (!((VoiceAction) axVar.mo56107c()).mo81133M()) {
            C58976aa aaVar2 = C58975e.f156826a;
            return C60856cj.m92900i(C87421i.m141588a(2));
        } else if (!((VoiceAction) axVar.mo56107c()).mo81051A()) {
            C58976aa aaVar3 = C58975e.f156826a;
            return C60856cj.m92900i(C87421i.m141588a(2));
        } else {
            VoiceAction voiceAction = (VoiceAction) axVar.mo56107c();
            if (voiceAction.mo81082u()) {
                C59104x b = C94692aw.f264811a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
                ((C59052c) ((C59052c) b).mo56372aa(16842)).mo56386p("Action is modular");
            }
            if (voiceAction.mo81087y() || voiceAction.mo81053C() || voiceAction.mo81084w() || voiceAction.mo81083v() || voiceAction.mo81052B()) {
                C59104x c2 = C94692aw.f264811a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "BistoModularActionMod");
                ((C59052c) ((C59052c) c2).mo56372aa(16841)).mo56386p("Voice action is complete. Not executing");
                return C60856cj.m92900i(C87421i.m141588a(2));
            }
            voiceAction.mo81060J(1);
            voiceAction.mo81058H();
            return bVar.mo78488g(voiceAction, query, C58836b.f156633a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f264814a.mo60297gq(), this.f264815c.mo60297gq(), this.f264816d.mo60297gq(), this.f264817e.mo60297gq(), this.f264818f.mo60297gq());
    }
}
