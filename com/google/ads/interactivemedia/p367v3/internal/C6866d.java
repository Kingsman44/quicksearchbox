package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;

/* renamed from: com.google.ads.interactivemedia.v3.internal.d */
/* compiled from: PG */
public final class C6866d {

    /* renamed from: a */
    private boolean f21829a;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo15647a() {
        return this.f21829a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15648b(Context context) {
        C7009ih.m20724b(context, "Application Context cannot be null");
        if (!this.f21829a) {
            this.f21829a = true;
            C7379w.m22239a().mo16704b(context);
            C7244r.m21679a().mo16350b(context);
            C6789ah.m18699a(context);
            C7298t.m21774a().mo16512c(context);
        }
    }
}
