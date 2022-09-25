package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;

/* renamed from: androidx.activity.f */
/* compiled from: PG */
final class C0793f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f2737a;

    /* renamed from: b */
    final /* synthetic */ IntentSender.SendIntentException f2738b;

    /* renamed from: c */
    final /* synthetic */ C0794g f2739c;

    public C0793f(C0794g gVar, int i, IntentSender.SendIntentException sendIntentException) {
        this.f2739c = gVar;
        this.f2737a = i;
        this.f2738b = sendIntentException;
    }

    public final void run() {
        this.f2739c.mo3363f(this.f2737a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f2738b));
    }
}
