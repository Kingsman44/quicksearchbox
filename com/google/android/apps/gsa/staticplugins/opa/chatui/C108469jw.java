package com.google.android.apps.gsa.staticplugins.opa.chatui;

import android.media.session.MediaController;
import android.media.session.PlaybackState;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.jw */
/* compiled from: PG */
public final /* synthetic */ class C108469jw implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C108474ka f301703a;

    public /* synthetic */ C108469jw(C108474ka kaVar) {
        this.f301703a = kaVar;
    }

    /* renamed from: a */
    public final void mo25795a() {
        PlaybackState playbackState;
        C108474ka kaVar = this.f301703a;
        MediaController mediaController = ((C108331et) kaVar.f301723g.mo27525b()).f301347f;
        if (mediaController == null) {
            playbackState = null;
        } else {
            playbackState = mediaController.getPlaybackState();
        }
        kaVar.mo96790b(playbackState);
    }
}
