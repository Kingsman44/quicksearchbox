package com.google.android.libraries.search.video.conductor;

import android.view.ViewTreeObserver;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.android.libraries.search.video.conductor.h */
/* compiled from: PG */
public final /* synthetic */ class C41485h implements ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ VideoViewTreeObserver f108377a;

    public /* synthetic */ C41485h(VideoViewTreeObserver videoViewTreeObserver) {
        this.f108377a = videoViewTreeObserver;
    }

    public final void onWindowFocusChanged(boolean z) {
        VideoViewTreeObserver videoViewTreeObserver = this.f108377a;
        C47538ax c = videoViewTreeObserver.f108363d.mo51613c("window focus changed");
        try {
            videoViewTreeObserver.mo44002c(z);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
