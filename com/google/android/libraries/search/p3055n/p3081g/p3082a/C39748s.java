package com.google.android.libraries.search.p3055n.p3081g.p3082a;

import com.google.android.libraries.assistant.soda.speakerid.p1613a.C19372j;
import com.google.android.libraries.search.p3055n.p3081g.p3082a.p3083a.C39717b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.speech.p5218j.C66838bp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.n.g.a.s */
/* compiled from: PG */
public final /* synthetic */ class C39748s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C39751v f104569a;

    /* renamed from: b */
    public final /* synthetic */ C39717b f104570b;

    public /* synthetic */ C39748s(C39751v vVar, C39717b bVar) {
        this.f104569a = vVar;
        this.f104570b = bVar;
    }

    public final C60870cx apply(Object obj) {
        C39751v vVar = this.f104569a;
        C39717b bVar = this.f104570b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53831)).mo56386p("VoiceMatch AuthToken available. Syncing silent enrollment utterances.");
            return ((C19372j) vVar.f104576f.get()).mo24515d(bVar, (String) axVar.mo56107c(), Optional.empty());
        }
        ((C58970a) ((C58970a) C39751v.f104571a.mo56224b()).mo56372aa(53830)).mo56386p("VoiceMatch AuthToken unavailable. Skipping silent enrollment utterance sync.");
        return C60856cj.m92900i(C66838bp.f181748d);
    }
}
