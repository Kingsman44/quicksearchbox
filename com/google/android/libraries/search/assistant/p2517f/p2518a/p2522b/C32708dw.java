package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32870p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.dw */
/* compiled from: PG */
public final class C32708dw {

    /* renamed from: a */
    public final C32870p f87660a;

    /* renamed from: b */
    public final C32849cq f87661b;

    public C32708dw(C32870p pVar, C32849cq cqVar) {
        C69664n.m101061g(cqVar, "sessionToken");
        this.f87660a = pVar;
        this.f87661b = cqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32708dw)) {
            return false;
        }
        C32708dw dwVar = (C32708dw) obj;
        return C69664n.m101066l(this.f87660a, dwVar.f87660a) && C69664n.m101066l(this.f87661b, dwVar.f87661b);
    }

    public final int hashCode() {
        return (this.f87660a.hashCode() * 31) + this.f87661b.hashCode();
    }

    public final String toString() {
        C32870p pVar = this.f87660a;
        C32849cq cqVar = this.f87661b;
        return "ParentSessionData(stub=" + pVar + ", sessionToken=" + cqVar + ")";
    }
}
