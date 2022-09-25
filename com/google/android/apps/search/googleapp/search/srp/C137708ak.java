package com.google.android.apps.search.googleapp.search.srp;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.apps.search.googleapp.search.srp.interceptor.C137876a;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ak */
/* compiled from: PG */
public final /* synthetic */ class C137708ak implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ C137876a f374542a;

    public /* synthetic */ C137708ak(C137876a aVar) {
        this.f374542a = aVar;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C137876a aVar = this.f374542a;
        C69664n.m101061g(lVar, "request");
        Uri parse = Uri.parse(lVar.f113296b);
        C136832c cVar = aVar.f375133a;
        C69664n.m101060f(parse, "uri");
        Uri a = cVar.mo113395a(parse);
        return a != null && aVar.f375133a.mo113403i(a);
    }
}
