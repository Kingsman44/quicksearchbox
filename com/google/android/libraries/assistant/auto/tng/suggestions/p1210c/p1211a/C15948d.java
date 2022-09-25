package com.google.android.libraries.assistant.auto.tng.suggestions.p1210c.p1211a;

import com.google.android.libraries.assistant.auto.tng.suggestions.p1270m.C16408a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.c.a.d */
/* compiled from: PG */
public final class C15948d {

    /* renamed from: a */
    public static final C59071e f47319a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.c.a.d");

    /* renamed from: b */
    public final C16408a f47320b;

    /* renamed from: c */
    public final Executor f47321c;

    /* renamed from: d */
    public final C69464a f47322d;

    /* renamed from: e */
    public final C69464a f47323e;

    public C15948d(C16408a aVar, Executor executor, C69464a aVar2, C69464a aVar3) {
        this.f47320b = aVar;
        this.f47321c = executor;
        this.f47322d = aVar2;
        this.f47323e = aVar3;
    }

    /* renamed from: a */
    public final C60870cx mo22622a() {
        C60870cx b = this.f47320b.mo22916b("voiceplate_immersive_display_id");
        C15945a aVar = new C15945a(this);
        C60870cx h = C60922j.m93045h(b, C47810es.m84966f(aVar), this.f47321c);
        C15946b bVar = new C15946b(this);
        return C60846c.m92878g(h, Throwable.class, C47810es.m84963c(bVar), this.f47321c);
    }
}
