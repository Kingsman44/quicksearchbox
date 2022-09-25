package com.google.android.apps.gsa.assistant.handoff;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.m */
/* compiled from: PG */
final class C9480m implements Runnable {

    /* renamed from: a */
    final /* synthetic */ BrowserControlActivity f32915a;

    public C9480m(BrowserControlActivity browserControlActivity) {
        this.f32915a = browserControlActivity;
    }

    public final void run() {
        this.f32915a.finish();
        this.f32915a.overridePendingTransition(0, 0);
    }
}
