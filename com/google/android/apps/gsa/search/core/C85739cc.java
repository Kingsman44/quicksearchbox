package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.Relationship;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;

/* renamed from: com.google.android.apps.gsa.search.core.cc */
/* compiled from: PG */
final class C85739cc extends C90888av {

    /* renamed from: a */
    final /* synthetic */ Relationship f231800a;

    /* renamed from: b */
    final /* synthetic */ Person f231801b;

    /* renamed from: c */
    final /* synthetic */ C85741ce f231802c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85739cc(C85741ce ceVar, Relationship relationship, Person person) {
        super("Remove relationship from person", 2, 0);
        this.f231802c = ceVar;
        this.f231800a = relationship;
        this.f231801b = person;
    }

    public final void run() {
        C90748e.m148224b();
        this.f231802c.mo79392d(this.f231800a, this.f231801b.f236372c);
        Person person = this.f231801b;
        person.f236388s.remove(this.f231800a);
        this.f231802c.mo79394f();
    }
}
