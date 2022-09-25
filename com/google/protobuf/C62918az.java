package com.google.protobuf;

/* renamed from: com.google.protobuf.az */
/* compiled from: PG */
final class C62918az {

    /* renamed from: a */
    private final Object f169867a;

    /* renamed from: b */
    private final int f169868b;

    public C62918az(Object obj, int i) {
        this.f169867a = obj;
        this.f169868b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C62918az)) {
            return false;
        }
        C62918az azVar = (C62918az) obj;
        if (this.f169867a == azVar.f169867a && this.f169868b == azVar.f169868b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f169867a) * 65535) + this.f169868b;
    }
}
