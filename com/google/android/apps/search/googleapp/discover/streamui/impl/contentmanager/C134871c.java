package com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager;

import android.view.View;
import com.google.android.apps.search.googleapp.discover.p10175ab.p10176a.C134091i;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40028ai;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4552o.p4566l.C60213m;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57528m;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62942bv;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.contentmanager.c */
/* compiled from: PG */
public final class C134871c implements C40028ai {

    /* renamed from: a */
    public final C57528m f367160a;

    /* renamed from: b */
    private final Map f367161b;

    /* renamed from: c */
    private final C60218r f367162c;

    public C134871c(Map map, C60218r rVar, C57528m mVar) {
        C69664n.m101061g(map, "discoverVeViewMap");
        C69664n.m101061g(rVar, "responseEventId");
        C69664n.m101061g(mVar, "surface");
        this.f367161b = map;
        this.f367162c = rVar;
        this.f367160a = mVar;
    }

    /* renamed from: a */
    public final void mo42134a(View view) {
        this.f367161b.remove(view);
    }

    /* renamed from: b */
    public final void mo42135b(View view, C57696b bVar) {
        C69664n.m101061g(bVar, "loggingProperties");
        Map map = this.f367161b;
        C60213m mVar = (C60213m) C60214n.f162914g.createBuilder();
        C60218r rVar = this.f367162c;
        mVar.copyOnWrite();
        C60214n nVar = (C60214n) mVar.instance;
        rVar.getClass();
        nVar.f162921f = rVar;
        nVar.f162916a |= 2048;
        C60214n nVar2 = bVar.f154142c;
        if (nVar2 == null) {
            nVar2 = C60214n.f162914g;
        }
        mVar.mergeFrom(nVar2);
        C62942bv build = mVar.build();
        C69664n.m101060f(build, "newBuilder()\n           …Cgi)\n            .build()");
        map.put(view, new C134091i((C60214n) build, C47810es.m84966f(new C134870b(bVar, this))));
    }
}
