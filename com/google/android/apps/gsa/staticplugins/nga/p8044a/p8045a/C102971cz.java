package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.gsa.assist.C9397cb;
import com.google.android.apps.gsa.assist.C9398cc;
import com.google.android.apps.gsa.nga.api.C74721by;
import com.google.android.apps.gsa.nga.api.C74726cf;
import com.google.android.libraries.gsa.p1876k.C22871g;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.cz */
/* compiled from: PG */
public final class C102971cz implements C74721by {

    /* renamed from: a */
    public final Context f287540a;

    /* renamed from: b */
    public final C74726cf f287541b;

    /* renamed from: c */
    public final C9398cc f287542c;

    /* renamed from: d */
    public C9397cb f287543d = null;

    /* renamed from: e */
    private final C22871g f287544e;

    public C102971cz(Context context, C74726cf cfVar, C22871g gVar, C9398cc ccVar) {
        this.f287540a = context;
        this.f287544e = gVar;
        this.f287541b = cfVar;
        this.f287542c = ccVar;
    }

    /* renamed from: a */
    public final void mo71092a(Bundle bundle, int i) {
        this.f287544e.mo28212l("[NGA] VoiceInteractionSessionAgent onShow", new C102970cy(this, bundle, i));
    }
}
