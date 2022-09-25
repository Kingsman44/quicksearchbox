package com.google.android.apps.gsa.staticplugins.actions;

import android.util.Pair;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.b.a.a;
import com.google.android.apps.gsa.search.core.C85669bt;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.C87456t;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.search.shared.contact.PersonShortcutKey;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58597ky;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.g */
/* compiled from: PG */
public final /* synthetic */ class C93386g implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C93421q f260461a;

    /* renamed from: b */
    public final /* synthetic */ C87456t f260462b;

    /* renamed from: c */
    public final /* synthetic */ ActionData f260463c;

    /* renamed from: d */
    public final /* synthetic */ Query f260464d;

    public /* synthetic */ C93386g(C93421q qVar, C87456t tVar, ActionData actionData, Query query) {
        this.f260461a = qVar;
        this.f260462b = tVar;
        this.f260463c = actionData;
        this.f260464d = query;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C93421q qVar = this.f260461a;
        C87456t tVar = this.f260462b;
        ActionData actionData = this.f260463c;
        Query query = this.f260464d;
        Person person = (Person) obj;
        if (person != null) {
            PersonDisambiguation b = tVar.mo81156b();
            if (b != null) {
                b.mo81535d(person, false);
            } else {
                b = new PersonDisambiguation(person.f236373d, BuildConfig.FLAVOR, C58597ky.m90212c(person), tVar.f236222c);
                tVar.mo81157c(b);
            }
            PersonDisambiguation personDisambiguation = b;
            String str = person.f236373d;
            if (str != null && C85669bt.m137537f(actionData.f235998h, query, (C86124t) qVar.f260577c.mo27525b())) {
                C85669bt btVar = (C85669bt) qVar.f260576b.mo27525b();
                Pair a = a.a(personDisambiguation.f236392h, btVar, str, (String) null);
                btVar.mo79200c(System.currentTimeMillis(), personDisambiguation, (Map) a.first, (PersonShortcutKey) a.second);
            }
        }
    }
}
