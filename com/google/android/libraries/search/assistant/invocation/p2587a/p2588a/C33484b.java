package com.google.android.libraries.search.assistant.invocation.p2587a.p2588a;

import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.invocation.a.a.b */
/* compiled from: PG */
public final class C33484b extends Exception {

    /* renamed from: a */
    private final C33485c f89607a;

    public C33484b(C33485c cVar) {
        super(cVar.f89608a);
        this.f89607a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C33484b) && C69664n.m101066l(this.f89607a, ((C33484b) obj).f89607a);
    }

    public final int hashCode() {
        return this.f89607a.hashCode();
    }

    public final String toString() {
        C33485c cVar = this.f89607a;
        return "ApaVisActivityStartedException(error=" + cVar + ")";
    }
}
