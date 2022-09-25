package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.common.p4522b.C58495hd;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.t */
/* compiled from: PG */
public abstract class C87456t {

    /* renamed from: c */
    public final Set f236222c;

    /* renamed from: d */
    public final C58495hd f236223d;

    protected C87456t(Set set, Map map) {
        this.f236222c = set;
        this.f236223d = C58495hd.m89898l(map);
    }

    /* renamed from: a */
    public abstract VoiceAction mo81155a(PersonDisambiguation personDisambiguation);

    /* renamed from: b */
    public abstract PersonDisambiguation mo81156b();

    /* renamed from: c */
    public abstract void mo81157c(PersonDisambiguation personDisambiguation);
}
