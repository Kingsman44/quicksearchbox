package com.google.android.apps.gsa.staticplugins.opa.tapas.framework;

import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8556a.C112145l;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113339cj;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121437c;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4553a.C59494br;
import com.google.common.p4552o.p4553a.C59496bt;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60873d;
import com.google.common.util.concurrent.C60930r;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.framework.ba */
/* compiled from: PG */
public final /* synthetic */ class C111863ba implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f310848a;

    /* renamed from: b */
    public final /* synthetic */ C112145l f310849b;

    /* renamed from: c */
    public final /* synthetic */ Map f310850c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f310851d;

    /* renamed from: e */
    public final /* synthetic */ Map f310852e;

    public /* synthetic */ C111863ba(C60870cx cxVar, C112145l lVar, Map map, C60870cx cxVar2, Map map2) {
        this.f310848a = cxVar;
        this.f310849b = lVar;
        this.f310850c = map;
        this.f310851d = cxVar2;
        this.f310852e = map2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C121438d dVar;
        C60870cx cxVar = this.f310848a;
        C112145l lVar = this.f310849b;
        Map map = this.f310850c;
        C60870cx cxVar2 = this.f310851d;
        Map map2 = this.f310852e;
        if (C90877ak.m148480n(cxVar)) {
            dVar = (C121438d) C60856cj.m92909r(cxVar);
        } else if ((((C60873d) cxVar).value instanceof C60873d.C60875b) || C90877ak.m148479m(cxVar, TimeoutException.class)) {
            C111877bo.f310873a.mo105240i("timeout_".concat(String.valueOf(lVar.mo99422a().name())));
            C121437c a = C121438d.m200684a();
            C59494br brVar = (C59494br) C59496bt.f157860g.createBuilder();
            brVar.copyOnWrite();
            C59496bt btVar = (C59496bt) brVar.instance;
            btVar.f157866e = 2;
            btVar.f157862a |= 4;
            a.mo105148c(brVar);
            dVar = a.mo105146a();
        } else {
            C121437c a2 = C121438d.m200684a();
            C59494br brVar2 = (C59494br) C59496bt.f157860g.createBuilder();
            brVar2.copyOnWrite();
            C59496bt btVar2 = (C59496bt) brVar2.instance;
            btVar2.f157866e = 1;
            btVar2.f157862a |= 4;
            a2.mo105148c(brVar2);
            dVar = a2.mo105146a();
        }
        if (dVar.mo105150c().f157863b > 0) {
            C113339cj.m187498f(map);
        }
        Map map3 = (Map) C60856cj.m92909r(cxVar2);
        if (map2.containsKey(Integer.valueOf(lVar.mo99422a().f125795r))) {
            ((C59052c) ((C59052c) C111877bo.f310874b.mo56226d()).mo56372aa(27410)).mo56359L("Unexpected duplicate adjuster enum %s from adjuster %s.  Discarding: %s", lVar.mo99422a().name(), lVar.getClass().getSimpleName(), dVar);
        } else {
            map2.put(Integer.valueOf(lVar.mo99422a().f125795r), dVar);
        }
        return C60866ct.f164955a;
    }
}
