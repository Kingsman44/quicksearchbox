package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9012a.p9016d.C119692k;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9011b.p9028d.p9032d.C119736a;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c;
import com.google.android.libraries.search.assistant.p2511d.C32534ai;
import com.google.android.libraries.search.assistant.p2511d.C32542e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60904dr;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.bk */
/* compiled from: PG */
final class C120221bk implements C120601c {

    /* renamed from: a */
    public final C32534ai f334556a;

    /* renamed from: b */
    public final C60870cx f334557b;

    /* renamed from: c */
    public final Executor f334558c;

    /* renamed from: d */
    public final C119692k f334559d;

    /* renamed from: e */
    public final C119736a f334560e;

    /* renamed from: f */
    public boolean f334561f = false;

    public C120221bk(Executor executor, C119692k kVar, C119736a aVar) {
        C32534ai aiVar = new C32534ai(executor);
        this.f334556a = aiVar;
        this.f334557b = aiVar.mo38134b();
        this.f334558c = new C60904dr(executor);
        this.f334559d = kVar;
        this.f334560e = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo104690a(C32542e eVar) {
        return this.f334556a.mo38133a(new C120215be(this, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo104691b(Throwable th) {
        this.f334558c.execute(C47810es.m84977q(new C120218bh(this, th)));
    }
}
