package com.google.android.apps.gsa.nga.shared.p6328ap;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import com.google.android.apps.gsa.nga.api.C74726cf;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80963a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.nga.shared.ap.k */
/* compiled from: PG */
public final class C80991k implements C80963a, C74726cf {

    /* renamed from: a */
    public final VoiceInteractionSession f222009a;

    /* renamed from: b */
    private final C22871g f222010b;

    public C80991k(VoiceInteractionSession voiceInteractionSession, C22871g gVar) {
        this.f222009a = voiceInteractionSession;
        this.f222010b = gVar;
    }

    /* renamed from: a */
    public final int mo71101a() {
        return this.f222009a.getUserDisabledShowContext();
    }

    /* renamed from: b */
    public final void mo71102b() {
        this.f222009a.closeSystemDialogs();
    }

    /* renamed from: c */
    public final void mo71103c() {
    }

    /* renamed from: d */
    public final void mo74736d() {
        C22871g gVar = this.f222010b;
        VoiceInteractionSession voiceInteractionSession = this.f222009a;
        Objects.requireNonNull(voiceInteractionSession);
        gVar.mo28212l("[NGA] hide", new C80990j(voiceInteractionSession));
    }

    /* renamed from: e */
    public final void mo71105e(int i) {
        this.f222009a.setDisabledShowContext(i);
    }

    /* renamed from: f */
    public final void mo74737f(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("START_ASSISTANT_ACTIVITY_INTENT", intent);
        this.f222009a.show(bundle, 0);
    }

    /* renamed from: g */
    public final void mo74738g(Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("START_VOICE_ACTIVITY_INTENT", intent);
        this.f222009a.show(bundle, 0);
    }

    /* renamed from: h */
    public final void mo74739h(Configuration configuration) {
        this.f222009a.onConfigurationChanged(configuration);
    }
}
