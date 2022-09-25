package com.google.android.apps.gsa.shared.p7012bb.p7016d;

import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.shared.bb.d.b */
/* compiled from: PG */
final class C89374b extends C89381i {

    /* renamed from: a */
    private final long f242313a;

    /* renamed from: b */
    private final MessageLite f242314b;

    public C89374b(long j, MessageLite messageLite) {
        this.f242313a = j;
        if (messageLite != null) {
            this.f242314b = messageLite;
            return;
        }
        throw new NullPointerException("Null proto");
    }

    /* renamed from: a */
    public final long mo83301a() {
        return this.f242313a;
    }

    /* renamed from: b */
    public final MessageLite mo83302b() {
        return this.f242314b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89381i) {
            C89381i iVar = (C89381i) obj;
            return this.f242313a == iVar.mo83301a() && this.f242314b.equals(iVar.mo83302b());
        }
    }

    public final int hashCode() {
        long j = this.f242313a;
        return this.f242314b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f242313a;
        String obj = this.f242314b.toString();
        return "CustomProto{timestampNanos=" + j + ", proto=" + obj + "}";
    }
}
