package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8724a;

import android.content.pm.LauncherApps;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.a.i */
/* compiled from: PG */
public final /* synthetic */ class C116860i implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C116863l f324332a;

    /* renamed from: b */
    public final /* synthetic */ C41626a f324333b;

    /* renamed from: c */
    public final /* synthetic */ C58485gu f324334c;

    public /* synthetic */ C116860i(C116863l lVar, C41626a aVar, C58485gu guVar) {
        this.f324332a = lVar;
        this.f324333b = aVar;
        this.f324334c = guVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C116863l lVar = this.f324332a;
        C41626a aVar = this.f324333b;
        C58485gu<RootSuggestion> guVar = this.f324334c;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            for (RootSuggestion j : guVar) {
                if (lVar.mo103034a(aVar, lVar.mo103036j(j, (LauncherApps) optional.get(), 0), 10) > 0) {
                    C116863l.m194169l(aVar);
                    return C60856cj.m92900i(aVar);
                }
            }
        }
        return lVar.f324341e.mo28209i(lVar.mo103035b(), "fetchOnDeviceAppActions", new C116857f(lVar, aVar, guVar));
    }
}
