package com.google.android.apps.gsa.search.core.preferences.cards;

import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.Relationship;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.shared.util.p7159c.C90945k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.cards.h */
/* compiled from: PG */
final class C86310h extends C90945k {

    /* renamed from: a */
    final /* synthetic */ C86312j f233361a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86310h(C86312j jVar, C90929bz bzVar) {
        super("Lookup all relationships", bzVar, 1, 8);
        this.f233361a = jVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo77936a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        return this.f233361a.f233366c.f233347d.n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo77937b(Object obj) {
        C86312j jVar = this.f233361a.f233366c.f233345b;
        jVar.f233364a.clear();
        for (Person person : (List) obj) {
            for (Relationship relationship : Collections.unmodifiableSet(person.f236388s)) {
                C86308f fVar = new C86308f();
                fVar.f233358a = relationship;
                fVar.f233359b = person;
                jVar.f233364a.add(fVar);
            }
        }
        Collections.sort(jVar.f233364a, C86309g.f233360a);
        jVar.notifyDataSetChanged();
        this.f233361a.f233366c.getListView().setEmptyView(this.f233361a.f233366c.f233346c);
    }
}
