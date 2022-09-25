package com.google.android.apps.gsa.nga.engine.p6044n.p6045a.p6047b;

import com.google.android.apps.gsa.nga.engine.p5913am.p5917c.p5918a.C74872a;
import com.google.common.p4522b.C58485gu;
import java.util.UUID;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.a.b.c */
/* compiled from: PG */
public final /* synthetic */ class C76260c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C74872a f211278a;

    public /* synthetic */ C76260c(C74872a aVar) {
        this.f211278a = aVar;
    }

    public final void accept(Object obj) {
        this.f211278a.c.mo55429h("uuid", C58485gu.m89846n(((UUID) obj).toString()));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
