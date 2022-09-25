package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

import android.media.session.PlaybackState;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57740d;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4403c.p4404a.p4405a.C57741e;
import p5488io.p5490b.p5496d.C69822d;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.ae */
/* compiled from: PG */
public final /* synthetic */ class C129031ae implements C69822d {

    /* renamed from: a */
    public final /* synthetic */ PlaybackState f354491a;

    public /* synthetic */ C129031ae(PlaybackState playbackState) {
        this.f354491a = playbackState;
    }

    /* renamed from: a */
    public final Object mo25875a(Object obj) {
        PlaybackState playbackState = this.f354491a;
        C57741e eVar = (C57741e) obj;
        int i = 3;
        if (playbackState.getState() == 3) {
            i = 4;
        } else if (playbackState.getState() != 2) {
            i = 2;
        }
        boolean z = true;
        boolean z2 = (playbackState.getActions() & 16) == 16;
        if ((playbackState.getActions() & 32) != 32) {
            z = false;
        }
        C57740d dVar = (C57740d) eVar.toBuilder();
        dVar.copyOnWrite();
        C57741e eVar2 = (C57741e) dVar.instance;
        eVar2.f154265g = i - 1;
        eVar2.f154259a |= 128;
        dVar.copyOnWrite();
        C57741e eVar3 = (C57741e) dVar.instance;
        eVar3.f154259a |= 512;
        eVar3.f154267i = z2;
        dVar.copyOnWrite();
        C57741e eVar4 = (C57741e) dVar.instance;
        eVar4.f154259a |= 256;
        eVar4.f154266h = z;
        return (C57741e) dVar.build();
    }
}
