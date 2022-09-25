package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.dr */
/* compiled from: PG */
public final /* synthetic */ class C115302dr implements C60931s {

    /* renamed from: a */
    public static final /* synthetic */ C115302dr f319930a = new C115302dr();

    private /* synthetic */ C115302dr() {
    }

    public final C60870cx apply(Object obj) {
        if (((C84272l) obj) == C84272l.SUCCESS) {
            return C60866ct.f164955a;
        }
        return C60856cj.m92899h(new IllegalStateException("Playback action failed."));
    }
}
