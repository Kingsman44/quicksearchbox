package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6394n.p6396b;

import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.n.b.h */
/* compiled from: PG */
public final /* synthetic */ class C81939h implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81941j f224034a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f224035b;

    public /* synthetic */ C81939h(C81941j jVar, Consumer consumer) {
        this.f224034a = jVar;
        this.f224035b = consumer;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81941j jVar = this.f224034a;
        Consumer consumer = this.f224035b;
        C22871g gVar = jVar.f224039a;
        Objects.requireNonNull(consumer);
        new C90873ag((C60870cx) obj, gVar, "[NGA] textFuture", new C81937f(consumer)).mo85223a(C81938g.f224033a);
    }
}
