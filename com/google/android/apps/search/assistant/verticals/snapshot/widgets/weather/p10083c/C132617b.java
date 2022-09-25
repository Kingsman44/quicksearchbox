package com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.p10083c;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123744bk;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123746bm;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132582aa;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132596ao;
import com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.C132606ay;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53244gs;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.verticals.snapshot.widgets.weather.c.b */
/* compiled from: PG */
final class C132617b implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C132618c f361921a;

    public C132617b(C132618c cVar) {
        this.f361921a = cVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f361921a.f361923b.mo56226d()).mo56382g(th)).mo56372aa(39764)).mo56386p("#onFailure");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        C53245gt gtVar;
        C53245gt gtVar2;
        C53245gt gtVar3;
        C123746bm bmVar = (C123746bm) obj;
        ((C58970a) ((C58970a) this.f361921a.f361923b.mo56224b()).mo56372aa(39765)).mo56386p("#onSuccess");
        if (bmVar.f341820a.size() > 0) {
            C123744bk bkVar = (C123744bk) bmVar.f341820a.get(0);
            if (bkVar.f341808c == 11) {
                gtVar = (C53245gt) bkVar.f341809d;
            } else {
                gtVar = C53245gt.f139564n;
            }
            C53244gs gsVar = gtVar.f139571e;
            if (gsVar == null) {
                gsVar = C53244gs.f139553j;
            }
            String str = gsVar.f139557c;
            C123744bk bkVar2 = (C123744bk) bmVar.f341820a.get(0);
            if (bkVar2.f341808c == 11) {
                gtVar2 = (C53245gt) bkVar2.f341809d;
            } else {
                gtVar2 = C53245gt.f139564n;
            }
            boolean z = gtVar2.f139574h;
            C132618c cVar = this.f361921a;
            C132606ay ayVar = cVar.f361925d;
            Context context = cVar.f361926e;
            C123744bk bkVar3 = (C123744bk) bmVar.f341820a.get(0);
            if (bkVar3.f341808c == 11) {
                gtVar3 = (C53245gt) bkVar3.f341809d;
            } else {
                gtVar3 = C53245gt.f139564n;
            }
            Optional of = Optional.m71637of(gtVar3);
            int[] d = C132582aa.m215550d(context);
            int[] c = C132582aa.m215549c(context);
            if (!ayVar.mo110831g(context, d, c)) {
                AppWidgetManager instance = AppWidgetManager.getInstance(context);
                ayVar.mo110829e();
                C60870cx c2 = ayVar.mo110827c();
                C132596ao aoVar = new C132596ao(ayVar, context, c, d, instance, of);
                C60922j.m93045h(c2, C47810es.m84966f(aoVar), ayVar.f361887d);
            }
        }
    }
}
