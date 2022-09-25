package com.google.android.apps.search.googleapp.discover.streamui.impl;

import com.google.android.apps.search.googleapp.discover.p10181d.C134228q;
import com.google.android.apps.search.googleapp.discover.streamui.p10227c.C134709g;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.ai */
/* compiled from: PG */
final class C134815ai implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C134904m f367058a;

    public C134815ai(C134904m mVar) {
        this.f367058a = mVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        C134709g gVar = (C134709g) bVar;
        C134904m mVar = this.f367058a;
        C69664n.m101061g(gVar, "event");
        SwipeRefreshView s = mVar.mo112062s();
        if (s != null) {
            if (s.f13509b) {
                return C47392e.f123115a;
            }
            s.mo8794l(true, false);
        }
        C59052c cVar = (C59052c) C134904m.f367250a.mo56224b();
        C134228q qVar = gVar.f366828a;
        cVar.mo56379ah(new C59094n(40488));
        cVar.mo56389s("StreamFragmentPeer#onRefreshEvent(%s)", qVar);
        mVar.mo112067x(gVar.f366828a);
        return C47392e.f123116b;
    }
}
