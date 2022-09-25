package com.google.android.apps.search.googleapp.search.srp;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.srp.interceptor.C137876a;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ag */
/* compiled from: PG */
public final /* synthetic */ class C137704ag implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ C137876a f374538a;

    public /* synthetic */ C137704ag(C137876a aVar) {
        this.f374538a = aVar;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C137876a aVar = this.f374538a;
        C69664n.m101061g(lVar, "request");
        if (aVar.mo114013a(lVar)) {
            return false;
        }
        Uri parse = Uri.parse(lVar.f113296b);
        C136832c cVar = aVar.f375133a;
        C69664n.m101060f(parse, "uri");
        if (!cVar.mo113403i(parse) || parse.getQueryParameter("google_abuse") != null) {
            return false;
        }
        if (aVar.f375133a.mo113404j(parse) || aVar.f375135c) {
            return true;
        }
        return false;
    }
}
