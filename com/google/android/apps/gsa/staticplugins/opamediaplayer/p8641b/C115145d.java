package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89062r;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.b.d */
/* compiled from: PG */
public final /* synthetic */ class C115145d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115148g f319566a;

    public /* synthetic */ C115145d(C115148g gVar) {
        this.f319566a = gVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        int i;
        C115148g gVar = this.f319566a;
        if (((C89062r) obj).mo83040a()) {
            i = C89885b.OPA_MEDIA_PLAYER_PLAYBACK_ERROR.f246280a;
        } else {
            i = C89885b.OPA_MEDIA_PLAYER_NETWORK_ERROR.f246280a;
        }
        gVar.mo101858e(i);
    }
}
