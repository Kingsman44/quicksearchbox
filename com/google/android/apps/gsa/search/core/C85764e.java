package com.google.android.apps.gsa.search.core;

import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.Relationship;

/* renamed from: com.google.android.apps.gsa.search.core.e */
/* compiled from: PG */
final class C85764e extends C85673bx {

    /* renamed from: a */
    private final Relationship f231919a;

    /* renamed from: b */
    private final Person f231920b;

    public C85764e(Relationship relationship, Person person) {
        if (relationship != null) {
            this.f231919a = relationship;
            this.f231920b = person;
            return;
        }
        throw new NullPointerException("Null relationship");
    }

    /* renamed from: a */
    public final Person mo79203a() {
        return this.f231920b;
    }

    /* renamed from: b */
    public final Relationship mo79204b() {
        return this.f231919a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C85673bx) {
            C85673bx bxVar = (C85673bx) obj;
            return this.f231919a.equals(bxVar.mo79204b()) && this.f231920b.equals(bxVar.mo79203a());
        }
    }

    public final int hashCode() {
        return ((this.f231919a.f236406b.hashCode() ^ 1000003) * 1000003) ^ ((int) this.f231920b.f236371b);
    }

    public final String toString() {
        String obj = this.f231919a.toString();
        String obj2 = this.f231920b.toString();
        return "RelationshipAndPerson{relationship=" + obj + ", person=" + obj2 + "}";
    }
}
