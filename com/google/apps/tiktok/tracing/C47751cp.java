package com.google.apps.tiktok.tracing;

import android.view.ViewTreeObserver;
import com.google.android.libraries.search.video.conductor.C41483f;

/* renamed from: com.google.apps.tiktok.tracing.cp */
/* compiled from: PG */
public final /* synthetic */ class C47751cp implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123722a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserver.OnScrollChangedListener f123723b;

    /* renamed from: c */
    public final /* synthetic */ String f123724c = "scroll changed";

    public /* synthetic */ C47751cp(C47770dh dhVar, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f123722a = dhVar;
        this.f123723b = onScrollChangedListener;
    }

    public final void onScrollChanged() {
        C47770dh dhVar = this.f123722a;
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.f123723b;
        String str = this.f123724c;
        if (!C47831fm.m85027v()) {
            C47538ax c = dhVar.mo51613c(str);
            try {
                ((C41483f) onScrollChangedListener).f108375a.mo44001b();
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47574by.m84679a(th, th);
            }
        } else {
            ((C41483f) onScrollChangedListener).f108375a.mo44001b();
            return;
        }
        throw th;
    }
}
