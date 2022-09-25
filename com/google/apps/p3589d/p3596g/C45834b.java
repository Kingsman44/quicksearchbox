package com.google.apps.p3589d.p3596g;

/* renamed from: com.google.apps.d.g.b */
/* compiled from: PG */
public final class C45834b extends C45847o {

    /* renamed from: a */
    public final boolean f120515a;

    public C45834b(boolean z) {
        this.f120515a = z;
    }

    /* renamed from: a */
    public final boolean mo49981a() {
        return this.f120515a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C45847o) && this.f120515a == ((C45847o) obj).mo49981a();
    }

    public final int hashCode() {
        return (true != this.f120515a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.f120515a;
        return "Options{autocorrectInvalidInput=" + z + "}";
    }
}
