package com.google.android.apps.gsa.nga.engine.recognition.concurrency;

/* renamed from: com.google.android.apps.gsa.nga.engine.recognition.concurrency.a */
/* compiled from: PG */
public final /* synthetic */ class C77605a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ MicConcurrencyActivity f213812a;

    public /* synthetic */ C77605a(MicConcurrencyActivity micConcurrencyActivity) {
        this.f213812a = micConcurrencyActivity;
    }

    public final void run() {
        MicConcurrencyActivity micConcurrencyActivity = this.f213812a;
        micConcurrencyActivity.f213811b.mo28212l("[NGA] handle on finish", new C77606b(micConcurrencyActivity));
    }
}
