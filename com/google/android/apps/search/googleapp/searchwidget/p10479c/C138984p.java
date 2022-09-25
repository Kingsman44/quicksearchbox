package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.frameworks.client.data.android.C61362ad;
import com.google.frameworks.client.data.android.C61363ae;
import com.google.frameworks.client.data.android.C61365ag;
import com.google.p337aa.C6617d;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.p */
/* compiled from: PG */
public final /* synthetic */ class C138984p implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C138990v f377973a;

    /* renamed from: b */
    public final /* synthetic */ String f377974b;

    /* renamed from: c */
    public final /* synthetic */ C6617d f377975c;

    public /* synthetic */ C138984p(C138990v vVar, String str, C6617d dVar) {
        this.f377973a = vVar;
        this.f377974b = str;
        this.f377975c = dVar;
    }

    public final C60870cx apply(Object obj) {
        C138990v vVar = this.f377973a;
        String str = this.f377974b;
        C6617d dVar = this.f377975c;
        if (((String) obj).equals(str)) {
            return C60866ct.f164955a;
        }
        String str2 = dVar.f19653c;
        ((C59052c) ((C59052c) C138990v.f377985a.mo56224b()).mo56372aa(41325)).mo56389s("Downloading doodle image from %s", str);
        vVar.f377992h.mo114639a(C37182a.f98202iJ.mo40813g());
        C138994z zVar = vVar.f377987c;
        C61363ae aeVar = new C61363ae();
        aeVar.mo57932a(C61362ad.m93870b("Accept"), "*/*");
        str.getClass();
        aeVar.f165930a = str;
        aeVar.mo57933b("GET");
        C60870cx a = zVar.f377997b.mo42484a(new C61365ag(aeVar));
        C138992x xVar = C138992x.f377994a;
        C60870cx g = C60922j.m93044g(a, C47810es.m84963c(xVar), zVar.f377998c);
        C60931s f = C47810es.m84966f(new C138985q(vVar, str, str2));
        C60870cx h = C60922j.m93045h(g, C47810es.m84966f(f), vVar.f377988d);
        C138986r rVar = new C138986r(vVar);
        Class<Exception> cls = Exception.class;
        C60870cx h2 = C60846c.m92879h(h, cls, C47810es.m84966f(rVar), vVar.f377989e);
        C138983o oVar = new C138983o(vVar);
        return C60922j.m93044g(h2, C47810es.m84963c(oVar), vVar.f377989e);
    }
}
