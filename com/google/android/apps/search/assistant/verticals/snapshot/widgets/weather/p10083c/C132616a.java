package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c;

import com.google.android.apps.search.assistant.platform.pcp.api.C123597m;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123755bv;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58759qy;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.a */
/* compiled from: PG */
public final /* synthetic */ class C132616a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C132618c f361920a;

    public /* synthetic */ C132616a(C132618c cVar) {
        this.f361920a = cVar;
    }

    public final Object apply(Object obj) {
        C132618c cVar = this.f361920a;
        if (!((Boolean) obj).booleanValue()) {
            return null;
        }
        C60870cx c = ((C123597m) cVar.f361922a).mo106043c(C53306j.WEATHER_WIDGET, new C58759qy(7), true, C123755bv.f341837o, C123777f.f341922a);
        C132617b bVar = new C132617b(cVar);
        C60856cj.m92911t(c, C47810es.m84974n(bVar), cVar.f361924c);
        return null;
    }
}
