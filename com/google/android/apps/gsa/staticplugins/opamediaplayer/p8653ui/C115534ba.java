package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115475s;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.C115476t;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.ba */
/* compiled from: PG */
public final class C115534ba implements C115475s {

    /* renamed from: a */
    public final C115475s f320470a;

    /* renamed from: b */
    private final C22945j f320471b;

    public C115534ba(C115475s sVar, C22945j jVar) {
        this.f320470a = sVar;
        this.f320471b = jVar;
    }

    /* renamed from: a */
    public final boolean mo102079a() {
        return this.f320471b.mo28316z();
    }

    /* renamed from: e */
    public final void mo102045e(long j) {
        if (mo102079a()) {
            C115475s sVar = this.f320470a;
            Bundle bundle = new Bundle();
            bundle.putLong("seekPositionMillis", Long.valueOf(j).longValue());
            ((C115476t) sVar).f320326a.mo28345s("onSeekTo_long", "PlaybackPanelEventsDispatcher", bundle);
        }
    }

    /* renamed from: f */
    public final void mo102046f() {
        if (mo102079a()) {
            C115475s sVar = this.f320470a;
            ((C115476t) sVar).f320326a.mo28345s("onTogglePlayPause", "PlaybackPanelEventsDispatcher", new Bundle());
        }
    }
}
