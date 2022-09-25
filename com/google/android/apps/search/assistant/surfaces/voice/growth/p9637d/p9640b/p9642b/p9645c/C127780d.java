package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9642b.p9645c;

import android.content.ComponentName;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127788e;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127804u;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127746g;
import com.google.android.libraries.search.assistant.p2714o.C34917c;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.b.c.d */
/* compiled from: PG */
public final /* synthetic */ class C127780d implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C127782f f351721a;

    public /* synthetic */ C127780d(C127782f fVar) {
        this.f351721a = fVar;
    }

    public final C60870cx apply(Object obj) {
        C127782f fVar = this.f351721a;
        C34917c cVar = (C34917c) obj;
        if (cVar.mo39613b().isEmpty()) {
            return C60856cj.m92900i(C127746g.MODE_UNSPECIFIED);
        }
        String packageName = ((ComponentName) cVar.mo39613b().get()).getPackageName();
        C127804u uVar = fVar.f351729c;
        C60870cx d = uVar.f351768a.mo40240d();
        C127788e eVar = new C127788e(packageName);
        C60870cx g = C60922j.m93044g(d, C47810es.m84963c(eVar), uVar.f351769b);
        C127779c cVar2 = new C127779c();
        return C60922j.m93044g(g, C47810es.m84963c(cVar2), fVar.f351731e);
    }
}
