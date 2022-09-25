package com.google.android.libraries.geller.p1813a;

import com.google.protos.p5129p.p5131b.C65753ak;
import java.io.Serializable;

/* renamed from: com.google.android.libraries.geller.a.a */
/* compiled from: PG */
public final class C21753a implements Serializable, C21754b {
    private static final long serialVersionUID = -2512461138929551103L;

    /* renamed from: a */
    private final C65753ak f60054a;

    public C21753a(C65753ak akVar) {
        if (akVar != null) {
            this.f60054a = akVar;
            return;
        }
        throw new NullPointerException("Null value");
    }

    /* renamed from: a */
    public final C65753ak mo27086a() {
        return this.f60054a;
    }

    public final Class annotationType() {
        return C21754b.class;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C21754b) {
            return this.f60054a.equals(((C21754b) obj).mo27086a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f60054a.hashCode() ^ 1335633679;
    }

    public final String toString() {
        return "@com.google.android.libraries.geller.annotations.GellerCorpusKey(" + this.f60054a + ')';
    }
}
