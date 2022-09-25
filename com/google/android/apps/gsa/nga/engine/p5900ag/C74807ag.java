package com.google.android.apps.gsa.nga.engine.p5900ag;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.nga.engine.ag.ag */
/* compiled from: PG */
public final /* synthetic */ class C74807ag implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C74810an f208952a;

    public /* synthetic */ C74807ag(C74810an anVar) {
        this.f208952a = anVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C74810an anVar = this.f208952a;
        anVar.f208957c.unregisterAudioPlaybackCallback(anVar.mo71200a());
        anVar.f208958d.getContentResolver().unregisterContentObserver(anVar.f208962h);
        return C118826c.f331422a;
    }
}
