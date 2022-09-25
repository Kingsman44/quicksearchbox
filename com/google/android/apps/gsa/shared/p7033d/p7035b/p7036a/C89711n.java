package com.google.android.apps.gsa.shared.p7033d.p7035b.p7036a;

import android.net.Uri;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2656a.C34053bp;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a.p2683g.C34638a;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2692j.p2694b.C34711b;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60845bz;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.gsa.shared.d.b.a.n */
/* compiled from: PG */
public final class C89711n implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C89712o f242852a;

    /* renamed from: b */
    final /* synthetic */ Uri f242853b;

    public C89711n(C89712o oVar, Uri uri) {
        this.f242852a = oVar;
        this.f242853b = uri;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C89712o.f242854a.mo56226d()).mo56382g(th);
        cVar.mo56379ah(new C59094n(10186));
        cVar.mo56386p("Failed to forward legacy hotword invocation.");
        C34638a aVar = this.f242852a.f242859f;
        String uri = this.f242853b.toString();
        C69664n.m101060f(uri, "uri.toString()");
        aVar.mo39455a(uri);
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        C34053bp bpVar = (C34053bp) obj;
        C69664n.m101061g(bpVar, "token");
        C59052c cVar = (C59052c) C89712o.f242854a.mo56224b();
        C61301b a = C34711b.m63445a(bpVar);
        cVar.mo56379ah(new C59094n(10187));
        cVar.mo56389s("Legacy hotword invocation(%s) has been forwarded.", a);
    }
}
