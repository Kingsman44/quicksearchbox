package com.google.android.libraries.web.webview.p3471a;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.web.webview.a.i */
/* compiled from: PG */
public final class C44325i {

    /* renamed from: a */
    public final Set f115250a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private final Executor f115251b;

    public C44325i(Executor executor) {
        this.f115251b = executor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47222a() {
        C44324h hVar = new C44324h(this);
        C46459k.m82829b(C60856cj.m92903l(C47810es.m84977q(hVar), this.f115251b), "Failed to run WebViewDataOwnerChangeListeners", new Object[0]);
    }
}
