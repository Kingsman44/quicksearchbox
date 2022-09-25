package com.google.android.libraries.search.p3055n.p3075e.p3077b;

import com.google.android.libraries.assistant.soda.C19240ac;
import com.google.android.libraries.assistant.soda.Soda;

/* renamed from: com.google.android.libraries.search.n.e.b.a */
/* compiled from: PG */
final class C39685a extends C39687c {

    /* renamed from: a */
    private final Soda f104452a;

    /* renamed from: b */
    private final C19240ac f104453b;

    public C39685a(Soda soda, C19240ac acVar) {
        this.f104452a = soda;
        if (acVar != null) {
            this.f104453b = acVar;
            return;
        }
        throw new NullPointerException("Null sodaInitParams");
    }

    /* renamed from: a */
    public final Soda mo41988a() {
        return this.f104452a;
    }

    /* renamed from: b */
    public final C19240ac mo41989b() {
        return this.f104453b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C39687c) {
            C39687c cVar = (C39687c) obj;
            return this.f104452a.equals(cVar.mo41988a()) && this.f104453b.equals(cVar.mo41989b());
        }
    }

    public final int hashCode() {
        return ((this.f104452a.hashCode() ^ 1000003) * 1000003) ^ this.f104453b.hashCode();
    }

    public final String toString() {
        String obj = this.f104452a.toString();
        String obj2 = this.f104453b.toString();
        return "PreloadContainer{soda=" + obj + ", sodaInitParams=" + obj2 + "}";
    }
}
