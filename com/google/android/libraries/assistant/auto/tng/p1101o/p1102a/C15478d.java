package com.google.android.libraries.assistant.auto.tng.p1101o.p1102a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.o.a.d */
/* compiled from: PG */
public final class C15478d {

    /* renamed from: a */
    public static final C59071e f46426a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.o.a.d");

    /* renamed from: b */
    public final Map f46427b = new HashMap();

    /* renamed from: c */
    public final Executor f46428c;

    public C15478d(Executor executor) {
        this.f46428c = new C60904dr(executor);
    }

    /* renamed from: a */
    public final C60870cx mo22361a(Long l) {
        C15477c cVar = new C15477c(this, l);
        return C60856cj.m92904m(C47810es.m84978r(cVar), this.f46428c);
    }
}
