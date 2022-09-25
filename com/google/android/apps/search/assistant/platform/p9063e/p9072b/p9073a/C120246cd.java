package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.cd */
/* compiled from: PG */
public final class C120246cd {

    /* renamed from: a */
    public final C32534ai f334605a;

    /* renamed from: b */
    public final AtomicBoolean f334606b = new AtomicBoolean(false);

    public C120246cd(Executor executor) {
        this.f334605a = new C32534ai(executor);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo104707a(Throwable th) {
        this.f334606b.set(true);
        this.f334605a.mo38135c(th);
    }
}
