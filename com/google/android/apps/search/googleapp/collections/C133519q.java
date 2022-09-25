package com.google.android.apps.search.googleapp.collections;

import android.net.Uri;
import com.google.android.apps.search.googleapp.p10369o.C136832c;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.collections.q */
/* compiled from: PG */
public final /* synthetic */ class C133519q implements C43721h {

    /* renamed from: a */
    public final /* synthetic */ C133525v f363794a;

    public /* synthetic */ C133519q(C133525v vVar) {
        this.f363794a = vVar;
    }

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C133525v vVar = this.f363794a;
        C69664n.m101061g(lVar, "request");
        C136832c cVar = vVar.f363815a;
        Uri parse = Uri.parse(lVar.f113296b);
        C69664n.m101060f(parse, "parse(request.currentUrl)");
        return cVar.mo113404j(parse);
    }
}
