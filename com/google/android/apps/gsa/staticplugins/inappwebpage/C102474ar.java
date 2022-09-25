package com.google.android.apps.gsa.staticplugins.inappwebpage;

import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6513aj.C84563w;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.ar */
/* compiled from: PG */
final class C102474ar {

    /* renamed from: a */
    final /* synthetic */ C102475as f285986a;

    /* renamed from: b */
    private boolean f285987b = false;

    /* renamed from: c */
    private boolean f285988c = false;

    public C102474ar(C102475as asVar) {
        this.f285986a = asVar;
    }

    /* renamed from: d */
    private final boolean m169930d() {
        if (this.f285988c) {
            return false;
        }
        this.f285988c = true;
        this.f285986a.mo93293a("Page ready to be shown");
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo93290a() {
        this.f285987b = true;
        this.f285986a.mo93293a("delayedPageLoad");
    }

    /* renamed from: b */
    public final synchronized boolean mo93291b(String str) {
        this.f285986a.mo93293a(new C84563w("pageLoadFinished %s", C85929cw.m138091v(str)));
        if (this.f285987b) {
            return false;
        }
        return m169930d();
    }

    /* renamed from: c */
    public final synchronized boolean mo93292c() {
        this.f285987b = true;
        this.f285986a.mo93293a("pageReady");
        return m169930d();
    }
}
