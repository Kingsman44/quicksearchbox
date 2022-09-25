package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5573a.C71389v;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.cm */
/* compiled from: PG */
public final class C32671cm implements C32672cn {

    /* renamed from: a */
    public final C71389v f87565a;

    /* renamed from: b */
    public final C71643cp f87566b;

    public C32671cm(C71389v vVar, C71643cp cpVar) {
        C69664n.m101061g(vVar, "invalidationChannel");
        C69664n.m101061g(cpVar, "ownerJob");
        this.f87565a = vVar;
        this.f87566b = cpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32671cm)) {
            return false;
        }
        C32671cm cmVar = (C32671cm) obj;
        return C69664n.m101066l(this.f87565a, cmVar.f87565a) && C69664n.m101066l(this.f87566b, cmVar.f87566b);
    }

    public final int hashCode() {
        return (this.f87565a.hashCode() * 31) + this.f87566b.hashCode();
    }

    public final String toString() {
        C71389v vVar = this.f87565a;
        C71643cp cpVar = this.f87566b;
        return "Ready(invalidationChannel=" + vVar + ", ownerJob=" + cpVar + ")";
    }
}
