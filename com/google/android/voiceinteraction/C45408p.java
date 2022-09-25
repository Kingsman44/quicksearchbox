package com.google.android.voiceinteraction;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.assistant.auto.jumpboost.p649a.p663j.C11445a;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.voiceinteraction.p */
/* compiled from: PG */
final class C45408p extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ GsaVoiceInteractionService f118782a;

    public C45408p(GsaVoiceInteractionService gsaVoiceInteractionService) {
        this.f118782a = gsaVoiceInteractionService;
    }

    public final void onReceive(Context context, Intent intent) {
        C69464a aVar;
        if ("action_auto_projected_client_info".equals(intent.getAction()) && (aVar = this.f118782a.f118689ak) != null) {
            ((C11445a) aVar.mo17428b()).f37229a = intent.getBooleanExtra("extra_auto_projected_client_active", false);
        }
    }
}
