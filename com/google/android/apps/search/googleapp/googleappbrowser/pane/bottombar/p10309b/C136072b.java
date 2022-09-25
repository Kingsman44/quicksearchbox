package com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.p10309b;

import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.shared.p3441a.C44078b;
import com.google.android.libraries.web.shared.p3441a.C44080d;
import com.google.android.libraries.web.shared.p3443c.C44082a;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.common.util.concurrent.C60866ct;
import com.google.protobuf.C62942bv;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.pane.bottombar.b.b */
/* compiled from: PG */
public final class C136072b {

    /* renamed from: a */
    public static final C46690ah f370593a = new C46885y("BOTTOM_BAR_STATE_LOCAL_DATASOURCE_KEY");

    /* renamed from: b */
    public final C44080d f370594b;

    /* renamed from: c */
    private final C46778cv f370595c;

    public C136072b(C46778cv cvVar, C44078b bVar) {
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(bVar, "webCoordinatorModelStoreFactory");
        this.f370595c = cvVar;
        this.f370594b = bVar.mo47044a(C44082a.f114755a, "BOTTOM_BAR_WEB_STORE_STATE_KEY", C136074d.f370596d);
    }

    /* renamed from: a */
    public final void mo112730a(String str) {
        C19559g.m37304c();
        C136074d dVar = (C136074d) this.f370594b.mo47045a();
        if (!C69664n.m101066l(dVar.f370600c, str)) {
            C136073c cVar = (C136073c) dVar.toBuilder();
            cVar.copyOnWrite();
            C136074d dVar2 = (C136074d) cVar.instance;
            dVar2.f370598a |= 2;
            dVar2.f370600c = str;
            C62942bv build = cVar.build();
            C69664n.m101060f(build, "currentState.toBuilder()…tFragmentKey(key).build()");
            mo112731b((C136074d) build);
        }
    }

    /* renamed from: b */
    public final void mo112731b(C136074d dVar) {
        this.f370594b.mo47046b(dVar);
        this.f370595c.mo50787a(C60866ct.f164955a, f370593a);
    }
}
