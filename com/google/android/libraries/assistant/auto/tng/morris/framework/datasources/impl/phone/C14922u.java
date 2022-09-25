package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone;

import android.telecom.CallAudioState;
import com.google.android.gms.car.C143145ca;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.phone.u */
/* compiled from: PG */
public final /* synthetic */ class C14922u implements C14895ah {

    /* renamed from: a */
    public final /* synthetic */ CallAudioState f44857a;

    public /* synthetic */ C14922u(CallAudioState callAudioState) {
        this.f44857a = callAudioState;
    }

    /* renamed from: a */
    public final void mo21795a(C143145ca caVar) {
        CallAudioState callAudioState = this.f44857a;
        caVar.mo21844b(callAudioState.isMuted(), callAudioState.getRoute(), callAudioState.getSupportedRouteMask());
    }
}
