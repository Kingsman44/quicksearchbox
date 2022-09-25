package com.google.frameworks.client.data.android.p4634b;

import com.google.android.gms.common.C143701ac;
import p5488io.grpc.Status;
import p5488io.grpc.binder.C70235o;

/* renamed from: com.google.frameworks.client.data.android.b.a */
/* compiled from: PG */
public final class C61382a extends C70235o {

    /* renamed from: a */
    final /* synthetic */ C143701ac f165971a;

    public C61382a(C143701ac acVar) {
        this.f165971a = acVar;
    }

    /* renamed from: a */
    public final Status mo57957a(int i) {
        if (this.f165971a.mo119085d(i)) {
            return Status.f186902OK;
        }
        return Status.f186909g.withDescription("Rejected by (1st-party only) security policy");
    }
}
