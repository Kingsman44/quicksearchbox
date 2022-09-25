package p5488io.grpc.p5524d;

import com.google.common.base.C58838bb;
import java.io.IOException;
import java.net.SocketAddress;

/* renamed from: io.grpc.d.a */
/* compiled from: PG */
public final class C70299a extends SocketAddress {
    private static final long serialVersionUID = -8567592561863414695L;

    /* renamed from: a */
    private C70308e f187374a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C70308e mo61986a() {
        return this.f187374a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo61987b(C70308e eVar) {
        C58838bb.m90883r(this.f187374a == eVar);
        this.f187374a = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo61988c(C70308e eVar) {
        if (this.f187374a == null) {
            this.f187374a = eVar;
        } else {
            throw new IOException("Server instance already registered");
        }
    }
}
