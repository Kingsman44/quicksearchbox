package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127746g;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9644b.C127774a;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9644b.C127776c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.w */
/* compiled from: PG */
public final /* synthetic */ class C127806w implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C127809z f351771a;

    public /* synthetic */ C127806w(C127809z zVar) {
        this.f351771a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C127809z zVar = this.f351771a;
        if (((C127746g) obj).equals(C127746g.MODE_UNSPECIFIED)) {
            return C60856cj.m92900i(Optional.empty());
        }
        C127776c cVar = zVar.f351775b;
        Locale locale = Locale.US;
        C60870cx a = cVar.f351713d.mo108181a();
        C127804u uVar = cVar.f351712c;
        C60870cx d = uVar.f351768a.mo40240d();
        C127798o oVar = C127798o.f351762a;
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(oVar), uVar.f351769b);
        return C47638k.m84751b(a, g).mo51520a(new C127774a(cVar, a, g, locale), cVar.f351714e);
    }
}
