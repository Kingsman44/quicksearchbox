package com.google.android.apps.search.weather.suggestions.p10694a;

import android.net.Uri;
import com.google.android.apps.search.weather.suggestions.p10696c.C142138d;
import com.google.android.apps.search.weather.suggestions.p10696c.C142139e;
import com.google.android.apps.search.weather.suggestions.p10696c.C142140f;
import com.google.android.apps.search.weather.suggestions.p10697d.C142143b;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;

/* renamed from: com.google.android.apps.search.weather.suggestions.a.f */
/* compiled from: PG */
final class C142129f implements C46689ag {

    /* renamed from: a */
    final /* synthetic */ C142143b f385580a;

    /* renamed from: b */
    final /* synthetic */ C142130g f385581b;

    public C142129f(C142130g gVar, C142143b bVar) {
        this.f385581b = gVar;
        this.f385580a = bVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(new C60817ay(C47633f.m84733g(this.f385581b.f385583c.mo50345e(this.f385580a)).mo51515h(new C142127d(this), this.f385581b.f385585e)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C60870cx cxVar;
        C142140f fVar = this.f385581b.f385582b;
        C142143b bVar = this.f385580a;
        String uri = Uri.parse("https://www.google.com/complete/search").buildUpon().appendQueryParameter("client", "maps-tng-weather").appendQueryParameter("q", bVar.f385602b).appendQueryParameter("hl", bVar.f385603c).build().toString();
        try {
            C61363ae aeVar = new C61363ae();
            aeVar.mo57933b("GET");
            uri.getClass();
            aeVar.f165930a = uri;
            C60870cx a = fVar.f385597b.mo42484a(new C61365ag(aeVar));
            C142138d dVar = C142138d.f385594a;
            cxVar = C60922j.m93044g(a, C47810es.m84963c(dVar), fVar.f385598c);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) C142140f.f385596a.mo56226d()).mo56382g(e)).mo56372aa(42036)).mo56389s("Exception while fetching data from [%s]", uri);
            cxVar = C60856cj.m92900i(C54229ar.f142352d);
        }
        C142139e eVar = C142139e.f385595a;
        return C47633f.m84733g(C60922j.m93044g(cxVar, C47810es.m84963c(eVar), fVar.f385598c)).mo51516i(new C142126c(this, this.f385580a), this.f385581b.f385585e);
    }

    /* renamed from: c */
    public final Object mo18088c() {
        return C142125b.f385575a;
    }
}
