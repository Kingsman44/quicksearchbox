package com.google.android.apps.gsa.staticplugins.p8793w.p8816h.p8823e;

import com.google.android.apps.gsa.search.shared.actions.C87473p;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.w.h.e.o */
/* compiled from: PG */
public final class C118039o extends C68247h {

    /* renamed from: a */
    private final C68283d f327610a;

    public C118039o(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C118039o.class), aVar);
        this.f327610a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C58833ax axVar = (C58833ax) obj;
        C58976aa aaVar = C58975e.f156826a;
        if (!axVar.mo56113h()) {
            obj2 = C58836b.f156633a;
        } else {
            C87473p pVar = (C87473p) axVar.mo56107c();
            List b = pVar.mo81190a().mo81178b();
            if (b == null || b.isEmpty()) {
                obj2 = C58836b.f156633a;
            } else {
                VoiceAction voiceAction = (VoiceAction) b.get(0);
                MatchingProviderInfo b2 = pVar.mo81191b();
                if (!(voiceAction == null || b2 == null)) {
                    voiceAction.mo81076o(b2);
                }
                obj2 = C58833ax.m90834k(voiceAction);
            }
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return this.f327610a.mo60297gq();
    }
}
