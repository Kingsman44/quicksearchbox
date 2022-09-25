package com.google.android.libraries.search.assistant.p2786t.p2787a.p2788a;

import com.google.android.libraries.search.assistant.p2786t.p2790b.p2792b.C36476g;
import com.google.android.libraries.search.assistant.p2786t.p2790b.p2794d.C36496e;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.grpc.C70148al;
import p5488io.grpc.C70168bc;
import p5488io.grpc.C70334de;
import p5488io.grpc.C70704ei;
import p5488io.grpc.Status;

/* renamed from: com.google.android.libraries.search.assistant.t.a.a.f */
/* compiled from: PG */
final class C36432f extends C70168bc {
    public C36432f(C70704ei eiVar) {
        super(eiVar);
    }

    /* renamed from: a */
    public final void mo39476a(Status status, C70334de deVar) {
        if (status.mo61679g()) {
            C36476g gVar = (C36476g) ((AtomicReference) C36450x.f95173a.mo61711a(C70148al.m102135m())).getAndSet((Object) null);
            if (gVar != null) {
                C36496e.m65044b(deVar, gVar);
            }
        }
        this.f187017c.mo39476a(status, deVar);
    }
}
