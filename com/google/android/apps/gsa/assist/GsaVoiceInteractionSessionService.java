package com.google.android.apps.gsa.assist;

import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import com.google.android.apps.gsa.nga.api.C74718bv;
import com.google.android.apps.gsa.nga.api.C74720bx;
import com.google.android.apps.gsa.nga.api.NgaState;
import com.google.android.apps.gsa.nga.shared.p6324an.C80938a;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.staticplugins.opa.C109714ms;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* compiled from: PG */
public class GsaVoiceInteractionSessionService extends C9402cg implements C74718bv {

    /* renamed from: g */
    private static final C59071e f32307g = C59071e.m91332i("com.google.android.apps.gsa.assist.GsaVoiceInteractionSessionService");

    /* renamed from: a */
    public C68214a f32308a;

    /* renamed from: b */
    public C58833ax f32309b;

    /* renamed from: c */
    public C22871g f32310c;

    /* renamed from: d */
    public final Object f32311d = new Object();

    /* renamed from: e */
    public VoiceInteractionSession f32312e = null;

    /* renamed from: f */
    public C109714ms f32313f;

    /* renamed from: a */
    public final void mo17497a(NgaState ngaState) {
        this.f32310c.mo28212l("[NGA] Maybe finish the current session", new C9399cd(this, ngaState));
    }

    public final void onCreate() {
        C74507e.m120466b(2);
        super.onCreate();
    }

    public final VoiceInteractionSession onNewSession(Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f32311d) {
            if (!this.f32309b.mo56113h() || !((C74720bx) this.f32309b.mo56107c()).mo71089f().a()) {
                if (this.f32309b.mo56113h()) {
                    ((C74720bx) this.f32309b.mo56107c()).mo71090g(this);
                }
                C9397cb a = ((C9398cc) this.f32308a.mo27525b()).mo17630a(bundle, this, C58836b.f156633a);
                this.f32312e = a;
                return a;
            }
            this.f32312e = null;
            C59104x b = f32307g.mo56224b();
            b.mo56378ag(C58975e.f156826a, "GsaVoiceInteractSessSvc");
            ((C59052c) ((C59052c) b).mo56372aa(142)).mo56386p("onNewSession - NgaState is out of sync between :search and :interactor, using InstantlyFinishingVis.");
            C80938a aVar = new C80938a(this);
            return aVar;
        }
    }
}
