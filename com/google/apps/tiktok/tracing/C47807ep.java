package com.google.apps.tiktok.tracing;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.apps.tiktok.tracing.ep */
/* compiled from: PG */
final class C47807ep implements C60931s {

    /* renamed from: a */
    final /* synthetic */ C47572bw f123817a;

    /* renamed from: b */
    final /* synthetic */ C60931s f123818b;

    public C47807ep(C47572bw bwVar, C60931s sVar) {
        this.f123817a = bwVar;
        this.f123818b = sVar;
    }

    public final C60870cx apply(Object obj) {
        C47572bw h = C47831fm.m85013h(this.f123817a);
        try {
            C60870cx apply = this.f123818b.apply(obj);
            C47831fm.m85013h(h);
            return apply;
        } catch (Throwable th) {
            C47831fm.m85013h(h);
            throw th;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f123818b);
        return "propagating=[" + valueOf + "]";
    }
}
