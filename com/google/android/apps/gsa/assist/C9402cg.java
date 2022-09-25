package com.google.android.apps.gsa.assist;

import android.service.voice.VoiceInteractionSessionService;
import com.google.android.apps.gsa.binaries.satin.app.amb;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.staticplugins.opa.C109714ms;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import dagger.hilt.android.internal.managers.C68326i;
import dagger.hilt.p5299a.C68288b;
import dagger.p5294a.C68219e;

/* renamed from: com.google.android.apps.gsa.assist.cg */
/* compiled from: PG */
abstract class C9402cg extends VoiceInteractionSessionService implements C68288b {

    /* renamed from: a */
    private volatile C68326i f32667a;

    /* renamed from: b */
    private final Object f32668b = new Object();

    /* renamed from: c */
    private boolean f32669c = false;

    /* renamed from: b */
    public final C68326i mo17652b() {
        if (this.f32667a == null) {
            synchronized (this.f32668b) {
                if (this.f32667a == null) {
                    this.f32667a = new C68326i(this);
                }
            }
        }
        return this.f32667a;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        return mo17652b().mo17653jN();
    }

    public void onCreate() {
        if (!this.f32669c) {
            this.f32669c = true;
            GsaVoiceInteractionSessionService gsaVoiceInteractionSessionService = (GsaVoiceInteractionSessionService) this;
            amb amb = (amb) mo17652b().mo17653jN();
            gsaVoiceInteractionSessionService.f32308a = C68219e.m98518a(amb.f197807b.b.f200334hd);
            gsaVoiceInteractionSessionService.f32309b = (C58833ax) amb.f197807b.a.f202972hE.mo17428b();
            gsaVoiceInteractionSessionService.f32313f = (C109714ms) amb.f197807b.fu.mo17428b();
            C90021c cVar = (C90021c) amb.f197807b.a.f202006C.mo17428b();
            gsaVoiceInteractionSessionService.f32310c = (C22871g) amb.f197807b.aT.mo17428b();
        }
        super.onCreate();
    }
}
