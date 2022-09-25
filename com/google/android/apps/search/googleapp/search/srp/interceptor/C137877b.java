package com.google.android.apps.search.googleapp.search.srp.interceptor;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.srp.p10437g.C137852a;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.interceptor.b */
/* compiled from: PG */
final /* synthetic */ class C137877b implements C43721h {

    /* renamed from: a */
    final /* synthetic */ C137876a f375136a;

    public C137877b(C137876a aVar) {
        this.f375136a = aVar;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C69664n.m101061g(lVar, "p0");
        C137876a aVar = this.f375136a;
        C69664n.m101061g(lVar, "request");
        Uri parse = Uri.parse(lVar.f113296b);
        C136832c cVar = aVar.f375133a;
        C69664n.m101060f(parse, "uri");
        if (cVar.mo113403i(parse)) {
            return true;
        }
        Uri a = aVar.f375133a.mo113395a(parse);
        if (a == null) {
            a = parse;
        }
        C137852a aVar2 = aVar.f375134b;
        C69664n.m101061g(parse, "uri");
        return (aVar2.f375064a.mo113398d(parse) && C69664n.m101066l(aVar2.f375064a.mo113397c(parse), "login.corp") && (C69664n.m101066l("/blessme", parse.getPath()) || C69664n.m101066l("/uberproxy/loginz", parse.getPath()))) || aVar.f375134b.mo114009c(parse) || aVar.f375134b.mo114007a(a);
    }
}
