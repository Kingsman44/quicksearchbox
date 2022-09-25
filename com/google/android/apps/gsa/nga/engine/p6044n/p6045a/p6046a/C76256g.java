package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6046a;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.conversation.p1855h.C22697b;
import com.google.android.libraries.gsa.conversation.p1855h.C22722z;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.a.g */
/* compiled from: PG */
public final class C76256g extends C22697b {

    /* renamed from: b */
    private static final C58974d f211273b = C58974d.m91136j();

    /* renamed from: a */
    public final SettableFuture f211274a = new SettableFuture();

    /* renamed from: a */
    public final void mo27813a(C22722z zVar) {
        if (!this.f211274a.isDone()) {
            this.f211274a.mo57356n(C118826c.f331422a);
        } else {
            ((C58970a) ((C58970a) f211273b.mo56225c()).mo56372aa(3474)).mo56389s("%s", "deltaProcessed future is already set, this should never happen");
            throw new IllegalStateException("deltaProcessed future is already set, this should never happen");
        }
    }
}
