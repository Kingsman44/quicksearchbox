package com.google.android.apps.gsa.assist;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;

/* renamed from: com.google.android.apps.gsa.assist.bu */
/* compiled from: PG */
final class C9380bu extends C9396ca {

    /* renamed from: d */
    private final VoiceInteractionSession.CommandRequest f32540d;

    public C9380bu(C9397cb cbVar, VoiceInteractionSession.CommandRequest commandRequest) {
        super(cbVar, commandRequest);
        this.f32540d = commandRequest;
    }

    /* renamed from: a */
    public final int mo17556a() {
        return 1;
    }

    /* renamed from: d */
    public final String mo17559d() {
        return this.f32540d.getCommand();
    }

    /* renamed from: e */
    public final void mo17560e(Bundle bundle) {
        if (mo17592m()) {
            this.f32540d.sendResult(bundle);
        }
    }

    /* renamed from: f */
    public final void mo17561f(Bundle bundle) {
        if (mo17592m()) {
            this.f32540d.sendResult(bundle);
        }
    }
}
