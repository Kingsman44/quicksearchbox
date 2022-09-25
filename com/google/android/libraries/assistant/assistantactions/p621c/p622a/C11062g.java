package com.google.android.libraries.assistant.assistantactions.p621c.p622a;

import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.a.g */
/* compiled from: PG */
public final class C11062g implements C11059d {

    /* renamed from: a */
    private final C42876ab f36310a;

    /* renamed from: b */
    private final Executor f36311b;

    public C11062g(C42876ab abVar, C90851k kVar) {
        this.f36310a = abVar;
        this.f36311b = kVar.mo85208a("FluidActionsDataStoreExecutor");
    }

    /* renamed from: a */
    public final C60870cx mo19527a(String str, String str2) {
        return this.f36310a.mo46039a(new C11060e(str, str2), this.f36311b);
    }

    /* renamed from: b */
    public final C60870cx mo19528b(String str) {
        return C60922j.m93044g(this.f36310a.mo46042d(), new C11061f(str), this.f36311b);
    }
}
