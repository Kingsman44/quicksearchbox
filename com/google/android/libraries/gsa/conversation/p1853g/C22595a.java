package com.google.android.libraries.gsa.conversation.p1853g;

import com.google.assistant.p3897e.p3921j.C52083ep;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.gsa.conversation.g.a */
/* compiled from: PG */
final class C22595a extends C22666j {

    /* renamed from: a */
    private final C52083ep f62242a;

    /* renamed from: b */
    private final C60870cx f62243b;

    /* renamed from: c */
    private final C60870cx f62244c;

    public C22595a(C52083ep epVar, C60870cx cxVar, C60870cx cxVar2) {
        if (epVar != null) {
            this.f62242a = epVar;
            if (cxVar != null) {
                this.f62243b = cxVar;
                this.f62244c = cxVar2;
                return;
            }
            throw new NullPointerException("Null materializedInteraction");
        }
        throw new NullPointerException("Null interaction");
    }

    /* renamed from: a */
    public final C52083ep mo27709a() {
        return this.f62242a;
    }

    /* renamed from: b */
    public final C60870cx mo27710b() {
        return this.f62244c;
    }

    /* renamed from: c */
    public final C60870cx mo27711c() {
        return this.f62243b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C22666j) {
            C22666j jVar = (C22666j) obj;
            return this.f62242a.equals(jVar.mo27709a()) && this.f62243b.equals(jVar.mo27711c()) && this.f62244c.equals(jVar.mo27710b());
        }
    }

    public final int hashCode() {
        return ((((this.f62242a.hashCode() ^ 1000003) * 1000003) ^ this.f62243b.hashCode()) * 1000003) ^ this.f62244c.hashCode();
    }

    public final String toString() {
        String obj = this.f62242a.toString();
        String obj2 = this.f62243b.toString();
        String obj3 = this.f62244c.toString();
        return "ClientOpExecutionResult{interaction=" + obj + ", materializedInteraction=" + obj2 + ", clientOpResultMetadataFuture=" + obj3 + "}";
    }
}
