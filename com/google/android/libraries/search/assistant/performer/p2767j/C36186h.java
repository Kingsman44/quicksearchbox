package com.google.android.libraries.search.assistant.performer.p2767j;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.android.libraries.search.assistant.performer.p2728a.C35470f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.j.h */
/* compiled from: PG */
public final class C36186h {

    /* renamed from: a */
    public static final C59071e f94548a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.j.h");

    /* renamed from: b */
    private final C35470f f94549b;

    /* renamed from: c */
    private final Executor f94550c;

    public C36186h(C35470f fVar, Executor executor) {
        this.f94549b = fVar;
        this.f94550c = executor;
    }

    /* renamed from: a */
    public final C60870cx mo40003a(Intent intent) {
        C60870cx f = this.f94549b.mo20101f(intent);
        C36184f fVar = new C36184f();
        C60870cx g = C60922j.m93044g(f, C47810es.m84963c(fVar), this.f94550c);
        C36185g gVar = new C36185g(intent);
        return C60846c.m92878g(g, ActivityNotFoundException.class, C47810es.m84963c(gVar), this.f94550c);
    }
}
