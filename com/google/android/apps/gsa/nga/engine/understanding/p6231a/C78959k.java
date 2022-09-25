package com.google.android.apps.gsa.nga.engine.understanding.p6231a;

import com.google.android.apps.gsa.nga.shared.p6407v.C83320io;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.understanding.a.k */
/* compiled from: PG */
public final /* synthetic */ class C78959k implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C78968t f217194a;

    /* renamed from: b */
    public final /* synthetic */ C83320io f217195b;

    public /* synthetic */ C78959k(C78968t tVar, C83320io ioVar) {
        this.f217194a = tVar;
        this.f217195b = ioVar;
    }

    public final void accept(Object obj) {
        C78968t tVar = this.f217194a;
        C83320io ioVar = this.f217195b;
        tVar.f217218f.mo74237c((C89849ae) obj, ioVar);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
