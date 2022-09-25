package com.google.apps.tiktok.tracing;

import android.view.ViewTreeObserver;
import com.google.android.libraries.search.video.conductor.C41484g;

/* renamed from: com.google.apps.tiktok.tracing.ct */
/* compiled from: PG */
public final /* synthetic */ class C47755ct implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123734a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f123735b;

    /* renamed from: c */
    public final /* synthetic */ String f123736c = "layout changed";

    public /* synthetic */ C47755ct(C47770dh dhVar, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f123734a = dhVar;
        this.f123735b = onGlobalLayoutListener;
    }

    public final void onGlobalLayout() {
        C47770dh dhVar = this.f123734a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f123735b;
        String str = this.f123736c;
        if (!C47831fm.m85027v()) {
            C47538ax c = dhVar.mo51613c(str);
            try {
                ((C41484g) onGlobalLayoutListener).f108376a.mo44000a();
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47574by.m84679a(th, th);
            }
        } else {
            ((C41484g) onGlobalLayoutListener).f108376a.mo44000a();
            return;
        }
        throw th;
    }
}
