package com.google.apps.tiktok.tracing.contrib.p3708i.p3713d;

import android.support.p033v7.widget.C0656fr;
import com.google.apps.tiktok.tracing.C47538ax;

/* renamed from: com.google.apps.tiktok.tracing.contrib.i.d.l */
/* compiled from: PG */
public final class C47721l extends C0656fr {

    /* renamed from: a */
    final /* synthetic */ String f123689a = "FilterCarousel fling";

    /* renamed from: b */
    final /* synthetic */ C0656fr f123690b;

    /* renamed from: c */
    final /* synthetic */ C47722m f123691c;

    public C47721l(C47722m mVar, C0656fr frVar) {
        this.f123691c = mVar;
        this.f123690b = frVar;
    }

    /* renamed from: e */
    public final boolean mo3014e(int i, int i2) {
        C47538ax c = this.f123691c.f123692a.mo51613c(this.f123689a);
        try {
            boolean e = this.f123690b.mo3014e(i, i2);
            if (c != null) {
                c.close();
            }
            return e;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
