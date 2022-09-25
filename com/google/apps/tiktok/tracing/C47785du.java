package com.google.apps.tiktok.tracing;

/* renamed from: com.google.apps.tiktok.tracing.du */
/* compiled from: PG */
final class C47785du extends C47571bv {

    /* renamed from: b */
    final /* synthetic */ C47572bw f123771b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47785du(C47558bi biVar, C47572bw bwVar) {
        super(biVar);
        this.f123771b = bwVar;
    }

    public final void close() {
        this.f123460a.close();
        C47572bw bwVar = this.f123771b;
        if (bwVar != null) {
            C47831fm.m85013h(bwVar);
        }
    }
}
