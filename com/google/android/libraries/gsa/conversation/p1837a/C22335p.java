package com.google.android.libraries.gsa.conversation.p1837a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.a.p */
/* compiled from: PG */
final class C22335p extends C22328i {

    /* renamed from: a */
    public final C60870cx f61664a;

    /* renamed from: b */
    private final C22326g f61665b;

    public C22335p(C60870cx cxVar, C22326g gVar) {
        this.f61664a = cxVar;
        this.f61665b = gVar;
    }

    /* renamed from: a */
    public final C22326g mo27557a() {
        return this.f61665b;
    }

    /* renamed from: b */
    public final C60870cx mo27558b() {
        return this.f61664a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22328i) {
            C22328i iVar = (C22328i) obj;
            return this.f61664a.equals(iVar.mo27558b()) && this.f61665b.equals(iVar.mo27557a());
        }
    }

    public final int hashCode() {
        return ((this.f61664a.hashCode() ^ 1000003) * 1000003) ^ this.f61665b.hashCode();
    }

    public final String toString() {
        String obj = this.f61664a.toString();
        String obj2 = this.f61665b.toString();
        return "ExecutionResult{executionFuture=" + obj + ", audioRequestHandler=" + obj2 + "}";
    }
}
