package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p759a.p767b.p768a.p769a;

import com.google.android.libraries.assistant.assistantactions.p621c.p622a.C11059d;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.a.b.a.a.c */
/* compiled from: PG */
public final class C12194c implements C11059d {

    /* renamed from: a */
    private final C42876ab f38907a;

    /* renamed from: b */
    private final Executor f38908b;

    public C12194c(C42876ab abVar, Executor executor) {
        this.f38907a = abVar;
        this.f38908b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo19527a(String str, String str2) {
        return this.f38907a.mo46039a(new C12192a(str, str2), this.f38908b);
    }

    /* renamed from: b */
    public final C60870cx mo19528b(String str) {
        C60870cx d = this.f38907a.mo46042d();
        C12193b bVar = new C12193b(str);
        return C60922j.m93044g(d, C47810es.m84963c(bVar), this.f38908b);
    }
}
