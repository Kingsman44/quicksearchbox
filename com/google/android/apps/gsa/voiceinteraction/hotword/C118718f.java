package com.google.android.apps.gsa.voiceinteraction.hotword;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.voiceinteraction.hotword.f */
/* compiled from: PG */
final class C118718f extends Handler {

    /* renamed from: a */
    final /* synthetic */ C118719g f331137a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C118718f(C118719g gVar) {
        super(Looper.getMainLooper());
        this.f331137a = gVar;
    }

    public final void handleMessage(Message message) {
        C58976aa aaVar = C58975e.f156826a;
        int i = message.what;
        if (message.what == 1) {
            try {
                this.f331137a.mo103916h();
            } catch (IllegalArgumentException unused) {
            }
        }
    }
}
