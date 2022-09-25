package com.google.android.libraries.search.assistant.performer.p2754f.p2756b;

import com.google.android.libraries.search.assistant.performer.p2754f.p2755a.C36000a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.grpc.C47686k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.C52070ec;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.search.assistant.performer.f.b.i */
/* compiled from: PG */
public final class C36009i extends C36001a implements C36000a {

    /* renamed from: a */
    public static final C59071e f94212a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.f.b.i");

    /* renamed from: b */
    public final CopyOnWriteArraySet f94213b = new CopyOnWriteArraySet();

    /* renamed from: c */
    private final Executor f94214c;

    public C36009i(C60887da daVar) {
        this.f94214c = new C60904dr(daVar);
    }

    /* renamed from: a */
    public final C60870cx mo39926a(C51809dy dyVar) {
        this.f94214c.execute(C47810es.m84977q(new C36006f(this, dyVar)));
        return C47633f.m84733g(C60856cj.m92900i(C52070ec.f136651d));
    }

    /* renamed from: b */
    public final C70862aj mo39927b(C70862aj ajVar) {
        this.f94214c.execute(C47810es.m84977q(new C36005e(this, ajVar)));
        return C47686k.m84827a(new C36008h(this, ajVar));
    }

    /* renamed from: c */
    public final void mo39931c(C70862aj ajVar) {
        this.f94214c.execute(C47810es.m84977q(new C36007g(this, ajVar)));
    }
}
