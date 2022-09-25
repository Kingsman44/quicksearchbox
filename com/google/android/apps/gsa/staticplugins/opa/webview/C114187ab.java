package com.google.android.apps.gsa.staticplugins.opa.webview;

import com.google.android.apps.gsa.search.core.webview.C87262h;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.webview.ab */
/* compiled from: PG */
final class C114187ab implements C87262h {

    /* renamed from: a */
    public final SettableFuture f316598a = new SettableFuture();

    /* renamed from: b */
    public final SettableFuture f316599b;

    /* renamed from: c */
    private final C60870cx f316600c;

    public C114187ab(C22871g gVar) {
        SettableFuture settableFuture = new SettableFuture();
        this.f316599b = settableFuture;
        this.f316600c = C90877ak.m148471e(settableFuture, 5, TimeUnit.MINUTES, gVar);
    }

    /* renamed from: a */
    public final C60870cx mo80876a() {
        return this.f316598a;
    }

    /* renamed from: b */
    public final C60870cx mo80877b() {
        return this.f316600c;
    }

    /* renamed from: c */
    public final void mo101243c() {
        this.f316598a.cancel(true);
        this.f316600c.cancel(true);
    }
}
