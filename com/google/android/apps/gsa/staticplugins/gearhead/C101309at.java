package com.google.android.apps.gsa.staticplugins.gearhead;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.at */
/* compiled from: PG */
final class C101309at extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C101325be f282722a;

    public C101309at(C101325be beVar) {
        this.f282722a = beVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null && "com.google.android.apps.gsa.staticplugins.gearhead.TRIGGER_VOICE_SESSION".equals(intent.getAction())) {
            ((C58970a) ((C58970a) C101325be.f282743a.mo56224b()).mo56372aa(19974)).mo56386p("Received voice session for car microphone triggering intent.");
            C101325be beVar = this.f282722a;
            C101332bl blVar = beVar.f282780j;
            Objects.requireNonNull(blVar);
            beVar.mo92237n("trigger-voice-session", new C101308as(blVar));
        }
    }
}
