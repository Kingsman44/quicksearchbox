package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.os.Bundle;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115164a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.k */
/* compiled from: PG */
public final /* synthetic */ class C115495k implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f320355a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f320356b;

    public /* synthetic */ C115495k(C115157bb bbVar, Bundle bundle) {
        this.f320355a = bbVar;
        this.f320356b = bundle;
    }

    public final void run() {
        C115157bb bbVar = this.f320355a;
        Bundle bundle = this.f320356b;
        bbVar.mo101861m(new C115503s(bundle));
        if (bundle.containsKey("com.google.android.apps.gsa.search.core.work.audioplayer.PlaybackSpeed")) {
            C115162bg bgVar = bbVar.f319601l;
            float f = bundle.getFloat("com.google.android.apps.gsa.search.core.work.audioplayer.PlaybackSpeed");
            C115164a aVar = bgVar.f319612c;
            aVar.copyOnWrite();
            C115169f fVar = (C115169f) aVar.instance;
            C115169f fVar2 = C115169f.f319625h;
            fVar.f319627a |= 4;
            fVar.f319630d = f;
        }
    }
}
