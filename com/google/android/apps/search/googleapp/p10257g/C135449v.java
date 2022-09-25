package com.google.android.apps.search.googleapp.p10257g;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.search.googleapp.p10257g.p10259b.C135427b;
import com.google.android.apps.search.googleapp.urlhandler.C139795f;
import com.google.android.apps.search.googleapp.urlhandler.C139798i;
import com.google.android.apps.search.googleapp.urlhandler.C139823j;
import com.google.android.apps.search.googleapp.urlhandler.C139851q;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.g.v */
/* compiled from: PG */
public final class C135449v {

    /* renamed from: a */
    private static final C59071e f369011a = C59071e.m91331h();

    /* renamed from: b */
    private final C139795f f369012b;

    public C135449v(C139795f fVar) {
        this.f369012b = fVar;
    }

    /* renamed from: b */
    public static final void m219615b(View view, C135410aa aaVar) {
        C69664n.m101061g(view, "doodleView");
        String queryParameter = C135427b.m219590a(aaVar.f368924b).getQueryParameter("q");
        if (queryParameter == null || queryParameter.length() == 0) {
            C59052c cVar = (C59052c) f369011a.mo56225c();
            cVar.mo56378ag(C38505d.f101864b, 149815953);
            cVar.mo56379ah(new C59094n(40563));
            cVar.mo56386p("SEARCH Doodle clicked: Query is empty.");
            return;
        }
        Uri parse = Uri.parse(aaVar.f368923a);
        C58490gz gzVar = new C58490gz(4);
        for (String next : parse.getQueryParameterNames()) {
            String queryParameter2 = parse.getQueryParameter(next);
            C69664n.m101058d(queryParameter2);
            gzVar.mo55429h(next, queryParameter2);
        }
        C135450w wVar = new C135450w(queryParameter);
        wVar.f369014b = gzVar.mo55427f(false);
        C47393f.m84237h(new C135451x(wVar), view);
    }

    /* renamed from: a */
    public final void mo112338a(String str) {
        C69664n.m101061g(str, "url");
        C139795f fVar = this.f369012b;
        Uri a = C135427b.m219590a(str);
        C139798i iVar = (C139798i) C139823j.f380066m.createBuilder();
        C69664n.m101060f(iVar, "newBuilder()");
        C69664n.m101061g(iVar, "builder");
        C139851q qVar = C139851q.DOODLE;
        C69664n.m101061g(qVar, "value");
        iVar.copyOnWrite();
        C139823j jVar = (C139823j) iVar.instance;
        jVar.f380069b = qVar.f380143m;
        jVar.f380068a |= 1;
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "_builder.build()");
        fVar.mo115250a(a, (C139823j) build);
    }
}
