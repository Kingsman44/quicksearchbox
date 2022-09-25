package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;

/* renamed from: io.grpc.cl */
/* compiled from: PG */
public abstract class C70283cl extends C70274cc {
    /* renamed from: b */
    public abstract int mo61963b();

    /* renamed from: c */
    public abstract String mo61964c();

    /* renamed from: d */
    public abstract boolean mo61965d();

    /* renamed from: e */
    public C70340dk mo61966e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("policy", mo61964c());
        b.mo56103c("priority", String.valueOf(mo61963b()));
        b.mo56103c("available", String.valueOf(mo61965d()));
        return b.toString();
    }
}
