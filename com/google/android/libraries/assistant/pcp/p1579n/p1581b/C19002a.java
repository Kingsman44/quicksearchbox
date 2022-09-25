package com.google.android.libraries.assistant.pcp.p1579n.p1581b;

import com.google.assistant.p3803ag.p3809c.C49051eq;
import com.google.assistant.p3994s.p3995a.C53306j;
import java.io.Serializable;

/* renamed from: com.google.android.libraries.assistant.pcp.n.b.a */
/* compiled from: PG */
public final class C19002a implements Serializable, C19003b {
    private static final long serialVersionUID = 2111382294156026078L;

    /* renamed from: a */
    private final C53306j f53376a;

    /* renamed from: b */
    private final C49051eq f53377b;

    public C19002a(C53306j jVar, C49051eq eqVar) {
        if (jVar != null) {
            this.f53376a = jVar;
            if (eqVar != null) {
                this.f53377b = eqVar;
                return;
            }
            throw new NullPointerException("Null featureType");
        }
        throw new NullPointerException("Null clientType");
    }

    /* renamed from: a */
    public final C53306j mo24103a() {
        return this.f53376a;
    }

    public final Class annotationType() {
        return C19003b.class;
    }

    /* renamed from: b */
    public final C49051eq mo24105b() {
        return this.f53377b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C19003b) {
            C19003b bVar = (C19003b) obj;
            return this.f53376a.equals(bVar.mo24103a()) && this.f53377b.equals(bVar.mo24105b());
        }
    }

    public final int hashCode() {
        return (this.f53376a.hashCode() ^ -1722369829) + (this.f53377b.hashCode() ^ -629042000);
    }

    public final String toString() {
        return "@com.google.android.libraries.assistant.pcp.sources.qualifiers.ProactiveDataRendererKey(clientType=" + this.f53376a + ", featureType=" + this.f53377b + ')';
    }
}
