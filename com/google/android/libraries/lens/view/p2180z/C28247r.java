package com.google.android.libraries.lens.view.p2180z;

import com.google.android.libraries.lens.view.p2067ak.C25275n;
import com.google.protobuf.C63042fg;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.z.r */
/* compiled from: PG */
public final /* synthetic */ class C28247r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C28226aa f76897a;

    /* renamed from: b */
    public final /* synthetic */ C25275n f76898b;

    public /* synthetic */ C28247r(C28226aa aaVar, C25275n nVar) {
        this.f76897a = aaVar;
        this.f76898b = nVar;
    }

    public final void accept(Object obj) {
        C28226aa aaVar = this.f76897a;
        int i = C28229ad.f76850c;
        aaVar.f76842c.accept(this.f76898b, (C63042fg) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
