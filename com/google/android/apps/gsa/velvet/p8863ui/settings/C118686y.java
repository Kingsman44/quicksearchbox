package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.content.Context;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137588a;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137589b;
import com.google.android.apps.search.googleapp.search.settings.p10425b.C137590c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.y */
/* compiled from: PG */
public final class C118686y {

    /* renamed from: a */
    public final Context f331081a;

    /* renamed from: b */
    private final C86034c f331082b;

    /* renamed from: c */
    private final C60887da f331083c;

    /* renamed from: d */
    private final C137590c f331084d;

    public C118686y(Context context, C60887da daVar, C137590c cVar, C86034c cVar2) {
        this.f331081a = context;
        this.f331083c = daVar;
        this.f331084d = cVar;
        this.f331082b = cVar2;
    }

    /* renamed from: a */
    public final C60870cx mo103867a(C137589b bVar, boolean z) {
        C137590c cVar = this.f331084d;
        return C47633f.m84733g(C60922j.m93044g(this.f331082b.mo79696a(), C47810es.m84963c(new C137588a(cVar, bVar)), cVar.f374248b)).mo51515h(new C118682u(z), this.f331083c);
    }

    /* renamed from: b */
    public final C60870cx mo103868b(C137589b bVar) {
        if (bVar == C137589b.LOCATION_CONSENT) {
            return C47633f.m84733g(this.f331082b.mo79697b()).mo51516i(new C118684w(this), this.f331083c).mo51516i(new C118685x(this), this.f331083c);
        }
        return mo103867a(bVar, true);
    }
}
