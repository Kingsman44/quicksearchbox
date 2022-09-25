package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8641b.C115141a;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.at */
/* compiled from: PG */
public final /* synthetic */ class C115133at implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f319543a;

    /* renamed from: b */
    public final /* synthetic */ C84269i f319544b;

    /* renamed from: c */
    public final /* synthetic */ C84271k f319545c;

    public /* synthetic */ C115133at(C115157bb bbVar, C84269i iVar, C84271k kVar) {
        this.f319543a = bbVar;
        this.f319544b = iVar;
        this.f319545c = kVar;
    }

    public final void run() {
        C115157bb bbVar = this.f319543a;
        C84269i iVar = this.f319544b;
        C84271k kVar = this.f319545c;
        for (C115141a zVar : bbVar.f319598i) {
            bbVar.f319595f.mo28212l("on-playback-action-requested", new C115842z(zVar, iVar, kVar));
        }
    }
}
