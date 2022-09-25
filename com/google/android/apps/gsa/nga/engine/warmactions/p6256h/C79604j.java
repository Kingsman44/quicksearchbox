package com.google.android.apps.gsa.nga.engine.warmactions.p6256h;

import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79569ab;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.p4543n.p4545b.C59364ae;
import java.util.Collections;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.h.j */
/* compiled from: PG */
public final /* synthetic */ class C79604j implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C91006f f218393a;

    public /* synthetic */ C79604j(C91006f fVar) {
        this.f218393a = fVar;
    }

    public final void accept(Object obj) {
        C91006f fVar = this.f218393a;
        int i = C79605k.f218396c;
        fVar.mo85291r("MWW config");
        C59364ae.m92266l(Collections.unmodifiableMap(((C79569ab) obj).f218319b)).mo56891b(C79600f.f218388a).mo56897g(new C79601g(fVar));
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
