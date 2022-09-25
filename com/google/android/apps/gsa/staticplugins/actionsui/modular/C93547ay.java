package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import com.google.android.apps.gsa.search.shared.actions.C87422j;
import com.google.android.apps.gsa.search.shared.actions.C87423k;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.PersonArgument;
import com.google.android.apps.gsa.search.shared.contact.Contact;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.PersonDisambiguation;
import com.google.android.apps.gsa.staticplugins.actionsui.C93696u;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ay */
/* compiled from: PG */
final class C93547ay implements C93696u {

    /* renamed from: a */
    final /* synthetic */ PersonDisambiguation f261197a;

    /* renamed from: b */
    final /* synthetic */ PersonArgument f261198b;

    /* renamed from: c */
    final /* synthetic */ C93602cz f261199c;

    /* renamed from: d */
    final /* synthetic */ int f261200d;

    /* renamed from: e */
    final /* synthetic */ DisambiguationContent f261201e;

    public C93547ay(DisambiguationContent disambiguationContent, PersonDisambiguation personDisambiguation, PersonArgument personArgument, C93602cz czVar, int i) {
        this.f261201e = disambiguationContent;
        this.f261197a = personDisambiguation;
        this.f261198b = personArgument;
        this.f261199c = czVar;
        this.f261200d = i;
    }

    /* renamed from: a */
    public final void mo87747a(Contact contact) {
        this.f261198b.f236147h = false;
        this.f261201e.f261021h.mo81610w(contact, true);
        C93602cz czVar = this.f261199c;
        PersonDisambiguation personDisambiguation = this.f261201e.f261021h;
        C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
        jVar.copyOnWrite();
        C87423k kVar = (C87423k) jVar.instance;
        kVar.f236087b = 3;
        kVar.f236086a = 1 | kVar.f236086a;
        int i = this.f261200d;
        jVar.copyOnWrite();
        C87423k kVar2 = (C87423k) jVar.instance;
        kVar2.f236086a |= 2;
        kVar2.f236088c = i;
        czVar.mo88029X(personDisambiguation, (C87423k) jVar.build(), 2);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo87748b(Object obj) {
        Person person = (Person) obj;
        if (this.f261197a.mo81545n()) {
            this.f261198b.f236147h = false;
            this.f261201e.f261021h.mo81535d(person, true);
            C93602cz czVar = this.f261199c;
            PersonDisambiguation personDisambiguation = this.f261201e.f261021h;
            C87422j jVar = (C87422j) C87423k.f236084e.createBuilder();
            jVar.copyOnWrite();
            C87423k kVar = (C87423k) jVar.instance;
            kVar.f236087b = 2;
            kVar.f236086a = 1 | kVar.f236086a;
            int i = this.f261200d;
            jVar.copyOnWrite();
            C87423k kVar2 = (C87423k) jVar.instance;
            kVar2.f236086a |= 2;
            kVar2.f236088c = i;
            czVar.mo88029X(personDisambiguation, (C87423k) jVar.build(), 2);
        }
    }
}
