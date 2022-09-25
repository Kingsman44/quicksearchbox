package com.google.android.libraries.componentview.services.application;

import android.content.Context;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.services.application.m */
/* compiled from: PG */
public final class C20622m implements C20546a {

    /* renamed from: a */
    private final Context f57851a;

    /* renamed from: b */
    private final C20601ca f57852b;

    public C20622m(Context context, C20601ca caVar) {
        this.f57851a = context;
        this.f57852b = caVar;
    }

    /* renamed from: a */
    public final void mo25476a() {
        C20520h.m38499d(C20482m.m38446n(this.f57851a), "DefaultAmpLauncher", C20482m.m38440h("prerenderAmpViewerFromRegisteredCandidates is not supported by DefaultAmpLauncher."), this.f57852b, new Object[0]);
    }

    /* renamed from: b */
    public final void mo25477b(String str, List list) {
        C20520h.m38497b(5, "DefaultAmpLauncher", (Throwable) null, "registerPrerenderCandidate is not supported by DefaultAmpLauncher.", new Object[0]);
    }

    /* renamed from: d */
    public final void mo25478d(List list, int i) {
        C20520h.m38499d(C20482m.m38446n(this.f57851a), "DefaultAmpLauncher", C20482m.m38440h("openAmpViewer is not supported by DefaultAmpLauncher."), this.f57852b, new Object[0]);
    }
}
