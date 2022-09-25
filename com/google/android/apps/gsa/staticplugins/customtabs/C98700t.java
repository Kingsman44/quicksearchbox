package com.google.android.apps.gsa.staticplugins.customtabs;

import android.net.Uri;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.libraries.web.profile.Profile;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.t */
/* compiled from: PG */
public final /* synthetic */ class C98700t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98583ai f275688a;

    /* renamed from: b */
    public final /* synthetic */ Uri f275689b;

    public /* synthetic */ C98700t(C98583ai aiVar, Uri uri) {
        this.f275688a = aiVar;
        this.f275689b = uri;
    }

    public final C60870cx apply(Object obj) {
        C98583ai aiVar = this.f275688a;
        aiVar.f275337m.f114966a.mo47129a((Profile) obj).mo47128b(this.f275689b);
        return C118826c.f331423b;
    }
}
