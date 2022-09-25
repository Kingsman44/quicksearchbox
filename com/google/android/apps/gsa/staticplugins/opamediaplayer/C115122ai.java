package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.os.Bundle;
import com.google.android.apps.gsa.p6486s.C84271k;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ai */
/* compiled from: PG */
public final /* synthetic */ class C115122ai implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f319525a;

    /* renamed from: b */
    public final /* synthetic */ int f319526b;

    /* renamed from: c */
    public final /* synthetic */ C84271k f319527c;

    public /* synthetic */ C115122ai(C115157bb bbVar, int i, C84271k kVar) {
        this.f319525a = bbVar;
        this.f319526b = i;
        this.f319527c = kVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C115157bb bbVar = this.f319525a;
        int i = this.f319526b;
        C84271k kVar = this.f319527c;
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.apps.gsa.search.core.work.audioplayer.SkipToWindow", i);
        bundle.putInt("com.google.android.apps.gsa.search.core.work.audioplayer.StartOffsetInWindow", ((Integer) kVar.mo77759c().mo56109e(0)).intValue());
        return bbVar.mo101859k(new C115840x(bundle));
    }
}
