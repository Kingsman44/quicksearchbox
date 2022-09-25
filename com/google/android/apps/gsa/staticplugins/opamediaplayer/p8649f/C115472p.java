package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.p */
/* compiled from: PG */
public final class C115472p implements C115471o {

    /* renamed from: a */
    private final C23112h f320324a;

    public C115472p(C23112h hVar) {
        this.f320324a = hVar;
    }

    /* renamed from: e */
    public final void mo101875e() {
        this.f320324a.mo28345s("onAlertDismissed", "MediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: f */
    public final void mo101876f() {
        this.f320324a.mo28345s("onFastForward", "MediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: h */
    public final void mo101877h(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", Integer.valueOf(i).intValue());
        this.f320324a.mo28345s("onMediaItemSelected_int", "MediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: i */
    public final void mo101878i(float f) {
        Bundle bundle = new Bundle();
        bundle.putFloat("newSpeed", Float.valueOf(f).floatValue());
        this.f320324a.mo28345s("onPlaybackSpeedChanged_float", "MediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: j */
    public final void mo101879j() {
        this.f320324a.mo28345s("onRewind", "MediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: k */
    public final void mo101880k(long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("seekPositionMillis", Long.valueOf(j).longValue());
        this.f320324a.mo28345s("onSeekTo_long", "MediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: l */
    public final void mo101881l(byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("screenshot", bArr);
        this.f320324a.mo28345s("onSendFeedback_byte[]", "MediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: m */
    public final void mo101882m(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", Integer.valueOf(i).intValue());
        this.f320324a.mo28345s("onShowInfo_int", "MediaPlayerEventsDispatcher", bundle);
    }

    /* renamed from: n */
    public final void mo101883n() {
        this.f320324a.mo28345s("onShowPlaylist", "MediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: o */
    public final void mo101884o() {
        this.f320324a.mo28345s("onSkipNext", "MediaPlayerEventsDispatcher", new Bundle());
    }

    /* renamed from: p */
    public final void mo101885p() {
        this.f320324a.mo28345s("onTogglePlayPause", "MediaPlayerEventsDispatcher", new Bundle());
    }
}
