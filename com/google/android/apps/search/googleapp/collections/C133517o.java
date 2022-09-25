package com.google.android.apps.search.googleapp.collections;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10539y.p10540a.C139883a;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;
import java.util.List;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.collections.o */
/* compiled from: PG */
public final /* synthetic */ class C133517o implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ C133525v f363792a;

    public /* synthetic */ C133517o(C133525v vVar) {
        this.f363792a = vVar;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C133525v vVar = this.f363792a;
        C69664n.m101061g(lVar, "request");
        Uri parse = Uri.parse(lVar.f113296b);
        C69664n.m101060f(parse, "uri");
        if (C139883a.m227491c(parse, vVar.f363815a)) {
            return true;
        }
        C69664n.m101061g(parse, "uri");
        List<String> pathSegments = parse.getPathSegments();
        C69664n.m101060f(pathSegments, "uri.pathSegments");
        if (pathSegments.isEmpty() || !C69664n.m101066l(parse.getPathSegments().get(0), "imgres")) {
            return false;
        }
        return true;
    }
}
