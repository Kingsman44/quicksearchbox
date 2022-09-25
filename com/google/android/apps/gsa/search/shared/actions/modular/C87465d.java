package com.google.android.apps.gsa.search.shared.actions.modular;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.d */
/* compiled from: PG */
final class C87465d extends C87456t {

    /* renamed from: a */
    final /* synthetic */ PersonArgument f236232a;

    /* renamed from: b */
    final /* synthetic */ ModularAction f236233b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C87465d(ModularAction modularAction, Set set, Map map, PersonArgument personArgument) {
        super(set, map);
        this.f236233b = modularAction;
        this.f236232a = personArgument;
    }

    /* renamed from: a */
    public final VoiceAction mo81155a(PersonDisambiguation personDisambiguation) {
        ModularAction modularAction = this.f236233b;
        PersonArgument personArgument = this.f236232a;
        return modularAction.mo81209P(new PersonArgument(personArgument, personDisambiguation, personArgument.f236140a));
    }

    /* renamed from: b */
    public final PersonDisambiguation mo81156b() {
        return (PersonDisambiguation) this.f236232a.f236203n;
    }

    /* renamed from: c */
    public final void mo81157c(PersonDisambiguation personDisambiguation) {
        this.f236232a.mo81334P(personDisambiguation);
        this.f236233b.mo81226af();
    }
}
