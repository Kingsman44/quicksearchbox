package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;
import com.google.common.base.C58838bb;

/* renamed from: io.grpc.t */
/* compiled from: PG */
public final class C70905t {

    /* renamed from: a */
    private final C70851i f189096a;

    /* renamed from: b */
    private final int f189097b;

    /* renamed from: c */
    private final boolean f189098c;

    public C70905t(C70851i iVar, int i, boolean z) {
        C58838bb.m90866a(iVar, "callOptions");
        this.f189096a = iVar;
        this.f189097b = i;
        this.f189098c = z;
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("callOptions", this.f189096a);
        b.mo56103c("previousAttempts", String.valueOf(this.f189097b));
        b.mo56103c("isTransparentRetry", String.valueOf(this.f189098c));
        return b.toString();
    }
}
