package com.google.android.libraries.geller.portable.database;

/* renamed from: com.google.android.libraries.geller.portable.database.b */
/* compiled from: PG */
final class C21954b extends C21956d {

    /* renamed from: a */
    private final Boolean f60570a;

    public C21954b(Boolean bool) {
        this.f60570a = bool;
    }

    /* renamed from: a */
    public final Boolean mo27276a() {
        return this.f60570a;
    }

    /* renamed from: b */
    public final int mo27277b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21956d) {
            C21956d dVar = (C21956d) obj;
            return this.f60570a.equals(dVar.mo27276a()) && dVar.mo27277b() == 1;
        }
    }

    public final int hashCode() {
        return ((this.f60570a.hashCode() ^ 1000003) * 1000003) ^ 1;
    }

    public final String toString() {
        Boolean bool = this.f60570a;
        return "DeleteStatusUpdateParams{markAsUndeleted=" + bool + ", deleteStatus=PENDING_DELETE}";
    }
}
