package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.libraries.geller.portable.C21943ai;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5129p.p5131b.C65753ak;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.aw */
/* compiled from: PG */
public final class C100911aw implements C21943ai {

    /* renamed from: a */
    public static final C59071e f281934a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.i.aw");

    /* renamed from: b */
    public static final C58528ij f281935b = C58528ij.m90011K(C65753ak.ASSISTANT_HISTORY, C65753ak.WEB_SEARCH);

    /* renamed from: c */
    public final C68214a f281936c;

    /* renamed from: d */
    public final C68214a f281937d;

    /* renamed from: e */
    private final Executor f281938e;

    public C100911aw(C68214a aVar, C68214a aVar2, Executor executor) {
        this.f281936c = aVar;
        this.f281937d = aVar2;
        this.f281938e = executor;
    }

    /* renamed from: a */
    public final void mo27224a(String str, C65753ak akVar) {
        this.f281938e.execute(C47810es.m84977q(new C100910av(this, str, akVar)));
    }
}
