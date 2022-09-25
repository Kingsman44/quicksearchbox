package com.google.android.apps.gsa.search.shared.actions.core;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.contact.C87518f;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.core.b */
/* compiled from: PG */
final class C87403b extends C87456t {

    /* renamed from: a */
    final /* synthetic */ CommunicationAction f236065a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87403b(CommunicationAction communicationAction, Set set, Map map) {
        super(set, map);
        this.f236065a = communicationAction;
    }

    /* renamed from: a */
    public final VoiceAction mo81155a(PersonDisambiguation personDisambiguation) {
        return this.f236065a.mo81148N(personDisambiguation);
    }

    /* renamed from: b */
    public final PersonDisambiguation mo81156b() {
        return this.f236065a.f236042f;
    }

    /* renamed from: c */
    public final void mo81157c(PersonDisambiguation personDisambiguation) {
        CommunicationAction communicationAction = this.f236065a;
        communicationAction.f236042f = personDisambiguation;
        C87518f fVar = communicationAction.f236043g;
        if (fVar != null) {
            communicationAction.f236042f.f236368g = fVar;
            communicationAction.f236043g.mo81345a(personDisambiguation);
        }
    }
}
