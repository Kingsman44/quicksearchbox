package com.google.android.apps.search.googleapp.customtabs.features.googleoncontent;

import android.net.Uri;
import com.google.android.apps.gsa.h.h.b;
import com.google.android.apps.gsa.h.h.c;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133712ad;
import com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a.C133714af;
import com.google.android.apps.search.googleapp.customtabs.p10156f.C133771b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.C60494rz;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.features.googleoncontent.t */
/* compiled from: PG */
public final /* synthetic */ class C133901t implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C133907z f364691a;

    /* renamed from: b */
    public final /* synthetic */ Uri f364692b;

    public /* synthetic */ C133901t(C133907z zVar, Uri uri) {
        this.f364691a = zVar;
        this.f364692b = uri;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C60870cx cxVar;
        C133907z zVar = this.f364691a;
        Uri uri = this.f364692b;
        C133714af b = zVar.f364706i.mo111359b();
        C133712ad adVar = b.f364211c;
        if (adVar == null) {
            adVar = C133712ad.f364202d;
        }
        C133771b bVar = adVar.f364206c;
        if (bVar == null) {
            bVar = C133771b.f364368e;
        }
        b createBuilder = c.e.createBuilder();
        String uri2 = uri.toString();
        createBuilder.copyOnWrite();
        c cVar = createBuilder.instance;
        uri2.getClass();
        cVar.a |= 1;
        cVar.b = uri2;
        long j = bVar.f364372c;
        createBuilder.copyOnWrite();
        c cVar2 = createBuilder.instance;
        cVar2.a |= 2;
        cVar2.c = j;
        C60494rz a = C60494rz.m92598a(bVar.f364371b);
        if (a == null) {
            a = C60494rz.UNKNOWN;
        }
        createBuilder.copyOnWrite();
        c cVar3 = createBuilder.instance;
        cVar3.d = a.f163762v;
        cVar3.a |= 4;
        c build = createBuilder.build();
        C133712ad adVar2 = b.f364211c;
        if (adVar2 == null) {
            adVar2 = C133712ad.f364202d;
        }
        C133771b bVar2 = adVar2.f364206c;
        if (bVar2 == null) {
            bVar2 = C133771b.f364368e;
        }
        if (uri.equals(zVar.mo111443h(zVar.f364706i.mo111358a()))) {
            cxVar = C60922j.m93044g(zVar.mo111444i(uri, bVar2), C47810es.m84963c(C133893l.f364676a), C60826bg.f164896a);
        } else {
            cxVar = C60922j.m93045h(zVar.f364707j.mo50395b(), C47810es.m84966f(new C133897p(zVar, uri, bVar2)), zVar.f364700c);
        }
        return C60922j.m93045h(cxVar, C47810es.m84966f(new C133896o(zVar, b, build)), zVar.f364700c);
    }
}
