package com.google.android.apps.search.xblend.p10705a.p10706a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.search.googleapp.p10310h.C136127h;
import com.google.android.apps.search.googleapp.p10310h.C136128i;
import com.google.android.apps.search.googleapp.p10310h.C136129j;
import com.google.android.apps.search.googleapp.p10527u.C139779t;
import com.google.android.apps.search.googleapp.search.p10409e.C137416e;
import com.google.android.apps.search.googleapp.search.p10409e.C137418g;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.silk.p3205a.p3228q.C41731a;
import com.google.android.libraries.silk.p3238b.C41742a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56796d;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56800h;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4312q.C56802j;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56847c;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56848d;
import com.google.p4283bv.p4287b.p4288a.p4322b.C56850f;
import com.google.protobuf.C62942bv;
import com.google.protobuf.p4746a.C62884c;
import java.util.Collections;
import java.util.Map;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.xblend.a.a.a */
/* compiled from: PG */
public final class C142268a implements C41731a {

    /* renamed from: a */
    private static final C59071e f385969a = C59071e.m91331h();

    /* renamed from: b */
    private static final C56848d f385970b;

    /* renamed from: c */
    private static final C56848d f385971c;

    /* renamed from: d */
    private final Context f385972d;

    /* renamed from: e */
    private final C41731a f385973e;

    /* renamed from: f */
    private final C40364q f385974f;

    static {
        C56847c cVar = (C56847c) C56848d.f151669d.createBuilder();
        C69664n.m101060f(cVar, "newBuilder()");
        C56850f a = C69664n.m101061g(cVar, "builder");
        a.mo54435c("no_handler_found");
        a.mo54434b("Open search failed due to ActivityNotFoundException");
        f385970b = a.mo54433a();
        C56847c cVar2 = (C56847c) C56848d.f151669d.createBuilder();
        C69664n.m101060f(cVar2, "newBuilder()");
        C56850f a2 = C69664n.m101061g(cVar2, "builder");
        a2.mo54435c("empty_query");
        a2.mo54434b("Query is empty");
        f385971c = a2.mo54433a();
    }

    public C142268a(Context context, C41731a aVar, C40364q qVar) {
        C69664n.m101061g(context, "context");
        C69664n.m101061g(aVar, "navigationDelegate");
        C69664n.m101061g(qVar, "logMetadataFactory");
        this.f385972d = context;
        this.f385973e = aVar;
        this.f385974f = qVar;
    }

    /* renamed from: a */
    public final C60870cx mo42557a(C56796d dVar) {
        C69664n.m101061g(dVar, "request");
        C60870cx a = this.f385973e.mo42557a(dVar);
        C69664n.m101060f(a, "navigationDelegate.openDeepLink(request)");
        return a;
    }

    /* renamed from: b */
    public final C60870cx mo42558b(C56800h hVar) {
        C69664n.m101061g(hVar, "request");
        String str = hVar.f151575a;
        C69664n.m101060f(str, "request.query");
        if (str.length() == 0) {
            return C60856cj.m92899h(new C41742a(f385971c));
        }
        C136128i l = C136129j.m221208l();
        l.mo112776k(C139779t.SEARCH);
        C137416e eVar = (C137416e) C137418g.f373767r.createBuilder();
        C69664n.m101060f(eVar, "newBuilder()");
        C69664n.m101061g(eVar, "builder");
        String str2 = hVar.f151575a;
        C69664n.m101060f(str2, "request.query");
        C69664n.m101061g(str2, "value");
        eVar.copyOnWrite();
        C137418g gVar = (C137418g) eVar.instance;
        str2.getClass();
        gVar.f373769a |= 1;
        gVar.f373770b = str2;
        Map unmodifiableMap = Collections.unmodifiableMap(Collections.unmodifiableMap(gVar.f373773e));
        C69664n.m101060f(unmodifiableMap, "_builder.getCgiParamMap()");
        new C62884c(unmodifiableMap);
        Map unmodifiableMap2 = Collections.unmodifiableMap(hVar.f151577d);
        C69664n.m101060f(unmodifiableMap2, "request.getCgiParamsMap()");
        C69664n.m101061g(unmodifiableMap2, "map");
        eVar.mo113713a(unmodifiableMap2);
        C62942bv build = eVar.build();
        C69664n.m101060f(build, "_builder.build()");
        l.mo112775j(Optional.m71637of((C137418g) build));
        C136129j a = l.mo112766a();
        Intent intent = new Intent();
        C136127h.m221196a(intent, a);
        try {
            C47810es.m84979s(this.f385972d, intent);
            return C60866ct.f164955a;
        } catch (ActivityNotFoundException e) {
            C59052c cVar = (C59052c) ((C59052c) f385969a.mo56225c()).mo56382g(e);
            cVar.mo56378ag(C40364q.f106014a, this.f385974f.mo42422a());
            cVar.mo56379ah(new C59094n(42046));
            cVar.mo56386p("Unable to start Activity for openSearch");
            return C60856cj.m92899h(new C41742a(f385970b, e));
        }
    }

    /* renamed from: c */
    public final C60870cx mo42559c(C56802j jVar) {
        C69664n.m101061g(jVar, "request");
        C60870cx c = this.f385973e.mo42559c(jVar);
        C69664n.m101060f(c, "navigationDelegate.openUrl(request)");
        return c;
    }
}
