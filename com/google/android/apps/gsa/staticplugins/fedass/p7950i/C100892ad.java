package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.android.apps.gsa.staticplugins.fedass.p7939a.C100719ab;
import com.google.android.libraries.assistant.trainingcache.p1617b.C19435g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.ad */
/* compiled from: PG */
public final class C100892ad implements C100935r {

    /* renamed from: a */
    public static final C59071e f281886a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.fedass.i.ad");

    /* renamed from: b */
    public final C68214a f281887b;

    /* renamed from: c */
    public final C68214a f281888c;

    /* renamed from: d */
    public final C68214a f281889d;

    /* renamed from: e */
    public final C68214a f281890e;

    /* renamed from: f */
    public final Executor f281891f;

    public C100892ad(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, Executor executor) {
        this.f281887b = aVar;
        this.f281888c = aVar2;
        this.f281889d = aVar3;
        this.f281890e = aVar4;
        this.f281891f = executor;
    }

    /* renamed from: a */
    public final C60870cx mo92084a() {
        ((C19435g) this.f281890e.mo27525b()).mo24621c("Sheldon.PeriodicTask", -1);
        C60870cx g = ((C100719ab) this.f281887b.mo27525b()).mo92023g();
        C100936s sVar = new C100936s(this);
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(sVar), this.f281891f);
        C100938u uVar = new C100938u(this);
        return C60846c.m92878g(h, Throwable.class, C47810es.m84963c(uVar), this.f281891f);
    }
}
