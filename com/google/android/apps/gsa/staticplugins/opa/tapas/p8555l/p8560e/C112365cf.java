package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8560e;

import com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8563g.C112471ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121511c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.C121537f;
import com.google.assistant.p3781ad.p3789d.p3791b.C48668ac;
import com.google.p386ak.C8393i;
import com.google.p386ak.C8399o;
import com.google.p386ak.p394d.C8387c;
import com.google.research.p5181a.C66350e;
import com.google.research.p5181a.C66380i;
import com.google.research.p5181a.p5183b.p5184a.C66302c;
import com.google.research.p5181a.p5183b.p5184a.C66306g;
import com.google.research.p5181a.p5188f.C66376a;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.e.cf */
/* compiled from: PG */
final class C112365cf {

    /* renamed from: a */
    public static final C121537f f311784a = C121537f.m200840b("Tapas/Ranker/ReflectionTranslatorUtils", C121511c.f337208a);

    /* renamed from: b */
    private static final C8393i f311785b = new C8393i();

    /* renamed from: a */
    public static void m186224a(C113405ep epVar, Map map, C112471ap apVar, C66302c cVar, List list) {
        C66376a aVar = (C66376a) f311784a.mo105235d("translateFeature", new C112361cb(epVar, map, apVar, cVar, list));
    }

    /* renamed from: b */
    public static void m186225b(C113415ez ezVar, C66302c cVar, List list) {
        String Q = ezVar.mo100058Q();
        C66350e eVar = cVar.f180311a;
        eVar.copyOnWrite();
        C66380i iVar = (C66380i) eVar.instance;
        C66380i iVar2 = C66380i.f180482l;
        Q.getClass();
        iVar.f180484a |= 1;
        iVar.f180485b = Q;
        cVar.mo59466i();
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C48668ac acVar = (C48668ac) it.next();
            C112341bi.m186204b(ezVar, acVar).ifPresent(new C112364ce(hashMap, acVar));
        }
        Class<?> cls = hashMap.getClass();
        C8393i iVar3 = f311785b;
        StringWriter stringWriter = new StringWriter();
        try {
            C8387c cVar2 = new C8387c(stringWriter);
            cVar2.f29236c = true;
            cVar2.f29235b = false;
            cVar2.f29237d = false;
            iVar3.mo17148g(hashMap, cls, cVar2);
            String stringWriter2 = stringWriter.toString();
            C66350e eVar2 = cVar.f180311a;
            eVar2.copyOnWrite();
            C66380i iVar4 = (C66380i) eVar2.instance;
            stringWriter2.getClass();
            iVar4.f180484a |= 128;
            iVar4.f180491h = stringWriter2;
            C66306g i = cVar.mo59466i();
            cVar.mo59472o(6);
            cVar.mo59470m(i);
        } catch (IOException e) {
            throw new C8399o((Throwable) e);
        }
    }
}
