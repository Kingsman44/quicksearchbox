package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.os.Bundle;
import android.support.p031v4.media.session.PlaybackStateCompat;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ar */
/* compiled from: PG */
public final /* synthetic */ class C115131ar implements C115156ba {

    /* renamed from: a */
    public final /* synthetic */ Bundle f319540a;

    public /* synthetic */ C115131ar(Bundle bundle) {
        this.f319540a = bundle;
    }

    /* renamed from: a */
    public final void mo101845a(C115493i iVar) {
        Bundle bundle = this.f319540a;
        C58833ax a = iVar.mo102055a();
        boolean z = false;
        if (a.mo56113h() && (((PlaybackStateCompat) a.mo56107c()).f994a == 3 || ((PlaybackStateCompat) a.mo56107c()).f994a == 6)) {
            z = true;
        }
        iVar.f320350a.mo1037e().mo1025j("com.google.android.apps.gsa.search.core.work.audioplayer.UpdatePlaybackState", bundle);
        if (z) {
            iVar.f320350a.mo1037e().mo1017b();
        }
    }
}
