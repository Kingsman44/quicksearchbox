package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.apps.gsa.p6486s.C84274n;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.c */
/* compiled from: PG */
public final /* synthetic */ class C115163c implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C84274n f319613a;

    public /* synthetic */ C115163c(C84274n nVar) {
        this.f319613a = nVar;
    }

    public final C60870cx apply(Object obj) {
        C84274n nVar = this.f319613a;
        if (((C84272l) obj).equals(C84272l.SUCCESS)) {
            return nVar.mo77787c(C84269i.STOP_SESSION);
        }
        throw new IllegalStateException("Couldn't stop playback.");
    }
}
