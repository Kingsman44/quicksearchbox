package p5488io.grpc;

import com.google.common.base.C58830au;
import com.google.common.base.C58831av;

/* renamed from: io.grpc.dw */
/* compiled from: PG */
abstract class C70352dw extends C70704ei {
    /* renamed from: a */
    public void mo39476a(Status status, C70334de deVar) {
        mo61742d().mo39476a(status, deVar);
    }

    /* renamed from: b */
    public void mo58113b(C70334de deVar) {
        mo61742d().mo58113b(deVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract C70704ei mo61742d();

    /* renamed from: f */
    public final C70256c mo62061f() {
        return mo61742d().mo62061f();
    }

    /* renamed from: g */
    public final void mo62062g(int i) {
        mo61742d().mo62062g(i);
    }

    /* renamed from: h */
    public final boolean mo62063h() {
        return mo61742d().mo62063h();
    }

    /* renamed from: i */
    public final boolean mo62064i() {
        return mo61742d().mo62064i();
    }

    public final String toString() {
        C58830au b = C58831av.m90829b(this);
        b.mo56102b("delegate", mo61742d());
        return b.toString();
    }
}
