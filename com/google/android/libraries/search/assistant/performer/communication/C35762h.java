package com.google.android.libraries.search.assistant.performer.communication;

import com.google.android.libraries.search.assistant.p2782r.C36379e;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.android.libraries.search.assistant.performer.permissions.C36197b;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.h */
/* compiled from: PG */
final class C35762h extends C35597cz {

    /* renamed from: a */
    private final C36197b f93689a;

    /* renamed from: b */
    private final C35470f f93690b;

    /* renamed from: c */
    private final C36379e f93691c;

    public C35762h(C36197b bVar, C35470f fVar, C36379e eVar) {
        this.f93689a = bVar;
        this.f93690b = fVar;
        this.f93691c = eVar;
    }

    /* renamed from: a */
    public final C36379e mo39727a() {
        return this.f93691c;
    }

    /* renamed from: b */
    public final C35470f mo39728b() {
        return this.f93690b;
    }

    /* renamed from: c */
    public final C36197b mo39729c() {
        return this.f93689a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C35597cz) {
            C35597cz czVar = (C35597cz) obj;
            return this.f93689a.equals(czVar.mo39729c()) && this.f93690b.equals(czVar.mo39728b()) && this.f93691c.equals(czVar.mo39727a());
        }
    }

    public final int hashCode() {
        return ((((this.f93689a.hashCode() ^ 1000003) * 1000003) ^ this.f93690b.hashCode()) * 1000003) ^ this.f93691c.hashCode();
    }

    public final String toString() {
        String obj = this.f93689a.toString();
        String obj2 = this.f93690b.toString();
        String obj3 = this.f93691c.toString();
        return "LocationFetchConfig{permissionsRequester=" + obj + ", contextIntentStarter=" + obj2 + ", locationService=" + obj3 + "}";
    }
}
