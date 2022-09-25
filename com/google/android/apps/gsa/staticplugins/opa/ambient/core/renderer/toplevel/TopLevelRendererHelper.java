package com.google.android.apps.gsa.staticplugins.opa.ambient.core.renderer.toplevel;

import android.support.p031v4.app.Fragment;
import android.view.ViewGroup;
import com.google.android.apps.gsa.assistant.settings.features.d.u;
import com.google.android.apps.gsa.opa.p6429a.p6431b.C83564a;
import com.google.android.apps.gsa.opa.smartspace.p6456e.C83783a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3886c.C50701am;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60922j;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
public final class TopLevelRendererHelper {

    /* renamed from: a */
    public final C58974d f297684a;

    /* renamed from: b */
    public final C60888db f297685b;

    /* renamed from: c */
    public final C60888db f297686c;

    /* renamed from: d */
    public final Map f297687d;

    /* renamed from: e */
    public final Map f297688e = new HashMap();

    /* renamed from: f */
    public final u f297689f;

    /* renamed from: g */
    private final C60870cx f297690g;

    public TopLevelRendererHelper(C83783a aVar, Map map, C60888db dbVar, C60888db dbVar2, u uVar, Fragment fragment, C83564a aVar2) {
        this.f297687d = map;
        this.f297685b = dbVar;
        this.f297686c = dbVar2;
        this.f297689f = uVar;
        this.f297690g = aVar.mo77105d();
        fragment.getViewLifecycleOwnerLiveData().mo5704e(fragment, new C106841u(this));
        this.f297684a = aVar2.mo76900a("TopLvlRenHlpr");
    }

    /* renamed from: a */
    public final synchronized C60870cx mo95682a(C50701am amVar, ViewGroup viewGroup) {
        if (this.f297688e.containsKey(amVar)) {
            return (C60870cx) this.f297688e.get(amVar);
        }
        C60870cx cxVar = this.f297690g;
        C106833m mVar = new C106833m(this, amVar);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(mVar), this.f297685b);
        C106822b bVar = new C106822b(this);
        C60870cx g = C60922j.m93044g(h, C47810es.m84963c(bVar), this.f297686c);
        C106834n nVar = new C106834n(this, viewGroup);
        C60870cx h2 = C60922j.m93045h(g, C47810es.m84966f(nVar), this.f297685b);
        C106835o oVar = new C106835o(this);
        C60870cx g2 = C60922j.m93044g(h2, C47810es.m84963c(oVar), this.f297685b);
        this.f297688e.put(amVar, g2);
        return g2;
    }
}
