package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import p5488io.grpc.C70137aa;

/* renamed from: io.grpc.e.be */
/* compiled from: PG */
final class C70389be {

    /* renamed from: a */
    private ArrayList f187596a = new ArrayList();

    /* renamed from: b */
    private volatile C70137aa f187597b = C70137aa.IDLE;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo62106a(C70137aa aaVar) {
        C58838bb.m90866a(aaVar, "newState");
        if (this.f187597b != aaVar && this.f187597b != C70137aa.SHUTDOWN) {
            this.f187597b = aaVar;
            if (!this.f187596a.isEmpty()) {
                ArrayList arrayList = this.f187596a;
                this.f187596a = new ArrayList();
                if (arrayList.size() > 0) {
                    C70388bd bdVar = (C70388bd) arrayList.get(0);
                    throw null;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo62107b() {
        if (this.f187597b == null) {
            throw new UnsupportedOperationException("Channel state API is not implemented");
        }
    }
}
