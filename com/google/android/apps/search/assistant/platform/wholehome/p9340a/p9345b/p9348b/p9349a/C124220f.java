package com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.p9349a;

import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9341a.p9344c.C124192h;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124214a;
import com.google.android.apps.search.assistant.platform.wholehome.p9340a.p9345b.p9348b.C124235b;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32849cq;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.platform.wholehome.a.b.b.a.f */
/* compiled from: PG */
public final /* synthetic */ class C124220f implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C124234t f343002a;

    public /* synthetic */ C124220f(C124234t tVar) {
        this.f343002a = tVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C124234t tVar = this.f343002a;
        if (!((Boolean) tVar.f343030i.mo17428b()).booleanValue()) {
            return tVar.mo106340c(tVar.f343028g);
        }
        ArrayList arrayList = new ArrayList();
        C60870cx c = tVar.mo106340c(tVar.f343028g);
        Iterator it = tVar.f343028g.iterator();
        while (it.hasNext()) {
            C124235b bVar = (C124235b) it.next();
            if (!tVar.f343029h.contains(bVar.mo106333h()) && bVar.mo106330e() == C124214a.ESTABLISHED) {
                C124192h hVar = bVar.mo106329d().f342941b;
                if (hVar == null) {
                    hVar = C124192h.f342949b;
                }
                if (hVar.f342951a) {
                    C32849cq cqVar = bVar.mo106329d().f342940a;
                    if (cqVar == null) {
                        cqVar = C32849cq.f88059c;
                    }
                    arrayList.add(tVar.f343025d.mo106346a(bVar.mo106333h(), bVar.mo106331f(), cqVar));
                    tVar.f343029h.add(bVar.mo106333h());
                }
            }
        }
        Iterator it2 = tVar.f343029h.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (Collection.EL.stream(tVar.f343028g).noneMatch(new C124232r(str))) {
                arrayList.add(tVar.f343025d.mo106347b(str));
                tVar.f343029h.remove(str);
            }
        }
        return C47638k.m84752c((Iterable) Stream.CC.m71936of((T[]) new List[]{Arrays.asList(new C60870cx[]{c}), arrayList}).flatMap(C124233s.f343021a).collect(Collectors.toCollection(C124221g.f343003a))).mo51521b(new C124222h(tVar), tVar.f343026e);
    }
}
