package com.google.android.libraries.search.assistant.performer.communication.p2732a.p2733a;

import android.telephony.PhoneStateListener;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.assistant.performer.communication.a.a.i */
/* compiled from: PG */
final class C35499i extends PhoneStateListener {

    /* renamed from: a */
    final /* synthetic */ C35505o f93224a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35499i(C35505o oVar, Executor executor) {
        super(executor);
        this.f93224a = oVar;
    }

    public final void onCallStateChanged(int i, String str) {
        this.f93224a.mo39678a(i);
    }
}
