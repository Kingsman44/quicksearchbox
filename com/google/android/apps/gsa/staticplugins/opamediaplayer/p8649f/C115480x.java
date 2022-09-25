package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f;

import android.os.Bundle;
import com.google.android.libraries.gsa.monet.shared.C23112h;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.f.x */
/* compiled from: PG */
public final class C115480x implements C115479w {

    /* renamed from: a */
    public final C23112h f320328a;

    public C115480x(C23112h hVar) {
        this.f320328a = hVar;
    }

    /* renamed from: e */
    public final void mo101891e(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", Integer.valueOf(i).intValue());
        this.f320328a.mo28345s("onMediaItemInfoRequested_int", "PlaylistEventsDispatcher", bundle);
    }

    /* renamed from: f */
    public final void mo101892f(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("index", Integer.valueOf(i).intValue());
        this.f320328a.mo28345s("onMediaItemRequested_int", "PlaylistEventsDispatcher", bundle);
    }
}
