package com.google.android.apps.gsa.staticplugins.bisto.p7520u;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.c */
/* compiled from: PG */
final class C96049c extends AudioDeviceCallback {

    /* renamed from: c */
    public static final /* synthetic */ int f268927c = 0;

    /* renamed from: a */
    public boolean f268928a;

    /* renamed from: b */
    final /* synthetic */ C96056f f268929b;

    public C96049c(C96056f fVar) {
        this.f268929b = fVar;
    }

    /* renamed from: a */
    private final void m159306a() {
        if (this.f268928a) {
            C59104x d = C96056f.f268937a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AudioRouteManagerImpl");
            ((C59052c) ((C59052c) d).mo56372aa(15506)).mo56386p("scheduleUpdateRoute when closed. Ignore.");
            return;
        }
        C60870cx cxVar = this.f268929b.f268946j;
        if (cxVar != null) {
            cxVar.cancel(false);
        }
        C96056f fVar = this.f268929b;
        fVar.f268946j = fVar.f268940d.mo28208h("audio-route-changed", C96056f.f268938b.toMillis(), new C95879b(this.f268929b));
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C59071e eVar = C96056f.f268937a;
        C58976aa aaVar = C58975e.f156826a;
        m159306a();
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C59071e eVar = C96056f.f268937a;
        C58976aa aaVar = C58975e.f156826a;
        m159306a();
    }
}
