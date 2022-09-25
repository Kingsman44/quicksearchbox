package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.p9794a;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import com.google.common.p4526f.C59052c;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57778j;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.C70129u;
import p5488io.p5490b.p5496d.C69819a;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5517i.C70101a;
import p5488io.p5490b.p5518j.C70111i;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.a.aa */
/* compiled from: PG */
public final /* synthetic */ class C129027aa implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C129037ak f354486a;

    /* renamed from: b */
    public final /* synthetic */ MediaController f354487b;

    public /* synthetic */ C129027aa(C129037ak akVar, MediaController mediaController) {
        this.f354486a = akVar;
        this.f354487b = mediaController;
    }

    /* renamed from: a */
    public final void mo25795a() {
        C129037ak akVar = this.f354486a;
        PlaybackState playbackState = this.f354487b.getPlaybackState();
        if (akVar.f354502d != null && playbackState != null) {
            if (playbackState.getState() == 7) {
                ((C59052c) ((C59052c) C129037ak.f354499a.mo56225c()).mo56372aa(38113)).mo56386p("PlaybackState.STATE_ERROR");
            } else if ((playbackState.getState() == 0 || playbackState.getState() == 1 || playbackState.getState() == 3 || playbackState.getState() == 2) && akVar.f354505g.mo56113h() && !((C57778j) akVar.f354505g.mo56107c()).f154371a.isEmpty()) {
                String str = ((C57778j) akVar.f354505g.mo56107c()).f154371a;
                C70129u j = akVar.f354502d.mo26139b(str).mo61651i(C129062u.f354550a).mo61652l(C129028ab.f354488a).mo61652l(C129029ac.f354489a).mo61657s().mo61671k(new C129030ad(akVar)).mo61670j(new C129031ae(playbackState));
                C70128t tVar = C70111i.f186862c;
                C69822d dVar = C70101a.f186841i;
                akVar.f354501c.mo61462b(j.mo61672l(tVar).mo61667e(C129032af.f354492a).mo61668f(new C129033ag(akVar, str)).mo61673m());
            }
        }
    }
}
