package com.google.android.libraries.elements.p1714d.p1719e;

import com.google.android.libraries.elements.interfaces.CommandRunCompletionCallback;
import p5488io.grpc.Status;
import p5488io.p5490b.p5497e.p5502e.p5503a.C69872g;

/* renamed from: com.google.android.libraries.elements.d.e.j */
/* compiled from: PG */
final class C21048j extends CommandRunCompletionCallback {

    /* renamed from: a */
    final /* synthetic */ C69872g f58965a;

    public C21048j(C69872g gVar) {
        this.f58965a = gVar;
    }

    public final void completion(Status status) {
        if (status.mo61679g()) {
            this.f58965a.mo61500a();
        } else {
            this.f58965a.mo61501b(status.asException());
        }
    }
}
