package com.google.android.libraries.assistant.pcp.p1555f.p1556a;

import com.google.android.libraries.assistant.pcp.p1579n.p1581b.C19003b;
import com.google.assistant.p3803ag.p3809c.C49051eq;
import com.google.assistant.p3994s.p3995a.C53306j;
import java.io.Serializable;

/* renamed from: com.google.android.libraries.assistant.pcp.f.a.a */
/* compiled from: PG */
final class C18678a implements Serializable, C19003b {
    private static final long serialVersionUID = 2111382294156026078L;

    /* renamed from: a */
    private final C53306j f52710a;

    /* renamed from: b */
    private final C49051eq f52711b;

    public C18678a(C53306j jVar, C49051eq eqVar) {
        if (jVar != null) {
            this.f52710a = jVar;
            if (eqVar != null) {
                this.f52711b = eqVar;
                return;
            }
            throw new NullPointerException("Null featureType");
        }
        throw new NullPointerException("Null clientType");
    }

    /* renamed from: a */
    public final C53306j mo24103a() {
        return this.f52710a;
    }

    public final Class annotationType() {
        return C19003b.class;
    }

    /* renamed from: b */
    public final C49051eq mo24105b() {
        return this.f52711b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19003b) {
            C19003b bVar = (C19003b) obj;
            return this.f52710a.equals(bVar.mo24103a()) && this.f52711b.equals(bVar.mo24105b());
        }
    }

    public final int hashCode() {
        return (this.f52710a.hashCode() ^ -1722369829) + (this.f52711b.hashCode() ^ -629042000);
    }

    public final String toString() {
        return "@com.google.android.libraries.assistant.pcp.sources.qualifiers.ProactiveDataRendererKey(clientType=" + this.f52710a + ", featureType=" + this.f52711b + ')';
    }
}
