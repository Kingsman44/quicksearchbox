package com.google.android.apps.search.assistant.verticals.newsplayer.p10069ui;

import android.support.p031v4.media.MediaMetadataCompat;
import android.support.p031v4.media.session.C0310l;
import android.support.p031v4.media.session.PlaybackStateCompat;

/* renamed from: com.google.android.apps.search.assistant.verticals.newsplayer.ui.aj */
/* compiled from: PG */
final class C132463aj extends C0310l {

    /* renamed from: d */
    final /* synthetic */ C132467an f361551d;

    public C132463aj(C132467an anVar) {
        this.f361551d = anVar;
    }

    /* renamed from: d */
    public final void mo1005d(MediaMetadataCompat mediaMetadataCompat) {
        this.f361551d.f361563b.mObservable.mo2879a();
    }

    /* renamed from: e */
    public final void mo1006e(PlaybackStateCompat playbackStateCompat) {
        int i = playbackStateCompat.f994a;
        if (i == 3) {
            C132467an anVar = this.f361551d;
            if (!anVar.f361562a) {
                anVar.f361562a = true;
                anVar.f361563b.mObservable.mo2879a();
            }
        } else if (i != 3) {
            C132467an anVar2 = this.f361551d;
            if (anVar2.f361562a) {
                anVar2.f361562a = false;
                anVar2.f361563b.mObservable.mo2879a();
            }
        }
    }
}
