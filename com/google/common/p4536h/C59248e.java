package com.google.common.p4536h;

import com.google.common.p4522b.C58647mu;
import java.util.Map;

/* renamed from: com.google.common.h.e */
/* compiled from: PG */
public abstract class C59248e extends C59245b implements C59243aj {
    /* renamed from: g */
    private static Map m91993g(C59243aj ajVar) {
        return new C58647mu(ajVar.mo56708b(), new C59247d(ajVar));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C59243aj)) {
            return false;
        }
        C59243aj ajVar = (C59243aj) obj;
        return mo56702f() == ajVar.mo56702f() && mo56699c().equals(ajVar.mo56699c()) && m91993g(this).equals(m91993g(ajVar));
    }

    public final int hashCode() {
        return m91993g(this).hashCode();
    }

    public final String toString() {
        return "isDirected: " + mo56702f() + ", allowsSelfLoops: " + mo56701e() + ", nodes: " + mo56699c() + ", edges: " + m91993g(this);
    }
}
