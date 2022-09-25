package p5488io.grpc.binder;

import p5488io.grpc.Status;

/* renamed from: io.grpc.binder.l */
/* compiled from: PG */
final class C70232l extends C70235o {
    /* renamed from: a */
    public final Status mo57957a(int i) {
        if (i == C70234n.f187218a) {
            return Status.f186902OK;
        }
        return Status.f186909g.withDescription("Rejected by (internal-only) security policy");
    }
}
